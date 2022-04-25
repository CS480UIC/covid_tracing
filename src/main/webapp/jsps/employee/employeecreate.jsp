<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>employee Create</title>
    
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
  <h1>Create a new employee</h1>
<form action="<c:url value='/employeeServletCreate'/>" method="post">
	Employee Id    :<input type="text" name="userid" value="${form.userid }"/>
	<span style="color: red; font-weight: 900">${errors.userid }</span>
	<br/>
	Employee Full Name ：<input type="text" name="username" value="${form.username }"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>	
	Employee Department Id ：<input type="text" name="e_d_id" value="${form.e_d_id }"/>
	<span style="color: red; font-weight: 900">${errors.e_d_id }</span>
	<br/>
	Employee Start Date ：<input type="text" name="start_date" value="${form.e_d_id }"/>
	<span style="color: red; font-weight: 900">${errors.e_d_id }</span>
	<br/>
	<input type="submit" value="Create employee"/>
</form>
  </body>
</html>
