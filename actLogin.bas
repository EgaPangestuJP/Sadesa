B4A=true
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

	Private txtnama As EditText
	Private txtpass As EditText
	
	Dim MHandler As MessageDigest
	Dim ByteCon As ByteConverter
	Dim passwordhash() As Byte
	Dim epass As String
	Dim p As String
	
End Sub

Sub Activity_Create(FiResultStTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("Login")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

'==================================================
Sub btnRegis_Click
	'Activity.Finish
	StartActivity(actRegister)
End Sub

Sub BtnResetSandi_Click
	'Activity.Finish
	StartActivity(actLupaKataSandi)
End Sub
Private Sub BtnLogin_Click
	StartActivity(actBeranda)
End Sub

Sub enkripsi
	passwordhash = MHandler.GetMessageDigest(p.GetBytes("UTF8"),"MHandler5")
	epass = ByteCon.HexFromBytes(passwordhash)
End Sub