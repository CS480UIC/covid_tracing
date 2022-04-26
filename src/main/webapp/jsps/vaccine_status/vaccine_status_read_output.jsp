<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Read vaccine_status Output</title>
    
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
  <h1>Read vaccine_status Output</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	Employee Id     :<input type="text" name="employee_id" value="${vaccine_status.employee_id }" disabled/>
	<br/>
	Vaccine Name ：<input type="text" name="vaccine_name" value="${vaccine_status.vaccine_name }" disabled/>
	<br/>
	Vaccine Date ：<input type="text" name="vaccine_date" value="${vaccine_status.vaccine_date }" disabled/>
	<br/>
	Dose Number ：<input type="text" name="dose_number" value="${vaccine_status.dose_number }" disabled/>
	<br/>
</form>

<button onclick="window.location.href='<c:url value='/jsps/main.jsp'/>'">Continue</button>
</body>
</html>
