package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>menu</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"skin/css/base.css\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"skin/css/menu.css\" type=\"text/css\" />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\n");
      out.write("        <script language='javascript'>var curopenItem = '1';</script>\n");
      out.write("        <script language=\"javascript\" type=\"text/javascript\" src=\"skin/js/frame/menu.js\"></script>\n");
      out.write("        <base target=\"main\" />\n");
      out.write("    </head>\n");
      out.write("    <body target=\"main\">\n");
      out.write("        <table width='99%' height=\"100%\" border='0' cellspacing='0' cellpadding='0'>\n");
      out.write("            <tr>\n");
      out.write("                <td style='padding-left:3px;padding-top:8px' valign=\"top\">\n");
      out.write("                    <dl class='bitem'>\n");
      out.write("                        <dt onClick='showHide(\"items1_1\")'><b>储户管理</b></dt>\n");
      out.write("                        <dd style='display:block' class='sitem' id='items1_1'>\n");
      out.write("                            <ul class='sitemu'>\n");
      out.write("                                <li>\n");
      out.write("                                    <div class='items'>\n");
      out.write("                                        <div class='fllct'><a href='pageAction' target='main'>查看所有储户</a></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li><div class='fllct'><a href='addstudent.jsp' target='main'>添加储户</a></div> </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <div class='fllct'><a href='importStudent.jsp' target='main'>导入储户</a></div>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                          </dd>\n");
      out.write("                        </dl>\n");
      out.write("                        <dl class='bitem'>\n");
      out.write("                            <dt onClick='showHide(\"items2_1\")'><b>业务员管理</b></dt>\n");
      out.write("                            <dd style='display:block' class='sitem' id='items2_1'>\n");
      out.write("                                <ul class='sitemu'>\n");
      out.write("                                    <li><a href='tpageAction' target='main'>查看所有业务员</a></li>\n");
      out.write("                                    <li><a href='addteacher.jsp' target='main'>添加业务员</a></li>\n");
      out.write("                                    <li><a href='importTeacher.jsp' target='main'>导入业务员</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </dd>\n");
      out.write("                        </dl>\n");
      out.write("                        <dl class='bitem'>\n");
      out.write("                            <dt onClick='showHide(\"items2_1\")'><b>账户管理</b></dt>\n");
      out.write("                            <dd style='display:block' class='sitem' id='items2_1'>\n");
      out.write("                                <ul class='sitemu'>\n");
      out.write("                                    <li><a href='cpageAction' target='main'>查看所有账户</a></li>\n");
      out.write("                                    <li><a href='addclasses.jsp' target='main'>添加账户</a></li>\n");
      out.write("                                    <li><a href='' target='main'>导入账户</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </dd>\n");
      out.write("                        </dl>\n");
      out.write("                        <dl class='bitem'>\n");
      out.write("                            <dt onClick='showHide(\"items2_1\")'><b>个人信息管理</b></dt>\n");
      out.write("                            <dd style='display:block' class='sitem' id='items2_1'>\n");
      out.write("                                <ul class='sitemu'>\n");
      out.write("                                    <li><a href='changPass.jsp' target='main'>修改密码</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </dd>\n");
      out.write("                        </dl>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </body>\n");
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
