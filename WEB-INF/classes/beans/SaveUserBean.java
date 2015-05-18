package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class SaveUserBean {
	private String firstname,lastname,emailid,password,sex,qr,month,username,user_type="reg_user";
	private boolean success; 
	private long mobileno;
	private int day,year;
	private String dburl="jdbc:db2j:net://localhost:50000/WILDLIFE";
	private String dbusername="db2inst1";
	private String dbpassword="db2inst1";
	public void setYear(int year) {
		this.year = year;
		saveUser();
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getUser_type() {
		return user_type;
	}
	public String getUsername() {
		return username;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public int getYear() {
		return year;
	}
	public String getSex() {
		return sex;
	}
	public String getPassword() {
		return password;
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
	public String getEmailid() {
		return emailid;
	}
	public int getDay() {
		return day;
	}
	public boolean isSuccess() {
		return success;
	}
	private void saveUser()
	{
		Connection conn=null;
		try
		{
		Class.forName("com.ibm.db2.jcc.DB2Driver");
		conn=DriverManager.getConnection(dburl, dbusername, dbpassword);
		qr="insert into userdetail(firstname,lastname,emailid,password,sex,day,month,year,user_type,mobileno,username) values(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(qr);
		ps.setString(1,firstname);
		ps.setString(2,lastname);
		ps.setString(3,emailid);
		ps.setString(4,password);
		ps.setString(5,sex);
		ps.setInt(6,day);
		ps.setString(7,month);
		ps.setInt(8,year);
		ps.setString(9,user_type);
		ps.setLong(10,mobileno);
		ps.setString(11,username);
		int insert=ps.executeUpdate();
		conn.commit();
		if(insert!=0)
		{
			success=true;
		}
		else
		{
			success=false;
		}
		ps.close();
		conn.close();
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch(SQLException ex )
		{
			ex.printStackTrace();
			try
			{
				conn.rollback();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}

}