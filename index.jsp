﻿<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name = keywords content = " wild , widlife , WILD , WILDLIFE , portal , wildlifeportal , indianwildlife , animals.habital , ecosystem , climate , travel , tour , travel to india , santury , reserves , wildlife reserves , national parks "/>
	<meta name = description content= " Descripition of the Organisation " />
	<title>Indian Wildlife</title>
	<%  
response.setHeader("Pragma","no-cache");  
response.setHeader("Cache-Control","no-store");  
response.setHeader("Expires","0");  
response.setDateHeader("Expires",-1);  
%>
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
	</style>
</head>
<body>
<%
if(session.getAttribute("fullname")!=null)
{
if(session.getAttribute("usertype").equals("admin"))
{
response.sendRedirect("AdminHome.jsp");
}
else if(session.getAttribute("usertype").equals("reg_user"))
{
response.sendRedirect("home.jsp");
}
}
%>
<!--HEADER-->
<table width="1024px" align="center" class="header_table">
	<tr>
	<td style="width: 208px; height: 109px">
	<img align="top" src="RetrieveSiteImage.jsp?imgid=2" alt="" style="height: 105px; width: 368px"/>
	</td>
		<td align="justify" >
			<div align="right">
						<form name="login" action="CheckUser" method="post" >
				<table width="400px" class="login_table" >
					<tr>
					
					</tr>
					<tr><td colspan="4" ><jsp:scriptlet>if(request.getAttribute("wronguser")!=null){if(request.getAttribute("wronguser").equals(true)){out.print("The Email Id or Password is incorrect");}} </jsp:scriptlet></td></tr>
					<tr >
					
							<td>
								
							<input style="border-style:none" size="15" value="Email Id" type="text" name="emailid" onfocus="if(this.value==this.defaultValue)this.value='';" onblur="if(this.value=='')this.value=this.defaultValue;" /></td>
							<td>
								<input style="border-style:none" size="15" value="Password" type="password" name="password" onfocus="if(this.value==this.defaultValue)this.value='';" onblur="if(this.value=='')this.value=this.defaultValue;" />
							</td>
							<td style="height: 36px; ">
								<input type="submit" value="Login &gt;" class="login_submit_button"/>
							</td>
							<td>
								<input type="button" value="SignUp &gt;" class="register_submit" onclick="parent.location='SignUp.jsp'"/>
							</td>
					</tr>
					<tr>
					<td>
					<input type="radio" name="user" value="admin" />Admin
					</td>
					<td style="width: 132px; ">
					<input type="radio" name="user" checked="checked" value="reg_user" />Registered User
					</td>
					<td colspan="2" style="width: 187px; height: 9px">
					<input type="radio" name="user" value="reviewer" />Reviewer
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
<!--MENU-->
<table width="100%" class="menu_table">
	<tr>
		<td width="auto">&nbsp;</td>
		<td width="1024px" align="center" height="50px">
			<br/>
			<input type="button" onclick="parent.location='index.jsp'" value="Home" class="menu_button"/><input type="button" value="Gallery" class="menu_button"/><input type="button" value="Destinations" onclick="parent.location='Destinations.jsp'" class="menu_button"/><input type="button" value="News" onclick="parent.location='News.jsp'" class="menu_button"/><input type="button" onclick="parent.location='Career.jsp'" value="Career" class="menu_button"/>
			<br/><br/>
		</td>
		<td width="auto">&nbsp;</td>
	</tr>
