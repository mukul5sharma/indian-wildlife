package beans;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;


public class SubmitQueryBean {
	private String subject,by,content,qr;
	private String dburl="jdbc:db2j:net://localhost:50000/WILDLIFE";
	private String dbusername="db2inst1";
	private String dbpassword="db2inst1";
	private int counter,query_id;
	private boolean valid;
	 Date date = new Date(System.currentTimeMillis());
	 
	 
	 public boolean getValid() {
			return valid;
		}
    
	public void setBy(String by) {
		this.by = by;
	}
    
	public int getQuery_id() {
		return query_id;
		
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setContent(String content) {
		this.content = content;
		checkquery();	
	}
	
	
	private void checkquery()
	{
		try
		{
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			Connection conn=DriverManager.getConnection(dburl, dbusername, dbpassword);
			qr="insert into query (subject,content,by,date) values(?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(qr);
			ps.setString(1,subject);
			ps.setString(2,content);
			ps.setString(3,by);
			ps.setDate(4,date);
			int counter =ps.executeUpdate();
			if(counter > 0 )
			{
				valid = true;
			}
			qr ="select id from query where by = ?";
			PreparedStatement ps2=conn.prepareStatement( qr);
			ps2.setString(1,by);
			ResultSet rs = ps2.executeQuery();
			while(rs.next())
			{
				query_id=rs.getInt("id");
			}
		}
		
		
	
		catch(Exception ex)
				{
			ex.printStackTrace();
				}
	
	}
	
	
	
	}

	


