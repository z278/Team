<%-- 
    Document   : look_allteller
    Created on : 2020-5-13, 21:28:22
    Author     : syr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.ArrayList,entity.Teller"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="业务员信息管理系统-查看"/></title>
    </head>
    <body bgcolor="white">
        <%response.setCharacterEncoding("UTF-8");%>
        <s:form action="look_allteller" method="post">
        <table align="center" width="80%" border="5">
            <tr>
                <th>记录条数</th>
                <th>姓名</th>
                <th>密码</th>
            </tr>
            <%
                ArrayList list=(ArrayList)session.getAttribute("allInfo");
                if(list.isEmpty()){
                    %>
                    <tr>
                        <td align="center">
                            <span>暂无业务员信息!</span>
                        </td>
                    </tr>
                    <%
                }else{
                    for(int i=0;i<list.size();i++){
                        Teller info=(Teller)list.get(i);
                        %>
                        <tr>
                            <td align="center"><%=i+1%></td>
                            <td><%=info.getUsername()%></td>
                            <td><%=info.getPassword()%></td>
                        </tr>
                        <%
                    }
                }
            %>
        </table>
        </s:form>
    </body>
</html>
