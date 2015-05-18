package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManageUserBean {
	private String user,qr,firstname,fullname,lastname,emailid,sex,month,username;
	private int day,year;
	private String dburl="jdbc:db2j:net://localhost:50000/WILDLIFE";
    private String dbusername="db2inst1";
    private String dbpassword="db2inst1";
    private Boolean valid=false;
    Connection conn=null;
    ResultSet rs;
    public void setUser(String user) {
		this.user = user;
		search();
	}
    public String getUser() {
		return user;
	}
    public String getUsername() {
		return username;
	}
    public void setValid(Boolean valid) {
		this.valid = valid;
	}
    public Boolean isValid() {
		return valid;
	}
    public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
    public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
    public void setSex(String sex) {
		this.sex = sex;
	}
    public void setMonth(String month) {
		this.month = month;
	}
    public void setLastname(String lastname) {
		this.lastname = lastname;
	}
    public String getEmailid() {
		return emailid;
	}
    public String getSex() {
		return sex;
	}
    public String getMonth() {
		return month;
	}
    public String getLastname() {
		return lastname;
	}
    public String getFirstname() {
		return firstname;
	}
    public void setYear(int year) {
		this.year = year;
	}
    public void setDay(int day) {
		this.day = day;
	}
    public int getYear() {
		return year;
	}
    public int getDay() {
		return day;
	}
    public String getFullname() {
		return fullname;
	}
    private void search()
    {

        fullname=user;
        try
        {
    	firstname=user.substring(0, user.indexOf(" "));
    	lastname=user.substring(user.indexOf(" ")+1);
        }
        catch (Exception e) 
        {
        	valid=false;
		}
        try
        {
        Class.forName("com.ibm.db2.jcc.DB2Driver");
        conn=DriverManager.getConnection(dburl, dbusername, dbpassword);
        if(user!=null && user.length()>0)
        {
            qr="select * from userdetail where firstname=? And lastname=? ";
        PreparedStatement ps=conn.prepareStatement(qr);
        ps.setString(1,firstname);
        ps.setString(2,lastname);
        rs=ps.executeQuery();
        while(rs.next())
        {
            firstname=rs.getString("firstname");
            lastname=rs.getString("lastname");
            emailid=rs.getString("emailid");
            day=rs.getInt("day");
            month=rs.getString("month");
            year=rs.getInt("year");
            sex=rs.getString("sex");
            username=rs.getString("username");
        }
        if(emailid!=null)
        {
            valid=true;
        }
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
	
    }

}
