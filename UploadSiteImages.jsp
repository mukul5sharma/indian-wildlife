
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="org.apache.commons.fileupload.*" %>
<%@ page import="org.apache.commons.fileupload.disk.*" %>
<%@ page import="org.apache.commons.fileupload.servlet.*" %>
<%@ page import="org.apache.commons.io.output.*" %>


<%
   File file ;
   int maxFileSize = 5000 * 1024;
   int maxMemSize = 5000 * 1024;
   ServletContext context = pageContext.getServletContext();
   String filePath = context.getInitParameter("file-upload");
   String fileName="";
   int imgid=0;
   Boolean uploaded=false;
   // Verify the content type
   String contentType = request.getContentType();
   if ((contentType.indexOf("multipart/form-data") >= 0)) {

      DiskFileItemFactory factory = new DiskFileItemFactory();
      // maximum size that will be stored in memory
      factory.setSizeThreshold(maxMemSize);
      // Location to save data that is larger than maxMemSize.
      factory.setRepository(new File("c:\\temp"));

      // Create a new file upload handler
      ServletFileUpload upload = new ServletFileUpload(factory);
      // maximum file size to be uploaded.
      upload.setSizeMax( maxFileSize );
      try{ 
         // Parse the request to get file items.
         List fileItems = upload.parseRequest(request);

         // Process the uploaded file items
         Iterator i = fileItems.iterator();
         while ( i.hasNext () ) 
         {
            FileItem fi = (FileItem)i.next();
            if ( !fi.isFormField () )	
            {
            // Get the uploaded file parameters
            String fieldName = fi.getFieldName();
            fileName = fi.getName();
            boolean isInMemory = fi.isInMemory();
            long sizeInBytes = fi.getSize();
            // Write the file
            if( fileName.lastIndexOf("\\") >= 0 ){
            file = new File( filePath + 
            fileName.substring( fileName.lastIndexOf("\\"))) ;
            }else{
            file = new File( filePath + 
            fileName.substring(fileName.lastIndexOf("\\")+1)) ;
            }
            fi.write( file ) ;
            uploaded=true;
            }
         }
      }catch(Exception ex) {
         System.out.println(ex);
      }
   }else{
	   uploaded=false;
   }
   System.out.println(uploaded);
Connection connection = null;
/* Create string of connection url within specified format with machine 
name, port number and database name. Here machine name id localhost 
and database name is mahendra. */
String connectionURL ="jdbc:db2j:net://localhost:50000/WILDLIFE";
/*declare a resultSet that works as a table resulted by execute a specified 
sql query. */
ResultSet rs = null;
// Declare prepare statement.
PreparedStatement psmnt = null,psmt=null;
// declare FileInputStream object to store binary stream of given image.
FileInputStream fis;
try {
// Load JDBC driver "com.mysql.jdbc.Driver"
Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance();
/* Create a connection by using getConnection() method that takes 
parameters of string type connection url, user name and password to 
connect to database. */
connection = DriverManager.getConnection(connectionURL, "db2inst1", "db2inst1");
// create a file object for image by specifying full path of image as parameter.
File image = new File(filePath + 
            fileName );
/* prepareStatement() is used for create statement object that is 
used for sending sql statements to the specified database. */
psmnt = connection.prepareStatement
("insert into siteimage(img) values(?)");
fis = new FileInputStream(image);
psmnt.setBinaryStream(1, (InputStream)fis, (int)(image.length()));
/* executeUpdate() method execute specified sql query. Here this query 
insert data and image from specified address. */ 
int s = psmnt.executeUpdate();
if(s>0) {
System.out.println("Uploaded successfully !");
}
else {
System.out.println("unsucessfull to upload image.");
}
psmt=connection.prepareStatement("select id from siteimage");
ResultSet rs1=psmt.executeQuery();
while(rs1.next())
{
imgid=rs1.getInt("id");
}
System.out.println("Image Id "+imgid);
image.delete();
}
// catch if found any exception during rum time.
catch (Exception ex) {
System.out.println("Found some error : "+ex);
}
finally {
// close all the connections.
connection.close();
psmnt.close();
}
%>