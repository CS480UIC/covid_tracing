<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete department_employee</title>
    
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
  <h1>Update department_employee</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	Department department id ：<input type="text" name="department_department_id" value="${department_employee.department_department_id }" disabled/>
	<br/>
	Employee employee Id ：<input type="text" name="employee_employee_id" value="${department_employee.employee_employee_id }" disabled/>
	<br/>
	Department employee Id ：<input type="text" name="department_employee_id" value="${department_employee.department_employee_id }" disabled/>
	<br/>
</form>
<h1>Update the values below</h1>
<form action="<c:url value='/Department_employeeServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
				<input type="hidden" name="department_employee_id" value="${department_employee.department_employee_id }"/>
				
	Department department id ：<input type="text" name="department_department_id" value="${department_employee.department_department_id }" />
	<br/>
	Employee employee Id ：<input type="text" name="employee_employee_id" value="${department_employee.employee_employee_id }" />
	<br/>
	
	<input type="submit" value="Update department_employee"/>
</form>

</body>
</html>
