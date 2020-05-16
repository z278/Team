<%-- 
    Document   : registerA
    Created on : 2020-5-12, 0:54:27
    Author     : 史一然
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>开户</title>
    </head>
    <body>
        <form name="form0" action="registerA" method="post">
            <table name="table1" align="center" cellpadding="0.5">
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
                        <img width="23" height="21"><font face="楷体,宋体" size="4">姓名：</font>
                    </td>
                    <td>
                        <input type="text" name="username">
                    </td>
                </tr>
                <tr>
                    <td>
                        <img width="23" height="21"><font face="楷体,宋体" size="4">手机号：</font>
                    </td>
                    <td>
                        <input type="text" name="myphone">
                    </td>
                </tr>
                <tr>
                    <td>
                        <img width="23" height="21"><font face="楷体,宋体" size="4">密码：</font>
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
