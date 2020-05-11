

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
                                        <div class='fllct'><a href='pageAction' target='main'>查看所有储户</a></div>
                                    </div>
                                </li>
                                <li><div class='fllct'><a href='addstudent.jsp' target='main'>添加储户</a></div> </li>
                                <li>
                                    <div class='fllct'><a href='importStudent.jsp' target='main'>导入储户</a></div>
                                </li>
                            </ul>
                          </dd>
                        </dl>
                        <dl class='bitem'>
                            <dt onClick='showHide("items2_1")'><b>业务员管理</b></dt>
                            <dd style='display:block' class='sitem' id='items2_1'>
                                <ul class='sitemu'>
                                    <li><a href='tpageAction' target='main'>查看所有业务员</a></li>
                                    <li><a href='addteacher.jsp' target='main'>添加业务员</a></li>
                                    <li><a href='importTeacher.jsp' target='main'>导入业务员</a></li>
                                </ul>
                            </dd>
                        </dl>
                        <dl class='bitem'>
                            <dt onClick='showHide("items2_1")'><b>账户管理</b></dt>
                            <dd style='display:block' class='sitem' id='items2_1'>
                                <ul class='sitemu'>
                                    <li><a href='cpageAction' target='main'>查看所有账户</a></li>
                                    <li><a href='addclasses.jsp' target='main'>添加账户</a></li>
                                    <li><a href='' target='main'>导入账户</a></li>
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
