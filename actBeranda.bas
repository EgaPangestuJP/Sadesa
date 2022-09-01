﻿B4A=true
Group=Modul Group
ModulesStructureVersion=1
Type=Activity
Version=11.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private lv As ListView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("berandaadmindesa")
	ShowList
	lv.SingleLineLayout.Label.TextColor = Colors.Black
	lv.SingleLineLayout.Label.TextSize = 15

End Sub

Sub ShowList
	ModulKoneksi.koneksi
	lv.Clear
	ModulKoneksi.rs = ModulKoneksi.mh.Query("SELECT * FROM tb_desa ORDER BY id_desa ASC")
	For i = 0 To ModulKoneksi.rs.RowCount - 1
		lv.AddSingleLine(ModulKoneksi.rs.GetString2("nama_desa"))
	Next
	ModulKoneksi.mh.Close
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Private Sub btnakunwarga_Click
	Activity.Finish
	StartActivity(AkunPenduduk)
End Sub