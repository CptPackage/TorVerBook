/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.99
 * Generated at: 2020-02-19 17:33:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import torverbook.web.constants.UrlRoutes;
import java.util.ArrayList;
import torverbook.web.constants.RequestAttributes;
import torverbook.web.ad.Ad;
import java.util.List;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"Java\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<!-- Charset & Responsiveness Metadata -->\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("<!-- StyleSheets -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./css/common.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./css/dashboard.css\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS CDN -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Google Fonts API CDN -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Montserrat:300,400,700,900&display=swap\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Comfortaa:300,400,700&display=swap\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<title>TorverBook - Dashboard</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<h1 id=\"header-title\">TorverBook</h1>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<div id=\"content-container\">\r\n");
      out.write("\t\t<div class=\"row main-panels-container\">\r\n");
      out.write("\t\t\t<panel class=\"left-panel col-lg-3\"> <a\r\n");
      out.write("\t\t\t\thref=\"/dashboard\">\r\n");
      out.write("\t\t\t\t<button class=\"active\">\r\n");
      out.write("\t\t\t\t\t<em class=\"fa fa-home\" /></em> Home\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t</a> <a href=\"/settings\">\r\n");
      out.write("\t\t\t\t<button>\r\n");
      out.write("\t\t\t\t\t<em class=\"fa fa-gear\" /></em> Settings\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t</a> <a href=\"/add-ad\">\r\n");
      out.write("\t\t\t\t<button>\r\n");
      out.write("\t\t\t\t\t<em class=\"fa fa-plus\" /></em> Add Ad\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t</a> <a href=\"/personal-ads\">\r\n");
      out.write("\t\t\t\t<button>\r\n");
      out.write("\t\t\t\t\t<em class=\"fa fa-bookmark\" /></em> My Ads\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t</a> <a href=\"/personal-reviews\">\r\n");
      out.write("\t\t\t\t<button>\r\n");
      out.write("\t\t\t\t\t<em class=\"fa fa-th-list\" /></em> My Reviews\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t</a> <a href=\"/favourite\">\r\n");
      out.write("\t\t\t\t<button>\r\n");
      out.write("\t\t\t\t\t<em class=\"fa fa-star\" /></em> Favourite List\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t</a> <a href=\"/logout\">\r\n");
      out.write("\t\t\t\t<button>\r\n");
      out.write("\t\t\t\t\t<em class=\"fa fa-sign-out-alt\" /></em> Logout\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t</a> </panel>\r\n");
      out.write("\t\t\t<panel class=\"central-panel col-lg-6\">\r\n");
      out.write("\t\t\t<div class=\"search-bar-container\">\r\n");
      out.write("\t\t\t\t<form method=\"GET\" action=\"");
      out.print(UrlRoutes.DASHBOARD_FULL_URL);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"category-input\">Category</label> <select\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"custom-select custom-select-sm\" id=\"category-input\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"");
      out.print(RequestAttributes.FILTER_CATEGORY_ATTRIBUTE_NAME);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t<option>ANY</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>ALGORITHMS</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>MATH</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>HISTORY</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>GEOMETRY</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>LAW</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>ECONOMY</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>LITERATURE</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>PHILOSOPHY</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>PHYSICS</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>COMPUTER_SCIENCE</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>CHEMISTRY</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"type-input\">Type</label> <select\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"custom-select custom-select-sm\" id=\"type-input\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"");
      out.print(RequestAttributes.FILTER_TYPE_ATTRIBUTE_NAME);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t<option>SALE</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>EXCHANGE</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label id=\"price-label\" for=\"price-input\"> Price<span\r\n");
      out.write("\t\t\t\t\t\t\tid=\"price-label-value\"></span>\r\n");
      out.write("\t\t\t\t\t\t</label> <input type=\"range\" id=\"price-input\" class=\"custom-range\"\r\n");
      out.write("\t\t\t\t\t\t\toninput=\"$('#price-label-value').text('(' + this.value + ')') \"\r\n");
      out.write("\t\t\t\t\t\t\tmin=\"1\" max=\"100\" value=\"100\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"");
      out.print(RequestAttributes.FILTER_PRICE_ATTRIBUTE_NAME);
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"search-button btn btn-light\">Search</button>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"ads-container\">\r\n");
      out.write("\t\t\t\t");

					Object listObj = request.getAttribute(RequestAttributes.ADS_LIST_ATTRIBUTE_NAME);
					List<Ad> list = new ArrayList<Ad>();
					if (listObj != null) {
						list = (List<Ad>) listObj;
					}
					for (int i = 0; i < list.size(); i++) {
						Ad ad = list.get(i);
				
      out.write("\r\n");
      out.write("\t\t\t\t<ad class=\"ad-container\">\r\n");
      out.write("\t\t\t\t<div class=\"title\">");
      out.print(ad.getTitle());
      out.write("</div>\r\n");
      out.write("\t\t\t\t<div class=\"info-container\">\r\n");
      out.write("\t\t\t\t\t<span class=\"price\"><em\r\n");
      out.write("\t\t\t\t\t\tclass=\"price-icon fa fa-money-check-alt\"></em> ");
      out.print(ad.getPrice());
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t<span class=\"quantity\">(");
      out.print(ad.getQuantity());
      out.write(" left)\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"description\">");
      out.print(ad.getDescription());
      out.write("</div>\r\n");
      out.write("\t\t\t\t<h6>\r\n");
      out.write("\t\t\t\t\t<em class=\"fa fa-book\"></em>\r\n");
      out.write("\t\t\t\t\t");
      out.print(ad.getCategory());
      out.write("</h6>\r\n");
      out.write("\t\t\t\t<h6>\r\n");
      out.write("\t\t\t\t\t<em class=\"fa fa-user\"></em>\r\n");
      out.write("\t\t\t\t\t");
      out.print(ad.getOwnerUsername());
      out.write("</h6>\r\n");
      out.write("\t\t\t\t<button class=\"btn btn-primary send-message\">Send Message</button>\r\n");
      out.write("\t\t\t\t</ad>\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</panel>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<panel class=\"right-panel col-lg-3\">\r\n");
      out.write("\t\t\t<div class=\"no-messages-container\">\r\n");
      out.write("\t\t\t\t<em class=\"fa fa-envelope-open fa-5x\"></em>\r\n");
      out.write("\t\t\t\t<h1>No messages yet..</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</panel>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap JS CDN -->\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- FontAwesome JS CDN -->\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/8526e38f8c.js\"></script>\r\n");
      out.write("\r\n");
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
