<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete student</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <h1>Update student</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	Student Id    :<input type="text" name="username1" value="${student.userid }" disabled/>
	<br/>
	
	Student Full Name：<input type="text" name="password1" value="${student.username }" disabled />
	<br/>
	Student Department Id	：<input type="text" name="email1" value="${student.userd_id }" disabled/>
	<br/>
</form>
<h1>Update the values below</h1>
<form action="<c:url value='/studentServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
				<input type="hidden" name="userid" value="${student.userid }"/>
	Student Full Name：<input type="text" name="username" value="${form.username }"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>
	Student Department Id	：<input type="text" name="userd_id" value="${form.userd_id }"/>
	<span style="color: red; font-weight: 900">${errors.userd_id }</span>
	<br/>
	<input type="submit" value="Update student"/>
</form>

</body>
</html>
