<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Update department</title>
    
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
  <h1>Update Department</h1>
<form action="<c:url value='/DepartmentServletUpdate'/>" method="post">
	<input type="hidden" name="method" value="search"/>
	
	Update Department ID   :<input type="text" name="department_id" value="${form.department_id }"/>
	<span style="color: red; font-weight: 900">${errors.department_id }</span>
	
	<br/>
	<input type="submit" value="Update Department"/>
</form>
  </body>
</html>
