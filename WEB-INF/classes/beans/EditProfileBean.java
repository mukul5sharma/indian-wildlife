package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EditProfileBean {
	private String emailid,about_me,expedition,last_school,employer,since_month,qr,firstname,lastname,username,sex,month,address,interest,qualification;
	private String dburl="jdbc:db2j:net://localhost:50000/WILDLIFE";
    private String dbusername="db2inst1";
    private String dbpassword="db2inst1";
    private Boolean valid=false,imageuploaded=false;
    Connection conn=null;
    ResultSet rs;
    private int imgid,since_day,day,year;
    private long mobileno;
    public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
    public Boolean getValid() {
		return valid;
	}
    public Boolean getImageuploaded() {
		return imageuploaded;
	}
    public void setImgid(int imgid) {
		this.imgid = imgid;
	}
    public void setAbout_me(String about_me) {
		this.about_me = about_me;
	}
    public void setAddress(String address) {
		this.address = address;
	}
    public void setDay(int day) {
		this.day = day;
	}
    public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
    public void setEmployer(String employer) {
		this.employer = employer;
	}
    public void setExpedition(String expedition) {
		this.expedition = expedition;
	}
    public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
    public void setInterest(String interest) {
		this.interest = interest;
	}
    public void setLast_school(String last_school) {
		this.last_school = last_school;
	}
    public void setLastname(String lastname) {
		this.lastname = lastname;
	}
    public void setMonth(String month) {
		this.month = month;
	}
    public void setYear(int year) {
		this.year = year;
	}
    public void setUsername(String username) {
		this.username = username;
		editProfile();
	}
    public void setSince_month(String since_month) {
		this.since_month = since_month;
	}
    public void setSince_day(int since_day) {
		this.since_day = since_day;
	}
    public void setQualification(String qualification) {
		this.qualification = qualification;
	}
    public void setSex(String sex) {
		this.sex = sex;
	}
    
    private void editProfile()
    {
    	try
        {
		if(imgid>0)
		{
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			conn=DriverManager.getConnection(dburl, dbusername, dbpassword);
			qr="update userdetail set imgid=? where emailid=? ";
			PreparedStatement ps=conn.prepareStatement(qr);
			ps.setInt(1,imgid);
			ps.setString(2,emailid);
			int n=ps.executeUpdate();
			if(n>0)
			{
				imageuploaded=true;
			}
		}
		else
		{
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			conn=DriverManager.getConnection(dburl, dbusername, dbpassword);
			qr="update userdetail set about_me=?,expedition=?,last_school=?,employer=?,since_month=?,firstname=?,lastname=?,username=?,month=?,address=?,qualification=?,since_day=?,day=?,year=?,mobileno=? where emailid=? ";
			PreparedStatement ps=conn.prepareStatement(qr);
			ps.setString(1,about_me);
			ps.setString(2,expedition);
			ps.setString(3,last_school);
			ps.setString(4,employer);
			ps.setString(5,since_month);
			ps.setString(6,firstname);
			ps.setString(7,lastname);
			ps.setString(8,username);
			ps.setString(9,month);
			ps.setString(10,address);
			ps.setString(11,qualification);
			ps.setInt(12,since_day);
			ps.setInt(13,day);
			ps.setInt(14,year);
			ps.setLong(15,mobileno);
			ps.setString(16,emailid);
			int n=ps.executeUpdate();
			if(n>0)
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
