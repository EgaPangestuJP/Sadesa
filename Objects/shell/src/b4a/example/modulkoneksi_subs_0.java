package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class modulkoneksi_subs_0 {


public static RemoteObject  _koneksi(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("koneksi (modulkoneksi) ","modulkoneksi",3,_ba,modulkoneksi.mostCurrent,11);
if (RapidSub.canDelegate("koneksi")) { return b4a.example.modulkoneksi.remoteMe.runUserSub(false, "modulkoneksi","koneksi", _ba);}
;
<<<<<<< HEAD
 BA.debugLineNum = 12;BA.debugLine="Sub koneksi";
Debug.ShouldStop(2048);
 BA.debugLineNum = 14;BA.debugLine="mh.Initialize(\"meniti.id\", \"u7753801_sadesa\", \"u7";
Debug.ShouldStop(8192);
modulkoneksi._mh.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("meniti.id")),(Object)(BA.ObjectToString("u7753801_sadesa")),(Object)(BA.ObjectToString("u7753801_nurjaman")),(Object)(RemoteObject.createImmutable("Nurjaman24")));
 BA.debugLineNum = 17;BA.debugLine="If mh.isConnected = False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",modulkoneksi._mh.getField(true,"isConnected"),modulkoneksi.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 18;BA.debugLine="MsgboxAsync(\"Koneksi Terputus\",\"Info\")";
Debug.ShouldStop(131072);
=======
 BA.debugLineNum = 11;BA.debugLine="Sub koneksi";
Debug.ShouldStop(1024);
 BA.debugLineNum = 13;BA.debugLine="mh.Initialize(\"meniti.id\", \"u7753801_sadesa\", \"u7";
Debug.ShouldStop(4096);
modulkoneksi._mh.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("meniti.id")),(Object)(BA.ObjectToString("u7753801_sadesa")),(Object)(BA.ObjectToString("u7753801_nurjaman")),(Object)(RemoteObject.createImmutable("Nurjaman24")));
 BA.debugLineNum = 16;BA.debugLine="If mh.isConnected = False Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",modulkoneksi._mh.getField(true,"isConnected"),modulkoneksi.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 17;BA.debugLine="MsgboxAsync(\"Koneksi Terputus\",\"Info\")";
Debug.ShouldStop(65536);
>>>>>>> 5204d7a0311585b33749d5e518350530ee61520a
modulkoneksi.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Koneksi Terputus")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 BA.debugLineNum = 18;BA.debugLine="ExitApplication";
Debug.ShouldStop(131072);
modulkoneksi.mostCurrent.__c.runVoidMethod ("ExitApplication");
 };
<<<<<<< HEAD
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
=======
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
>>>>>>> 5204d7a0311585b33749d5e518350530ee61520a
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
<<<<<<< HEAD
 //BA.debugLineNum = 8;BA.debugLine="Dim mh As MysqlHandler";
modulkoneksi._mh = RemoteObject.createNew ("mysql.mysqlhandler");
 //BA.debugLineNum = 9;BA.debugLine="Dim rs As ResultSet";
modulkoneksi._rs = RemoteObject.createNew ("mysql.mysqlhandler.ResultSetWrapper");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
=======
 //BA.debugLineNum = 7;BA.debugLine="Dim mh As MysqlHandler";
modulkoneksi._mh = RemoteObject.createNew ("mysql.mysqlhandler");
 //BA.debugLineNum = 8;BA.debugLine="Dim rs As ResultSet";
modulkoneksi._rs = RemoteObject.createNew ("mysql.mysqlhandler.ResultSetWrapper");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
>>>>>>> 5204d7a0311585b33749d5e518350530ee61520a
return RemoteObject.createImmutable("");
}
}