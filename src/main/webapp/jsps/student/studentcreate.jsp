<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>student Create</title>
    
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
  <h1>Create a new student</h1>
<form action="<c:url value='/studentServletCreate'/>" method="post">
	Student Id    :<input type="text" name="userid" value="${form.userid }"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>
	Student Full Name：<input type="text" name="username" value="${form.username }"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>
	Student Department Id	：<input type="text" name="userd_id" value="${form.userd_id }"/>
	<span style="color: red; font-weight: 900">${errors.userd_id }</span>
	<br/>
	<input type="submit" value="Create student"/>
</form>
  </body>
</html>
