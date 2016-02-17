<%@ page language="java" import="java.util.*" pageEncoding="US-ASCII"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="refresh" content="0;url=login.do">
		<title>快订网上订餐后台管理</title>
		<script language="javascript">
    		window.location.href = "login.do";
		</script>
	</head>
	<body>
	</body>
</html>
