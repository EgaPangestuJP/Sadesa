B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=11.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private lv As ListView
	Private search As EditText
	Private btnadd As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("akunpenduduk")
	
	showList
	
	lv.SingleLineLayout.Label.TextColor = Colors.Black
	lv.SingleLineLayout.Label.TextSize = 15
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub lv_ItemClick (Position As Int, Value As Object)
	
End Sub

Private Sub search_EnterPressed
	FilterList
End Sub

Private Sub btnadd_Click
'	Activity.Finish
'	StartActivity(Tambah_Data_Desa)
End Sub

Sub showList
	ModulKoneksi.koneksi
	
	lv.Clear
	ModulKoneksi.rs = ModulKoneksi.mh.Query("SELECT * FROM tb_akunwarga ORDER BY id_akun_warga ASC")
	
	For i = 0 To ModulKoneksi.rs.RowCount - 1
		lv.AddSingleLine(ModulKoneksi.rs.GetString2("username"))
	Next
	
	ModulKoneksi.mh.Close
End Sub

Sub FilterList
	ModulKoneksi.koneksi
	
	lv.Clear
	ModulKoneksi.rs = ModulKoneksi.mh.Query("SELECT * FROM tb_akunwarga WHERE username LIKE '%" & search.Text & "%' ORDER BY id_akun_warga ASC")
	
	For i = 0 To ModulKoneksi.rs.RowCount - 1
		lv.AddSingleLine(ModulKoneksi.rs.GetString2("username"))
	Next
	
	ModulKoneksi.mh.Close
End Sub