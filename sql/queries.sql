use bookstore;

-- ---------------------------------------- Haeun Kim-------------------------------------------------------------------- --
-- A simple query searches data in one table using logic operators in the condition, and orders the result 
-- by a particular column.
select * 
from university
where university_id > 3
order by university_id desc;

-- An aggregate query groups data in one table and applies an aggregate function
select COUNT(*) count_of_university
from university
where university_id > 1;

-- From the N queries, at least one should use a numeric function.
select POW(department_id, university_id)
from department;

-- From the N queries, at least one should use a string function.
select LOWER(university_name)
from university
where university_id = 5;

-- From the N queries, at least one should use a date and time function.
select date(employee_start_date)
from employee;

-- From the N queries, at least one should group rows with identical values into a set of 
-- summary rows and filter group results (GROUP BY and HAVING clauses).
select department_name cs_department_employee
from department
group by university_name = 'UIC'
having COUNT(*) > 1;


-- A complex query searches data in two or more tables.
-- From the N queries, at least one should use a join (any type of join).
select employee_full_name, department_name 
from employee
inner join department
on employee.department_id = department.department_id;

-- From the N queries, at least one should use a correlated subquery (without EXIST).
select employee_full_name only_cs_employee
from employee
where department_id IN (select department_id from department where department_name = 'CS');

-- From the N queries, at least one should use a correlated subquery that uses the EXIST clause
select employee_full_name
from employee e
where EXISTS (select * from department_employee where employee_employee_id = e.employee_id AND department_employee_id > 500);

-- --------------------------------------Done by Haeun Kim-------------------------------------------------------------------- --

-- --------------------------------------Liz Morales-------------------------------------------------------------------------- --

-- A simple query searches data in one table using logic operators in the condition, and orders the result 
-- by a particular column.
select * 
from department
where department_id > 3
order by department_id;

-- An aggregate query groups data in one table and applies an aggregate function
select vaccine_name, COUNT(*)
from vaccine_status
ORDER BY vaccine_name;

-- From the N queries, at least one should use a numeric function.

select ABS(employee_id - department_id)
from employee;

-- From the N queries, at least one should use a string function.

select TRIM(student_full_name)
from student;

-- From the N queries, at least one should use a date and time function.
select date(date)
from vaccine_status
where vaccine_name = 'P';

-- From the N queries, at least one should group rows with identical values into a set of 
-- summary rows and filter group results (GROUP BY and HAVING clauses).
select university_name, COUNT(*)
from university
group by university_name
having COUNT(*) > 0;

-- A complex query searches data in two or more tables.
-- From the N queries, at least one should use a join (any type of join).
select student_full_name, department_name 
from student
inner join department
on student.department_id = department.department_id;

-- From the N queries, at least one should use a correlated subquery (without EXIST).

select student_id, vaccine_name
from vaccine_status v
where student_id > ( select COUNT(*) from vaccine_status where vaccine_name= v.vaccine_name);

-- From the N queries, at least one should use a correlated subquery that uses the EXIST clause
select student_full_name
from student s
where EXISTS(select * from schedule where student_id = s.student_id AND course_name = 'CS480');

-- --------------------------------------Done by Liz Morales-------------------------------------------------------------------- --

