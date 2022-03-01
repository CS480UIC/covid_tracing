Entity:

  University
  
  
    Synonyms: college, educational_institution, academy
    Description: The University has a unique name. This has department, employee, student, vaccine_status, and schedule
  Department
  
  
    Synonyms: branch, compartment, section
    Description: Department is a name for a part of the university. Employee are assigned in department and employee are enrolled in depertment
  Employee
  
  
    Synonyms: worker, hired_hand
    Description: Employee is a person who is assigned to a department. Employees are required to have vaccine_status and given a schedule.

  student
   
  
    Synonyms: classmate, scholar
    Description: A student is any person who is enrolled in a department within a university. 
  
  vacccine_status
     
  
    Synonyms: immunization_status, dose_status
    Description: A student or an employee can disclose their current vaccination status with the department. 
  
  schedule
     
  
    Synonyms: agenda, routine
    Description: A student picks their desired schedule while the employee is assigned with a schedule.  
    
    
Relationship:


  university-has-department


    Maxima : one - many
    Minima : one - one


  department-assigned-employee


    Maxima : many - many
    Minima  : one - one


  department-enrolled-student
  
  
    Maxima : one - many
    Minima : one - one
  
  
  employee-required-vaccine_status
  
  
    Maxima : one - many
    Minima : one - zero


  employee-given-schedule
  
  
    Maxima : one - many
    Minima : one - one
    
    
  student-picks-schedule
  
  
    Maxima : one - many
    Minima : one - one
    
    
  student-encouraged-vaccine_status
  
  
    Maxima : one - many
    Minima : one - one
    
    
    
Attribute


  university


    id 1-1
    name 1-1 


  department
    
    
    id 1-1
    name 1-1


employee


    employee_id 1-1
    full_name M-1
    department_id 1-1


student


    student_id 1-1
    full_name M-1
    department_id 1-1
    
    

vaccine_status


    vaccine_name 1-1
    date M-1
    employee_id 1-1 
    student_id 1-1
    
  
schedule


    course_name M-1
    time M-1
    employee_id 1-1 
    student_id 1-1
    
Dependent entities and dependency relationships:
   
   university is independent
   department is depends on university
   employee is depends on department
   student is depends on department
   vaccine_status is depends on employee
   schedule depends on emplyee and student
   
   

  






