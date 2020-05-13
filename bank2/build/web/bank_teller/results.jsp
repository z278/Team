<%-- 
    Document   : results
    Created on : 2020-5-12, 10:55:21
    Author     : hp
--%>

<%@page import="entity.Record"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>查询记录结果</title>
    </head>
    <body>
        <form name="form5" action="results" method="post">
            <table name="table5" align="center" cellpadding="0.5">
                <%
                ArrayList list=(ArrayList)session.getAttribute("recordlook");
                if(list.isEmpty()){
                    %>
                    <tr>
                        <td align="center">
                            <span>暂无信息!</span>
                        </td>
                    </tr>
                    <%
                }else{
                    for(int i=0;i<list.size();i++){
                        Record r = (Record)list.get(i);
                        %>
                        <tr>
                            <td align="center"><%=i+1%></td>
                            <td><%=r.getType()%></td>
                            <td><%=r.getMoney()%></td>
                            <td><%=r.getDate()%></td>
                        </tr>
                        <%
                    }
                }
            %>
            </table>
        </form>
    </body>
</html>
