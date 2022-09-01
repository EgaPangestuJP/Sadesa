package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class actberanda_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (actberanda) ","actberanda",4,actberanda.mostCurrent.activityBA,actberanda.mostCurrent,18);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.actberanda.remoteMe.runUserSub(false, "actberanda","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 18;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 20;BA.debugLine="Activity.LoadLayout(\"berandaadmindesa\")";
Debug.ShouldStop(524288);
actberanda.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("berandaadmindesa")),actberanda.mostCurrent.activityBA);
 BA.debugLineNum = 21;BA.debugLine="ShowList";
Debug.ShouldStop(1048576);
_showlist();
 BA.debugLineNum = 22;BA.debugLine="lv.SingleLineLayout.Label.TextColor = Colors.Blac";
Debug.ShouldStop(2097152);
actberanda.mostCurrent._lv.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",actberanda.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 23;BA.debugLine="lv.SingleLineLayout.Label.TextSize = 15";
Debug.ShouldStop(4194304);
actberanda.mostCurrent._lv.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
<<<<<<< HEAD
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (actberanda) ","actberanda",4,actberanda.mostCurrent.activityBA,actberanda.mostCurrent,41);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.actberanda.remoteMe.runUserSub(false, "actberanda","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 41;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Activity_Resume (actberanda) ","actberanda",4,actberanda.mostCurrent.activityBA,actberanda.mostCurrent,37);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.actberanda.remoteMe.runUserSub(false, "actberanda","activity_resume");}
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16);
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
=======
public static RemoteObject  _btnakunwarga_click() throws Exception{
try {
		Debug.PushSubsStack("btnakunwarga_Click (actberanda) ","actberanda",4,actberanda.mostCurrent.activityBA,actberanda.mostCurrent,31);
if (RapidSub.canDelegate("btnakunwarga_click")) { return b4a.example.actberanda.remoteMe.runUserSub(false, "actberanda","btnakunwarga_click");}
 BA.debugLineNum = 31;BA.debugLine="Private Sub btnakunwarga_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Activity.Finish";
Debug.ShouldStop(-2147483648);
actberanda.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 33;BA.debugLine="StartActivity(AkunPenduduk)";
Debug.ShouldStop(1);
actberanda.mostCurrent.__c.runVoidMethod ("StartActivity",actberanda.processBA,(Object)((actberanda.mostCurrent._akunpenduduk.getObject())));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
>>>>>>> 5204d7a0311585b33749d5e518350530ee61520a
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
 //BA.debugLineNum = 15;BA.debugLine="Private lv As ListView";
actberanda.mostCurrent._lv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _showlist() throws Exception{
try {
		Debug.PushSubsStack("ShowList (actberanda) ","actberanda",4,actberanda.mostCurrent.activityBA,actberanda.mostCurrent,27);
if (RapidSub.canDelegate("showlist")) { return b4a.example.actberanda.remoteMe.runUserSub(false, "actberanda","showlist");}
int _i = 0;
 BA.debugLineNum = 27;BA.debugLine="Sub ShowList";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="ModulKoneksi.koneksi";
Debug.ShouldStop(134217728);
actberanda.mostCurrent._modulkoneksi.runVoidMethod ("_koneksi" /*RemoteObject*/ ,actberanda.mostCurrent.activityBA);
 BA.debugLineNum = 29;BA.debugLine="lv.Clear";
Debug.ShouldStop(268435456);
actberanda.mostCurrent._lv.runVoidMethod ("Clear");
 BA.debugLineNum = 30;BA.debugLine="ModulKoneksi.rs = ModulKoneksi.mh.Query(\"SELECT *";
Debug.ShouldStop(536870912);
actberanda.mostCurrent._modulkoneksi._rs /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("mysql.mysqlhandler.ResultSetWrapper"), actberanda.mostCurrent._modulkoneksi._mh /*RemoteObject*/ .runMethod(false,"Query",(Object)(RemoteObject.createImmutable("SELECT * FROM tb_desa ORDER BY id_desa ASC"))));
 BA.debugLineNum = 31;BA.debugLine="For i = 0 To ModulKoneksi.rs.RowCount - 1";
Debug.ShouldStop(1073741824);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {actberanda.mostCurrent._modulkoneksi._rs /*RemoteObject*/ .runMethod(true,"RowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 32;BA.debugLine="lv.AddSingleLine(ModulKoneksi.rs.GetString2(\"nam";
Debug.ShouldStop(-2147483648);
actberanda.mostCurrent._lv.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(actberanda.mostCurrent._modulkoneksi._rs /*RemoteObject*/ .runMethod(true,"GetString2",(Object)(RemoteObject.createImmutable("nama_desa"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 34;BA.debugLine="ModulKoneksi.mh.Close";
Debug.ShouldStop(2);
actberanda.mostCurrent._modulkoneksi._mh /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}