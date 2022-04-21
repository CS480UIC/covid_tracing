<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete Department</title>
    
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
  <h1>Delete Department</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/DepartmentServletDelete'/>" method="post">
	<input type="hidden" name="method" value="delete"/>
	<input type="hidden" name="department_id" value="${department.department_id }"/>
		
	Department Id    :<input type="text" name="department_id" value="${department.department_id }"disabled/>
	<br/>
	Department Name ：<input type="text" name="department_name" value="${department.department_name }"disabled/>
	<br/>
	Department Number ：<input type="text" name="department_number" value="${department.department_number }"disabled/>
	<br/>	
	University ID ：<input type="text" name="university_id" value="${department.university_id }"disabled/>
	<br/>
	<input type="submit" value="Delete Department"/>
</form>

</body>
</html>
