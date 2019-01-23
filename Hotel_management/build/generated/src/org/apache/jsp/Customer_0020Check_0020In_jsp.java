package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Customer_0020Check_0020In_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body style=\"background: url(Images/ckin1.jpg)\">\n");
      out.write("        <h1><center>Customer Check in </center></h1>\n");
      out.write("        <form>\n");
      out.write("            <table align=\"center\">\n");
      out.write("                \n");
      out.write("                  \n");
      out.write("                <tr>\n");
      out.write("                          <td>Customer Name </td>\n");
      out.write("                         <td>  <input type=\"text\" name=\"cname\"></td> \n");
      out.write("                 </tr>\n");
      out.write("                  <tr>\n");
      out.write("                          <td>Father Name </td>\n");
      out.write("                         <td>  <input type=\"text\" name=\"fname\"></td> \n");
      out.write("                 </tr>\n");
      out.write("                 <tr>\n");
      out.write("                          <td>Customer Age </td>\n");
      out.write("                         <td>  <input type=\"text\" name=\"age\"></td> \n");
      out.write("                 </tr>\n");
      out.write("                  <tr>\n");
      out.write("\t\t\t<td>Gender</td>\n");
      out.write("                        <td><input type=\"radio\" name=\"gender\" value=\"male\"> Male\n");
      out.write("                            <input type=\"radio\" name=\"gender\" value=\"female\"> Female\n");
      out.write("                        </td>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</tr>\n");
      out.write("                 <tr>\n");
      out.write("                              <td> Martial Status  </td>\n");
      out.write("                            <td><select>\n");
      out.write("                            <option value=\"\">Married</option>\n");
      out.write("                            <option value=\"\">unMarried</option>\n");
      out.write("                            </select></td> \n");
      out.write("                 </tr>\n");
      out.write("                 <tr>\n");
      out.write("\t\t\t\t\t<td>Address</td>\n");
      out.write("                                        <td><textarea rows=\"4\" cols=\"50\">\n");
      out.write("                                            </textarea>\n");
      out.write("                                        </td>\n");
      out.write("\t\t</tr>\n");
      out.write("                 <tr>\n");
      out.write("                          <td>Mobile Number </td>\n");
      out.write("                         <td>  <input type=\"text\" name=\"no\"></td> \n");
      out.write("                 </tr>\n");
      out.write("                 <tr>\n");
      out.write("\t\t\t<td>Select  Room Category</td>\n");
      out.write("\t\t\t<td><select>\n");
      out.write("                           </select>\n");
      out.write("                        </td>\n");
      out.write("\t\t</tr>\n");
      out.write("               \n");
      out.write("                 <tr>\n");
      out.write("\t\t\t<td>Select Ac Type</td>\n");
      out.write("\t\t\t<td><select>\n");
      out.write("                           </select>\n");
      out.write("                            <input type=\"submit\" value=\"ok\" />\n");
      out.write("                        </td>\n");
      out.write("\t\t</tr>\n");
      out.write("                <tr>\n");
      out.write("                          <td> Rent</td>\n");
      out.write("                         <td>  <input type=\"text\" name=\"amount\"></td> \n");
      out.write("                 </tr>\n");
      out.write("                  <tr>\n");
      out.write("\t\t\t<td>Rooms Available</td>\n");
      out.write("\t\t\t<td><select>\n");
      out.write("                           </select>\n");
      out.write("                        </td>\n");
      out.write("\t\t</tr>\n");
      out.write("                <tr>\n");
      out.write("                          <td>Checkin Date(DD-MM-YYYY) </td>\n");
      out.write("                         <td>  <input type=\"text\" name=\"no\"></td>\n");
      out.write("                          <td>Checkin Time(HH:MM) </td>\n");
      out.write("                         <td>  <input type=\"text\" name=\"no\"></td>\n");
      out.write("                         \n");
      out.write("                 </tr>\n");
      out.write("                 <tr>\n");
      out.write("                          <td> Purpose</td>\n");
      out.write("                         <td>  <input type=\"text\" name=\"name\"></td> \n");
      out.write("                 </tr>\n");
      out.write("                  \n");
      out.write("       \n");
      out.write("            </table>\n");
      out.write("        <center>\n");
      out.write("\t\t\t<input type=\"submit\" value=\"save\" />\n");
      out.write("                        <center/>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("       \n");
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
