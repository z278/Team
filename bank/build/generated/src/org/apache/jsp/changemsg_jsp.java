package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class changemsg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title><s:text name=\"找回密码\"></s:text></title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <s:form action=\"changemsg\" method=\"post\">\n");
      out.write("            <table align=\"center\" width=\"30%\" bgcolor=\"gray\" border=\"5\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            用户名：\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input name=\"bId\" value=\"<s:property value=\"#application.bId\"/>\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            新密码：\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input name=\"cPass1\" type=\"password\" value=\"<s:property value=\"#application.cPass1\"/>\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            确认密码：\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input name=\"cPass2\" type=\"password\" value=\"<s:property value=\"#application.cPass2\"/>\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <s:submit value=\"提交\"></s:submit>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"reset\" value=\"清空\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td align=\"center\" colspan=\"2\">\n");
      out.write("                            <s:a href=\"http://localhost:8080/bank/TeamLogin.jsp\">返回</s:a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("            </table>\n");
      out.write("        </s:form>\n");
      out.write("    </body>\n");
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
