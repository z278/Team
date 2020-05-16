<%-- 
    Document   : validate
    Created on : 2020-5-11, 22:48:35
    Author     : 标哥！
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>//
//            alert("验证码错误，请重新登陆！");
//        </script>
    </head>
    <body>
        <%
            String a = request.getParameter("checkcode").trim(); //这是用户输入的验证码
            session.getAttribute("key");        //这是正确的验证码
            //用equals方法比较一下即可知道用户是否输入正确了。
            if(a.equals(session.getAttribute("key"))){
		response.setHeader("refresh","0;URL=account/index.jsp");
        %>
        
        <%
            }else{
                response.setHeader("refresh","0;URL=index.jsp");
        %>
            
        <%
                }
        %>
    </body>
</html>
