package employee.domain;

import java.sql.Date;

/**
 * Employee object
 * 
 * @author Liz Morales
 * 
 */
public class Employee {
	/*
	 * Correspond to the user table
	 */
	
	private Integer employee_id;
	private String employee_full_name;
	private Integer department_id;
	private Date employee_start_date;
	/**
	 * @return the employee_id
	 */
	public Integer getEmployee_id() {
		return employee_id;
	}
	/**
	 * @param employee_id the employee_id to set
	 */
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	/**
	 * @return the employee_full_name
	 */
	public String getEmployee_full_name() {
		return employee_full_name;
	}
	/**
	 * @param employee_full_name the employee_full_name to set
	 */
	public void setEmployee_full_name(String employee_full_name) {
		this.employee_full_name = employee_full_name;
	}
	/**
	 * @return the department_id
	 */
	public Integer getDepartment_id() {
		return department_id;
	}
	/**
	 * @param department_id the department_id to set
	 */
	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}
	/**
	 * @return the employee_start_date
	 */
	public Date getEmployee_start_date() {
		return employee_start_date;
	}
	/**
	 * @param employee_start_date the employee_start_date to set
	 */
	public void setEmployee_start_date(Date employee_start_date) {
		this.employee_start_date = employee_start_date;
	}
	
	
}
