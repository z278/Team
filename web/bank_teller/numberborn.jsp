<%-- 
    Document   : numberborn
    Created on : 2020-5-10, 15:57:39
    Author     : syr
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>储户账号生成</title>
         <style type="text/css">
        #ge{ height:20px; background-color:#AAEC79;}
        </style>
    </head>
    <body id="ge">
      <s:form id="form1" name="form1" method="post" action="numberborn">
  <table width="503" height="267" border="1" align="center">
    <tr>
      <td colspan="3"><div align="center">储户账号生成及密码设置</div></td>
    </tr>
    <tr>
      <td width="2"><div align="right">储户账号生成:</div></td>
      <td width="116"><s:textfield name="account_number" size="20"/></td>
    </tr>
    <tr>
      <td><div align="right">储户设置密码:</div></td>
      <td><s:password name="cPass1" size="20"/>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="right">再次输入密码:</div></td>
      <td><s:password name="cPass2" size="20"/>&nbsp;</td>
    </tr>
    <tr>
        <td colspan="2" align="center">
            <input type="submit" value="提交"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="reset" value="清空"/>
        </td>
     </tr>
     <tr>
        <td colspan="2" align="center">
            <s:a href="http://localhost:8080/bank2/ ">返回</s:a>
        </td>
    </tr>
  </table>
</s:form>
    </body>
</html>

