/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.57
 * Generated at: 2018-03-04 09:53:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EmployeeRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("<form action='EmployeeRegAction.jsp' method='post' >\r\n");
      out.write("\r\n");
      out.write("<center><font face=\"\" size=6 style=\"font-weight:bold;\">Employee Registration</font><br><br></center>\r\n");
      out.write("\r\n");
      out.write("<table border=0 cellpadding=10  width=70% bgcolor=\"#d3d3d3\" align=center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr><td align=right><font size=4>Id:</font></td><td> <input type='text' value='' name=\"e_id\" size=40></td></tr>\r\n");
      out.write("<tr><td align=right><font size=4>Name: </font></td><td>       <input type='text' value='' name=\"e_name\" size=40></td></tr>\r\n");
      out.write("<tr><td align=right><font size=4>Phone_number:</font></td><td>    <input type='text' value='' name=\"e_ph\" size=40></td></tr>\r\n");
      out.write("<tr><td align=right><font size=4>Email_address:</font></td><td>   <input type='text' value='' name=\"e_emailadr\" size=40></td></tr>\r\n");
      out.write("<tr><td align=right><font size=4>Address:   </font></td><td>      <input type='text' value='' name=\"e_adr\" size=40></td></tr>\r\n");
      out.write("<tr><td align=right><font size=4>Status: </font></td><td>          <input type='text' value='' name=\"e_status\" size=40></td></tr>\r\n");
      out.write("<tr><td align=right><font size=4>Password:</font></td><td>        <input type='password' value='' name=\"e_pwd\" size=40></td></tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr><td></td><td></td><td align=right><input type='submit' value='Register' name=\"register\"/></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
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
