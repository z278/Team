<%-- 
    Document   : change_teller
    Created on : 2020-5-13, 18:06:09
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>修改业务员密码</title>
    </head>
    <body>
        <form name="form14" action="change_teller" method="post">
            <table name="table14" align="center" cellpadding="0.5">
                <tr>
                    <td>
                        <img width="23" height="21"><font face="楷体,宋体" size="4">用户名：</font>
                    </td>
                    <td>
                        <input type="text" name="username">
                    </td>
                </tr>
                <tr>
                    <td>
                        <img width="23" height="21"><font face="楷体,宋体" size="4">新密码：</font>
                    </td>
                    <td>
                        <input type="password" name="password1">
                    </td>
                </tr>
                <tr>
                    <td>
                        <img width="23" height="21"><font face="楷体,宋体" size="4">确认密码：</font>
                    </td>
                    <td>
                        <input type="password" name="password2">
                    </td>
                </tr>
                <tr>
                    <td align="center">
                        <font face="楷体,宋体" size="4" align="center"><input type="submit" value="提交" ></font>
                    </td>
                    <td align="center">
                        <font face="楷体,宋体" size="4" align="center"><input type="reset" name="Submit" value="重置"></font>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
