/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.99
 * Generated at: 2020-02-20 08:25:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"Java\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<!-- Charset & Responsiveness Metadata -->\n");
      out.write("<meta charset=\"utf-8\" />\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("<!-- StyleSheets -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./css/common.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./css/login.css\" />\n");
      out.write("\n");
      out.write("<!-- Bootstrap CSS CDN -->\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" />\n");
      out.write("\n");
      out.write("<!-- Google Fonts API CDN -->\n");
      out.write("<link\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Montserrat:300,400,700,900&display=swap\"\n");
      out.write("\trel=\"stylesheet\" />\n");
      out.write("<link\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Comfortaa:300,400,700&display=swap\"\n");
      out.write("\trel=\"stylesheet\" />\n");
      out.write("<title>TorverBook - Login</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<header>\n");
      out.write("\t\t<h1 id=\"header-title\">TorverBook</h1>\n");
      out.write("\t</header>\n");
      out.write("\t<div id=\"content-container\">\n");
      out.write("\t\t<div class=\"user-login-container user-auth-container\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t");

				if (request.getAttribute("errorMessage") != null &&
				!String.valueOf(request.getAttribute("errorMessage")).isEmpty()) {
			
      out.write("\n");
      out.write("\t\t\t<div class='alert alert-danger' role='alert'>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMessage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div>\n");
      out.write("\t\t\t");

				}
			
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<form method=\"POST\" action=\"/login\">\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"username-input\">Username</label> <input type=\"text\"\n");
      out.write("\t\t\t\t\t\tclass=\"form-control\" id=\"username-input\" name=\"username\"\n");
      out.write("\t\t\t\t\t\tplaceholder=\"John_Doe_XX\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"password-input\">Password</label> <input type=\"password\"\n");
      out.write("\t\t\t\t\t\tclass=\"form-control\" id=\"password-input\" name=\"password\"\n");
      out.write("\t\t\t\t\t\tplaceholder=\"******************\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<button type=\"submit\" class=\"btn btn-info\" id=\"loginBtn\">Login</button>\n");
      out.write("\t\t\t\t<hr />\n");
      out.write("\t\t\t\t<a href=\"/signup\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-light sign-up-btn\">Sign\n");
      out.write("\t\t\t\t\t\tUp</button>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Bootstrap JS CDN -->\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
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
