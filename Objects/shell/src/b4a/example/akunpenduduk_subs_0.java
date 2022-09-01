package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class akunpenduduk_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (akunpenduduk) ","akunpenduduk",8,akunpenduduk.mostCurrent.activityBA,akunpenduduk.mostCurrent,21);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.akunpenduduk.remoteMe.runUserSub(false, "akunpenduduk","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 21;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 23;BA.debugLine="Activity.LoadLayout(\"akunpenduduk\")";
Debug.ShouldStop(4194304);
akunpenduduk.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("akunpenduduk")),akunpenduduk.mostCurrent.activityBA);
 BA.debugLineNum = 25;BA.debugLine="showList";
Debug.ShouldStop(16777216);
_showlist();
 BA.debugLineNum = 27;BA.debugLine="lv.SingleLineLayout.Label.TextColor = Colors.Blac";
Debug.ShouldStop(67108864);
akunpenduduk.mostCurrent._lv.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",akunpenduduk.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 28;BA.debugLine="lv.SingleLineLayout.Label.TextSize = 15";
Debug.ShouldStop(134217728);
akunpenduduk.mostCurrent._lv.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Activity_Pause (akunpenduduk) ","akunpenduduk",8,akunpenduduk.mostCurrent.activityBA,akunpenduduk.mostCurrent,35);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.akunpenduduk.remoteMe.runUserSub(false, "akunpenduduk","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Activity_Resume (akunpenduduk) ","akunpenduduk",8,akunpenduduk.mostCurrent.activityBA,akunpenduduk.mostCurrent,31);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.akunpenduduk.remoteMe.runUserSub(false, "akunpenduduk","activity_resume");}
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("btnadd_Click (akunpenduduk) ","akunpenduduk",8,akunpenduduk.mostCurrent.activityBA,akunpenduduk.mostCurrent,48);
if (RapidSub.canDelegate("btnadd_click")) { return b4a.example.akunpenduduk.remoteMe.runUserSub(false, "akunpenduduk","btnadd_click");}
 BA.debugLineNum = 48;BA.debugLine="Private Sub btnadd_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("FilterList (akunpenduduk) ","akunpenduduk",8,akunpenduduk.mostCurrent.activityBA,akunpenduduk.mostCurrent,66);
if (RapidSub.canDelegate("filterlist")) { return b4a.example.akunpenduduk.remoteMe.runUserSub(false, "akunpenduduk","filterlist");}
int _i = 0;
 BA.debugLineNum = 66;BA.debugLine="Sub FilterList";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="ModulKoneksi.koneksi";
Debug.ShouldStop(4);
akunpenduduk.mostCurrent._modulkoneksi.runVoidMethod ("_koneksi" /*RemoteObject*/ ,akunpenduduk.mostCurrent.activityBA);
 BA.debugLineNum = 69;BA.debugLine="lv.Clear";
Debug.ShouldStop(16);
akunpenduduk.mostCurrent._lv.runVoidMethod ("Clear");
 BA.debugLineNum = 70;BA.debugLine="ModulKoneksi.rs = ModulKoneksi.mh.Query(\"SELECT *";
Debug.ShouldStop(32);
akunpenduduk.mostCurrent._modulkoneksi._rs /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("mysql.mysqlhandler.ResultSetWrapper"), akunpenduduk.mostCurrent._modulkoneksi._mh /*RemoteObject*/ .runMethod(false,"Query",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM tb_akunwarga WHERE username LIKE '%"),akunpenduduk.mostCurrent._search.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY id_akun_warga ASC")))));
 BA.debugLineNum = 72;BA.debugLine="For i = 0 To ModulKoneksi.rs.RowCount - 1";
Debug.ShouldStop(128);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {akunpenduduk.mostCurrent._modulkoneksi._rs /*RemoteObject*/ .runMethod(true,"RowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 73;BA.debugLine="lv.AddSingleLine(ModulKoneksi.rs.GetString2(\"use";
Debug.ShouldStop(256);
akunpenduduk.mostCurrent._lv.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(akunpenduduk.mostCurrent._modulkoneksi._rs /*RemoteObject*/ .runMethod(true,"GetString2",(Object)(RemoteObject.createImmutable("username"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 76;BA.debugLine="ModulKoneksi.mh.Close";
Debug.ShouldStop(2048);
akunpenduduk.mostCurrent._modulkoneksi._mh /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lv_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("lv_ItemClick (akunpenduduk) ","akunpenduduk",8,akunpenduduk.mostCurrent.activityBA,akunpenduduk.mostCurrent,40);
if (RapidSub.canDelegate("lv_itemclick")) { return b4a.example.akunpenduduk.remoteMe.runUserSub(false, "akunpenduduk","lv_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 40;BA.debugLine="Private Sub lv_ItemClick (Position As Int, Value A";
Debug.ShouldStop(128);
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("search_EnterPressed (akunpenduduk) ","akunpenduduk",8,akunpenduduk.mostCurrent.activityBA,akunpenduduk.mostCurrent,44);
if (RapidSub.canDelegate("search_enterpressed")) { return b4a.example.akunpenduduk.remoteMe.runUserSub(false, "akunpenduduk","search_enterpressed");}
 BA.debugLineNum = 44;BA.debugLine="Private Sub search_EnterPressed";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="FilterList";
Debug.ShouldStop(4096);
_filterlist();
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("showList (akunpenduduk) ","akunpenduduk",8,akunpenduduk.mostCurrent.activityBA,akunpenduduk.mostCurrent,53);
if (RapidSub.canDelegate("showlist")) { return b4a.example.akunpenduduk.remoteMe.runUserSub(false, "akunpenduduk","showlist");}
int _i = 0;
 BA.debugLineNum = 53;BA.debugLine="Sub showList";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="ModulKoneksi.koneksi";
Debug.ShouldStop(2097152);
akunpenduduk.mostCurrent._modulkoneksi.runVoidMethod ("_koneksi" /*RemoteObject*/ ,akunpenduduk.mostCurrent.activityBA);
 BA.debugLineNum = 56;BA.debugLine="lv.Clear";
Debug.ShouldStop(8388608);
akunpenduduk.mostCurrent._lv.runVoidMethod ("Clear");
 BA.debugLineNum = 57;BA.debugLine="ModulKoneksi.rs = ModulKoneksi.mh.Query(\"SELECT *";
Debug.ShouldStop(16777216);
akunpenduduk.mostCurrent._modulkoneksi._rs /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("mysql.mysqlhandler.ResultSetWrapper"), akunpenduduk.mostCurrent._modulkoneksi._mh /*RemoteObject*/ .runMethod(false,"Query",(Object)(RemoteObject.createImmutable("SELECT * FROM tb_akunwarga ORDER BY id_akun_warga ASC"))));
 BA.debugLineNum = 59;BA.debugLine="For i = 0 To ModulKoneksi.rs.RowCount - 1";
Debug.ShouldStop(67108864);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {akunpenduduk.mostCurrent._modulkoneksi._rs /*RemoteObject*/ .runMethod(true,"RowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 60;BA.debugLine="lv.AddSingleLine(ModulKoneksi.rs.GetString2(\"use";
Debug.ShouldStop(134217728);
akunpenduduk.mostCurrent._lv.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(akunpenduduk.mostCurrent._modulkoneksi._rs /*RemoteObject*/ .runMethod(true,"GetString2",(Object)(RemoteObject.createImmutable("username"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 63;BA.debugLine="ModulKoneksi.mh.Close";
Debug.ShouldStop(1073741824);
akunpenduduk.mostCurrent._modulkoneksi._mh /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}