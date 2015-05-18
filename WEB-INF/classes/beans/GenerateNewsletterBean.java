package beans;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GenerateNewsletterBean {
	private String subject,content,qr;
	private String dburl="jdbc:db2j:net://localhost:50000/WILDLIFE";
    private String dbusername="db2inst1";
    private String dbpassword="db2inst1";
    private Boolean valid=false;
    Connection conn=null;
    ResultSet rs;
	Date date =new Date(System.currentTimeMillis());
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setContent(String content) {
		this.content = content;
		generate();
	}
	public Boolean getValid() {
		return valid;
	}
	private void generate()
	{
        try
        {
        Class.forName("com.ibm.db2.jcc.DB2Driver");
        conn=DriverManager.getConnection(dburl, dbusername, dbpassword);
        qr="insert into newsletter (subject,content,date) values (?,?,?) ";
        PreparedStatement ps=conn.prepareStatement(qr);
        ps.setString(1,subject);
        ps.setString(2,content);
        ps.setDate(3,date);
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
	}

}
