<%-- 
    Document   : balance_success
    Created on : 2020-5-13, 17:05:59
    Author     : hp
--%>

<%@page import="entity.UserPO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>查看余额_结果</title>
    </head>
    <body>
        <form name="form11" method="post">
            <table name="table11" align="center" cellpadding="0.5">
                <%
                ArrayList list=(ArrayList)session.getAttribute("balance");
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
