	<%  
response.setHeader("Pragma","no-cache");  
response.setHeader("Cache-Control","no-store");  
response.setHeader("Expires","0");  
response.setDateHeader("Expires",-1);  
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name = keywords content = " wild , widlife , WILD , WILDLIFE , portal , wildlifeportal , indianwildlife , animals.habital , ecosystem , climate , travel , tour , travel to india , santury , reserves , wildlife reserves , national parks "/>
<meta name = description content= " Descripition of the Organisation " />
<title>Indian Wildlife-Admin Home</title>
<style type="text/css">
.header_table{
	background-color:#659EC7;
	border-bottom:3px solid white;
}
body{
	margin:0;
	background-color:WHITE;
}
.body_table{
	background-color:white;
	border-left:2px solid black;
	border-right:2px solid black;
	border-bottom:2px solid black;
	border-bottom-right-radius: 20px;
	border-bottom-left-radius: 20px;
	-khtml-border-bottom-right-radius: 20px;
	-khtml-border-bottom-right-radius: 20px;
}
.menu_table{
	 background-color:black;
}
.login_table{
	background-color:#659EC7;
	border-right:3px solid white;
	border-left:3px solid white;
	border-bottom:3px solid white;
}
.login_submit_button{
	background-color:Black;
	color:white;
	width:50px;
	font-family:"Comic Sans MS";
	border-style:none;
	cursor:pointer;
}
.register_submit{
	background-color:firebrick;
	color:white;
	width:80px;
	font-family:"Comic Sans MS";
	border-style:none;
	cursor:pointer;
}
.search_button{
	background-color:black;
	color:white;
	width:80px;
	font-family:"Comic Sans MS";
	border-style:none;
	cursor:pointer;
}
.footer_menu_button{
	border-style:none;
	background-color:#659EC7;
	color:#E6E6E6;
	cursor:pointer;
	font-weight:bold;
}
.footer_menu_button:hover{
	color:white;
}
.footer_table{
	background-color:#659EC7;
	border-top:3px solid white;
	border-top-right-radius: 20px;
	border-top-left-radius: 20px;
	-khtml-border-top-right-radius: 20px;
	-khtml-border-top-right-radius: 20px;
}
.copyright{
	background-color:#4e9258;
	border-radius:20px;
	-khtml-border-radius:20px;
	color:white;
	font-family:'Times New Roman', Times, serif;
	font-size:medium;
	text-align:center;
}
/*CSS for Site's Main Menu*/
.menu_button{
	background-color:#4E9258;
	color:white;
	height:40px;
	width:90px;
	cursor:pointer;
	font-family:"Comic Sans MS";
	font-weight:bold;
	border-style:none;
}
.menu_button:hover{
	background-color:white;
	color:#4E9258;
	font-weight:bold;
}
.form_labels{
	font-weight:bold;
	font-size:medium;
	font-family:Calibri,comic sans ms, times new roman;
}
/*CSS for Profile Page*/
.profile_menu_table{
	border:1px;
	padding-left:10px;
	padding-right:10px;
	background-color:#659EC7/*#A1B8E3*/;
	border-bottom-left-radius:20px;
	-khtml-border-bottom-left-radius: 20px;
}
.profile_menu{
	background-color:#2C5197;
	border-style:none;
	border:3px solid #2C5197;
	border-top-right-radius:20px;
	-khtml-border-top-right-radius:20px;
	border-bottom-left-radius:20px;
	-khtml-border-bottom-left-radius:20px;
	width:170px;
	height:23px;
	cursor:pointer;
	color:white;
	font-weight:bold;
	text-align:center;
}
.profile_menu:hover{
	border:3px solid white;
}
.profile_button{
	border-style:none;
	background-color:#2C5197;
	color:white;
	font-family:calibri,times new roman,comic sans ms;
	height:30px;
	cursor:pointer;
}
.profile_name_heading{
	 color:#4e9258;
	 font-size:x-large;
}
.profile_top_head{
	 color:#2C5197;
	 font-family:Calibri,times new roman,comic sans ms;
}
.profile_top_entries{
	color:#4e9258;
	font-family:Calibri,times new roman,comic sans ms;
}
.profile_select_option{
	border:2px #659EC7 solid;
	width:157px;
	height:28px;
	color:#4e9258;
	font-size:medium;
}
.profile_photo_upload_button{
	border-style:none;
	background:#2C5197;
	color:white;
	font-weight:bold;
}
/*CC Code for Forum Page*/
.forum_labels{
	color:#2C5197;
	font-weight:bold;
	font-size:medium;
	font-family:Calibri,comic sans ms, times new roman;
}
.forum_button{
	border-style:none;
	background-color:#2C5197;
	color:white;
	font-family:calibri,times new roman,comic sans ms;
	height:30px;
	cursor:pointer;
}
.forum_select_option{
	border:2px #659EC7 solid;
	width:157px;
	height:28px;
	color:#659EC7;
	font-size:medium;
}
.newsletter_button{
	border-style:none;
	background-color:#2C5197;
	color:white;
	font-family:calibri,times new roman,comic sans ms;
	height:30px;
	cursor:pointer;
}
.admin_menu_table{
	 background-color:#4E9258;
}
.admin_menu_button{
	border-style:none;
	background-color:black;
	color:white;
	font-weight:bold;
	height:25px;
	cursor:pointer;
	border-radius:20px;
	border:2px solid black;
}
.admin_menu_button:hover{
	border:2px solid white;
}
.admin_user_search_label{
	font-weight:bold;
	font-size:medium;
	font-family:Calibri,comic sans ms, times new roman;
}
.admin_user_search_input{
	height:23px;
	width:210px;
	color:#4e9258;
	border:2px #659EC7 solid;
}
.admin_user_search_button{
	border-style:none;
	background-color:#4E9258;
	color:white;
	font-family:calibri,times new roman,comic sans ms;
	height:25px;
	width:70px;
	cursor:pointer;
	border-radius:25px;
}
.admin_user_search_notify_label{
	font-weight:bold;
	font-size:medium;
	font-family:Calibri,comic sans ms, times new roman;
}
.admin_user_search_result_label{
	width:100px;
	font-weight:bold;
	font-size:medium;
	font-family:Calibri,comic sans ms, times new roman;
	border-right:2px solid black;
}
.admin_user_search_result_output{
	color:#4E9258;
	width:auto;
	font-size:medium;
	font-family:Calibri,comic sans ms, times new roman;
}
</style>
</head>
<body>
<!--HEADER-->
<form action="LogOut" method="post" >
<table width="1024px" align="center" class="header_table">
	<tr>
	
	<td style="width: 208px; height: 109px">
	<img align="top" src="RetrieveSiteImage.jsp?imgid=2" alt="" style="height: 105px; width: 368px"/>
	</td>
		<td align="right" >
		<%
		if
		((session.getAttribute("fullname")!=null) && (session.getAttribute("usertype").equals("admin")))
		{
		out.println(session.getAttribute("fullname"));
		}
		else
		{
		response.sendRedirect("index.jsp");
		}
		%>
		<input type="submit" value="Log Out" class="admin_menu_button"/>
		</td>
	</tr>
	<tr>
	<td align="center" colspan="2" width="1024px" >
	<object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" width="1000" height="213" id="indo" align="middle">
				<param name="movie" value="RetrieveSiteImage.jsp?imgid=4"/>
				<param name="quality" value="high"/>
				<param name="bgcolor" value="#ffffff"/>
				<param name="play" value="true"/>
				<param name="loop" value="true"/>
				<param name="wmode" value="window"/>
				<param name="scale" value="showall"/>
				<param name="menu" value="true"/>
				<param name="devicefont" value="false"/>
				<param name="salign" value=""/>
				<param name="allowScriptAccess" value="sameDomain"/>
				
				<object type="application/x-shockwave-flash" data="RetrieveSiteImage.jsp?imgid=4" width="1000" height="213">
					<param name="movie" value="RetrieveSiteImage.jsp?imgid=4"/>
					<param name="quality" value="high"/>
					<param name="bgcolor" value="#ffffff"/>
					<param name="play" value="true"/>
					<param name="loop" value="true"/>
					<param name="wmode" value="window"/>
					<param name="scale" value="showall"/>
					<param name="menu" value="true"/>
					<param name="devicefont" value="false"/>
					<param name="salign" value=""/>
					<param name="allowScriptAccess" value="sameDomain"/>
				
					<a href="http://www.adobe.com/go/getflash">
						<img src="http://www.adobe.com/images/shared/download_buttons/get_flash_player.gif" alt="Get Adobe Flash player"/>
					</a>
				
				</object>
				
			</object>
	</td>
	</tr>
