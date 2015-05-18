package beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CheckUserBean {
private String emailid,password,qr,rsemailid,rspassword,firstname,lastname,user,usertype,username,sex,month,address,interest,qualification,fullname,about_me,expedition,last_school,employer,since_month;
private String dburl="jdbc:db2j:net://localhost:50000/WILDLIFE";
private String dbusername="db2inst1";
private String dbpassword="db2inst1";
private boolean validuser;
private int day,year,imgid,since_day;
private long mobileno,telno;
public void setPassword(String password) {
	this.password = password;
	checkUser();
}
public int getSince_day() {
	return since_day;
}
public String getLast_school() {
	return last_school;
}
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getPassword() {
	return password;
}
public String getEmailid() {
	return emailid;
}
public void setValiduser(boolean validuser) {
	this.validuser = validuser;
}
public boolean isValiduser() {
	return validuser;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getFirstname() {
	return firstname;
}
public void setUsertype(String usertype) {
	this.usertype = usertype;
}
public String getUsertype() {
	return usertype;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getLastname() {
	return lastname;
}
public String getUsername() {
	return username;
}
public String getAddress() {
	return address;
}
public int getDay() {
	return day;
}
public int getYear() {
	return year;
}
public long getTelno() {
	return telno;
}
public long getMobileno() {
	return mobileno;
}
public String getInterest() {
	return interest;
}
public String getSex() {
	return sex;
}
public String getMonth() {
	return month;
}
public String getQualification() {
	return qualification;
}
public String getFullname() {
	return fullname;
}
public String getAbout_me() {
	return about_me;
}
public String getSince_month() {
	return since_month;
}
public String getEmployer() {
	return employer;
}
public String getExpedition() {
	return expedition;
}
public int getImgid() {
	return imgid;
}
private void checkUser()
{
	try
	{
	Class.forName("com.ibm.db2.jcc.DB2Driver");
	Connection conn=DriverManager.getConnection(dburl, dbusername, dbpassword);
	qr="select emailid,password,firstname,lastname,user_type,username,sex,address,interest,qualification,day,month,year,mobileno,telno,about_me,expedition,last_school,employer,since_month,imgid,since_day from userdetail where emailid=? and user_type=?";
	PreparedStatement ps=conn.prepareStatement(qr);
	ps.setString(1,emailid);
	ps.setString(2,user);
	ResultSet rs=ps.executeQuery();
	while(rs.next())
	{
		try
		{
		rsemailid=rs.getString("emailid");
		rspassword=rs.getString("password");
		firstname=rs.getString("firstname");
		lastname=rs.getString("lastname");
		usertype=rs.getString("user_type");
		username=rs.getString("username");
		sex=rs.getString("sex");
		mobileno=rs.getLong("mobileno");
		telno=rs.getLong("telno");
		day=rs.getInt("day");
		month=rs.getString("month");
		year=rs.getInt("year");
		address=rs.getString("address");
		interest=rs.getString("interest");
		qualification=rs.getString("qualification");
		about_me=rs.getString("about_me");
		expedition=rs.getString("expedition");
		last_school=rs.getString("last_school");
		employer=rs.getString("employer");
		since_month=rs.getString("since_month");
		imgid=rs.getInt("imgid");
		since_day=rs.getInt("since_day");
		since_day=rs.getInt("since_day");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	fullname=firstname+" "+lastname;
	if(emailid.equals(rsemailid) && password.equals(rspassword))
	{
		validuser=true;
	}
	else
	{
		validuser=false;
	}
	}
	catch(ClassNotFoundException ex)
	{
		ex.printStackTrace();
	}
	catch(SQLException ex)
	{
		ex.printStackTrace();
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}
}
}