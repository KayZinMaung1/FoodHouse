/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.57
 * Generated at: 2018-03-04 08:05:00 UTC
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

public final class OrderManagement_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/importfile.jsp", Long.valueOf(1519226520000L));
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
      out.write("<style>\r\n");
      out.write("table{\r\n");
      out.write("border-collapse:collapse;\r\n");
      out.write("width:100%;\r\n");
      out.write("}\r\n");
      out.write("th{\r\n");
      out.write("padding:8px;\r\n");
      out.write("background-color:#848482;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td{\r\n");
      out.write("text-align:left;\r\n");
      out.write("padding:8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tr:nth-child(even){\r\n");
      out.write("background-color:#f2f2f2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style></head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("  <tr>\r\n");
      out.write("   <th>Order_id</th>\r\n");
      out.write("   <th>Customer_firstName</th>\r\n");
      out.write("   <th>Customer_lastName </th>\r\n");
      out.write("   <th>Menu-name</th>\r\n");
      out.write("   <th>Quantity </th>\r\n");
      out.write("   <th>Total</th>\r\n");
      out.write("   <th>Date</th> \r\n");
      out.write("  </tr>\r\n");
      out.write(" ");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   ");

   
   
   try{
	   Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/foodordering","root","root");
		
		
		Statement st=con.createStatement();
		
		
		
		
	   String menu_id;
		String sql="select * from foodordering.order where status='unfulfilled'";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()){
			int order_id=rs.getInt(1);
			String customer_firstN=rs.getString(2);
			String customer_lastN=rs.getString(3);
			
			String menu_name=rs.getString(4);
			int quantity=rs.getInt(5);
			int total=rs.getInt(6);
			String date=rs.getString(7);
			
			
			
	
			
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t<td>");
      out.print(order_id );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( customer_firstN );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( customer_lastN );
      out.write("</td>\t\r\n");
      out.write("\t\t\t<td>");
      out.print(menu_name );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(quantity );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(total );
      out.write("</td>\t\r\n");
      out.write("\t\t\t<td>");
      out.print(date );
      out.write("</td>\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
 
			
		}
   }
   catch(Exception e){
	   out.println(e);
   }
   
      out.write("\r\n");
      out.write("   \r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
