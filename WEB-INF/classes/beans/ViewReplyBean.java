package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewReplyBean {
	private String subject,content,reply,date,qr;
	private int id;
	private String dburl="jdbc:db2j:net://localhost:50000/WILDLIFE";
	private String dbusername="db2inst1";
	private String dbpassword="db2inst1";
	private boolean valid=false;
	ResultSet rs;
	public void setId(int id) {
		this.id = id;
		viewReply();
	}
	public String getContent() {
		return content;
	}
	public String getDate() {
		return date;
	}
	public String getSubject() {
		return subject;
	}
	public String getReply() {
		return reply;
	}
	public boolean getValid()
	{
		return valid;
	}
	public void viewReply()
	{
		try
		{
		Class.forName("com.ibm.db2.jcc.DB2Driver");
		Connection conn=DriverManager.getConnection(dburl, dbusername, dbpassword);
		qr="select * from query where id=? ";
		PreparedStatement ps=conn.prepareStatement(qr);
		ps.setInt(1,id);
		rs=ps.executeQuery();
		while(rs.next())
		{
			subject=rs.getString("subject");
			content=rs.getString("content");
			reply=rs.getString("reply");
			date=rs.getDate("date").toString();
		}
		if(subject!=null)
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
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
