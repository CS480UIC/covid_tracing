<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Read employee Output</title>
    
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
  <h1>Read employee Output</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	Employee Id     :<input type="text" name="employee_id" value="${employee.employee_id }" disabled/>
	<br/>
	Employee Full Name ：<input type="text" name="employee_full_name" value="${employee.employee_full_name }" disabled/>
	<br/>
	Employee Department Id ：<input type="text" name="department_id" value="${employee.department_id }" disabled/>
	<br/>
	Employee Start Date ：<input type="text" name="employee_start_date" value="${employee.employee_start_date }" disabled/>
	<br/>

</form>

<button onclick="window.location.href='<c:url value='/jsps/main.jsp'/>'">Continue</button>
</body>
</html>
