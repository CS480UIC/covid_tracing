<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>university department</title>
    
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
  <h1>Create a new Department</h1>
<form action="<c:url value='/DepartmentServletCreate'/>" method="post">
	Department Id    :<input type="text" name="department_id" value="${form.department_id }"/>
	<span style="color: red; font-weight: 900">${errors.department_id }</span>
	<br/>
	Department Name ：<input type="text" name="department_name" value="${form.department_name }"/>
	<span style="color: red; font-weight: 900">${errors.department_name }</span>
	<br/>
	Department Number ：<input type="text" name="department_number" value="${form.department_number }"/>
	<span style="color: red; font-weight: 900">${errors.department_number }</span>
	<br/>	
	University ID ：<input type="text" name="university_id" value="${form.university_id }"/>
	<span style="color: red; font-weight: 900">${errors.university_id }</span>
	<br/>	
	
	<input type="submit" value="Create department"/>
</form>
  </body>
</html>