</table>
</form>
<!--MENU-->
<form action="CheckAdminActivity" method="post" >
<table width="100%" class="admin_menu_table">
	<tr>
		<td width="auto">&nbsp;</td>
		<td width="1024px" align="center" height="50px">
			<input type="submit" class="admin_menu_button" name="button" value="Home"/>
			<input type="submit" class ="admin_menu_button" name="button" value="Manage User" />
			<input type="submit" class ="admin_menu_button" name="button" value="News Letter" />
			
			<input type="submit" class ="admin_menu_button" name="button" value="Upload Data" />
		</td>
		<td width="auto">&nbsp;</td>
	</tr>
</table>
</form>
<!--BODY-->
<table class="body_table" style="background-color:#E0E0E0;" width="1024px" align="center">
	<tr>
		<td>
		<form action="GenerateNewsletterAction" method="post" >
		<table align="center" >
		<tr>
		<td>
		<div class="forum_labels" >
		Subject
		</div>
		</td>
		</tr>
		<tr>
		<td>
		<input type="text" name="subject" />
		</td>
		</tr>
		<tr>
		<td>
		<div class="forum_labels" >
		Content
		</div>
		</td>
		</tr>
		<tr>
		<td>
		<textarea name="content" rows="5" cols="50"></textarea>
		</td>
		</tr>
		<tr>
		<td>
		<input type="submit" value="Release Newsletter" class="forum_button" />
		</td>
		</tr>
		</table>
		</form>
		</td>
	</tr>
</table>
<!--FOOTER-->
<table align="center" width="984px">
		<tr>
			<td>
				<table width="984px">
					<tr>
						<td><hr/></td>
						<td class="footer" width="325px">
							&copy; Copyright 2011 Reserved by Elitecoders Services.
						</td>
						<td><hr/></td>
					</tr>
				</table>
			</td>
		</tr>
</table>
</body>
</html>