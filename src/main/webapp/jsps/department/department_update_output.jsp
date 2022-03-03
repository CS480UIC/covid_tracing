<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete employee</title>
    
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
  <h1>Update employee</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	id    :<input type="text" name=userid value="${employee.userid }" disabled/>
	<br/>
	
	name ：<input type="text" name="username" value="${employee.username }" disabled />
	<br/>
	
	department id ：<input type="text" name="userd_id" value="${employee.userd_id }" disabled />
	<br/>

</form>
<h1>Update the values below</h1>
<form action="<c:url value='/employeeServletUpdate'/>" method="post">
		<input type="text" name="method" value="update"/>
				<input type="hidden" name="userid" value="${employee.userid }"/>
	Name：<input type="text" name="username" value="${employee.username }"/>
	
	<span style="color: red; font-weight: 900">${errors.password }</span>
	<br/>

	<input type="submit" value="Update employee"/>
</form>

</body>
</html>
