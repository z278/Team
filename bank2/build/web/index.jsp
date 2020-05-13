<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>长春市奋进乡村镇银行储蓄业务系统</title>
        <script type="text/javascript">
            
        </script>
    </head>
    <body>
        <s:form action="login" method="post">
            <table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
                <tr>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td height="608">
                        <table width="862" border="0" align="center" cellpadding="0" cellspacing="0">
                            <tr>
                                <br>
                                <font face="楷体" color="green" size="4"><h1 align="center">长春市奋进乡村镇银行储蓄业务系统</h1></font>
                                <marquee onmouseover="this.stop()" onmouseout="this.start()" scrollamount=5 scrolldelay=0 direction=left><img src="公告1.jpg" width="21" height="19"></img><font face="楷体" color="pink" size="4">公告：受疫情影响，交易金额不得超过1元，望周知！</font></MARQUEE>    
                                <br><br>
                            </tr>
                            <tr>
                                <td height="95">
                                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                        <tr>
                                            <td width="342" height="95">&nbsp;</td>
                                            <td width="265">
                                                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                                    <tr>
                                                        <td width="21%" height="30"><div align="center"><span class="STYLE3">用户</span></div></td>
                                                        <td width="39%" height="30"><input type="text" name="username"  style="height:18px; width:130px; border:solid 1px #cadcb2; font-size:12px; color:#81b432;"></td>
                                                        <td width="40%"><label><input type="radio" name="radiobutton" value="1" checked="checked">储户</label></td>
                                                    </tr>
                                                    <tr>
                                                        <td height="30"><div align="center"><span class="STYLE3">密码</span></div></td>
                                                        <td height="30"><input type="password" name="password"  style="height:18px; width:130px; border:solid 1px #cadcb2; font-size:12px; color:#81b432;"></td>
                                                        <td height="30"><label><input type="radio" name="radiobutton" value="2">柜员 </label></td>
                                                    </tr>
                                                    <tr>
                                                        <td><img id="loginform:vCode" src="${pageContext.request.contextPath }/validatecode.jsp" onclick="javascript:document.getElementById('loginform:vCode').src='${pageContext.request.contextPath }/validatecode.jsp?'+Math.random();" /></td>
                                                        <td><input style="height:18px; width:130px; border:solid 1px #cadcb2; font-size:12px; color:#81b432;" type="text" name="checkcode" title="请输入验证码" /></td>
                                                        <!--<td>&nbsp;</td>-->
                                                        <td height="30"><input type="radio" name="radiobutton" value="3">管理</td>
                                                    </tr>
                                                    <tr>
                                                        <td height="30">&nbsp;</td>
                                                        <td height="30"><input type="submit" value="登录" ><label><input type="reset" name="Submit" value="重置"></label></td>
                                                        
                                                    </tr>
                                                  </table>
                                                </td>
                                                <td width="255">&nbsp;</td>
                                            </tr>
                                      </table>
                                   </td>
                                </tr>
                                <tr>
                                    <td height="247" valign="top">
                                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                            <tr>
                                                <td width="22%" height="30">&nbsp;</td>
                                                <td width="56%">&nbsp;</td>
                                                <td width="22%">&nbsp;</td>
                                            </tr>
                                            <tr>
                                                <td>&nbsp;</td>
                                                 <td height="30">
                                                     <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                                        <tr>
                                                            <td width="44%" height="20">&nbsp;</td>
                                                            <td width="56%" class="STYLE4">版本 2020V1.0 </td>
                                                        </tr>
                                                     </table>
                                                  </td>
                                                 <td>&nbsp;</td>
                                             </tr>
                                          </table>
                                        </td>
                            </tr>
                        </table>
                    </td>
                    </tr>                   
                </table>
            </s:form>
       </body>
</html>