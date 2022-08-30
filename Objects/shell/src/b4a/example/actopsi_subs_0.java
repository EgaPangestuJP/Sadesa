package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class actopsi_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (actopsi) ","actopsi",2,actopsi.mostCurrent.activityBA,actopsi.mostCurrent,21);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.actopsi.remoteMe.runUserSub(false, "actopsi","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 21;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 23;BA.debugLine="Activity.LoadLayout(\"Opsi\")";
Debug.ShouldStop(4194304);
actopsi.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Opsi")),actopsi.mostCurrent.activityBA);
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (actopsi) ","actopsi",2,actopsi.mostCurrent.activityBA,actopsi.mostCurrent,31);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.actopsi.remoteMe.runUserSub(false, "actopsi","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (actopsi) ","actopsi",2,actopsi.mostCurrent.activityBA,actopsi.mostCurrent,27);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.actopsi.remoteMe.runUserSub(false, "actopsi","activity_resume");}
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Resume";
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
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (actopsi) ","actopsi",2,actopsi.mostCurrent.activityBA,actopsi.mostCurrent,44);
if (RapidSub.canDelegate("button1_click")) { return b4a.example.actopsi.remoteMe.runUserSub(false, "actopsi","button1_click");}
 BA.debugLineNum = 44;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="StartActivity(actLogin)";
Debug.ShouldStop(4096);
actopsi.mostCurrent.__c.runVoidMethod ("StartActivity",actopsi.processBA,(Object)((actopsi.mostCurrent._actlogin.getObject())));
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
public static RemoteObject  _button2_click() throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (actopsi) ","actopsi",2,actopsi.mostCurrent.activityBA,actopsi.mostCurrent,40);
if (RapidSub.canDelegate("button2_click")) { return b4a.example.actopsi.remoteMe.runUserSub(false, "actopsi","button2_click");}
 BA.debugLineNum = 40;BA.debugLine="Private Sub Button2_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="StartActivity(actLogin)";
Debug.ShouldStop(256);
actopsi.mostCurrent.__c.runVoidMethod ("StartActivity",actopsi.processBA,(Object)((actopsi.mostCurrent._actlogin.getObject())));
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
public static RemoteObject  _button3_click() throws Exception{
try {
		Debug.PushSubsStack("Button3_Click (actopsi) ","actopsi",2,actopsi.mostCurrent.activityBA,actopsi.mostCurrent,36);
if (RapidSub.canDelegate("button3_click")) { return b4a.example.actopsi.remoteMe.runUserSub(false, "actopsi","button3_click");}
 BA.debugLineNum = 36;BA.debugLine="Private Sub Button3_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="StartActivity(actLogin)";
Debug.ShouldStop(16);
actopsi.mostCurrent.__c.runVoidMethod ("StartActivity",actopsi.processBA,(Object)((actopsi.mostCurrent._actlogin.getObject())));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
 //BA.debugLineNum = 16;BA.debugLine="Private Button1 As Button";
actopsi.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private Button2 As Button";
actopsi.mostCurrent._button2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private Button3 As Button";
actopsi.mostCurrent._button3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}