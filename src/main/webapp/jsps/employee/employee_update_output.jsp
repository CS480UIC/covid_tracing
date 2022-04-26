<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Update Employee</title>
    
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
  <h1>Update employee</h1>
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
<h1>Update the values below</h1>
<form action="<c:url value='/EmployeeServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
		<input type="hidden" name="employee_id" value="${employee.employee_id }"/>
				
	Employee Full Name ：<input type="text" name="employee_full_name" value="${form.employee_full_name }" />
	<span style = "color:red; font-weight: 900">${errors.employee_full_name }</span>
	<br/>
	Employee Department Id ：<input type="text" name="department_id" value="${form.department_id }" />
	<br/>
	Employee Start Date ：<input type="text" name="employee_start_date" value="${form.employee_start_date }" />
	<br/>

	<input type="submit" value="Update employee"/>
</form>

</body>
</html>
