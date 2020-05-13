<%@page import="PO.UserPO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>注销页面</title>
    </head>
    <body>
        <s:form action="delete.action" method="post">
            <table align="center" width="40%" border="5">
                请输入你的用户名和密码！
                <tr>
                    <td>
                        <font face="楷体,宋体" size="4" align="center">用户名</font>
                    </td>
                    <td>
                        <input name="delId" type="text"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <font face="楷体,宋体" size="4" align="center">密码</font>
                    </td>
                    <td>
                        <input name="delpws" type="password"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" value="确定" >
                    </td>
                    <td>
                        <input type="button" value="返回" onclick="javascript:window.location.href='success.jsp'"/>
                    </td>
                </tr>
            </table>
        </s:form>
    </body>
</html>
