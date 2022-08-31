package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class modulkoneksi_subs_0 {


public static RemoteObject  _koneksi(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("koneksi (modulkoneksi) ","modulkoneksi",3,_ba,modulkoneksi.mostCurrent,12);
if (RapidSub.canDelegate("koneksi")) { return b4a.example.modulkoneksi.remoteMe.runUserSub(false, "modulkoneksi","koneksi", _ba);}
;
 BA.debugLineNum = 12;BA.debugLine="Sub koneksi";
Debug.ShouldStop(2048);
 BA.debugLineNum = 14;BA.debugLine="MHandler.Initialize(\"meniti.id\", \"u7753801_sadesa";
Debug.ShouldStop(8192);
modulkoneksi._mhandler.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("meniti.id")),(Object)(BA.ObjectToString("u7753801_sadesa")),(Object)(BA.ObjectToString("u7753801_nurjaman")),(Object)(RemoteObject.createImmutable("Nurjaman24")));
 BA.debugLineNum = 17;BA.debugLine="If MHandler.isConnected = False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",modulkoneksi._mhandler.getField(true,"isConnected"),modulkoneksi.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 18;BA.debugLine="MsgboxAsync(\"Koneksi Terputus\",\"Info\")";
Debug.ShouldStop(131072);
modulkoneksi.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Koneksi Terputus")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 BA.debugLineNum = 19;BA.debugLine="ExitApplication";
Debug.ShouldStop(262144);
modulkoneksi.mostCurrent.__c.runVoidMethod ("ExitApplication");
 }else 
{ BA.debugLineNum = 20;BA.debugLine="Else If MHandler.isConnected = True Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",modulkoneksi._mhandler.getField(true,"isConnected"),modulkoneksi.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 21;BA.debugLine="MsgboxAsync(\"Koneksi Tersambung\",\"Info\")";
Debug.ShouldStop(1048576);
modulkoneksi.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Koneksi Tersambung")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 BA.debugLineNum = 22;BA.debugLine="ExitApplication";
Debug.ShouldStop(2097152);
modulkoneksi.mostCurrent.__c.runVoidMethod ("ExitApplication");
 }}
;
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Dim MHandler As MysqlHandler";
modulkoneksi._mhandler = RemoteObject.createNew ("mysql.mysqlhandler");
 //BA.debugLineNum = 9;BA.debugLine="Dim ResultS As ResultSet";
modulkoneksi._results = RemoteObject.createNew ("mysql.mysqlhandler.ResultSetWrapper");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}