package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

public class CreateTopicBean {
	private String name,content,by,qr;
	private String dburl="jdbc:db2j:net://localhost:50000/WILDLIFE";
	private String dbusername="db2inst1";
	private String dbpassword="db2inst1";
	private int insert;
	Date date=new Date(System.currentTimeMillis());
	private boolean valid=false;
	Connection conn=null;
	ResultSet rs;
	public void setContent(String content) {
		this.content = content;
		createTopic();
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBy(String by) {
		this.by = by;
	}
	public boolean isValid()
	{
		return valid;
	}
	public String getName() {
		return name;
	}
	private void createTopic()
	{
		try
	    {
	    Class.forName("com.ibm.db2.jcc.DB2Driver");
	    conn=DriverManager.getConnection(dburl, dbusername, dbpassword);
	    qr="insert into topic (name,content,by,date) values(?,?,?,?) ";
	    PreparedStatement ps=conn.prepareStatement(qr);
	    ps.setString(1,name);
	    ps.setString(2,content);
	    ps.setString(3,by);
	    ps.setDate(4,date);
	    insert=ps.executeUpdate();
		if(insert>0)
		{
			valid=true;
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
