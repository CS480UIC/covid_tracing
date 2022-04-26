<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>vaccine_status Create</title>
    
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
  <h1>vaccine_status Create</h1>
<form action="<c:url value='/Vaccine_statusServletCreate'/>" method="post">
	Employee Id     :<input type="text" name="employee_id" value="${form.employee_id }" />
	<span style="color: red; font-weight: 900">${errors.employee_id }</span>
	<br/>
	Vaccine Name ：<input type="text" name="vaccine_name" value="${form.vaccine_name }" />
	<span style="color: red; font-weight: 900">${errors.vaccine_name }</span>
	<br/>
	Vaccine Date ：<input type="text" name="vaccine_date" value="${form.vaccine_date }" />
	<span style="color: red; font-weight: 900">${errors.vaccine_date }</span>
	<br/>
	Dose Number ：<input type="text" name="dose_number" value="${form.dose_number }" />
	<span style="color: red; font-weight: 900">${errors.dose_number }</span>
	<br/>
	
	<input type="submit" value="Create vaccine_status"/>
</form>
  </body>
</html>
