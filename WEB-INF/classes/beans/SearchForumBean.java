package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SearchForumBean {

	private String keyword,qr,forum_name;
	private int forum_id,no_of_user;
	private String dburl="jdbc:db2j:net://localhost:50000/WILDLIFE";
    private String dbusername="db2inst1";
    private String dbpassword="db2inst1";
    private Boolean valid=false;
    Connection conn=null;
    ResultSet rs;
	public void setKeyword(String keyword) {
		this.keyword = keyword;
		search();
	}
	public Boolean isValid() {
		return valid;
	}
	public int getNo_of_user() {
		return no_of_user;
	}
	public String getForum_name() {
		return forum_name;
	}
	public int getForum_id() {
		return forum_id;
	}
	private void search()
	{
		try
        {
        Class.forName("com.ibm.db2.jcc.DB2Driver");
        conn=DriverManager.getConnection(dburl, dbusername, dbpassword);
        if(keyword!=null && keyword.length()>0)
        {
            qr="select * from forum where name=?";
        PreparedStatement ps=conn.prepareStatement(qr);
        ps.setString(1,keyword);
        rs=ps.executeQuery();
        while(rs.next())
        {
        	forum_id=rs.getInt("id");
        	forum_name=rs.getString("name");
        	no_of_user=rs.getInt("no_of_user");
        }
        if(forum_name!=null)
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
