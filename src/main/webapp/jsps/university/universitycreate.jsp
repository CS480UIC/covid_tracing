<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>university Create</title>
    
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
  <h1>Create a new university</h1>
<form action="<c:url value='/UniversityServletCreate'/>" method="post">
	University Id    :<input type="text" name="university_id" value="${form.university_id }"/>
	<span style="color: red; font-weight: 900">${errors.university_id }</span>
	<br/>
	University Name ：<input type="text" name="university_name" value="${form.university_name }"/>
	<span style="color: red; font-weight: 900">${errors.university_name }</span>
	<br/>
	University user ID ：<input type="text" name="university_user_id" value="${form.university_user_id }"/>
	<span style="color: red; font-weight: 900">${errors.university_user_id }</span>

	<br/>
	<input type="submit" value="Create university"/>
</form>
  </body>
</html>
