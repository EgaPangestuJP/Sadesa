package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class actlogin_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firesultsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (actlogin) ","actlogin",2,actlogin.mostCurrent.activityBA,actlogin.mostCurrent,27);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.actlogin.remoteMe.runUserSub(false, "actlogin","activity_create", _firesultsttime);}
Debug.locals.put("FiResultStTime", _firesultsttime);
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Create(FiResultStTime As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="Activity.LoadLayout(\"Login\")";
Debug.ShouldStop(268435456);
actlogin.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Login")),actlogin.mostCurrent.activityBA);
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (actlogin) ","actlogin",2,actlogin.mostCurrent.activityBA,actlogin.mostCurrent,36);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.actlogin.remoteMe.runUserSub(false, "actlogin","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (actlogin) ","actlogin",2,actlogin.mostCurrent.activityBA,actlogin.mostCurrent,32);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.actlogin.remoteMe.runUserSub(false, "actlogin","activity_resume");}
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Resume";
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
public static RemoteObject  _btnlogin_click() throws Exception{
try {
		Debug.PushSubsStack("BtnLogin_Click (actlogin) ","actlogin",2,actlogin.mostCurrent.activityBA,actlogin.mostCurrent,51);
if (RapidSub.canDelegate("btnlogin_click")) { return b4a.example.actlogin.remoteMe.runUserSub(false, "actlogin","btnlogin_click");}
 BA.debugLineNum = 51;BA.debugLine="Private Sub BtnLogin_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 53;BA.debugLine="If txtnama.Text = \"\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",actlogin.mostCurrent._txtnama.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 54;BA.debugLine="MsgboxAsync(\"Masukkan Username\",\"Info\")";
Debug.ShouldStop(2097152);
actlogin.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Masukkan Username")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),actlogin.processBA);
 BA.debugLineNum = 55;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 57;BA.debugLine="If txtpass.Text = \"\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",actlogin.mostCurrent._txtpass.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 58;BA.debugLine="MsgboxAsync(\"Masukkan Password\",\"Info\")";
Debug.ShouldStop(33554432);
actlogin.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Masukkan Password")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),actlogin.processBA);
 BA.debugLineNum = 59;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 62;BA.debugLine="ModulKoneksi.koneksi";
Debug.ShouldStop(536870912);
actlogin.mostCurrent._modulkoneksi.runVoidMethod ("_koneksi" /*RemoteObject*/ ,actlogin.mostCurrent.activityBA);
 BA.debugLineNum = 64;BA.debugLine="p = txtpass.Text";
Debug.ShouldStop(-2147483648);
actlogin.mostCurrent._p = actlogin.mostCurrent._txtpass.runMethod(true,"getText");
 BA.debugLineNum = 66;BA.debugLine="enkripsi";
Debug.ShouldStop(2);
_enkripsi();
 BA.debugLineNum = 69;BA.debugLine="ModulKoneksi.rs = ModulKoneksi.mh.Query(\"SELECT *";
Debug.ShouldStop(16);
actlogin.mostCurrent._modulkoneksi._rs /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("mysql.mysqlhandler.ResultSetWrapper"), actlogin.mostCurrent._modulkoneksi._mh /*RemoteObject*/ .runMethod(false,"Query",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM tb_admindesa WHERE username='"),actlogin.mostCurrent._txtnama.runMethod(true,"getText"),RemoteObject.createImmutable("'")))));
 BA.debugLineNum = 70;BA.debugLine="If ModulKoneksi.rs.RowCount > 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",actlogin.mostCurrent._modulkoneksi._rs /*RemoteObject*/ .runMethod(true,"RowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 72;BA.debugLine="ModulKoneksi.rs = ModulKoneksi.mh.Query(\"SELECT";
Debug.ShouldStop(128);
actlogin.mostCurrent._modulkoneksi._rs /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("mysql.mysqlhandler.ResultSetWrapper"), actlogin.mostCurrent._modulkoneksi._mh /*RemoteObject*/ .runMethod(false,"Query",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM tb_admindesa WHERE username='"),actlogin.mostCurrent._txtnama.runMethod(true,"getText"),RemoteObject.createImmutable("' and password='"),actlogin.mostCurrent._epass,RemoteObject.createImmutable("'")))));
 BA.debugLineNum = 73;BA.debugLine="If ModulKoneksi.rs.RowCount > 0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",actlogin.mostCurrent._modulkoneksi._rs /*RemoteObject*/ .runMethod(true,"RowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 75;BA.debugLine="ModulKoneksi.mh.Close";
Debug.ShouldStop(1024);
actlogin.mostCurrent._modulkoneksi._mh /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 77;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4096);
actlogin.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 78;BA.debugLine="StartActivity(actBeranda)";
Debug.ShouldStop(8192);
actlogin.mostCurrent.__c.runVoidMethod ("StartActivity",actlogin.processBA,(Object)((actlogin.mostCurrent._actberanda.getObject())));
 }else {
 BA.debugLineNum = 80;BA.debugLine="MsgboxAsync(\"Password tidak ditemukan\",\"Info\")";
Debug.ShouldStop(32768);
actlogin.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Password tidak ditemukan")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),actlogin.processBA);
 BA.debugLineNum = 81;BA.debugLine="txtpass.Text = \"\"";
Debug.ShouldStop(65536);
actlogin.mostCurrent._txtpass.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 82;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return RemoteObject.createImmutable("");
 };
 }else {
 BA.debugLineNum = 85;BA.debugLine="MsgboxAsync(\"Username tidak ditemukan\",\"Info\")";
Debug.ShouldStop(1048576);
actlogin.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Username tidak ditemukan")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),actlogin.processBA);
 BA.debugLineNum = 86;BA.debugLine="txtnama.Text = \"\"";
Debug.ShouldStop(2097152);
actlogin.mostCurrent._txtnama.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 87;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("btnRegis_Click (actlogin) ","actlogin",2,actlogin.mostCurrent.activityBA,actlogin.mostCurrent,41);
if (RapidSub.canDelegate("btnregis_click")) { return b4a.example.actlogin.remoteMe.runUserSub(false, "actlogin","btnregis_click");}
 BA.debugLineNum = 41;BA.debugLine="Sub btnRegis_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="StartActivity(actRegister)";
Debug.ShouldStop(1024);
actlogin.mostCurrent.__c.runVoidMethod ("StartActivity",actlogin.processBA,(Object)((actlogin.mostCurrent._actregister.getObject())));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnresetsandi_click() throws Exception{
try {
		Debug.PushSubsStack("BtnResetSandi_Click (actlogin) ","actlogin",2,actlogin.mostCurrent.activityBA,actlogin.mostCurrent,46);
if (RapidSub.canDelegate("btnresetsandi_click")) { return b4a.example.actlogin.remoteMe.runUserSub(false, "actlogin","btnresetsandi_click");}
 BA.debugLineNum = 46;BA.debugLine="Sub BtnResetSandi_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 48;BA.debugLine="StartActivity(actLupaKataSandi)";
Debug.ShouldStop(32768);
actlogin.mostCurrent.__c.runVoidMethod ("StartActivity",actlogin.processBA,(Object)((actlogin.mostCurrent._actlupakatasandi.getObject())));
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
public static RemoteObject  _enkripsi() throws Exception{
try {
		Debug.PushSubsStack("enkripsi (actlogin) ","actlogin",2,actlogin.mostCurrent.activityBA,actlogin.mostCurrent,91);
if (RapidSub.canDelegate("enkripsi")) { return b4a.example.actlogin.remoteMe.runUserSub(false, "actlogin","enkripsi");}
 BA.debugLineNum = 91;BA.debugLine="Sub enkripsi";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="passwordhash = md.GetMessageDigest(p.GetBytes(\"UT";
Debug.ShouldStop(134217728);
actlogin._passwordhash = actlogin.mostCurrent._md.runMethod(false,"GetMessageDigest",(Object)(actlogin.mostCurrent._p.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))),(Object)(RemoteObject.createImmutable("MD5")));
 BA.debugLineNum = 93;BA.debugLine="epass = ByteCon.HexFromBytes(passwordhash)";
Debug.ShouldStop(268435456);
actlogin.mostCurrent._epass = actlogin.mostCurrent._bytecon.runMethod(true,"HexFromBytes",(Object)(actlogin._passwordhash));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private txtnama As EditText";
actlogin.mostCurrent._txtnama = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private txtpass As EditText";
actlogin.mostCurrent._txtpass = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim md As MessageDigest";
actlogin.mostCurrent._md = RemoteObject.createNew ("anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim ByteCon As ByteConverter";
actlogin.mostCurrent._bytecon = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
 //BA.debugLineNum = 21;BA.debugLine="Dim passwordhash() As Byte";
actlogin._passwordhash = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 22;BA.debugLine="Dim epass As String";
actlogin.mostCurrent._epass = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="Dim p As String";
actlogin.mostCurrent._p = RemoteObject.createImmutable("");
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}