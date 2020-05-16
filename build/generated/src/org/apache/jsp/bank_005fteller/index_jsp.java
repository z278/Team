package org.apache.jsp.bank_005fteller;

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.0//EN\" \"http://www.w3.org/TR/REC-html40/strict.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>长春市奋进乡村镇银行储蓄业务系统-业务员</title>\n");
      out.write("        <style>\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                scrollbar-base-color:#C0D586;\n");
      out.write("                scrollbar-arrow-color:#FFFFFF;\n");
      out.write("                scrollbar-shadow-color:DEEFC6;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <frameset rows=\"60,*\" cols=\"*\" frameborder=\"no\" border=\"0\" framespacing=\"0\">\n");
      out.write("        <frame src=\"http://localhost:8080/bank2/bank_teller/top.jsp\" name=\"topFrame\" scrolling=\"no\">\n");
      out.write("        <frameset cols=\"180,*\" name=\"btFrame\" frameborder=\"NO\" border=\"0\" framespacing=\"0\">\n");
      out.write("            <frame src=\"http://localhost:8080/bank2/bank_teller/menu.jsp\" noresize name=\"menu\" scrolling=\"yes\">\n");
      out.write("            <frame src=\"http://localhost:8080/bank2/bank_teller/main.jsp\" noresize name=\"main\" scrolling=\"yes\">\n");
      out.write("        </frameset>\n");
      out.write("    </frameset>\n");
      out.write("    <noframes>\n");
      out.write("\t<body>您的浏览器不支持框架！</body>\n");
      out.write("    </noframes>\n");
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
