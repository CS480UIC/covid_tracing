package department_employee.service;


import department_employee.dao.Department_employeeDao;
import department_employee.domain.Department_employee;

/**
 * logic functions such as register, login
 * @author Liz Morales
 *
 */
public class Department_employeeService {
	private Department_employeeDao department_employeeDao = new Department_employeeDao();
	
	/**
	 * register a Department_employee
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Department_employee form) throws Department_employeeException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Department_employee entity1 = department_employeeDao.findByDepartment_employee_id(form.getDepartment_employee_id());
		if(entity1.getDepartment_employee_id()!=null && entity1.getDepartment_employee_id() == form.getDepartment_employee_id()) throw new Department_employeeException("This Department Employee ID has been registered!");
		department_employeeDao.add(form);
	}

}
