<%-- 
    Document   : set
    Created on : 2020-5-12, 3:05:14
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>存款</title>
    </head>
    <body>
        <form name="form2" action="set" method="post">
            <table name="table1" align="center" cellpadding="0.5">
                <tr>
                    <td>
                        <img width="23" height="21"><font face="楷体,宋体" size="4">账户：</font>
                    </td>
                    <td>
                        <input type="text" name="account_number">
                    </td>
                </tr>
                <tr>
                    <td>
                        <img width="23" height="21"><font face="楷体,宋体" size="4">密码：</font>
                    </td>
                    <td>
                        <input type="password" name="password">
                    </td>
                </tr>
                <tr>
                    <td>
                        <img width="23" height="21"><font face="楷体,宋体" size="4">存款金额：</font>
                    </td>
                    <td>
                        <input type="text" name="money">
                    </td>
                </tr>
                <tr>
                    <td  colspan="2" align="center">
                        <font face="楷体,宋体" size="4" align="center"><input type="submit" value="提交" ></font>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
