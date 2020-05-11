package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      <title>main</title>\n");
      out.write("<base target=\"_self\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"skin/css/base.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"skin/css/main.css\" />\n");
      out.write("</head>\n");
      out.write("<body leftmargin=\"8\" topmargin='8'>\n");
      out.write("<table width=\"98%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("  <tr>\n");
      out.write("    <td><div style='float:left'> <img height=\"14\" src=\"skin/images/frame/book1.gif\" width=\"20\" />&nbsp;欢迎登录长春市奋进乡村镇银行储蓄业务系统。 </div>\n");
      out.write("      <div style='float:right;padding-right:8px;'>\n");
      out.write("        <!--  //保留接口  -->\n");
      out.write("      </div></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"1\" background=\"skin/images/frame/sp_bg.gif\" style='padding:0px'></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("<table width=\"98%\" align=\"center\" border=\"0\" cellpadding=\"3\" cellspacing=\"1\" bgcolor=\"#CBD8AC\" style=\"margin-bottom:8px;margin-top:8px;\">\n");
      out.write("  <tr>\n");
      out.write("    <td background=\"skin/images/frame/wbg.gif\" bgcolor=\"#EEF4EA\" class='title'><span>消息</span></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("<table width=\"98%\" align=\"center\" border=\"0\" cellpadding=\"4\" cellspacing=\"1\" bgcolor=\"#CBD8AC\" style=\"margin-bottom:8px\">\n");
      out.write("  <tr>\n");
      out.write("    <td colspan=\"2\" background=\"skin/images/frame/wbg.gif\" bgcolor=\"#EEF4EA\" class='title'>\n");
      out.write("    \t<div style='float:left'><span>快捷操作</span></div>\n");
      out.write("    \t<div style='float:right;padding-right:10px;'></div>\n");
      out.write("   </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\n");
      out.write("    <td height=\"30\" colspan=\"2\" align=\"center\" valign=\"bottom\"><table width=\"100%\" border=\"0\" cellspacing=\"1\" cellpadding=\"1\">\n");
      out.write("        <tr>\n");
      out.write("          <td width=\"15%\" height=\"31\" align=\"center\"><img src=\"skin/images/frame/qc.gif\" width=\"90\" height=\"30\" /></td>\n");
      out.write("          <td width=\"85%\" valign=\"bottom\"><div class='icoitem'>\n");
      out.write("              <div class='ico'></div>\n");
      out.write("              <div class='txt'><a href=''><u></u></a></div>\n");
      out.write("            </div>\n");
      out.write("            <div class='icoitem'>\n");
      out.write("              <div class='ico'></div>\n");
      out.write("              <div class='txt'><a href=''><u></u></a></div>\n");
      out.write("            </div>\n");
      out.write("            <div class='icoitem'>\n");
      out.write("              <div class='ico'></div>\n");
      out.write("              <div class='txt'><a href=''><u></u></a></div>\n");
      out.write("            </div>\n");
      out.write("            <div class='icoitem'>\n");
      out.write("              <div class='ico'></div>\n");
      out.write("              <div class='txt'><a href=''><u></u></a></div>\n");
      out.write("            </div>\n");
      out.write("            <div class='icoitem'>\n");
      out.write("              <div class='ico'></div>\n");
      out.write("              <div class='txt'><a href=''><u></u></a></div>\n");
      out.write("            </div>\n");
      out.write("            <div class='icoitem'>\n");
      out.write("              <div class='ico'></div>\n");
      out.write("              <div class='txt'><a href=''><u></u></a></div>\n");
      out.write("            </div></td>\n");
      out.write("        </tr>\n");
      out.write("      </table></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("<table width=\"98%\" align=\"center\" border=\"0\" cellpadding=\"4\" cellspacing=\"1\" bgcolor=\"#CBD8AC\" style=\"margin-bottom:8px\">\n");
      out.write("  <tr bgcolor=\"#EEF4EA\">\n");
      out.write("    <td colspan=\"2\" background=\"skin/images/frame/wbg.gif\" class='title'><span>系统基本信息</span></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\n");
      out.write("    <td width=\"25%\" bgcolor=\"#FFFFFF\">您的级别：</td>\n");
      out.write("    <td width=\"75%\" bgcolor=\"#FFFFFF\">管理员</td>\n");
      out.write("  </tr>\n");
      out.write(" \n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("<table width=\"98%\" align=\"center\" border=\"0\" cellpadding=\"4\" cellspacing=\"1\" bgcolor=\"#CBD8AC\">\n");
      out.write(" \n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>");
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
