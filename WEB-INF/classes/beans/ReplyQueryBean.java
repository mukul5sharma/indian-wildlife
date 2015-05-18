package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReplyQueryBean {
	private String reply,qr;
	private int id;
	private boolean valid=false;
	private String dburl="jdbc:db2j:net://localhost:50000/WILDLIFE";
	private String dbusername="db2inst1";
	private String dbpassword="db2inst1";
	public void setId(int id) {
		this.id = id;
	}
	public void setReply(String reply) {
		this.reply = reply;
		reply();
	}
	public boolean getValid()
	{
		return valid;
	}
	public void reply()
	{
		try
		{
		Class.forName("com.ibm.db2.jcc.DB2Driver");
		Connection conn=DriverManager.getConnection(dburl, dbusername, dbpassword);
		qr="update query set reply=? where id=? ";
		PreparedStatement ps=conn.prepareStatement(qr);
		ps.setString(1,reply);
		ps.setInt(2,id);
		int n=ps.executeUpdate();
		if(n>0)
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
