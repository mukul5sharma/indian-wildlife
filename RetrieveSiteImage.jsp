

<%@ page import="java.sql.*,java.io.*,java.util.*" %> 

<%



String connectionURL = "jdbc:db2j:net://localhost:50000/WILDLIFE";

if(request.getParameter("imgid")!=null && request.getParameter("imgid")!="")

{


  int id =  Integer.parseInt(request.getParameter("imgid"));



  String filename = "image"+id+".jpg";

  Connection con=null;

  try{  

  Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance();

  con=DriverManager.getConnection(connectionURL,"db2inst1","db2inst1");  

  Statement st1=con.createStatement();

  String strQuery = "select img from siteimage where id="+id;

  

  ResultSet rs1 = st1.executeQuery(strQuery);

  

  String imgLen="";

  if(rs1.next()){

  imgLen = rs1.getString(1);

 }  

  rs1 = st1.executeQuery(strQuery);

  if(rs1.next()){

  int len = imgLen.length();

  byte [] rb = new byte[len];

  InputStream readImg = rs1.getBinaryStream(1);

  int index=readImg.read(rb, 0, len);  

  st1.close();

  response.reset();

  response.setContentType("image/jpg");


  response.getOutputStream().write(rb,0,len); 

  response.getOutputStream().flush();  

  }

  }

  catch (Exception e){

  e.printStackTrace();

  }

}

%>