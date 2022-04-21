<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete University</title>
    
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
  <h1>Delete University</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/UniversityServletDelete'/>" method="post">
	<input type="hidden" name="method" value="delete"/>
	<input type="hidden" name="university_id" value="${university.university_id }"/>
	
	
	University Id    :<input type="text" name="university_id" value="${university.university_id }"disabled/>
	<br/>
	University Name ：<input type="text" name="university_name" value="${university.university_name }"disabled/>
	<br/>
	University user ID ：<input type="text" name="university_user_id" value="${university.university_user_id }"disabled/>
	<br/>
	
	
	
</form>
<button onclick="window.location.href='<c:url value='/jsps/university/universitydelete.jsp'/>'">Continue</button>

</body>
</html>