</table>
<!--BODY-->
<table width="1024px" align="center" class="body_table" style="background-color:#EBF0F9;">
	<tr>
		<td>
			<table width="1024px">
				<tr>
					<td width="70%" height="200px" style="background-color:white;border:2px solid black;">
						<div id="flashContent">
			<object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" width="700" height="343" id="aaa" align="middle">
				<param name="movie" value="RetrieveSiteImage.jsp?imgid=9" />
				<param name="quality" value="high" />
				<param name="bgcolor" value="#ffffff" />
				<param name="play" value="true" />
				<param name="loop" value="true" />
				<param name="wmode" value="window" />
				<param name="scale" value="showall" />
				<param name="menu" value="true" />
				<param name="devicefont" value="false" />
				<param name="salign" value="" />
				<param name="allowScriptAccess" value="sameDomain" />
				<!--[if !IE]>-->
				<object type="application/x-shockwave-flash" data="RetrieveSiteImage.jsp?imgid=9" width="700" height="343">
					<param name="movie" value="RetrieveSiteImage.jsp?imgid=9" />
					<param name="quality" value="high" />
					<param name="bgcolor" value="#ffffff" />
					<param name="play" value="true" />
					<param name="loop" value="true" />
					<param name="wmode" value="window" />
					<param name="scale" value="showall" />
					<param name="menu" value="true" />
					<param name="devicefont" value="false" />
					<param name="salign" value="" />
					<param name="allowScriptAccess" value="sameDomain" />
				<!--<![endif]-->
					<a href="http://www.adobe.com/go/getflash">
						<img src="http://www.adobe.com/images/shared/download_buttons/get_flash_player.gif" alt="Get Adobe Flash player" />
					</a>
				<!--[if !IE]>-->
				</object>
				<!--<![endif]-->
			</object>
		</div>
					</td>
					<td valign="top" width="30%" align="center" style="background-color:#FFF0E5;">
						<div valign="middle" width="100%" style="font-size:large;height:30px;padding-left:5px;background-color:orange;color:white;">
						Photo of the Day
						</div><br/>
						<img src="RetrieveSiteImage.jsp?imgid=7" width="100px" height="100px"alt="Image Here" style="border:5px solid orange"/>
						<img src="RetrieveSiteImage.jsp?imgid=8" width="100px" height="100px"alt="Image Here" style="border:5px solid orange"/>
					</td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<td>
			<table width="1024px">
				<tr>
					<td width="70%"style="background-color:white;">
						<table width="100%">
							<tr>
								<td width="100px">
									<img src="news.svg"/>
								</td>
								<td width="auto" valign="top" height="100px">
									<div style="color:firebrick; font-family:'Comic Sans MS'">
									&lt;&lt;NEWS Heading1&gt;&gt;</div>
									<div style="color:green">
									&lt;&lt;News content&gt;&gt;</div>
									<hr/>
								</td>
							</tr>
							<tr>
								<td colspan="2" height="100px" valign="100px">
									<div style="color:firebrick; font-family:'Comic Sans MS'">
									&lt;&lt;NEWS Heading2&gt;&gt;</div>
									<div style="color:green">
									&lt;&lt;News content&gt;&gt;</div>
									<hr/>
								</td>
							</tr>
						</table>
					</td>
					<td width="30%" valign="top" background="gray">
						<fieldset style="color:firebrick;font-family:'arial'">
							<legend style="color:green">Adevertise Wid Us</legend>
							[Add any Advertisement Policy here]
						</fieldset>
					</td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<td>
			<table width="1024px">
				<tr>
					<td valign="top" width="33%" align="center" style="background-color:#E5FFE5; border-bottom-left-radius:20px;">
						<div valign="middle" width="100%" style="font-size:large;height:30px;padding-left:5px;background-color:green;color:white;">
						Animal of the Day
						</div><br/>
						<img src="RetrieveSiteImage.jsp?imgid=5" width="100px" height="100px"alt="Image Here" style="border:5px solid green; float: left; border-bottom-left-radius:20px;"/>
						<div style="color:green">The leopard, Panthera pardus, is a member of the Felidae family and the smallest of the four &quot;big cats&quot; in the genus Panthera, the other three being the tiger, lion, and jaguar. The leopard was once distributed across eastern and southern Asia and Africa, from Siberia to South Africa, but its range of distribution has decreased radically because of hunting and loss of habitat. It is now chiefly found in sub-Saharan Africa; there are also fragmented populations in the Indian subcontinent, Sri Lanka, Indochina, Malaysia, Indonesia, and China. Because of its declining range and population, it is listed as a &quot;Near Threatened&quot; species on the IUCN Red List.</div>
					</td>
					<td valign="top" width="33%" align="center" style="background-color:#F5E7FD;">
						<div valign="middle" width="100%" style="font-size:large;height:30px;padding-left:5px;background-color:purple;color:white;">
						Bird of the Day
						</div><br/>
						<img src="RetrieveSiteImage.jsp?imgid=6" width="100px" height="100px"alt="Image Here" style="border:5px solid purple;float:left;"/>
						<div style="color:purple">The Grey Crested Tit (Lophophanes dichrous) is a species of bird in the Paridae family.
It is found in Bhutan, China, Pakistan, India, Burma, and Nepal. Its natural habitats are temperate forests and subtropical or tropical moist montane forests.
</div>
					</td>
					<td valign="top" width="33%" align="center" style="background-color:#FBEAEA; border-bottom-right-radius:20px;"">
						<div valign="middle" width="100%" style="font-size:large;height:30px;padding-left:5px;background-color:firebrick;color:white;">
						Destination of the Day
						</div><br/>
						<img src="RetrieveSiteImage.jsp?imgid=10" width="100px" height="100px"alt="Image Here" style="border:5px solid firebrick; float:left;"/>
						<div style="color:firebrick">Bandhavgarh National Park (Devanagari: बांधवगढ राष्ट्रीय उद्दान) is one of the popular national parks in India located in the Umaria district of Madhya Pradesh. Bandhavgarh was declared a national park in 1968, with an area of 105 km². The buffer is spread over the forest divisions of Umaria and Katni and totals 437 km². The park derives its name from the most prominent hillock of the area, which is said to be given by Hindu Lord Rama to his brother Lakshmana to keep a watch on Lanka (Ceylon). Hence the name Bandhavgarh (Sanskrit: Brother's Fort).</div>
					</td>
				</tr>
			</table>
		</td>
	</tr>
</table>

<hr/>
<!--FOOTER-->
<table width="1024px" align="center" class="footer_table" style="padding-right:15px;">
	<tr>
		<td>
			<div align="right">
						<form name="search">
				<table width="auto<!--734px-->" class="search_table">
					<tr>
					<td>
						<div style="color:white;">Powered By Elitecoders &copy; Copyright 2011</div>
					</td>

							<td style="border-left:5px black solid;padding-left:10px;">
								<input style="border-style:none; width:200px;" size="15" value="Search 4m here" type="text" name="search" onfocus="if(this.value==this.defaultValue)this.value='';" onblur="if(this.value=='')this.value=this.defaultValue;" />
								<input type="button" value="Search &gt;" class="search_button"/>
							</td>
						
					</tr>
				</table>
				</form>
			</div>
		</td>
	</tr>
</table>

</body>
</html>