package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ChooseForumBean{

	private String fullname,qr,topic_name,name,content,by;
	private int topic_id;
	ArrayList<MyTopicNames> topicnames=new ArrayList<MyTopicNames>();
	private String dburl="jdbc:db2j:net://localhost:50000/WILDLIFE";
    private String dbusername="db2inst1";
    private String dbpassword="db2inst1";
    private Boolean valid=false;
    Connection conn=null;
    ResultSet rs;
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public Boolean isValid() {
		return valid;
	}
	public void setName(String name) {
		this.name = name;
		search();
	}
	public ArrayList<MyTopicNames> getTopicnames() {
		return topicnames;
	}
	public String getBy() {
		return by;
	}
	public String getContent() {
		return content;
	}
	public String getName() {
		return name;
	}
	public String getTopic_name() {
		return topic_name;
	}
	public int getTopic_id() {
		return topic_id;
	}
	private void search()
	{
		try
        {
        Class.forName("com.ibm.db2.jcc.DB2Driver");
        conn=DriverManager.getConnection(dburl, dbusername, dbpassword);
            qr="select * from topic where by=?";
        PreparedStatement ps=conn.prepareStatement(qr);
        ps.setString(1,fullname);
        rs=ps.executeQuery();
        while(rs.next())
        {
        	MyTopicNames names=new MyTopicNames();
        	topic_id=rs.getInt("id");
        	topic_name=rs.getString("name");
        	names.setTopic_name(topic_name);
        	content=rs.getString("content");
        	by=rs.getString("by");
        	topicnames.add(names);
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
