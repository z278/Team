<%-- 
    Document   : information_success
    Created on : 2020-5-12, 21:32:04
    Author     : hp
--%>

<%@page import="entity.UserPO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>查询储户信息_结果</title>
    </head>
    <body>
        <form name="form8" action="information_success" method="post">
            <table name="table8" align="center" cellpadding="0.5">
                <%
                ArrayList list=(ArrayList)session.getAttribute("info");
                if(list.size()==0){
                    %>
                    <tr>
                        <td align="center">
                            <span>暂无信息!</span>
                        </td>
                    </tr>
                    <%
                }else{
                        UserPO u = (UserPO)list.get(0);
                        %>
                        <tr>
                            <td>
                                <img width="23" height="21"><font face="楷体,宋体" size="4">银行账号：</font>
                            </td>
                            <td>
                                <%=u.getAccount_number()%>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <img width="23" height="21"><font face="楷体,宋体" size="4">密码：</font>
                            </td>
                            <td>
                                <%=u.getPassword()%>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <img width="23" height="21"><font face="楷体,宋体" size="4">身份证号：</font>
                            </td>
                            <td>
                                <%=u.getId_number()%>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <img width="23" height="21"><font face="楷体,宋体" size="4">手机号：</font>
                            </td>
                            <td>
                                <%=u.getMyphone()%>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <img width="23" height="21"><font face="楷体,宋体" size="4">姓名：</font>
                            </td>
                            <td>
                                <%=u.getUsername()%>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <img width="23" height="21"><font face="楷体,宋体" size="4">余额：</font>
                            </td>
                            <td>
                                <%=u.getMoney()%>
                            </td>
                        </tr>
                        <%
                }
            %>
            </table>
        </form>
    </body>
</html>
