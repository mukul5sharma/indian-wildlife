package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class VewQueryBean {
	private String subject,content,by,date,qr,isquery;
	private String dburl="jdbc:db2j:net://localhost:50000/WILDLIFE";
	private String dbusername="db2inst1";
	private String dbpassword="db2inst1";
	ResultSet rs;
	ArrayList<ViewQuery> viewquery = new ArrayList<ViewQuery>();
	private boolean query=false;
	public String getBy() {
		return by;
	}
	public String getContent() {
		return content;
	}
	public ArrayList<ViewQuery> getViewquery() {
		return viewquery;
	}
	public String getDate() {
		return date;
	}
	public String getSubject() {
		return subject;
	}
	public VewQueryBean() {
		// TODO Auto-generated constructor stub
		viewQuery();
	}
	public boolean getQuery()
	{
		return query;
	}
	private void viewQuery()
	{
		try
		{
		Class.forName("com.ibm.db2.jcc.DB2Driver");
		Connection conn=DriverManager.getConnection(dburl, dbusername, dbpassword);
		qr="select * from query where reply is null ";
		PreparedStatement ps=conn.prepareStatement(qr,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		rs=ps.executeQuery();
		rs.afterLast();
		while(rs.previous())
		{
			ViewQuery viewqueries = new ViewQuery();
			viewqueries.setBy(rs.getString("by"));
			viewqueries.setContent(rs.getString("content"));
			viewqueries.setDate(rs.getDate("date").toString());
			viewqueries.setSubject(rs.getString("subject"));
			viewqueries.setId(rs.getInt("id"));
			viewquery.add(viewqueries);
			isquery="yes";
		}
		if(isquery!=null)
		{
			query=true;
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
