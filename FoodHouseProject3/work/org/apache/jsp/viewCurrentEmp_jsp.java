/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.57
 * Generated at: 2018-03-03 15:54:29 UTC
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

public final class viewCurrentEmp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("table{\r\n");
      out.write("\r\n");
      out.write("border-collapse:collapse;\r\n");
      out.write("width:80%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th{\r\n");
      out.write("padding:10px;\r\n");
      out.write("border-bottom:1px solid black;}\r\n");
      out.write("\r\n");
      out.write("td{\r\n");
      out.write("text-align:left;\r\n");
      out.write("padding:4px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tr:nth-child(even){\r\n");
      out.write("background-color:#f2f2f2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<table border=1 align=center>\r\n");
      out.write(" <tr>\r\n");
      out.write("    <th>Employee_id</th>\r\n");
      out.write("     <th>Employee_name</th>\r\n");
      out.write("     <th>Employee_phone</th>\r\n");
      out.write("      <th>Employee_email</th>\r\n");
      out.write("      <th>Employee_address</th> \r\n");
      out.write("      <th>Employee_status</th>\r\n");
      out.write(" </tr>\r\n");
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

String sql="select * from foodordering.employee_info where working_status='yes'";
ResultSet rs=st.executeQuery(sql);
while(rs.next()){
	String emp_id=rs.getString(1);
	String emp_name=rs.getString(2);
	String emp_ph=rs.getString(3);
	String emp_email=rs.getString(4);
	String emp_adr=rs.getString(5);
	String emp_sts=rs.getString(6);
	
      out.write("\r\n");
      out.write("\t <tr>\r\n");
      out.write("\t   <td>");
      out.print( emp_id);
      out.write("</td>\r\n");
      out.write("\t   <td>");
      out.print( emp_name);
      out.write("</td>\r\n");
      out.write("\t   <td>");
      out.print( emp_ph);
      out.write("</td>\r\n");
      out.write("\t   <td>");
      out.print( emp_email);
      out.write("</td>\r\n");
      out.write("\t   <td>");
      out.print( emp_adr);
      out.write("</td>\r\n");
      out.write("\t   <td>");
      out.print( emp_sts);
      out.write("</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\r\n");
      out.write("\t");

}


      out.write("\r\n");
      out.write("</table>\r\n");
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
