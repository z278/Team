<%-- 
    Document   : register
    Created on : 2020-5-10, 15:14:44
    Author     : syr
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0//EN" "http://www.w3.org/TR/REC-html40/strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>储户开户</title>
         <style type="text/css">
        #ge{ height:20px; background-color:#AAEC79;}
        </style>
    </head>
    <body id="ge">
      <s:form id="form1" name="form1" method="post" action="register">
  <table width="503" height="267" border="1" align="center">
    <tr>
      <td colspan="3"><div align="center">添写储户信息</div></td>
    </tr>
    <tr>
      <td width="2"><div align="right">真实姓名:</div></td>
      <td width="116"><s:textfield name="name" size="30"/></td>
    </tr>
    <tr>
      <td><div align="right">身份证号:</div></td>
      <td><s:textfield name="id_number" size="30"/>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="right">电话号码:</div></td>
      <td><s:textfield name="phone" size="30"/>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="right">家庭住址:</div><div align="right">省/市/区/乡</div></td>
      <td><s:textfield name="address" size="30"/>&nbsp;</td>
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

