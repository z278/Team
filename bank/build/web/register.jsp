<%-- 
    Document   : register
    Created on : 2020-4-18, 18:59:23
    Author     : 史一然
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="吉林省长春市奋进乡村镇银行储蓄业务系统登录页面"></s:text></title>
    </head>
     <body background="背景3.gif" style="background-repeat:no-repeat; background-position:center;background-size:100%">
        <br>
        <font face="楷体" color="brown" size="4"><h1 align="center">吉林省长春市奋进乡村镇银行储蓄业务系统登录信息表</h1></font>
        <br>
        <s:form action="register" method="post">  
            <br><br><br><br><br><br>
            <table border="1" align="center" bgcolor="bluegreen">
                <tr>
                    <td>
                        <s:textfield name="name" label="用户真实姓名" size="30"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <s:textfield name="cId" label="用户身份证号" size="30"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <s:textfield name="phone" label="用户电话号码" size="30"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <s:textfield name="bId" label="用户账号(无需填写）" size="30"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <s:password name="cPass1" label="用户密码(密码应设定为6位数字）" size="30"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <s:password name="cPass2" label="再次输入密码(两次输入的密码保持一致)" size="30"/>
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
                        <s:a href="http://localhost:8080/bank/TeamLogin.jsp">返回</s:a>
                    </td>
                </tr>
            </table>
        </s:form>
    </body>
</html>

