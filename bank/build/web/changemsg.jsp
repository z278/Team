<%-- 
    Document   : changemsg
    Created on : 2020-4-23, 14:59:59
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="找回密码"></s:text></title>
    </head>
    <body background="背景5.jpg" style="background-size:100%">
        <br>
        <font face="楷体" color="bluegreen" size="4"><h1 align="center">吉林省长春市奋进乡村镇银行储蓄业务系统</h1></font>
        <marquee onmouseover="this.stop()" onmouseout="this.start()" scrollamount=5 scrolldelay=0 direction=left><img src="公告1.jpg" width="21" height="19"></img><font face="楷体" color="pink" size="4">公告：受疫情影响，交易金额不得超过1元，望周知！</font></MARQUEE>    
        <br>
        <br/><br/><br/>
        <center><font size="5">找回密码</font></center>
        <s:form action="changemsg" method="post">
            <table align="center" width="30%" border="5">
                    <tr>
                        <td>
                            用户名：
                        </td>
                        <td>
                            <input name="bId" value="<s:property value="#application.bId"/>"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            新密码：
                        </td>
                        <td>
                            <input name="cPass1" type="password"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            确认密码：
                        </td>
                        <td>
                            <input name="cPass2" type="password"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <s:submit value="提交"></s:submit>
                        </td>
                        <td>
                            <input type="reset" value="清空">
                        </td>
                    </tr>
                    <tr>
                        <td align="center" colspan="2">
                            <s:a href="http://localhost:8080/bank/TeamLogin.jsp">返回</s:a>
                        </td>
                    </tr>
            </table>
        </s:form>
    </body>
</html>
