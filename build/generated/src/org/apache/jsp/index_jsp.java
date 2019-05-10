package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" >\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>Project | Login</title>\n");
      out.write("  \n");
      out.write("  <script\n");
      out.write("  src=\"https://code.jquery.com/jquery-3.3.1.js\"\n");
      out.write("   ></script>\n");
      out.write("  \n");
      out.write("      <link rel=\"stylesheet\" href=\"css1/style.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style1.css\">\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"track\">\n");
      out.write("    <div class=\"square\"></div>\n");
      out.write("    <div class=\"square\"></div>\n");
      out.write("</div>\t  \n");
      out.write("\t<div class=\"login-reg-panel\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t<div class=\"white-panel\">\n");
      out.write("\t\t\t<div class=\"login-show\">\n");
      out.write("                            <form action=\"Login\" method=\"post\">\n");
      out.write("\t\t\t\t<h1 id=\"h\">LOGIN</h1>\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"Email\" name=\"username\" required>\n");
      out.write("                                <input type=\"password\" placeholder=\"Password\" name=\"password\" required>\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"Login\">\n");
      out.write("                            </form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    \n");
      out.write("\n");
      out.write(" <script type=\"text/javascript\" src=\"js1/style.js\"></script>\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!--#2196f3  #fff   #2196f3   linear-gradient(90deg, #03a9f4, #f441a5, #ffeb3b,#03a9f4)-->  \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
