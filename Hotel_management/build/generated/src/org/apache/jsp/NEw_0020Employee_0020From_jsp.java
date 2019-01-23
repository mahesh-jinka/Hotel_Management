package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NEw_0020Employee_0020From_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <style>\n");
      out.write("div.ex {\n");
      out.write("\ttext-align: right;\n");
      out.write("         width: 500px;\n");
      out.write("\tpadding: 10px;\n");
      out.write("\tborder: 5px solid grey;\n");
      out.write("\tmargin: 0px\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body style=\"background: url(Images/empf1.jpg);height:100%;background-position:center;\n");
      out.write("          background-repeat: no-repeat;\n");
      out.write("          background-size: cover;\">\n");
      out.write("    <center>\n");
      out.write("\t<h1>New Employee From</h1>\n");
      out.write("        <div class=\"ex\">\n");
      out.write("            <center>\n");
      out.write("\t\t<form>\n");
      out.write("\t\t\t<table style=\"width: 50%\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>Enter Employee Name</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"employeename\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>Address</td>\n");
      out.write("                                        <td><textarea rows=\"4\" cols=\"50\">\n");
      out.write("                                            </textarea>\n");
      out.write("                                        </td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>Father Name</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"Fname\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td> D O B </td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"Dob\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>Mobile</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"no\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>Mail id</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"mailid\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>Experience</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"name\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>Designation</td>\n");
      out.write("\t\t\t\t\t<td><select>\n");
      out.write("                                            <option value=\"\"></option>\n");
      out.write("                                            <option value=\"\"></option>\n");
      out.write("                                            </select>\n");
      out.write("                                            </td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</table>\n");
      out.write("                    <center>\n");
      out.write("\t\t\t<input type=\"submit\" value=\"save\" />\n");
      out.write("                        <center/>\n");
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
