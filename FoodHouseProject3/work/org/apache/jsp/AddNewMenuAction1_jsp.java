/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.57
 * Generated at: 2018-03-04 13:22:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.disk.*;
import org.apache.commons.fileupload.servlet.*;
import org.apache.commons.io.output.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import java.lang.*;

public final class AddNewMenuAction1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/importfile.jsp", Long.valueOf(1519226520000L));
    _jspx_dependants.put("/dbConnector.jsp", Long.valueOf(1519226598000L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(" \r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/foodordering","root","root");
		Statement st=con.createStatement();
		
		
		 
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("   \r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("\r\n");

	
	String menu_id="";
    String menu_name="";
    int menu_price=0;
    String menu_p="";
    String menu_catagory="";
    String menu_status="";
    String img_url=" ";
	
	

		 File file ; 
		   int maxFileSize = 8000 * 1024; 
		   int maxMemSize = 8000 * 1024;
		   ServletContext context = pageContext.getServletContext();
		   String filePath = "G:\\J2EE project\\workspace\\FoodHouseProject3\\images";
		 
		 
		   String contentType = request.getContentType(); 
		   if ((contentType.indexOf("multipart/form-data") >= 0))
		   {
			   DiskFileItemFactory factory = new DiskFileItemFactory(); 
		  
		   factory.setSizeThreshold(maxMemSize);
		  
		   factory.setRepository(new File("C:\\temp")); 
		   
		   ServletFileUpload upload = new ServletFileUpload(factory); 
		   
		   upload.setSizeMax( maxFileSize );
		
			 
			   List fileItems = upload.parseRequest(request); 
			  
			   Iterator i = fileItems.iterator(); 
			   
			   while ( i.hasNext () ) 
			   { FileItem fi = (FileItem)i.next();
			   if( fi.isFormField()){
				   if(fi.getFieldName().equals("menu_id")){
					  menu_id = fi.getString();
				   }
			   }
			   if( fi.isFormField()){
				   if(fi.getFieldName().equals("menu_name")){
					   menu_name= fi.getString();
				   }
			   }
			   if( fi.isFormField()){
				   if(fi.getFieldName().equals("menu_price")){
					   menu_p= fi.getString();
					   
				   }
			   }
			   if( fi.isFormField()){
				   if(fi.getFieldName().equals("menu_catagory")){
					   menu_catagory= fi.getString();
				   }
			   }
			   if( fi.isFormField()){
				   if(fi.getFieldName().equals("menu_status")){
					   menu_status= fi.getString();
				   }
			   }
			   
			   
			   if ( !fi.isFormField () ) { 
				
				   String fieldName = fi.getFieldName();
				   String fileName = fi.getName();
				
				   
				  if(fieldName.equals("img_file")){
					   boolean isInMemory = fi.isInMemory(); 
					   long sizeInBytes = fi.getSize(); 
					   if( fileName.lastIndexOf("\\") >= 0 )
					   { file = new File(filePath + fileName.substring( fileName.lastIndexOf("\\"))) ; 
					   }else
					   { file = new File(filePath + fileName.substring(fileName.lastIndexOf("\\")+1)) ; 
					   } 
					   fi.write(file) ; 
					  //out.println("Uploaded Filename: " + filePath + fileName.substring( fileName.lastIndexOf("\\")) + "<br>");
					    img_url=fileName.substring( fileName.lastIndexOf("\\")+1);
					 
				  }
				  } 
			}
		 	
			  
			
			   out.println(img_url + "<br>");
			  
		   }
		  
		
			   try{		
				   menu_price=Integer.parseInt(menu_p);
					String sqlquery="insert into foodordering.menu(menu_id,menu_name,menu_price,menu_image,menu_catagory,menu_status) values('" + menu_id + "','" + menu_name + "',"+ menu_price+",'" + img_url + "','" + menu_catagory + "','"+menu_status+"')";
					int result = st.executeUpdate(sqlquery);
					if(result == 1){
						out.println("<font size=5 face='' color='blue'>Successfully Inserted!!</font>");
					}
			   
			   }
		   catch(Exception ex){
						out.println(ex);
					}
	
	
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
