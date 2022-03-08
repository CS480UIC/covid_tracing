<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Read schedule Output</title>
    
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
  <h1>Read schedule Output</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	Course Name    :<input type="text" name="coursename" value="${schedule.coursename }" disabled/>
	<br/>
	Time：<input type="text" name="time" value="${schedule.time }" disabled/>
	<br/>
	Employee Id	：<input type="text" name="userid" value="${schedule.userid }" disabled/>
	<br/>
	Student Id	：<input type="text" name="userid" value="${schedule.userid }" disabled/>
	<br/>
</form>

<button onclick="window.location.href='<c:url value='/jsps/main.jsp'/>'">Continue</button>
</body>
</html>
