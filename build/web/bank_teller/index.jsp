

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0//EN" "http://www.w3.org/TR/REC-html40/strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>长春市奋进乡村镇银行储蓄业务系统-业务员</title>
        <style>
            body
            {
                scrollbar-base-color:#C0D586;
                scrollbar-arrow-color:#FFFFFF;
                scrollbar-shadow-color:DEEFC6;
            }
        </style>
    </head>
    <frameset rows="60,*" cols="*" frameborder="no" border="0" framespacing="0">
        <frame src="http://localhost:8080/bank2/bank_teller/top.jsp" name="topFrame" scrolling="no">
        <frameset cols="180,*" name="btFrame" frameborder="NO" border="0" framespacing="0">
            <frame src="http://localhost:8080/bank2/bank_teller/menu.jsp" noresize name="menu" scrolling="yes">
            <frame src="http://localhost:8080/bank2/bank_teller/main.jsp" noresize name="main" scrolling="yes">
        </frameset>
    </frameset>
    <noframes>
	<body>您的浏览器不支持框架！</body>
    </noframes>
</html>
