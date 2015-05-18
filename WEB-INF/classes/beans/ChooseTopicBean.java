package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ChooseTopicBean {
private String name,qr,topic_name,content,by,date,comment;
private int topic_id;
ArrayList<Comments> comments=new ArrayList<Comments>();
private String dburl="jdbc:db2j:net://localhost:50000/WILDLIFE";
private String dbusername="db2inst1";
private String dbpassword="db2inst1";
private Boolean valid=false,commentfound=false;
Connection conn=null;
ResultSet rs,rs1;
public void setName(String name) {
	this.name = name;
	choose();
}
public String getBy() {
	return by;
}
public String getContent() {
	return content;
}
public String getTopic_name() {
	return topic_name;
}
public Boolean isValid() {
	return valid;
}
public int getTopic_id() {
	return topic_id;
}
public String getDate() {
	return date;
}
public ArrayList<Comments> getComments() {
	return comments;
}
public Boolean getCommentfound() {
	return commentfound;
}
private void choose()
{
	try
    {
    Class.forName("com.ibm.db2.jcc.DB2Driver");
    conn=DriverManager.getConnection(dburl, dbusername, dbpassword);
        qr="select * from topic where name=?";
    PreparedStatement ps=conn.prepareStatement(qr);
    ps.setString(1,name);
    rs=ps.executeQuery();
    while(rs.next())
    {
    	topic_id=rs.getInt("id");
    	topic_name=rs.getString("name");
    	content=rs.getString("content");
    	by=rs.getString("by");
    	date=rs.getDate("date").toString();
    }
    qr="select comment,by,date from comment where topic_id=?";
    PreparedStatement ps1=conn.prepareStatement(qr);
    ps1.setInt(1,topic_id);
    rs1=ps1.executeQuery();
    while(rs1.next())
    {
    	Comments commentss=new Comments();
    	commentss.setComment(rs1.getString("comment"));
    	commentss.setComment_by(rs1.getString("by"));
    	commentss.setComment_date(rs1.getDate("date").toString());
    	comments.add(commentss);
    	comment="yes";
    }
    if(comment!=null)
    {
    	commentfound=true;
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
