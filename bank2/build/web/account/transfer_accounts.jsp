<%-- 
    Document   : transfer_accounts
    Created on : 2020-5-13, 17:12:12
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>转账</title>
    </head>
    <body>
        <form name="form3" action="transfer_accounts" method="post">
            <table name="table1" align="center" cellpadding="0.5">
                <tr>
                    <td>
                        <img width="23" height="21"><font face="楷体,宋体" size="4">要转账的账户：</font>
                    </td>
                    <td>
                        <input type="text" name="account_number1">
                    </td>
                </tr>
                <tr>
                    <td>
                        <img width="23" height="21"><font face="楷体,宋体" size="4">转账到账户：</font>
                    </td>
                    <td>
                        <input type="text" name="account_number2">
                    </td>
                </tr>
                <tr>
                    <td>
                        <img width="23" height="21"><font face="楷体,宋体" size="4">要转账的密码：</font>
                    </td>
                    <td>
                        <input type="password" name="password">
                    </td>
                </tr>
                <tr>
                    <td>
                        <img width="23" height="21"><font face="楷体,宋体" size="4">转账金额：</font>
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
