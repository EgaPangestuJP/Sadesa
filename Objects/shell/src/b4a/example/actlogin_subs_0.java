package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class actlogin_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (actlogin) ","actlogin",5,actlogin.mostCurrent.activityBA,actlogin.mostCurrent,22);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.actlogin.remoteMe.runUserSub(false, "actlogin","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 22;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 24;BA.debugLine="Activity.LoadLayout(\"Login\")";
Debug.ShouldStop(8388608);
actlogin.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Login")),actlogin.mostCurrent.activityBA);
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Activity_Pause (actlogin) ","actlogin",5,actlogin.mostCurrent.activityBA,actlogin.mostCurrent,32);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.actlogin.remoteMe.runUserSub(false, "actlogin","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(-2147483648);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (actlogin) ","actlogin",5,actlogin.mostCurrent.activityBA,actlogin.mostCurrent,28);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.actlogin.remoteMe.runUserSub(false, "actlogin","activity_resume");}
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("BtnKembali_Click (actlogin) ","actlogin",5,actlogin.mostCurrent.activityBA,actlogin.mostCurrent,45);
if (RapidSub.canDelegate("btnkembali_click")) { return b4a.example.actlogin.remoteMe.runUserSub(false, "actlogin","btnkembali_click");}
 BA.debugLineNum = 45;BA.debugLine="Private Sub BtnKembali_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="StartActivity(actOpsi)";
Debug.ShouldStop(8192);
actlogin.mostCurrent.__c.runVoidMethod ("StartActivity",actlogin.processBA,(Object)((actlogin.mostCurrent._actopsi.getObject())));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlogin_click() throws Exception{
try {
		Debug.PushSubsStack("BtnLogin_Click (actlogin) ","actlogin",5,actlogin.mostCurrent.activityBA,actlogin.mostCurrent,49);
if (RapidSub.canDelegate("btnlogin_click")) { return b4a.example.actlogin.remoteMe.runUserSub(false, "actlogin","btnlogin_click");}
 BA.debugLineNum = 49;BA.debugLine="Private Sub BtnLogin_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="StartActivity(actBeranda)";
Debug.ShouldStop(131072);
actlogin.mostCurrent.__c.runVoidMethod ("StartActivity",actlogin.processBA,(Object)((actlogin.mostCurrent._actberanda.getObject())));
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
public static RemoteObject  _btnlupakatasandi_click() throws Exception{
try {
		Debug.PushSubsStack("btnLupaKataSandi_Click (actlogin) ","actlogin",5,actlogin.mostCurrent.activityBA,actlogin.mostCurrent,41);
if (RapidSub.canDelegate("btnlupakatasandi_click")) { return b4a.example.actlogin.remoteMe.runUserSub(false, "actlogin","btnlupakatasandi_click");}
 BA.debugLineNum = 41;BA.debugLine="Private Sub btnLupaKataSandi_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="StartActivity(actLupaKataSandi)";
Debug.ShouldStop(512);
actlogin.mostCurrent.__c.runVoidMethod ("StartActivity",actlogin.processBA,(Object)((actlogin.mostCurrent._actlupakatasandi.getObject())));
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
public static RemoteObject  _btnregis_click() throws Exception{
try {
		Debug.PushSubsStack("btnRegis_Click (actlogin) ","actlogin",5,actlogin.mostCurrent.activityBA,actlogin.mostCurrent,37);
if (RapidSub.canDelegate("btnregis_click")) { return b4a.example.actlogin.remoteMe.runUserSub(false, "actlogin","btnregis_click");}
 BA.debugLineNum = 37;BA.debugLine="Private Sub btnRegis_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="StartActivity(actRegister)";
Debug.ShouldStop(32);
actlogin.mostCurrent.__c.runVoidMethod ("StartActivity",actlogin.processBA,(Object)((actlogin.mostCurrent._actregister.getObject())));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
 //BA.debugLineNum = 16;BA.debugLine="Private btnLupaKataSandi As Button";
actlogin.mostCurrent._btnlupakatasandi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private btnRegis As Button";
actlogin.mostCurrent._btnregis = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private BtnKembali As Button";
actlogin.mostCurrent._btnkembali = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private BtnLogin As Button";
actlogin.mostCurrent._btnlogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}