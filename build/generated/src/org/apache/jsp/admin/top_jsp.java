package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_property_value_nobody.release();
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.0//EN\" \"http://www.w3.org/TR/REC-html40/strict.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>top</title>\n");
      out.write("        <link href=\"skin/css/base.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <script language='javascript'>\n");
      out.write("            var preFrameW = '206,*';\n");
      out.write("            var FrameHide = 0;\n");
      out.write("            var curStyle = 1;\n");
      out.write("            var totalItem = 9;\n");
      out.write("            function ChangeMenu(way){\n");
      out.write("                var addwidth = 10;\n");
      out.write("                var fcol = top.document.all.btFrame.cols;\n");
      out.write("                if(way==1) addwidth = 10;\n");
      out.write("                else if(way==-1) addwidth = -10;\n");
      out.write("                else if(way==0){\n");
      out.write("                    if(FrameHide == 0){\n");
      out.write("\t\t\tpreFrameW = top.document.all.btFrame.cols;\n");
      out.write("\t\t\ttop.document.all.btFrame.cols = '0,*';\n");
      out.write("\t\t\tFrameHide = 1;\n");
      out.write("\t\t\treturn;\n");
      out.write("                    }else{\n");
      out.write("\t\t\ttop.document.all.btFrame.cols = preFrameW;\n");
      out.write("\t\t\tFrameHide = 0;\n");
      out.write("\t\t\treturn;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                fcols = fcol.split(',');\n");
      out.write("                fcols[0] = parseInt(fcols[0]) + addwidth;\n");
      out.write("                top.document.all.btFrame.cols = fcols[0]+',*';\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function mv(selobj,moveout,itemnum)\n");
      out.write("            {\n");
      out.write("                if(itemnum==curStyle) return false;\n");
      out.write("                if(moveout=='m') selobj.className = 'itemsel';\n");
      out.write("                if(moveout=='o') selobj.className = 'item';\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function changeSel(itemnum)\n");
      out.write("            {\n");
      out.write("                curStyle = itemnum;\n");
      out.write("                for(i=1;i<=totalItem;i++)\n");
      out.write("                {\n");
      out.write("                    if(document.getElementById('item'+i)) document.getElementById('item'+i).className='item';\n");
      out.write("                }\n");
      out.write("                document.getElementById('item'+itemnum).className='itemsel';\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            body { padding:0px; margin:0px; }\n");
      out.write("            #tpa {\n");
      out.write("               color: #009933;\n");
      out.write("               margin:0px;\n");
      out.write("               padding:0px;\n");
      out.write("               float:right;\n");
      out.write("               padding-right:10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #tpa dd {\n");
      out.write("               margin:0px;\n");
      out.write("               padding:0px;\n");
      out.write("               float:left;\n");
      out.write("               margin-right:2px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #tpa dd.ditem {\n");
      out.write("               margin-right:8px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #tpa dd.img {\n");
      out.write("                padding-top:6px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            div.item\n");
      out.write("            {\n");
      out.write("               text-align:center;\n");
      out.write("               background:url(skin/images/frame/topitembg.gif) 0px 3px no-repeat;\n");
      out.write("               width:82px;\n");
      out.write("               height:26px;\n");
      out.write("               line-height:28px;\n");
      out.write("             }\n");
      out.write("\n");
      out.write("            .itemsel {\n");
      out.write("               width:80px;\n");
      out.write("               text-align:center;\n");
      out.write("               background:#226411;\n");
      out.write("               border-left:1px solid #c5f097;\n");
      out.write("               border-right:1px solid #c5f097;\n");
      out.write("               border-top:1px solid #c5f097;\n");
      out.write("               height:26px;\n");
      out.write("               line-height:28px;\n");
      out.write("             }\n");
      out.write("\n");
      out.write("             .itemsel {\n");
      out.write("                height:26px;\n");
      out.write("                line-height:26px;\n");
      out.write("              }\n");
      out.write("\n");
      out.write("             a:link,a:visited {\n");
      out.write("                 text-decoration: underline;\n");
      out.write("             }\n");
      out.write("\n");
      out.write("            .item a:link, .item a:visited {\n");
      out.write("                 font-size: 12px;\n");
      out.write("                 color: #ffffff;\n");
      out.write("                 text-decoration: none;\n");
      out.write("                 font-weight: bold;\n");
      out.write("             }\n");
      out.write("\n");
      out.write("            .itemsel a:hover {\n");
      out.write("                color: #ffffff;\n");
      out.write("                font-weight: bold;\n");
      out.write("                 border-bottom:2px solid #E9FC65;\n");
      out.write("             }\n");
      out.write("\n");
      out.write("             .itemsel a:link, .itemsel a:visited {\n");
      out.write("                 font-size: 12px;\n");
      out.write("                 color: #ffffff;\n");
      out.write("                 text-decoration: none;\n");
      out.write("                 font-weight: bold;\n");
      out.write("             }\n");
      out.write("\n");
      out.write("            .itemsel a:hover {\n");
      out.write("                color: #ffffff;\n");
      out.write("                border-bottom:2px solid #E9FC65;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .rmain {\n");
      out.write("                padding-left:10px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body bgColor='#ffffff'>\n");
      out.write("        <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" background=\"skin/images/frame/topbg.gif\">\n");
      out.write("            <tr>\n");
      out.write("                <td width='20%' height=\"60\"><h2>长春市奋进乡村镇银行储蓄业务系统</h2></td>\n");
      out.write("                <td width='80%' align=\"right\" valign=\"bottom\">\n");
      out.write("                    <table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td align=\"right\" height=\"26\" style=\"padding-right:10px;line-height:26px;\">\n");
      out.write("                                您好：<span class=\"username\">");
      if (_jspx_meth_s_property_0(_jspx_page_context))
        return;
      out.write("</span>，欢迎登录长春市奋进乡村镇银行储蓄业务系统！\n");
      out.write("                                [<a href=\"");
      out.print(request.getContextPath());
      out.write("/index.jsp\" target=\"_blank\">登录页面</a>]\n");
      out.write("                                [<a href=\"chang\" target=\"main\">修改密码</a>]\n");
      out.write("                                [<a href=\"clear\" target=\"_top\">注销退出</a>]&nbsp;\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td align=\"right\" height=\"34\" class=\"rmain\">\n");
      out.write("                                <dl id=\"tpa\">\n");
      out.write("                                    <dd class='img'><a href=\"javascript:ChangeMenu(-1);\"><img vspace=\"5\" src=\"skin/images/frame/arrl.gif\" border=\"0\" width=\"5\" height=\"8\" alt=\"缩小左框架\"  title=\"缩小左框架\" /></a></dd>\n");
      out.write("                                    <dd class='img'><a href=\"javascript:ChangeMenu(0);\"><img vspace=\"3\" src=\"skin/images/frame/arrfc.gif\" border=\"0\" width=\"12\" height=\"12\" alt=\"显示/隐藏左框架\" title=\"显示/隐藏左框架\" /></a></dd>\n");
      out.write("                                    <dd class='img' style=\"margin-right:10px;\"><a href=\"javascript:ChangeMenu(1);\"><img vspace=\"5\" src=\"skin/images/frame/arrr.gif\" border=\"0\" width=\"5\" height=\"8\" alt=\"增大左框架\" title=\"增大左框架\" /></a></dd>\n");
      out.write("                                    <dd><div class='itemsel' id='item1' onMouseMove=\"mv(this,'move',1);\" onMouseOut=\"mv(this,'o',1);\"><a href=\"menu.asp\" onclick=\"changeSel(1)\" target=\"menu\">主菜单</a></div></dd>\n");
      out.write("\t\t\n");
      out.write("                                </dl>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
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

  private boolean _jspx_meth_s_property_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent(null);
    _jspx_th_s_property_0.setValue("#session.username");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }
}
