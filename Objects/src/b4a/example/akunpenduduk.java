package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class akunpenduduk extends Activity implements B4AActivity{
	public static akunpenduduk mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.akunpenduduk");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (akunpenduduk).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.akunpenduduk");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.akunpenduduk", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (akunpenduduk) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (akunpenduduk) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return akunpenduduk.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (akunpenduduk) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (akunpenduduk) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            akunpenduduk mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (akunpenduduk) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.ListViewWrapper _lv = null;
public anywheresoftware.b4a.objects.EditTextWrapper _search = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnadd = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlakun = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnladd = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnmpengguna = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtpwd = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsave = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spnnik = null;
public b4a.example.main _main = null;
public b4a.example.actopsi _actopsi = null;
public b4a.example.actlogin _actlogin = null;
public b4a.example.modulkoneksi _modulkoneksi = null;
public b4a.example.actberanda _actberanda = null;
public b4a.example.actregister _actregister = null;
public b4a.example.actlupakatasandi _actlupakatasandi = null;
public b4a.example.starter _starter = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="akunpenduduk";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="Activity.LoadLayout(\"AkunWarga\")";
mostCurrent._activity.LoadLayout("AkunWarga",mostCurrent.activityBA);
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="showList";
_showlist();
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="isiSpinner";
_isispinner();
RDebugUtils.currentLine=3604488;
 //BA.debugLineNum = 3604488;BA.debugLine="lv.TwoLinesLayout.Label.TextColor = Colors.Black";
mostCurrent._lv.getTwoLinesLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=3604489;
 //BA.debugLineNum = 3604489;BA.debugLine="lv.TwoLinesLayout.Label.TextSize = 15";
mostCurrent._lv.getTwoLinesLayout().Label.setTextSize((float) (15));
RDebugUtils.currentLine=3604491;
 //BA.debugLineNum = 3604491;BA.debugLine="pnlakun.Visible = True";
mostCurrent._pnlakun.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3604492;
 //BA.debugLineNum = 3604492;BA.debugLine="pnladd.Visible = False";
mostCurrent._pnladd.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3604494;
 //BA.debugLineNum = 3604494;BA.debugLine="End Sub";
return "";
}
public static String  _showlist() throws Exception{
RDebugUtils.currentModule="akunpenduduk";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showlist", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "showlist", null));}
int _i = 0;
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub showList";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="ModulKoneksi.koneksi";
mostCurrent._modulkoneksi._koneksi /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="lv.Clear";
mostCurrent._lv.Clear();
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="ModulKoneksi.rs = ModulKoneksi.mh.Query(\"SELECT *";
mostCurrent._modulkoneksi._rs /*mysql.mysqlhandler.ResultSetWrapper*/  = (mysql.mysqlhandler.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new mysql.mysqlhandler.ResultSetWrapper(), (java.sql.ResultSet)(mostCurrent._modulkoneksi._mh /*mysql.mysqlhandler*/ .Query("SELECT * FROM tb_akunwarga ORDER BY id_akun_warga ASC")));
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="For i = 0 To ModulKoneksi.rs.RowCount - 1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._modulkoneksi._rs /*mysql.mysqlhandler.ResultSetWrapper*/ .RowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="ModulKoneksi.rs.Position  = i";
mostCurrent._modulkoneksi._rs /*mysql.mysqlhandler.ResultSetWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=3866632;
 //BA.debugLineNum = 3866632;BA.debugLine="lv.AddTwoLines(ModulKoneksi.rs.GetString2(\"id_ak";
mostCurrent._lv.AddTwoLines(BA.ObjectToCharSequence(mostCurrent._modulkoneksi._rs /*mysql.mysqlhandler.ResultSetWrapper*/ .GetString2("id_akun_warga")),BA.ObjectToCharSequence(mostCurrent._modulkoneksi._rs /*mysql.mysqlhandler.ResultSetWrapper*/ .GetString2("username")));
 }
};
RDebugUtils.currentLine=3866635;
 //BA.debugLineNum = 3866635;BA.debugLine="ModulKoneksi.mh.Close";
mostCurrent._modulkoneksi._mh /*mysql.mysqlhandler*/ .Close();
RDebugUtils.currentLine=3866636;
 //BA.debugLineNum = 3866636;BA.debugLine="End Sub";
