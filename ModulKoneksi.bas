B4A=true
Group=Modul Group
ModulesStructureVersion=1
Type=StaticCode
Version=11.8
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	
<<<<<<< HEAD
	
=======
>>>>>>> 5204d7a0311585b33749d5e518350530ee61520a
	Dim mh As MysqlHandler
	Dim rs As ResultSet
End Sub

Sub koneksi
	'setting koneksi database
	mh.Initialize("meniti.id", "u7753801_sadesa", "u7753801_nurjaman", "Nurjaman24")
	
	'cek koneksi
	If mh.isConnected = False Then
		MsgboxAsync("Koneksi Terputus","Info")
		ExitApplication
<<<<<<< HEAD
'	Else If MHandler.isConnected = True Then
'		MsgboxAsync("Koneksi Tersambung","Info")
'		ExitApplication
=======
>>>>>>> 5204d7a0311585b33749d5e518350530ee61520a
	End If
End Sub