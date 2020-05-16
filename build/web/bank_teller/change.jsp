<%-- 
    Document   : change
    Created on : 2020-5-12, 21:45:37
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>修改储户密码</title>
    </head>
    <body>
        <form name="form9" action="change" method="post">
            <table name="table9" align="center" cellpadding="0.5">
                <tr>
                    <td>
                        <img width="23" height="21"><font face="楷体,宋体" size="4">账号：</font>
                    </td>
                    <td>
                        <input type="text" name="account_number">
                    </td>
                </tr>
                <tr>
                    <td>
                        <img width="23" height="21"><font face="楷体,宋体" size="4">身份证号：</font>
                    </td>
                    <td>
                        <input type="text" name="id_number">
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