return "";
}
public static String  _isispinner() throws Exception{
RDebugUtils.currentModule="akunpenduduk";
if (Debug.shouldDelegate(mostCurrent.activityBA, "isispinner", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "isispinner", null));}
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Sub isiSpinner";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="ModulKoneksi.koneksi";
mostCurrent._modulkoneksi._koneksi /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="spnnik.Clear";
mostCurrent._spnnik.Clear();
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="spnnik.Add(ModulKoneksi.mh.Query(\"SELECT nik, nam";
mostCurrent._spnnik.Add(BA.ObjectToString(mostCurrent._modulkoneksi._mh /*mysql.mysqlhandler*/ .Query("SELECT nik, nama FROM tb_penduduk ORDER BY id_penduduk")));
RDebugUtils.currentLine=6094853;
 //BA.debugLineNum = 6094853;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="akunpenduduk";
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="akunpenduduk";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="End Sub";
return "";
}
public static String  _btnadd_click() throws Exception{
RDebugUtils.currentModule="akunpenduduk";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnadd_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnadd_click", null));}
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Private Sub btnadd_Click";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="pnlakun.Visible = False";
mostCurrent._pnlakun.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="pnladd.Visible = True";
mostCurrent._pnladd.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="End Sub";
return "";
}
public static String  _btnback_click() throws Exception{
RDebugUtils.currentModule="akunpenduduk";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnback_click", null));}
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Private Sub btnBack_Click";
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="pnlakun.Visible = True";
mostCurrent._pnlakun.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="pnladd.Visible = False";
mostCurrent._pnladd.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="End Sub";
return "";
}
public static String  _btnkembali_click() throws Exception{
RDebugUtils.currentModule="akunpenduduk";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnkembali_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnkembali_click", null));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Private Sub btnkembali_Click";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="StartActivity(actBeranda)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._actberanda.getObject()));
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="End Sub";
return "";
}
public static String  _btnsave_click() throws Exception{
RDebugUtils.currentModule="akunpenduduk";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsave_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnsave_click", null));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Private Sub btnSave_Click";
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="If spnnik.SelectedIndex = \"\" Then";
if (mostCurrent._spnnik.getSelectedIndex()==(double)(Double.parseDouble(""))) { 
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="MsgboxAsync(\"Masukkan NIK | Nama Lengkap\",\"Info\"";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Masukkan NIK | Nama Lengkap"),BA.ObjectToCharSequence("Info"),processBA);
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4128775;
 //BA.debugLineNum = 4128775;BA.debugLine="If txtnmpengguna.Text = \"\" Then";
if ((mostCurrent._txtnmpengguna.getText()).equals("")) { 
RDebugUtils.currentLine=4128776;
 //BA.debugLineNum = 4128776;BA.debugLine="MsgboxAsync(\"Masukkan Nama Pengguna\",\"Info\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Masukkan Nama Pengguna"),BA.ObjectToCharSequence("Info"),processBA);
RDebugUtils.currentLine=4128777;
 //BA.debugLineNum = 4128777;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4128780;
 //BA.debugLineNum = 4128780;BA.debugLine="If txtpwd.Text = \"\" Then";
if ((mostCurrent._txtpwd.getText()).equals("")) { 
RDebugUtils.currentLine=4128781;
 //BA.debugLineNum = 4128781;BA.debugLine="MsgboxAsync(\"Masukkan Password\",\"Info\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Masukkan Password"),BA.ObjectToCharSequence("Info"),processBA);
RDebugUtils.currentLine=4128782;
 //BA.debugLineNum = 4128782;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4128785;
 //BA.debugLineNum = 4128785;BA.debugLine="If btnSave.Text = \"Simpan\" Then";
if ((mostCurrent._btnsave.getText()).equals("Simpan")) { 
RDebugUtils.currentLine=4128787;
 //BA.debugLineNum = 4128787;BA.debugLine="ModulKoneksi.koneksi";
mostCurrent._modulkoneksi._koneksi /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=4128790;
 //BA.debugLineNum = 4128790;BA.debugLine="ModulKoneksi.rs = ModulKoneksi.mh.Query(\"SELECT";
mostCurrent._modulkoneksi._rs /*mysql.mysqlhandler.ResultSetWrapper*/  = (mysql.mysqlhandler.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new mysql.mysqlhandler.ResultSetWrapper(), (java.sql.ResultSet)(mostCurrent._modulkoneksi._mh /*mysql.mysqlhandler*/ .Query("SELECT * FROM tb_akunwarga WHERE username='"+mostCurrent._spnnik.getSelectedItem()+"'")));
RDebugUtils.currentLine=4128791;
 //BA.debugLineNum = 4128791;BA.debugLine="If ModulKoneksi.rs.RowCount > 0 Then";
if (mostCurrent._modulkoneksi._rs /*mysql.mysqlhandler.ResultSetWrapper*/ .RowCount()>0) { 
RDebugUtils.currentLine=4128792;
 //BA.debugLineNum = 4128792;BA.debugLine="MsgboxAsync(\"Akun telah digunakan\",\"Info\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Akun telah digunakan"),BA.ObjectToCharSequence("Info"),processBA);
 };
RDebugUtils.currentLine=4128796;
 //BA.debugLineNum = 4128796;BA.debugLine="ModulKoneksi.mh.Exec(\"INSERT INTO tb_akunwarga V";
mostCurrent._modulkoneksi._mh /*mysql.mysqlhandler*/ .Exec("INSERT INTO tb_akunwarga VALUES('"+mostCurrent._spnnik.getSelectedItem()+"', '"+mostCurrent._txtnmpengguna.getText()+"', '"+mostCurrent._txtpwd.getText()+"')");
 }else {
RDebugUtils.currentLine=4128798;
 //BA.debugLineNum = 4128798;BA.debugLine="tampilanAwal";
_tampilanawal();
 };
RDebugUtils.currentLine=4128800;
 //BA.debugLineNum = 4128800;BA.debugLine="End Sub";
return "";
}
public static String  _tampilanawal() throws Exception{
RDebugUtils.currentModule="akunpenduduk";
if (Debug.shouldDelegate(mostCurrent.activityBA, "tampilanawal", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "tampilanawal", null));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Sub tampilanAwal";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="spnnik.SelectedIndex = \"\"";
mostCurrent._spnnik.setSelectedIndex((int)(Double.parseDouble("")));
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="txtnmpengguna.Text = \"\"";
mostCurrent._txtnmpengguna.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="txtpwd.Text = \"\"";
mostCurrent._txtpwd.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=4194310;
 //BA.debugLineNum = 4194310;BA.debugLine="showList";
_showlist();
RDebugUtils.currentLine=4194312;
 //BA.debugLineNum = 4194312;BA.debugLine="pnlakun.Visible = True";
mostCurrent._pnlakun.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4194313;
 //BA.debugLineNum = 4194313;BA.debugLine="pnladd.Visible = False";
mostCurrent._pnladd.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4194314;
 //BA.debugLineNum = 4194314;BA.debugLine="End Sub";
return "";
}
public static String  _filterlist() throws Exception{
RDebugUtils.currentModule="akunpenduduk";
if (Debug.shouldDelegate(mostCurrent.activityBA, "filterlist", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "filterlist", null));}
int _i = 0;
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub FilterList";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="ModulKoneksi.koneksi";
mostCurrent._modulkoneksi._koneksi /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="lv.Clear";
mostCurrent._lv.Clear();
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="ModulKoneksi.rs = ModulKoneksi.mh.Query(\"SELECT *";
mostCurrent._modulkoneksi._rs /*mysql.mysqlhandler.ResultSetWrapper*/  = (mysql.mysqlhandler.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new mysql.mysqlhandler.ResultSetWrapper(), (java.sql.ResultSet)(mostCurrent._modulkoneksi._mh /*mysql.mysqlhandler*/ .Query("SELECT * FROM tb_akunwarga WHERE username LIKE '%"+mostCurrent._search.getText()+"%' ORDER BY id_akun_warga ASC")));
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="For i = 0 To ModulKoneksi.rs.RowCount - 1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._modulkoneksi._rs /*mysql.mysqlhandler.ResultSetWrapper*/ .RowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="lv.AddSingleLine(ModulKoneksi.rs.GetString2(\"use";
mostCurrent._lv.AddSingleLine(BA.ObjectToCharSequence(mostCurrent._modulkoneksi._rs /*mysql.mysqlhandler.ResultSetWrapper*/ .GetString2("username")));
 }
};
RDebugUtils.currentLine=3932170;
 //BA.debugLineNum = 3932170;BA.debugLine="ModulKoneksi.mh.Close";
mostCurrent._modulkoneksi._mh /*mysql.mysqlhandler*/ .Close();
RDebugUtils.currentLine=3932171;
 //BA.debugLineNum = 3932171;BA.debugLine="End Sub";
return "";
}
public static String  _search_enterpressed() throws Exception{
RDebugUtils.currentModule="akunpenduduk";
if (Debug.shouldDelegate(mostCurrent.activityBA, "search_enterpressed", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "search_enterpressed", null));}
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Private Sub search_EnterPressed";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="FilterList";
_filterlist();
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="End Sub";
return "";
}
public static String  _spnnik_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="akunpenduduk";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spnnik_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spnnik_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Private Sub spnnik_ItemClick (Position As Int, Val";
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="End Sub";
return "";
}
}