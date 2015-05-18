package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

public class CommentBean {
	private String comment,qr,by,oldcomment,oldby,olddate;
	private int topic_id,insert;
	private String dburl="jdbc:db2j:net://localhost:50000/WILDLIFE";
	private String dbusername="db2inst1";
	private String dbpassword="db2inst1";
	private Boolean valid=false;
	Connection conn=null;
	ResultSet rs,rs1;
	Date date=new Date(System.currentTimeMillis());
	public void setComment(String comment) {
		this.comment = comment;
		Comment();
	}
	public Boolean isValid() {
		return valid;
	}
	public void setBy(String by) {
		this.by = by;
	}
	public void setTopic_id(int topic_id) {
		this.topic_id = topic_id;
	}
	public String getOldby() {
		return oldby;
	}
	public String getOldcomment() {
		return oldcomment;
	}
	public String getOlddate() {
		return olddate;
	}
	private void Comment()
	{
		try
	    {
		if(comment!=null && comment.length()>0)
		{
	    Class.forName("com.ibm.db2.jcc.DB2Driver");
	    conn=DriverManager.getConnection(dburl, dbusername, dbpassword);
	        qr="insert into comment (comment,by,topic_id,date) values(?,?,?,?)";
	    PreparedStatement ps=conn.prepareStatement(qr);
	    ps.setString(1,comment);
	    ps.setString(2,by);
	    ps.setInt(3,topic_id);
	    ps.setDate(4,date);
	    insert=ps.executeUpdate();
	    if(insert>0)
	    {
	    	valid=true;
	    }
		}
	    qr="select comment,by,date from comment where topic_id=? ";
	    PreparedStatement ps1=conn.prepareStatement(qr);
	    ps1.setInt(1,topic_id);
	    rs1=ps1.executeQuery();
	    while(rs1.next())
	    {
	    	oldcomment=rs1.getString("comment");
	    	oldby=rs1.getString("by");
	    	olddate=rs1.getDate("date").toString();
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
