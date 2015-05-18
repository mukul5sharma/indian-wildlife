package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ViewNewsletterBean {
	private String subject,content,date,qr,button,news;
	ArrayList<Newsletters> newsletter =new ArrayList<Newsletters>();
	private String dburl="jdbc:db2j:net://localhost:50000/WILDLIFE";
	private String dbusername="db2inst1";
	private String dbpassword="db2inst1";
	private Boolean valid=false;
	Connection conn=null;
	ResultSet rs;
	public String getContent() {
		return content;
	}
	public String getDate() {
		return date;
	}
	public String getSubject() {
		return subject;
	}
	public Boolean getValid() {
		return valid;
	}
	public void setButton(String button) {
		this.button = button;
		viewNewsletter();
	}
	public ArrayList<Newsletters> getNewsletter() {
		return newsletter;
	}
	public String getButton() {
		return button;
	}
	private void viewNewsletter()
	{
		try
		{
		Class.forName("com.ibm.db2.jcc.DB2Driver");
		Connection conn=DriverManager.getConnection(dburl, dbusername, dbpassword);
		if(button.equalsIgnoreCase("Read Latest Realize"))
		{
		qr="select subject,content,date from newsletter";
		PreparedStatement ps=conn.prepareStatement(qr);
		rs=ps.executeQuery();
		while(rs.next())
		{
			subject=rs.getString("subject");
			content=rs.getString("content");
			date=rs.getDate("date").toString();
		}
		if(subject!=null)
		{
			valid=true;
		}
		}
		else if(button.equalsIgnoreCase("Read Previous Realize"))
		{
			qr="select subject,content,date from newsletter";
			PreparedStatement ps=conn.prepareStatement(qr);
			rs=ps.executeQuery();
			while(rs.next())
			{
				Newsletters newsletters=new Newsletters();
				newsletters.setSubject(rs.getString("subject"));
				newsletters.setContent(rs.getString("content"));
				newsletters.setDate(rs.getDate("date").toString());
				newsletter.add(newsletters);
				news="yes";
			}
			if(news!=null)
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
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
