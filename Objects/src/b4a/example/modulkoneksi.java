package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class modulkoneksi {
private static modulkoneksi mostCurrent = new modulkoneksi();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public static mysql.mysqlhandler _mh = null;
public static mysql.mysqlhandler.ResultSetWrapper _rs = null;
public b4a.example.main _main = null;
public b4a.example.actopsi _actopsi = null;
public b4a.example.actlogin _actlogin = null;
public b4a.example.actberanda _actberanda = null;
public b4a.example.actregister _actregister = null;
public b4a.example.actlupakatasandi _actlupakatasandi = null;
public b4a.example.starter _starter = null;
public static String  _koneksi(anywheresoftware.b4a.BA _ba) throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub koneksi";
 //BA.debugLineNum = 13;BA.debugLine="mh.Initialize(\"meniti.id\", \"u7753801_sadesa\", \"u7";
_mh.Initialize("meniti.id","u7753801_sadesa","u7753801_nurjaman","Nurjaman24");
 //BA.debugLineNum = 16;BA.debugLine="If mh.isConnected = False Then";
if (_mh.isConnected==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 17;BA.debugLine="MsgboxAsync(\"Koneksi Terputus\",\"Info\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Koneksi Terputus"),BA.ObjectToCharSequence("Info"),(_ba.processBA == null ? _ba : _ba.processBA));
 //BA.debugLineNum = 18;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Dim mh As MysqlHandler";
_mh = new mysql.mysqlhandler();
 //BA.debugLineNum = 8;BA.debugLine="Dim rs As ResultSet";
_rs = new mysql.mysqlhandler.ResultSetWrapper();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
}
