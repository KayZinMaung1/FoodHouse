/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.57
 * Generated at: 2018-03-04 00:19:21 UTC
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
import java.sql.*;

public final class EditChefInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"EditChefInfoAction.jsp\">\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write(" \r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/foodordering","root","root");
		Statement st=con.createStatement();
		
		
		 
      out.write('\r');
      out.write('\n');

HttpSession s1=request.getSession(false);
String cf_id=(String)(s1.getAttribute("cf_id"));
//out.println(cf_id);
try{
	
	String e_name="";
	String e_ph="";
	String e_email="";
	String e_address="";
	String sql="select * from foodordering.employee_info where employee_id='"+cf_id+"'";
	ResultSet rs=st.executeQuery(sql);
	if(rs.next()){
		 e_name=rs.getString(2);
		 e_ph=rs.getString(3);
		 e_email=rs.getString(4);
		 e_address=rs.getString(5);
	}
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<center><font face=\"broadway\" size=5>Edit Your Info!\t</font></center>\t<br>\r\n");
      out.write("\t<table align=center border=0 height=50% width=70% bgcolor=#d3d3d3 cellpadding=10>\r\n");
      out.write("\t<tr><td><font size=4>Name:</font></td><td><input type=\"text\" name=\"e_name\" value=\"");
      out.print(e_name);
      out.write("\" size=40></td></tr>\r\n");
      out.write("\t<tr><td><font size=4>Phone:</font></td><td><input type=\"text\" name=\"e_ph\" value=\"");
      out.print(e_ph);
      out.write("\" size=40></td></tr>\r\n");
      out.write("\t<tr><td><font size=4>Email:</font></td><td><input type=\"text\" name=\"e_email\" value=\"");
      out.print(e_email);
      out.write("\"size=40></td></tr>\r\n");
      out.write("\t<tr><td><font size=4>Address:</font></td><td><input type=\"text\" name=\"e_address\" value=\"");
      out.print(e_address);
      out.write("\" size=40></td></tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr><td></td><td></td><td> <input type=\"submit\" value=\"Update My Info\" name=\"editChefInfo\"></td></tr>\r\n");
      out.write("\t");

	
}
catch(Exception ex){
	
}

      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
