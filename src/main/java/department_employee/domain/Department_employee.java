package department_employee.domain;

/**
 * Department_employee object
 * 
 * @author Liz Morales
 * 
 */
public class Department_employee {
	/*
	 * Correspond to the Department_employee table
	 */
	
	private Integer department_department_id;
	private Integer employee_employee_id;
	private Integer department_employee_id;
	/**
	 * @return the department_department_id
	 */
	public Integer getDepartment_department_id() {
		return department_department_id;
	}
	/**
	 * @param department_department_id the department_department_id to set
	 */
	public void setDepartment_department_id(Integer department_department_id) {
		this.department_department_id = department_department_id;
	}
	/**
	 * @return the employee_employee_id
	 */
	public Integer getEmployee_employee_id() {
		return employee_employee_id;
	}
	/**
	 * @param employee_employee_id the employee_employee_id to set
	 */
	public void setEmployee_employee_id(Integer employee_employee_id) {
		this.employee_employee_id = employee_employee_id;
	}
	/**
	 * @return the department_employee_id
	 */
	public Integer getDepartment_employee_id() {
		return department_employee_id;
	}
	/**
	 * @param department_employee_id the department_employee_id to set
	 */
	public void setDepartment_employee_id(Integer department_employee_id) {
		this.department_employee_id = department_employee_id;
	}
	
	
}
