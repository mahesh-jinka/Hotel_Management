package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Show_0020Food_0020Order_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("   <style>\n");
      out.write("div.ex {\n");
      out.write("\ttext-align: right;\n");
      out.write("         width: 500px;\n");
      out.write("\tpadding: 10px;\n");
      out.write("\tborder: 5px solid grey;\n");
      out.write("\tmargin: 0px\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body style=\"background: url(Images/img3.jpg)\">\n");
      out.write("    <center>\n");
      out.write("\t<h1>Show Food Order</h1>\n");
      out.write("        <div class=\"ex\">\n");
      out.write("            <center>\n");
      out.write("\t\t<form>\n");
      out.write("\t\t\t<table style=\"width: 50%\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>Room No</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"no\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>Customer Name</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"cname\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>Select Date</td>\n");
      out.write("                                            <td><select>\n");
      out.write("                                            <option value=\"\"></option>\n");
      out.write("                                            <option value=\"\"></option>\n");
      out.write("                                            </select>\n");
      out.write("                                            </td>\n");
      out.write("                                            \n");
      out.write("                                            <td><input type=\"submit\" value=\"save\" />\n");
      out.write("                                            </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    \n");
      out.write("                                    <td align=\"left\">Food to Order</td>\n");
      out.write("                                    <td><ul>\n");
      out.write("                                               <li></li>\n");
      out.write("                                                  <li></li>\n");
      out.write("                                                  <li></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                    </td>\n");
      out.write("                                      <td align=\"center\">Quantity</td>\n");
      out.write("                                    <td><ul>\n");
      out.write("                                                  <li></li>\n");
      out.write("                                                  <li></li>\n");
      out.write("                                                  <li></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td align=\"right\">Price</td>\n");
      out.write("                                    <td><ul>\n");
      out.write("                                                  <li></li>\n");
      out.write("                                                  <li></li>\n");
      out.write("                                                  <li></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("            \n");
      out.write("\t\t</form>\n");
      out.write("</center>\t\t\n");
      out.write("\t</div>\n");
      out.write("</center>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
