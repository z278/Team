package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_password_size_name_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_a_href;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_text_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_textfield_size_name_label_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_password_size_name_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_a_href = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_text_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_textfield_size_name_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_password_size_name_label_nobody.release();
    _jspx_tagPool_s_form_method_action.release();
    _jspx_tagPool_s_a_href.release();
    _jspx_tagPool_s_text_name_nobody.release();
    _jspx_tagPool_s_textfield_size_name_label_nobody.release();
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>");
      if (_jspx_meth_s_text_0(_jspx_page_context))
        return;
      out.write("</title>\n");
      out.write("    </head>\n");
      out.write("     <body background=\"背景3.gif\" style=\"background-repeat:no-repeat; background-position:center;background-size:100%\">\n");
      out.write("        <br>\n");
      out.write("        <font face=\"楷体\" color=\"bluegreen\" size=\"4\"><h1 align=\"center\">吉林省长春市奋进乡村镇银行储蓄业务系统登录信息表</h1></font>\n");
      out.write("        <br>\n");
      out.write("        ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_s_text_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_0 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_0.setPageContext(_jspx_page_context);
    _jspx_th_s_text_0.setParent(null);
    _jspx_th_s_text_0.setName("吉林省长春市奋进乡村镇银行储蓄业务系统登录页面");
    int _jspx_eval_s_text_0 = _jspx_th_s_text_0.doStartTag();
    if (_jspx_th_s_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_0);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_0);
    return false;
  }

  private boolean _jspx_meth_s_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_method_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent(null);
    _jspx_th_s_form_0.setAction("register");
    _jspx_th_s_form_0.setMethod("post");
    int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
    if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_0.doInitBody();
      }
      do {
        out.write("  \n");
        out.write("            <br><br><br><br><br><br>\n");
        out.write("            <table border=\"1\" align=\"center\" bgcolor=\"bluegreen\">\n");
        out.write("                <tr>\n");
        out.write("                    <td>\n");
        out.write("                        ");
        if (_jspx_meth_s_textfield_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    </td>\n");
        out.write("                </tr>\n");
        out.write("                <tr>\n");
        out.write("                    <td>\n");
        out.write("                        ");
        if (_jspx_meth_s_password_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    </td>\n");
        out.write("                </tr>\n");
        out.write("                <tr>\n");
        out.write("                    <td>\n");
        out.write("                        ");
        if (_jspx_meth_s_password_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    </td>\n");
        out.write("                </tr>\n");
        out.write("                <tr>\n");
        out.write("                    <td>\n");
        out.write("                        ");
        if (_jspx_meth_s_password_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    </td>\n");
        out.write("                </tr>\n");
        out.write("                <tr>\n");
        out.write("                    <td>\n");
        out.write("                        ");
        if (_jspx_meth_s_password_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    </td>\n");
        out.write("                </tr>\n");
        out.write("                <tr>\n");
        out.write("                    <td>\n");
        out.write("                        ");
        if (_jspx_meth_s_password_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    </td>\n");
        out.write("                </tr>\n");
        out.write("                <tr>\n");
        out.write("                    <td colspan=\"2\" align=\"center\">\n");
        out.write("                        <input type=\"submit\" value=\"提交\"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
        out.write("                        <input type=\"reset\" value=\"清空\"/>\n");
        out.write("                    </td>\n");
        out.write("                </tr>\n");
        out.write("                <tr>\n");
        out.write("                    <td colspan=\"2\" align=\"center\">\n");
        out.write("                        ");
        if (_jspx_meth_s_a_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    </td>\n");
        out.write("                </tr>\n");
        out.write("            </table>\n");
        out.write("        ");
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

  private boolean _jspx_meth_s_textfield_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_size_name_label_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_0.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_0.setName("name");
    _jspx_th_s_textfield_0.setLabel("用户真实姓名");
    _jspx_th_s_textfield_0.setSize("30");
    int _jspx_eval_s_textfield_0 = _jspx_th_s_textfield_0.doStartTag();
    if (_jspx_th_s_textfield_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_size_name_label_nobody.reuse(_jspx_th_s_textfield_0);
      return true;
    }
    _jspx_tagPool_s_textfield_size_name_label_nobody.reuse(_jspx_th_s_textfield_0);
    return false;
  }

  private boolean _jspx_meth_s_password_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:password
    org.apache.struts2.views.jsp.ui.PasswordTag _jspx_th_s_password_0 = (org.apache.struts2.views.jsp.ui.PasswordTag) _jspx_tagPool_s_password_size_name_label_nobody.get(org.apache.struts2.views.jsp.ui.PasswordTag.class);
    _jspx_th_s_password_0.setPageContext(_jspx_page_context);
    _jspx_th_s_password_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_password_0.setName("cId");
    _jspx_th_s_password_0.setLabel("用户身份证号");
    _jspx_th_s_password_0.setSize("30");
    int _jspx_eval_s_password_0 = _jspx_th_s_password_0.doStartTag();
    if (_jspx_th_s_password_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_password_size_name_label_nobody.reuse(_jspx_th_s_password_0);
      return true;
    }
    _jspx_tagPool_s_password_size_name_label_nobody.reuse(_jspx_th_s_password_0);
    return false;
  }

  private boolean _jspx_meth_s_password_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:password
    org.apache.struts2.views.jsp.ui.PasswordTag _jspx_th_s_password_1 = (org.apache.struts2.views.jsp.ui.PasswordTag) _jspx_tagPool_s_password_size_name_label_nobody.get(org.apache.struts2.views.jsp.ui.PasswordTag.class);
    _jspx_th_s_password_1.setPageContext(_jspx_page_context);
    _jspx_th_s_password_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_password_1.setName("phone");
    _jspx_th_s_password_1.setLabel("用户电话号码");
    _jspx_th_s_password_1.setSize("30");
    int _jspx_eval_s_password_1 = _jspx_th_s_password_1.doStartTag();
    if (_jspx_th_s_password_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_password_size_name_label_nobody.reuse(_jspx_th_s_password_1);
      return true;
    }
    _jspx_tagPool_s_password_size_name_label_nobody.reuse(_jspx_th_s_password_1);
    return false;
  }

  private boolean _jspx_meth_s_password_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:password
    org.apache.struts2.views.jsp.ui.PasswordTag _jspx_th_s_password_2 = (org.apache.struts2.views.jsp.ui.PasswordTag) _jspx_tagPool_s_password_size_name_label_nobody.get(org.apache.struts2.views.jsp.ui.PasswordTag.class);
    _jspx_th_s_password_2.setPageContext(_jspx_page_context);
    _jspx_th_s_password_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_password_2.setName("bId");
    _jspx_th_s_password_2.setLabel("用户账号");
    _jspx_th_s_password_2.setSize("30");
    int _jspx_eval_s_password_2 = _jspx_th_s_password_2.doStartTag();
    if (_jspx_th_s_password_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_password_size_name_label_nobody.reuse(_jspx_th_s_password_2);
      return true;
    }
    _jspx_tagPool_s_password_size_name_label_nobody.reuse(_jspx_th_s_password_2);
    return false;
  }

  private boolean _jspx_meth_s_password_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:password
    org.apache.struts2.views.jsp.ui.PasswordTag _jspx_th_s_password_3 = (org.apache.struts2.views.jsp.ui.PasswordTag) _jspx_tagPool_s_password_size_name_label_nobody.get(org.apache.struts2.views.jsp.ui.PasswordTag.class);
    _jspx_th_s_password_3.setPageContext(_jspx_page_context);
    _jspx_th_s_password_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_password_3.setName("cPass1");
    _jspx_th_s_password_3.setLabel("用户密码");
    _jspx_th_s_password_3.setSize("30");
    int _jspx_eval_s_password_3 = _jspx_th_s_password_3.doStartTag();
    if (_jspx_th_s_password_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_password_size_name_label_nobody.reuse(_jspx_th_s_password_3);
      return true;
    }
    _jspx_tagPool_s_password_size_name_label_nobody.reuse(_jspx_th_s_password_3);
    return false;
  }

  private boolean _jspx_meth_s_password_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:password
    org.apache.struts2.views.jsp.ui.PasswordTag _jspx_th_s_password_4 = (org.apache.struts2.views.jsp.ui.PasswordTag) _jspx_tagPool_s_password_size_name_label_nobody.get(org.apache.struts2.views.jsp.ui.PasswordTag.class);
    _jspx_th_s_password_4.setPageContext(_jspx_page_context);
    _jspx_th_s_password_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_password_4.setName("cPass2");
    _jspx_th_s_password_4.setLabel("再次输入密码");
    _jspx_th_s_password_4.setSize("30");
    int _jspx_eval_s_password_4 = _jspx_th_s_password_4.doStartTag();
    if (_jspx_th_s_password_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_password_size_name_label_nobody.reuse(_jspx_th_s_password_4);
      return true;
    }
    _jspx_tagPool_s_password_size_name_label_nobody.reuse(_jspx_th_s_password_4);
    return false;
  }

  private boolean _jspx_meth_s_a_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_0 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_0.setPageContext(_jspx_page_context);
    _jspx_th_s_a_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_a_0.setHref("http://localhost:8080/bank/TeamLogin.jsp");
    int _jspx_eval_s_a_0 = _jspx_th_s_a_0.doStartTag();
    if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_0.doInitBody();
      }
      do {
        out.write('返');
        out.write('回');
        int evalDoAfterBody = _jspx_th_s_a_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_0);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_0);
    return false;
  }
}
