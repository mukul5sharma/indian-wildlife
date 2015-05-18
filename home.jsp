﻿<%
if(session.getAttribute("fullname")==null)
{
	response.sendRedirect("index.jsp");
}
%>
	<%  
response.setHeader("Pragma","no-cache");  
response.setHeader("Cache-Control","no-store");  
response.setHeader("Expires","0");  
response.setDateHeader("Expires",-1);  
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html;" />
	<meta name = keywords content = " wild , widlife , WILD , WILDLIFE , portal , wildlifeportal , indianwildlife , animals.habital , ecosystem , climate , travel , tour , travel to india , santury , reserves , wildlife reserves , national parks "/>
	<meta name = description content= " Descripition of the Organisation " />
	<title>Indian Wildlife-Home</title>
	<style type="text/css" >
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
	height:35px;
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
<table width="1024px" align="center" class="header_table">
	<tr>
	
	<td style="width: 208px; height: 109px">
	<img align="top" src="RetrieveSiteImage.jsp?imgid=2" alt="" style="height: 105px; width: 368px"/>
	</td>
		<td>
			<div align="right">
						<form name="search">
				<table width="310px" class="login_table">
					<tr>
							<td style="width: 330px; ">
								<input style="border-style:none; width:214px;" size="15" value="Search 4m here" type="text" name="search" onfocus="if(this.value==this.defaultValue)this.value='';" onblur="if(this.value=='')this.value=this.defaultValue;"/>
								<input type="button" value="Search &gt;" class="search_button"/>
							</td>
					</tr>
		
				</table>
						</form>
			</div>
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
<!--BODY-->
<table width="1024px" align="center" class="body_table" style="border-top:25px black solid;">
	<tr>
		<td width="200px" valign="top" style="background-color:#659EC7; border-bottom-left-radius: 20px; -khtml-border-bottom-left-radius: 20px;">
		<form action="CheckUserActivity" method="post" >
			<table align="center" class="profile_menu_table">
				<tr>
					<td>
					<hr/><input name="button" type="submit" value="Home" class="profile_menu"/>
					<hr/><input name="button" type="submit" value="Profile" class="profile_menu"/>
					<hr/><input name="button" type="submit" value="Statistics" class="profile_menu"/>
					<hr/><input name="button" type="submit" value="Forums" class="profile_menu"/>
					<hr/><input name="button" type="submit" value="Newsletters" class="profile_menu"/>
					<hr/><input name="button" type="submit" value="Queries" class="profile_menu"/>
					<hr/><input name="button" type="submit" value="Logout" class="profile_menu"/>
					<hr/>
					</td>
				</tr>
			</table>
			</form>
		</td>
		<td width="auto" valign="top" style="background-color:#EBF0F9;">
			<table align="left">
				<tr>
					<td>
						<table width="650px">
							<tr>
								<td width="40px">
									<img src="RetrieveImage.jsp?imgid=<%=session.getAttribute("imgid") %>" width="40px" height="40px" alt="Profile Picture"/>
								</td>
								<td colspan="2" class="profile_name_heading">
<%
		if
		(session.getAttribute("fullname")!=null)
		{
		out.println(session.getAttribute("fullname"));
		}
		%></td>
							</tr>
							<tr>
								<td colspan="3"><hr style="height:3px; color:black;" noshade="noshade"/></td>
							</tr>
							<tr>
								<td colspan="3">
									<table>
										<tr>
											<td></td>
										</tr>
									</table>
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</td>
		<td valign="top" width="150px" style=" background-color:#E6E6E6;border-bottom-right-radius: 20px; -khtml-border-bottom-right-radius: 20px;">
			[This is a free Space suggest any idea for here]
		</td>
	</tr>
</table>
<hr/>
<!--FOOTER-->
<table width="1024px" align="center" class="footer_table" style="padding-right:15px;">
	<tr>
		<td>
			<div align="center">
				<table width="auto<!--734px-->" class="search_table">
					<tr>
						<td>
							<div style="color:white">
								~ <input type="button" value="Mobile" class="footer_menu_button"/>
								 ~ <input type="button" value="Search Friends" class="footer_menu_button"/>
								 ~ <input type="button" value="Advertise Here" class="footer_menu_button"/>
								 ~ <input type="button" value="Job" class="footer_menu_button"/>
								 ~ <input type="button" value="Privacy" class="footer_menu_button"/>
								 ~ <input type="button" value="Terms" class="footer_menu_button"/>
								 ~ <input type="button" value="Help" class="footer_menu_button"/> ~
							</div>
						</td>
					</tr>
				</table>
			</div>
		</td>
	</tr>
</table>
<table align="center" width="984px">
	<tr>
		<td>
			<table width="984px">
				<tr>
					<td><hr/></td>
					<td class="copyright" width="325px">
						Powered By Elitecoders &copy; Copyright 2011
					</td>
					<td><hr/></td>
				</tr>
			</table>
		</td>
	</tr>
</table>
</body>
</html>