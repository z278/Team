<%-- 
    Document   : lookEnd
    Created on : 2020-4-23, 14:06:10
    Author     : hp
--%>

<%@page import="PO.UserPO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="取款"></s:text></title>
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
                    <font face="楷体,宋体" size="4" align="center">查询账号余额</font>
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
        <br/><br/><br/>
        <center><font face="楷体,宋体" size="5" align="center">查询账号余额</font></center>
        </div>
        <s:form action="lookEnd" method="post">
            <table align="center" width="30%" border="5">
                <%
                ArrayList list=(ArrayList)session.getAttribute("lookInfo");
                UserPO info=(UserPO)list.get(0);
                %>
                <tr>
                        <td>
                            <font face="楷体,宋体" size="4" align="center">账号</font>
                        </td>
                        <td>
                            <input name="bId" value="<s:property value="#application.bId"/>"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <font face="楷体,宋体" size="4" align="center">余额</font>
                        </td>
                        <td>
                            <input type="text" name="money" value="<%=info.getMoney()%>">
                        </td>
                    </tr>
                    <tr>
                        <td align="center" colspan="2">
                            <font face="楷体,宋体" size="4" align="center"><s:a href="http://localhost:8080/bank/success.jsp">返回</s:a></font>
                        </td>
                    </tr>
            </table>
        </s:form>
    </body>
</html>
