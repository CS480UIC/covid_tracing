<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete vaccine_status</title>
    
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
  <h1>Update vaccine_status</h1>
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
<h1>Update the values below</h1>
<form action="<c:url value='/Vaccine_statusServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
				<input type="hidden" name="employee_id" value="${vaccine_status.employee_id }"/>
				
	Vaccine Name ：<input type="text" name="vaccine_name" value="${form.vaccine_name }" />
	<br/>
	<span style="color: red; font-weight: 900">${errors.vaccinename }</span>
	<br/>
	Vaccine Date ：<input type="text" name="vaccine_date" value="${form.vaccine_date }" />
	<br/>
	Dose Number ：<input type="text" name="dose_number" value="${form.dose_number }" />
	<br/>
	<input type="submit" value="Update vaccine_status"/>
</form>

</body>
</html>
