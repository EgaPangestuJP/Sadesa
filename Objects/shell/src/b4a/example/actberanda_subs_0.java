package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class actberanda_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (actberanda) ","actberanda",4,actberanda.mostCurrent.activityBA,actberanda.mostCurrent,17);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.actberanda.remoteMe.runUserSub(false, "actberanda","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 17;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 19;BA.debugLine="Activity.LoadLayout(\"berandaadmindesa\")";
Debug.ShouldStop(262144);
actberanda.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("berandaadmindesa")),actberanda.mostCurrent.activityBA);
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Activity_Pause (actberanda) ","actberanda",4,actberanda.mostCurrent.activityBA,actberanda.mostCurrent,27);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.actberanda.remoteMe.runUserSub(false, "actberanda","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(67108864);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (actberanda) ","actberanda",4,actberanda.mostCurrent.activityBA,actberanda.mostCurrent,23);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.actberanda.remoteMe.runUserSub(false, "actberanda","activity_resume");}
 BA.debugLineNum = 23;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4194304);
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
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}