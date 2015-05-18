
package beans;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



/**
 *
 * @author amit
 */
public class SearchProcessBean {
    private String keyword,qr,type,username;
    private String dburl="jdbc:db2j:net://localhost:50000/WILDLIFE";
    private String dbusername="db2inst1";
    private String dbpassword="db2inst1";
    private String phy_char,name,threats,sci_name,climatic_cond;
    private int lifespan,id,imgid;
    private Boolean valid=false;
    Connection conn=null;
    ResultSet rs;
    public void setKeyword(String keyword) {
        this.keyword = keyword;
        search();
    }
    public String getKeyword() {
        return keyword;
    }
    public void setType(String type) {
		this.type = type;
	}
    public String getType() {
		return type;
	}
    public int getLifespan() {
        return lifespan;
    }
    public String getSci_name() {
        return sci_name;
    }

    public String getThreats() {
        return threats;
    }
    public Boolean isValid() {
        return valid;
    }
    public void setUsername(String username) {
		this.username = username;
	}
    public String getClimatic_cond() {
		return climatic_cond;
	}
    public String getPhy_char() {
		return phy_char;
	}
    public int getId() {
		return id;
	}
    public String getName() {
		return name;
	}
    public int getImgid() {
		return imgid;
	}
    private void search()
    {
        try
        {
        Class.forName("com.ibm.db2.jcc.DB2Driver");
        conn=DriverManager.getConnection(dburl, dbusername, dbpassword);
        if(keyword!=null && keyword.length()>0)
        {
            qr="select * from statistics where name=? And type=? ";
        }
        PreparedStatement ps=conn.prepareStatement(qr);
        ps.setString(1,keyword);
        ps.setString(2,type);
        rs=ps.executeQuery();
        while(rs.next())
        {
            phy_char=rs.getString("phy_char");
            id=rs.getInt("id");
            lifespan=rs.getInt("lifespan");
            name=rs.getString("name");
            threats=rs.getString("threats");
            sci_name=rs.getString("sci_name");
            climatic_cond=rs.getString("climatic_cond");
            imgid=rs.getInt("imgid");
        }
        if(name!=null)
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
