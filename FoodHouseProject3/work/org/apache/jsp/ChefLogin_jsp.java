/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.57
 * Generated at: 2018-03-04 08:15:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ChefLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write(".cus{\r\n");
      out.write("text-align:center;\r\n");
      out.write("position:relative;\r\n");
      out.write("background-color:#d3d3d3;\r\n");
      out.write("height:50%;\r\n");
      out.write("width:50%;\r\n");
      out.write("left:300px;\r\n");
      out.write("top:30px;}\r\n");
      out.write("\r\n");
      out.write(".txtBox{\r\n");
      out.write("position:absolute;\r\n");
      out.write("background-color:#d3d3d3;\r\n");
      out.write("left:87px;\r\n");
      out.write("top:40px;}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<center><font face=\"broadway\" size=6>CHEF LOGIN</font><br>\r\n");
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("<div class=\"cus\">\r\n");
      out.write("\t<div class=\"txtBox\">\r\n");
      out.write("\t\r\n");
      out.write("\t<form action='ChefLoginForS.jsp' method='post'>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<font size=4>&nbsp;&nbsp;&nbsp;ID:</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<input type='text' name='chefId' size=50><br><br><br>\r\n");
      out.write("\r\n");
      out.write("<font size=4>Password:</font>&nbsp;&nbsp;&nbsp;&nbsp;<input type='password' name='chefPwd' size=50>\r\n");
      out.write("<br><br><br>\r\n");
      out.write("<input type=\"submit\" value=\"LOG IN\" name=\"chef_login\"></form>\r\n");
      out.write("<form action='realIndex.html' method='post'><input type=\"submit\" value=\"CANCEL\" name=\"customer_login\">\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</div></div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
