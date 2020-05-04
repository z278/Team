<%-- 
    Document   : TeamLogin
    Created on : 2020-4-6, 16:55:56
    Author     : 标哥！
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>村镇银行储蓄业务系统首页</title>
    </head>
    <body background="背景3.gif" style="background-repeat:no-repeat; background-position:center;background-size:100%">
        <br>
        <font face="楷体" color="bluegreen" size="4"><h1 align="center">吉林省长春市奋进乡村镇银行储蓄业务系统首页</h1></font>
        <marquee onmouseover="this.stop()" onmouseout="this.start()" scrollamount=5 scrolldelay=0 direction=left><img src="公告1.jpg" width="21" height="19"></img><font face="楷体" color="pink" size="4">公告：受疫情影响，交易金额不得超过1元，望周知！</font></MARQUEE>    
        <br><br>
        <form name="form1" action="teamlogin" method="post">
            <table name="table1" align="center" cellpadding="0.5">
                <tr>
                    <td>
                        <img src="勾4.jpg" width="23" height="21"><font face="楷体,宋体" size="4">账户：</font>
                    </td>
                    <td>
                        <input type="text" name="bId">
                    </td>
                </tr>
                <tr>
                    <td>
                        <img src="勾5.png" width="23" height="21"><font face="楷体,宋体" size="4">密码：</font>
                    </td>
                    <td>
                        <input type="password" name="cPass">
                    </td>
                </tr>
                <tr>
                    <td align="center">
                        <font face="楷体,宋体" size="4" align="center"><input type="submit" value="登录" ></font>
                    </td>
                    <td align="center">
                        <font face="楷体,宋体" size="4" align="center"><s:a href="http://localhost:8080/bank/register.jsp">注册</s:a></font>
                    </td>
                </tr>
                <tr>
                <td colspan="2" align="right">
                    <font face="楷体,宋体" size="4" align="center"><s:a href="http://localhost:8080/bank/forgot.jsp">忘记密码？</s:a></font>
                </td>
                </tr>
            </table>
        </form>
    </body>
</html>
