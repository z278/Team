

<%@page import="java.util.Calendar"%>
<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="登录成功"></s:text></title>
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
                    <font face="楷体,宋体" size="4" align="center">登录成功</font>
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
                    <font face="楷体,宋体" size="4" align="center"><s:a href="http://localhost:8080/bank/change.jsp">修改密码</s:a></font>
                </td>
            </tr>
        </table>
         <br/>
        </div>
                <div align="center">
                    <font face="楷体,宋体" size="5" align="center" color="#9c26b0">
                    <%
                        Calendar cal = Calendar.getInstance();
                        int hour = cal.get(Calendar.HOUR_OF_DAY);
                        if (hour >= 6 && hour < 8) {
                        out.print("早上好！");
                        } else if (hour >= 8 && hour < 11) {
                        out.print("上午好！");
                        } else if (hour >= 11 && hour < 13) {
                        out.print("中午好！");
                        } else if (hour >= 13 && hour < 18) {
                        out.print("下午好！");
                        } else {
                        out.print("晚上好");
                    }
                    %>
                    </font>
                    <font face="楷体,宋体" size="5" align="center" color="#9c26b0">Id卡号为：${bId}的用户，恭喜你，登陆成功！</font>
                </div>
                
    </body>
</html>
