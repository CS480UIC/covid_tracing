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


    id 1-1 PRIMARY KEY
    name 1-1 NOT NULL
    city 1-1 NOT NULL


  department
    
    
    id 1-1 PRIMARY KEY
    name 1-1 NOT NULL
    building_name 1-1 NOT NULL


employee


    employee_id 1-1 PRIMARY KEY
    full_name M-1 NOT NULL
    department_id 1-1 FOREIGN KEY


student


    student_id 1-1 PRIMARY KEY
    full_name M-1 NOT NULL
    department_id 1-1 FOREIGN KEY
    
    

vaccine_status


    vaccine_name 1-1 NOT NULL
    date M-1 NOT NULL
    employee_id 1-1 PRIMARY KEY, FOREIGN KEY
    student_id 1-1 PRIMARY KEY, FOREIGN KEY
    
  
schedule


    course_name M-1 NOT NULL
    course_id 1-M NOT NULL
    time M-1 NOT NULL
    employee_id 1-1 PRIMARY KEY, FOREIGN KEY
    student_id 1-1 PRIMARY KEY, FOREIGN KEY
    
Dependent entities and dependency relationships:
   
   
   
    university is independent
    department is depends on university
    employee is depends on department
    student is depends on department
    vaccine_status is depends on employee
    schedule depends on emplyee and student
   

Supertypes, subtypes, and partitions:
    
    university supertypehas department, employee, and student subtypes
    employee and student particion department 


Cascade and restrict actions for dependeny relationships:

    scheudle contains the plural attribute. The primarykey of the new table is the composite of the plural attribute and the foreign key.
    The new table that is to be created is dependend on the schedule table, so the primary key cascade and foriegn key restricts rules are specified.

Cascade and restrict rules on foreign keys that implement dependency relationships:
    
    
    university unique, required
    department simple, required
    employee unique, required
    student unique, required
    vaccine_status simple
    schedule required


Implementing attribute types:
    
    
    university 1(1) ---- has ---- department 1(1)
    department 1(1) ----assigned --- employee 1(M)
    department 1(1) ----choose ----student 1(M)
    employee 1(M) -------required --- vaccine_status 1(1)
    employee 1(M) -------given --- schedule M(1)
    student 1(M) -------picks ------schedule M(1)
    student 1(M) ------encouraged ---- vaccine_status 1(1)
    
    

Describe at least one plural attribute and describe how did you implement it:
    
    schedule has a many course_name attribute which it can be implemented as multiple columns in the same table. 
    course_id becomes three different columns. 
