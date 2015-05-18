package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteUserBean {
	private String fullname,qr,firstname,lastname;
	private boolean userdeleted=false;
	private String dburl="jdbc:db2j:net://localhost:50000/WILDLIFE";
    private String dbusername="db2inst1";
    private String dbpassword="db2inst1";
    Connection conn=null;
	public void setFullname(String fullname) {
		this.fullname = fullname;
		delete();
	}
	public boolean getUserdeleted() {
		return userdeleted;
	}
	private void delete()
	{
		firstname=fullname.substring(0,fullname.indexOf(" "));
		lastname=fullname.substring((fullname.indexOf(" ")+1));
        try
        {
        	Class.forName("com.ibm.db2.jcc.DB2Driver");
        	conn=DriverManager.getConnection(dburl, dbusername, dbpassword);
            qr="delete from userdetail where firstname=? And lastname=? ";
            PreparedStatement ps=conn.prepareStatement(qr);
            ps.setString(1,firstname);
            ps.setString(2,lastname);
            int delete=ps.executeUpdate();
            if(delete>0)
            {
            	userdeleted=true;
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
