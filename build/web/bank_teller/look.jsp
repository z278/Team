<%-- 
    Document   : look
    Created on : 2020-5-11, 0:34:06
    Author     : syr
--%>


<%@page import="entity.Bank_teller"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="取款"></s:text></title>
    </head>
    <body>
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
                    <s:a href="http://localhost:8080/bank2/success.jsp">登录成功</s:a>
                </td>
                <td width="20%">
                    查询账号余额
                </td>
                <td width="20%">
                    <s:a href="http://localhost:8080/bank2/set.jsp">存款</s:a>
                </td>
                <td width="20%">
                    <s:a href="http://localhost:8080/bank2/get.jsp">取款</s:a>
                </td>
                <td width="20%">
                    <s:a href="http://localhost:8080/bank2/change.jsp">修改密码</s:a>
                </td>
            </tr>
        </table>
         <br/>
        </div>
        <br/><br/><br/>
        <center><font size="5">查询账号余额</font></center>
        </div>
        <s:form action="look" method="post">
            <table align="center" width="30%" border="5">
                <tr>
                        <td>
                            账号
                        </td>
                        <td>
                            <input name="account_number" value="<s:property value="#application.account_number"/>"/>
                        </td>
                    </tr>
                    <tr>
                        
                    </tr>
                    <tr>
                        <td>
                            <s:submit value="确定查询余额"></s:submit>
                        </td>
                        <td align="center" colspan="2">
                            <s:a href="http://localhost:8080/bank2/success.jsp">返回</s:a>
                        </td>
                    </tr>
            </table>
        </s:form>
    </body>
</html>

