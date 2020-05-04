<%-- 
    Document   : forgot
    Created on : 2020-4-23, 14:43:22
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>找回密码</title>
    </head>
     <body background="背景3.gif" style="background-repeat:no-repeat; background-position:center;background-size:100%">
        <br>
        <font face="楷体" color="brown" size="4"><h1 align="center">吉林省长春市奋进乡村镇银行储蓄业务系统找回密码</h1></font>
        <marquee onmouseover="this.stop()" onmouseout="this.start()" scrollamount=5 scrolldelay=0 direction=left><img src="公告1.jpg" width="21" height="19"></img><font face="楷体" color="pink" size="4">公告：受疫情影响，交易金额不得超过1元，望周知！</font></MARQUEE>
        <br><br>
        <s:form action="forgot" method="post">
            <table align="center" cellpadding="0.5">
                <tr>
                    <td>
                        <s:textfield name="bId" label="用户账号" size="30"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <s:textfield name="cId" label="用户身份证号" size="30"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="提交"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="reset" value="清空"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <font face="楷体,宋体" size="4" align="center"><s:a href="http://localhost:8080/bank/TeamLogin.jsp">返回</s:a></font>
                    </td>
                </tr>
            </table>
        </s:form>
    </body>
</html>
