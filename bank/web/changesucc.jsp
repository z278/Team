<%-- 
    Document   : changesucc
    Created on : 2020-4-22, 16:27:21
    Author     : 标哥！
--%>

<%@page import="PO.UserPO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">

<html>
    <head>
        <meta http-equiv="refresh" content="6;url=TeamLogin.jsp">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>修改密码</title>
        <script language="javascript">
            var sec = 0;
            timerID = setInterval("count()",1000);
            function count(){
                num.innerHTML = sec++;
            }
        </script>
    </head>
    <body background="背景5.jpg" style="background-size:100%">
        <br>
        <font face="楷体" color="bluegreen" size="4"><h1 align="center">吉林省长春市奋进乡村镇银行储蓄业务系统</h1></font>
        <marquee onmouseover="this.stop()" onmouseout="this.start()" scrollamount=5 scrolldelay=0 direction=left><img src="公告1.jpg" width="21" height="19"></img><font face="楷体" color="pink" size="4">公告：受疫情影响，交易金额不得超过1元，望周知！</font></MARQUEE>    
        <br>
        <div align="center">
            <hr color="red"/>
        <br/>
        <table align="center" width="80%">
            <tr>
                <td width="20%">
                    <font face="楷体,宋体" size="4" align="center"><s:a href="http://localhost:8080/bank/success.jsp">登录成功</s:a></font>
                </td>
                <td width="20%">
                    <font face="楷体,宋体" size="4" align="center"><s:a href="http://localhost:8080/bank/look.jsp">查询账号余额</s:a></font>
                </td>
                <td width="20%">
                    <font face="楷体,宋体" size="4" align="center"><s:a href="http://localhost:8080/bank/set.jsp">存款</s:a></font>
                </td>
                <td width="20%">
                    <font face="楷体,宋体" size="4" align="center"><s:a href="http://localhost:8080/bank/get.jsp">取款</s:a></font>
                </td>
                <td width="20%">
                    <font face="楷体,宋体" size="4" align="center">修改密码</font>
                </td>
            </tr>
        </table>
         <br/>
        </div>
        <br/><br/><br/>
        <center><font face="楷体,宋体" size="5" align="center">修改密码</font></center>
        <center><font face="楷体,宋体" size="5" align="center">修改密码成功，等待5秒后自动跳转到首页进行重新登陆！目前已等待：</font><font id="num" face="impact" color="red" size="7">0</font></center>
    </body>
</html>
