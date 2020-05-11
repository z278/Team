

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
                        <dt onClick='showHide("items1_1")'><b>账户应用</b></dt>
                        <dd style='display:block' class='sitem' id='items1_1'>
                            <ul class='sitemu'>
                                <li><div class='fllct'><a href='addstudent.jsp' target='main'>查看余额</a></div> </li>
                                <li>
                                    <div class='fllct'><a href='importStudent.jsp' target='main'>转账</a></div>
                                </li>
                            </ul>
                        </dd>
                    </dl>
                    <dl class='bitem'>
                        <dt onClick='showHide("items2_1")'><b>个人信息管理</b></dt>
                        <dd style='display:block' class='sitem' id='items2_1'>
                            <ul class='sitemu'>
                                <li><a href='changPass.jsp' target='main'>修改密码</a></li>
                            </ul>
                        </dd>
                    </dl>
                </td>
            </tr>
        </table>
    </body>
</html>
