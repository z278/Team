package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_method_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_form_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_form_method_action.release();
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>长春市奋进乡村镇银行储蓄业务系统</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("       </body>\n");
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

  private boolean _jspx_meth_s_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_method_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent(null);
    _jspx_th_s_form_0.setAction("login");
    _jspx_th_s_form_0.setMethod("post");
    int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
    if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("            <table width=\"100%\" height=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
        out.write("                <tr>\n");
        out.write("                    <td>&nbsp;</td>\n");
        out.write("                </tr>\n");
        out.write("                <tr>\n");
        out.write("                    <td height=\"608\">\n");
        out.write("                        <table width=\"862\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n");
        out.write("                            <tr>\n");
        out.write("                                <br>\n");
        out.write("                                <font face=\"楷体\" color=\"green\" size=\"4\"><h1 align=\"center\">长春市奋进乡村镇银行储蓄业务系统</h1></font>\n");
        out.write("                                <marquee onmouseover=\"this.stop()\" onmouseout=\"this.start()\" scrollamount=5 scrolldelay=0 direction=left><img src=\"公告1.jpg\" width=\"21\" height=\"19\"></img><font face=\"楷体\" color=\"pink\" size=\"4\">公告：受疫情影响，交易金额不得超过1元，望周知！</font></MARQUEE>    \n");
        out.write("                                <br><br>\n");
        out.write("                            </tr>\n");
        out.write("                            <tr>\n");
        out.write("                                <td height=\"95\">\n");
        out.write("                                    <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
        out.write("                                        <tr>\n");
        out.write("                                            <td width=\"342\" height=\"95\">&nbsp;</td>\n");
        out.write("                                            <td width=\"265\">\n");
        out.write("                                                <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
        out.write("                                                    <tr>\n");
        out.write("                                                        <td width=\"21%\" height=\"30\"><div align=\"center\"><span class=\"STYLE3\">用户</span></div></td>\n");
        out.write("                                                        <td width=\"39%\" height=\"30\"><input type=\"text\" name=\"username\"  style=\"height:18px; width:130px; border:solid 1px #cadcb2; font-size:12px; color:#81b432;\"></td>\n");
        out.write("                                                        <td width=\"40%\"><label><input type=\"radio\" name=\"radiobutton\" value=\"1\" checked=\"checked\">储户</label></td>\n");
        out.write("                                                    </tr>\n");
        out.write("                                                    <tr>\n");
        out.write("                                                        <td height=\"30\"><div align=\"center\"><span class=\"STYLE3\">密码</span></div></td>\n");
        out.write("                                                        <td height=\"30\"><input type=\"password\" name=\"password\"  style=\"height:18px; width:130px; border:solid 1px #cadcb2; font-size:12px; color:#81b432;\"></td>\n");
        out.write("                                                        <td height=\"30\"><label><input type=\"radio\" name=\"radiobutton\" value=\"2\">业务员 </label></td>\n");
        out.write("                                                    </tr>\n");
        out.write("                                                    <tr>\n");
        out.write("                                                        <td height=\"30\">&nbsp;</td>\n");
        out.write("                                                        <td height=\"30\"><input type=\"submit\" value=\"登录\" ><label><input type=\"reset\" name=\"Submit\" value=\"重置\"></label></td>\n");
        out.write("                                                        <td height=\"30\"><input type=\"radio\" name=\"radiobutton\" value=\"3\">管理员</td>\n");
        out.write("                                                    </tr>\n");
        out.write("                                                  </table>\n");
        out.write("                                                </td>\n");
        out.write("                                                <td width=\"255\">&nbsp;</td>\n");
        out.write("                                            </tr>\n");
        out.write("                                      </table>\n");
        out.write("                                   </td>\n");
        out.write("                                </tr>\n");
        out.write("                                <tr>\n");
        out.write("                                    <td height=\"247\" valign=\"top\">\n");
        out.write("                                        <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
        out.write("                                            <tr>\n");
        out.write("                                                <td width=\"22%\" height=\"30\">&nbsp;</td>\n");
        out.write("                                                <td width=\"56%\">&nbsp;</td>\n");
        out.write("                                                <td width=\"22%\">&nbsp;</td>\n");
        out.write("                                            </tr>\n");
        out.write("                                            <tr>\n");
        out.write("                                                <td>&nbsp;</td>\n");
        out.write("                                                 <td height=\"30\">\n");
        out.write("                                                     <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
        out.write("                                                        <tr>\n");
        out.write("                                                            <td width=\"44%\" height=\"20\">&nbsp;</td>\n");
        out.write("                                                            <td width=\"56%\" class=\"STYLE4\">版本 2020V1.0 </td>\n");
        out.write("                                                        </tr>\n");
        out.write("                                                     </table>\n");
        out.write("                                                  </td>\n");
        out.write("                                                 <td>&nbsp;</td>\n");
        out.write("                                             </tr>\n");
        out.write("                                          </table>\n");
        out.write("                                        </td>\n");
        out.write("                            </tr>\n");
        out.write("                        </table>\n");
        out.write("                    </td>\n");
        out.write("                    </tr>                   \n");
        out.write("                </table>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_s_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_method_action.reuse(_jspx_th_s_form_0);
      return true;
    }
    _jspx_tagPool_s_form_method_action.reuse(_jspx_th_s_form_0);
    return false;
  }
}
