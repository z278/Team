

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0//EN" "http://www.w3.org/TR/REC-html40/strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>menu</title>
        <link rel="stylesheet" href="skin/css/base.css" type="text/css" />
        <link rel="stylesheet" href="skin/css/menu.css" type="text/css" />
        <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
        <script language='javascript'>var curopenItem = '1';</script>
        <script language="javascript" type="text/javascript" src="skin/js/frame/menu.js"></script>
        <base target="main" />
    </head>
    <body target="main">
        <table width='99%' height="100%" border='0' cellspacing='0' cellpadding='0'>
            <tr>
                <td style='padding-left:3px;padding-top:8px' valign="top">
                    <dl class='bitem'>
                        <dt onClick='showHide("items1_1")'><b>储户管理</b></dt>
                        <dd style='display:block' class='sitem' id='items1_1'>
                            <ul class='sitemu'>
                                <li>
                                    <div class='items'>
                                        <div class='fllct'><a href='registerA.jsp' target='main'>开设储户</a></div>
                                    </div>
                                </li>
                                <li><div class='fllct'><a href='change.jsp' target='main'>修改储户密码</a></div> </li>
                                <li>
                                    <div class='fllct'><a href='information.jsp' target='main'>查询储户信息</a></div>
                                </li>
                                <li>
                                    <div class='fllct'><a href='delete.jsp' target='main'>注销储户</a></div>
                                </li>
                            </ul>
                          </dd>
                        </dl>
                        <dl class='bitem'>
                            <dt onClick='showHide("items2_1")'><b>业务管理</b></dt>
                            <dd style='display:block' class='sitem' id='items2_1'>
                                <ul class='sitemu'>
                                    <li><a href='set.jsp' target='main'>存款</a></li>
                                    <li><a href='get.jsp' target='main'>取款</a></li>
                                    <li><a href='transfer.jsp' target='main'>转账</a></li>
                                    <li><a href='recordsQuery.jsp' target='main'>查看记录</a></li>
                                </ul>
                            </dd>
                        </dl>
                    </td>
                </tr>
            </table>
        </body>
</html>
