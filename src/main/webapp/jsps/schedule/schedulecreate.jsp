<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>schedule Create</title>
    
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
  <h1>schedule Create</h1>
<form action="<c:url value='/scheduleServletCreate'/>" method="post">
	Course Name    :<input type="text" name="coursename" value="${form.coursename }"/>
	<span style="color: red; font-weight: 900">${errors.coursename }</span>
	<br/>
	Time：<input type="text" name="time" value="${form.time }"/>
	<span style="color: red; font-weight: 900">${errors.time }</span>
	<br/>
	Employee Id	：<input type="text" name="userid" value="${form.userid }"/>
	<span style="color: red; font-weight: 900">${errors.userid }</span>
	<br/>
	Student Id	：<input type="text" name="userid" value="${form.userid }"/>
	<span style="color: red; font-weight: 900">${errors.userid }</span>
	<br/>
	<input type="submit" value="Create schedule"/>
</form>
  </body>
</html>
