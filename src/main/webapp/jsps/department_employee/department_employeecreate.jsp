<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>department_employee Create</title>
    
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
  <h1>department_employee Create</h1>
<form action="<c:url value='/Department_employeeServletCreate'/>" method="post">
	Department department id ：<input type="text" name="department_department_id" value="${department_employee.department_department_id }" />
	<span style="color: red; font-weight: 900">${errors.department_department_id }</span>
	<br/>
	Employee employee Id ：<input type="text" name="employee_employee_id" value="${department_employee.employee_employee_id }" />
	<span style="color: red; font-weight: 900">${errors.employee_employee_id }</span>
	<br/>
	Department employee Id ：<input type="text" name="department_employee_id" value="${department_employee.department_employee_id }" />
	<span style="color: red; font-weight: 900">${errors.department_employee_id }</span>
	<br/>
	<input type="submit" value="Create department_employee"/>
</form>
  </body>
</html>
