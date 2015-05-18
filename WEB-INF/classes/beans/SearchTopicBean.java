package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchTopicBean {
	private String keyword,qr,topic_name;
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
	public String getTopic_name() {
		return topic_name;
	}
	private void search()
	{
		try
        {
        Class.forName("com.ibm.db2.jcc.DB2Driver");
        conn=DriverManager.getConnection(dburl, dbusername, dbpassword);
            qr="select name from topic where name=?";
        PreparedStatement ps=conn.prepareStatement(qr);
        ps.setString(1,keyword);
        rs=ps.executeQuery();
        while(rs.next())
        {
        	topic_name=rs.getString("name");
        }
        if(topic_name!=null)
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
