package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UploadStatisticsBean {
	private String name,sci_name,climatic_cond,threats,phy_char,stattype,qr,qr1;
	private int imgid,lifespan;
	private String dburl="jdbc:db2j:net://localhost:50000/WILDLIFE";
    private String dbusername="db2inst1";
    private String dbpassword="db2inst1";
    private Boolean valid=false,imageuploaded=false;
    Connection conn=null;
    ResultSet rs;
    public Boolean getImageuploaded() {
		return imageuploaded;
	}
    public void setClimatic_cond(String climatic_cond) {
		this.climatic_cond = climatic_cond;
	}
    public void setLifespan(int lifespan) {
		this.lifespan = lifespan;
	}
    public void setThreats(String threats) {
		this.threats = threats;
		upload();
	}
    public void setStattype(String stattype) {
		this.stattype = stattype;
	}
    public void setSci_name(String sci_name) {
		this.sci_name = sci_name;
	}
    public void setPhy_char(String phy_char) {
		this.phy_char = phy_char;
	}
    public void setName(String name) {
		this.name = name;
	}
    public Boolean getValid() {
		return valid;
	}
    public void setImgid(int imgid) {
		this.imgid = imgid;
	}
	private void upload()
	{
		 try
	        {
			if(imgid>0)
			{
				Class.forName("com.ibm.db2.jcc.DB2Driver");
				conn=DriverManager.getConnection(dburl, dbusername, dbpassword);
				qr1="select name from statistics";
				PreparedStatement ps1=conn.prepareStatement(qr1);
				rs=ps1.executeQuery();
				while(rs.next())
				{
					name=rs.getString("name");
				}
				qr="update statistics set imgid=? where name=? ";
				PreparedStatement ps=conn.prepareStatement(qr);
				ps.setInt(1,imgid);
				ps.setString(2,name);
				int n=ps.executeUpdate();
				if(n>0)
				{
					imageuploaded=true;
				}
			}
			else
			{
				Class.forName("com.ibm.db2.jcc.DB2Driver");
				conn=DriverManager.getConnection(dburl, dbusername, dbpassword);
				qr="insert into statistics (name,sci_name,lifespan,climatic_cond,threats,type,phy_char) values(?,?,?,?,?,?,?) ";
				PreparedStatement ps=conn.prepareStatement(qr);
				ps.setString(1,name);
				ps.setString(2,sci_name);
				ps.setInt(3,lifespan);
				ps.setString(4,climatic_cond);
				ps.setString(5,threats);
				ps.setString(6,stattype);
				ps.setString(7,phy_char);
				int n=ps.executeUpdate();
				if(n>0)
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
