<%-- 
    Document   : change
    Created on : 2020-4-22, 16:17:46
    Author     : 标哥！
--%>

<%@page import="PO.UserPO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>修改密码</title>
        <script language="JavaScript">
            function trim(str)
            {
                //使用正则式去掉字符的前后空格
                return str.replace(/^\s*/,"").replace(/\s*$/,""); 
            }
            function check(form)
            {
                //定义错误标志字符串
                var errorStr="";
                //提取表单的4个数据
                var bId=trim(form.bId.value);
                var initpws=trim(form.password.value);
                var newpws1=trim(form.cPass1.value);
                var newpws2=trim(form.cPass2.value);
                
                var pattern = /^\d{8}$/;
                //判断用户名是否为空
                if(bId==null||bId=="")
                {
                    errorStr="用户名不能为空！";
                }
                else if(initpws==null||initpws=="")
                {
                    errorStr="原始密码不允许为空！";
                }
                else if(newpws1.length !=6 && !pattern.test(newpws1))
                {
                    errorStr="新密码必须为6位数字组成！";
                }
                else if(newpws1 != newpws2){
                    errorStr="两次密码输入不一致！";
                }
                if(errorStr=="")
                {
                    return true;
                 }else
                {
                    alert(errorStr);
                    return false;
                }
            }
        </script>
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
                    <font face="楷体,宋体" size="4" align="center"><s:a href="http://localhost:8080/bank/look.jsp">查询账号余额</s:a></font>
                </td>
                <td width="20%">
                    <font face="楷体,宋体" size="4" align="center"><s:a href="http://localhost:8080/bank/set.jsp">存款</s:a></font>
                </td>
                <td width="20%">
                    <font face="楷体,宋体" size="4" align="center"><s:a href="http://localhost:8080/bank/get.jsp">取款</s:a></font>
                </td>
                <td width="20%">
                    <font face="楷体,宋体" size="4" align="center">修改密码</font>
                </td>
            </tr>
        </table>
         <br/>
        </div>
        <br/><br/><br/>
        <center><font face="楷体,宋体" size="5" align="center">修改密码</font></center>
        </div>
        <s:form action="change" method="post" onSubmit="return check(this);">
            <table align="center" width="30%" border="5">
                    <tr>
                        <td>
                            <font face="楷体,宋体" size="4" align="center">用户名</font>
                        </td>
                        <td>
                            <input name="bId" value="<s:property value="#application.bId"/>"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <font face="楷体,宋体" size="4" align="center">原始密码</font>
                        </td>
                        <td>
                            <input name="password" type="password"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <font face="楷体,宋体" size="4" align="center">新密码</font>
                        </td>
                        <td>
                            <input name="cPass1" type="password"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                           <font face="楷体,宋体" size="4" align="center">确认密码</font>
                        </td>
                        <td>
                            <input name="cPass2" type="password"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <font face="楷体,宋体" size="4" align="center"><input type="submit" value="提交"></font>
                        </td>
                        <td>
                            <font face="楷体,宋体" size="4" align="center"><input type="reset" value="清空"></font>
                        </td>
                    </tr>
                    <tr>
                        <td align="center" colspan="2">
                            <font face="楷体,宋体" size="4" align="center"><s:a href="http://localhost:8080/bank/TeamLogin.jsp">返回</s:a></font>
                        </td>
                    </tr>
            </table>
        </s:form>
    </body>
</html>
