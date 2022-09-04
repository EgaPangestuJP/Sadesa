package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class akunpenduduk_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (akunpenduduk) ","akunpenduduk",8,akunpenduduk.mostCurrent.activityBA,akunpenduduk.mostCurrent,27);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.akunpenduduk.remoteMe.runUserSub(false, "akunpenduduk","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="Activity.LoadLayout(\"AkunWarga\")";
Debug.ShouldStop(268435456);
akunpenduduk.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("AkunWarga")),akunpenduduk.mostCurrent.activityBA);
 BA.debugLineNum = 31;BA.debugLine="showList";
Debug.ShouldStop(1073741824);
_showlist();
 BA.debugLineNum = 33;BA.debugLine="isiSpinner";
Debug.ShouldStop(1);
_isispinner();
 BA.debugLineNum = 35;BA.debugLine="lv.TwoLinesLayout.Label.TextColor = Colors.Black";
Debug.ShouldStop(4);
akunpenduduk.mostCurrent._lv.runMethod(false,"getTwoLinesLayout").getField(false,"Label").runMethod(true,"setTextColor",akunpenduduk.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 36;BA.debugLine="lv.TwoLinesLayout.Label.TextSize = 15";
Debug.ShouldStop(8);
akunpenduduk.mostCurrent._lv.runMethod(false,"getTwoLinesLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 38;BA.debugLine="pnlakun.Visible = True";
Debug.ShouldStop(32);
akunpenduduk.mostCurrent._pnlakun.runMethod(true,"setVisible",akunpenduduk.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 39;BA.debugLine="pnladd.Visible = False";
Debug.ShouldStop(64);
akunpenduduk.mostCurrent._pnladd.runMethod(true,"setVisible",akunpenduduk.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (akunpenduduk) ","akunpenduduk",8,akunpenduduk.mostCurrent.activityBA,akunpenduduk.mostCurrent,47);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.akunpenduduk.remoteMe.runUserSub(false, "akunpenduduk","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 47;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (akunpenduduk) ","akunpenduduk",8,akunpenduduk.mostCurrent.activityBA,akunpenduduk.mostCurrent,43);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.akunpenduduk.remoteMe.runUserSub(false, "akunpenduduk","activity_resume");}
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1024);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnadd_click() throws Exception{
try {
		Debug.PushSubsStack("btnadd_Click (akunpenduduk) ","akunpenduduk",8,akunpenduduk.mostCurrent.activityBA,akunpenduduk.mostCurrent,85);
if (RapidSub.canDelegate("btnadd_click")) { return b4a.example.akunpenduduk.remoteMe.runUserSub(false, "akunpenduduk","btnadd_click");}
 BA.debugLineNum = 85;BA.debugLine="Private Sub btnadd_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="pnlakun.Visible = False";
Debug.ShouldStop(2097152);
akunpenduduk.mostCurrent._pnlakun.runMethod(true,"setVisible",akunpenduduk.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 87;BA.debugLine="pnladd.Visible = True";
Debug.ShouldStop(4194304);
akunpenduduk.mostCurrent._pnladd.runMethod(true,"setVisible",akunpenduduk.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnback_click() throws Exception{
try {
		Debug.PushSubsStack("btnBack_Click (akunpenduduk) ","akunpenduduk",8,akunpenduduk.mostCurrent.activityBA,akunpenduduk.mostCurrent,90);
if (RapidSub.canDelegate("btnback_click")) { return b4a.example.akunpenduduk.remoteMe.runUserSub(false, "akunpenduduk","btnback_click");}
 BA.debugLineNum = 90;BA.debugLine="Private Sub btnBack_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 92;BA.debugLine="pnlakun.Visible = True";
Debug.ShouldStop(134217728);
akunpenduduk.mostCurrent._pnlakun.runMethod(true,"setVisible",akunpenduduk.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 93;BA.debugLine="pnladd.Visible = False";
Debug.ShouldStop(268435456);
akunpenduduk.mostCurrent._pnladd.runMethod(true,"setVisible",akunpenduduk.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnkembali_click() throws Exception{
try {
		Debug.PushSubsStack("btnkembali_Click (akunpenduduk) ","akunpenduduk",8,akunpenduduk.mostCurrent.activityBA,akunpenduduk.mostCurrent,149);
if (RapidSub.canDelegate("btnkembali_click")) { return b4a.example.akunpenduduk.remoteMe.runUserSub(false, "akunpenduduk","btnkembali_click");}
 BA.debugLineNum = 149;BA.debugLine="Private Sub btnkembali_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 150;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2097152);
akunpenduduk.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 151;BA.debugLine="StartActivity(actBeranda)";
Debug.ShouldStop(4194304);
akunpenduduk.mostCurrent.__c.runVoidMethod ("StartActivity",akunpenduduk.processBA,(Object)((akunpenduduk.mostCurrent._actberanda.getObject())));
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsave_click() throws Exception{
try {
		Debug.PushSubsStack("btnSave_Click (akunpenduduk) ","akunpenduduk",8,akunpenduduk.mostCurrent.activityBA,akunpenduduk.mostCurrent,103);
if (RapidSub.canDelegate("btnsave_click")) { return b4a.example.akunpenduduk.remoteMe.runUserSub(false, "akunpenduduk","btnsave_click");}
 BA.debugLineNum = 103;BA.debugLine="Private Sub btnSave_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 105;BA.debugLine="If spnnik.SelectedIndex = \"\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",akunpenduduk.mostCurrent._spnnik.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, ""))) { 
 BA.debugLineNum = 106;BA.debugLine="MsgboxAsync(\"Masukkan NIK | Nama Lengkap\",\"Info\"";
Debug.ShouldStop(512);
akunpenduduk.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Masukkan NIK | Nama Lengkap")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),akunpenduduk.processBA);
 BA.debugLineNum = 107;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 110;BA.debugLine="If txtnmpengguna.Text = \"\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",akunpenduduk.mostCurrent._txtnmpengguna.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 111;BA.debugLine="MsgboxAsync(\"Masukkan Nama Pengguna\",\"Info\")";
Debug.ShouldStop(16384);
akunpenduduk.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Masukkan Nama Pengguna")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),akunpenduduk.processBA);
 BA.debugLineNum = 112;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 115;BA.debugLine="If txtpwd.Text = \"\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",akunpenduduk.mostCurrent._txtpwd.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 116;BA.debugLine="MsgboxAsync(\"Masukkan Password\",\"Info\")";
Debug.ShouldStop(524288);
akunpenduduk.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Masukkan Password")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),akunpenduduk.processBA);
 BA.debugLineNum = 117;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 120;BA.debugLine="If btnSave.Text = \"Simpan\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",akunpenduduk.mostCurrent._btnsave.runMethod(true,"getText"),BA.ObjectToString("Simpan"))) { 
 BA.debugLineNum = 122;BA.debugLine="ModulKoneksi.koneksi";
Debug.ShouldStop(33554432);
akunpenduduk.mostCurrent._modulkoneksi.runVoidMethod ("_koneksi" /*RemoteObject*/ ,akunpenduduk.mostCurrent.activityBA);
 BA.debugLineNum = 125;BA.debugLine="ModulKoneksi.rs = ModulKoneksi.mh.Query(\"SELECT";
Debug.ShouldStop(268435456);
akunpenduduk.mostCurrent._modulkoneksi._rs /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("mysql.mysqlhandler.ResultSetWrapper"), akunpenduduk.mostCurrent._modulkoneksi._mh /*RemoteObject*/ .runMethod(false,"Query",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM tb_akunwarga WHERE username='"),akunpenduduk.mostCurrent._spnnik.runMethod(true,"getSelectedItem"),RemoteObject.createImmutable("'")))));
 BA.debugLineNum = 126;BA.debugLine="If ModulKoneksi.rs.RowCount > 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",akunpenduduk.mostCurrent._modulkoneksi._rs /*RemoteObject*/ .runMethod(true,"RowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 127;BA.debugLine="MsgboxAsync(\"Akun telah digunakan\",\"Info\")";
Debug.ShouldStop(1073741824);
akunpenduduk.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Akun telah digunakan")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),akunpenduduk.processBA);
 };
 BA.debugLineNum = 131;BA.debugLine="ModulKoneksi.mh.Exec(\"INSERT INTO tb_akunwarga V";
Debug.ShouldStop(4);
akunpenduduk.mostCurrent._modulkoneksi._mh /*RemoteObject*/ .runVoidMethod ("Exec",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO tb_akunwarga VALUES('"),akunpenduduk.mostCurrent._spnnik.runMethod(true,"getSelectedItem"),RemoteObject.createImmutable("', '"),akunpenduduk.mostCurrent._txtnmpengguna.runMethod(true,"getText"),RemoteObject.createImmutable("', '"),akunpenduduk.mostCurrent._txtpwd.runMethod(true,"getText"),RemoteObject.createImmutable("')"))));
 }else {
 BA.debugLineNum = 133;BA.debugLine="tampilanAwal";
Debug.ShouldStop(16);
_tampilanawal();
 };
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _filterlist() throws Exception{
try {
		Debug.PushSubsStack("FilterList (akunpenduduk) ","akunpenduduk",8,akunpenduduk.mostCurrent.activityBA,akunpenduduk.mostCurrent,71);
if (RapidSub.canDelegate("filterlist")) { return b4a.example.akunpenduduk.remoteMe.runUserSub(false, "akunpenduduk","filterlist");}
int _i = 0;
 BA.debugLineNum = 71;BA.debugLine="Sub FilterList";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="ModulKoneksi.koneksi";
Debug.ShouldStop(128);
akunpenduduk.mostCurrent._modulkoneksi.runVoidMethod ("_koneksi" /*RemoteObject*/ ,akunpenduduk.mostCurrent.activityBA);
 BA.debugLineNum = 74;BA.debugLine="lv.Clear";
Debug.ShouldStop(512);
akunpenduduk.mostCurrent._lv.runVoidMethod ("Clear");
 BA.debugLineNum = 75;BA.debugLine="ModulKoneksi.rs = ModulKoneksi.mh.Query(\"SELECT *";
Debug.ShouldStop(1024);
akunpenduduk.mostCurrent._modulkoneksi._rs /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("mysql.mysqlhandler.ResultSetWrapper"), akunpenduduk.mostCurrent._modulkoneksi._mh /*RemoteObject*/ .runMethod(false,"Query",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM tb_akunwarga WHERE username LIKE '%"),akunpenduduk.mostCurrent._search.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY id_akun_warga ASC")))));
 BA.debugLineNum = 77;BA.debugLine="For i = 0 To ModulKoneksi.rs.RowCount - 1";
Debug.ShouldStop(4096);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {akunpenduduk.mostCurrent._modulkoneksi._rs /*RemoteObject*/ .runMethod(true,"RowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 78;BA.debugLine="lv.AddSingleLine(ModulKoneksi.rs.GetString2(\"use";
Debug.ShouldStop(8192);
akunpenduduk.mostCurrent._lv.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(akunpenduduk.mostCurrent._modulkoneksi._rs /*RemoteObject*/ .runMethod(true,"GetString2",(Object)(RemoteObject.createImmutable("username"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 81;BA.debugLine="ModulKoneksi.mh.Close";
Debug.ShouldStop(65536);
akunpenduduk.mostCurrent._modulkoneksi._mh /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private lv As ListView";
akunpenduduk.mostCurrent._lv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private search As EditText";
akunpenduduk.mostCurrent._search = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private btnadd As Button";
akunpenduduk.mostCurrent._btnadd = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private pnlakun As Panel";
akunpenduduk.mostCurrent._pnlakun = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private pnladd As Panel";
akunpenduduk.mostCurrent._pnladd = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private txtnmpengguna As EditText";
akunpenduduk.mostCurrent._txtnmpengguna = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private txtpwd As EditText";
akunpenduduk.mostCurrent._txtpwd = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private btnSave As Button";
akunpenduduk.mostCurrent._btnsave = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private spnnik As Spinner";
akunpenduduk.mostCurrent._spnnik = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _isispinner() throws Exception{
try {
		Debug.PushSubsStack("isiSpinner (akunpenduduk) ","akunpenduduk",8,akunpenduduk.mostCurrent.activityBA,akunpenduduk.mostCurrent,96);
if (RapidSub.canDelegate("isispinner")) { return b4a.example.akunpenduduk.remoteMe.runUserSub(false, "akunpenduduk","isispinner");}
 BA.debugLineNum = 96;BA.debugLine="Sub isiSpinner";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="ModulKoneksi.koneksi";
Debug.ShouldStop(1);
akunpenduduk.mostCurrent._modulkoneksi.runVoidMethod ("_koneksi" /*RemoteObject*/ ,akunpenduduk.mostCurrent.activityBA);
 BA.debugLineNum = 99;BA.debugLine="spnnik.Clear";
Debug.ShouldStop(4);
akunpenduduk.mostCurrent._spnnik.runVoidMethod ("Clear");
 BA.debugLineNum = 100;BA.debugLine="spnnik.Add(ModulKoneksi.mh.Query(\"SELECT nik, nam";
Debug.ShouldStop(8);
akunpenduduk.mostCurrent._spnnik.runVoidMethod ("Add",(Object)(BA.ObjectToString(akunpenduduk.mostCurrent._modulkoneksi._mh /*RemoteObject*/ .runMethod(false,"Query",(Object)(RemoteObject.createImmutable("SELECT nik, nama FROM tb_penduduk ORDER BY id_penduduk"))))));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _search_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("search_EnterPressed (akunpenduduk) ","akunpenduduk",8,akunpenduduk.mostCurrent.activityBA,akunpenduduk.mostCurrent,52);
if (RapidSub.canDelegate("search_enterpressed")) { return b4a.example.akunpenduduk.remoteMe.runUserSub(false, "akunpenduduk","search_enterpressed");}
 BA.debugLineNum = 52;BA.debugLine="Private Sub search_EnterPressed";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="FilterList";
Debug.ShouldStop(1048576);
_filterlist();
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showlist() throws Exception{
try {
		Debug.PushSubsStack("showList (akunpenduduk) ","akunpenduduk",8,akunpenduduk.mostCurrent.activityBA,akunpenduduk.mostCurrent,57);
if (RapidSub.canDelegate("showlist")) { return b4a.example.akunpenduduk.remoteMe.runUserSub(false, "akunpenduduk","showlist");}
int _i = 0;
 BA.debugLineNum = 57;BA.debugLine="Sub showList";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="ModulKoneksi.koneksi";
Debug.ShouldStop(33554432);
akunpenduduk.mostCurrent._modulkoneksi.runVoidMethod ("_koneksi" /*RemoteObject*/ ,akunpenduduk.mostCurrent.activityBA);
 BA.debugLineNum = 60;BA.debugLine="lv.Clear";
Debug.ShouldStop(134217728);
akunpenduduk.mostCurrent._lv.runVoidMethod ("Clear");
 BA.debugLineNum = 61;BA.debugLine="ModulKoneksi.rs = ModulKoneksi.mh.Query(\"SELECT *";
Debug.ShouldStop(268435456);
akunpenduduk.mostCurrent._modulkoneksi._rs /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("mysql.mysqlhandler.ResultSetWrapper"), akunpenduduk.mostCurrent._modulkoneksi._mh /*RemoteObject*/ .runMethod(false,"Query",(Object)(RemoteObject.createImmutable("SELECT * FROM tb_akunwarga ORDER BY id_akun_warga ASC"))));
 BA.debugLineNum = 63;BA.debugLine="For i = 0 To ModulKoneksi.rs.RowCount - 1";
Debug.ShouldStop(1073741824);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {akunpenduduk.mostCurrent._modulkoneksi._rs /*RemoteObject*/ .runMethod(true,"RowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 64;BA.debugLine="ModulKoneksi.rs.Position  = i";
Debug.ShouldStop(-2147483648);
akunpenduduk.mostCurrent._modulkoneksi._rs /*RemoteObject*/ .runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 65;BA.debugLine="lv.AddTwoLines(ModulKoneksi.rs.GetString2(\"id_ak";
Debug.ShouldStop(1);
akunpenduduk.mostCurrent._lv.runVoidMethod ("AddTwoLines",(Object)(BA.ObjectToCharSequence(akunpenduduk.mostCurrent._modulkoneksi._rs /*RemoteObject*/ .runMethod(true,"GetString2",(Object)(RemoteObject.createImmutable("id_akun_warga"))))),(Object)(BA.ObjectToCharSequence(akunpenduduk.mostCurrent._modulkoneksi._rs /*RemoteObject*/ .runMethod(true,"GetString2",(Object)(RemoteObject.createImmutable("username"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 68;BA.debugLine="ModulKoneksi.mh.Close";
Debug.ShouldStop(8);
akunpenduduk.mostCurrent._modulkoneksi._mh /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spnnik_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("spnnik_ItemClick (akunpenduduk) ","akunpenduduk",8,akunpenduduk.mostCurrent.activityBA,akunpenduduk.mostCurrent,154);
if (RapidSub.canDelegate("spnnik_itemclick")) { return b4a.example.akunpenduduk.remoteMe.runUserSub(false, "akunpenduduk","spnnik_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 154;BA.debugLine="Private Sub spnnik_ItemClick (Position As Int, Val";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tampilanawal() throws Exception{
try {
		Debug.PushSubsStack("tampilanAwal (akunpenduduk) ","akunpenduduk",8,akunpenduduk.mostCurrent.activityBA,akunpenduduk.mostCurrent,137);
if (RapidSub.canDelegate("tampilanawal")) { return b4a.example.akunpenduduk.remoteMe.runUserSub(false, "akunpenduduk","tampilanawal");}
 BA.debugLineNum = 137;BA.debugLine="Sub tampilanAwal";
Debug.ShouldStop(256);
 BA.debugLineNum = 138;BA.debugLine="spnnik.SelectedIndex = \"\"";
Debug.ShouldStop(512);
akunpenduduk.mostCurrent._spnnik.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, ""));
 BA.debugLineNum = 139;BA.debugLine="txtnmpengguna.Text = \"\"";
Debug.ShouldStop(1024);
akunpenduduk.mostCurrent._txtnmpengguna.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 140;BA.debugLine="txtpwd.Text = \"\"";
Debug.ShouldStop(2048);
akunpenduduk.mostCurrent._txtpwd.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 143;BA.debugLine="showList";
Debug.ShouldStop(16384);
_showlist();
 BA.debugLineNum = 145;BA.debugLine="pnlakun.Visible = True";
Debug.ShouldStop(65536);
akunpenduduk.mostCurrent._pnlakun.runMethod(true,"setVisible",akunpenduduk.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 146;BA.debugLine="pnladd.Visible = False";
Debug.ShouldStop(131072);
akunpenduduk.mostCurrent._pnladd.runMethod(true,"setVisible",akunpenduduk.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}