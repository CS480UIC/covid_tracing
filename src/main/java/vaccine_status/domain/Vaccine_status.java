package vaccine_status.domain;

import java.sql.Date;

/**
 * User object
 * 
 * @author Liz Morales
 * 
 */
public class Vaccine_status {
	/*
	 * Correspond to the vaccine_status table
	 */
	
	private Integer employee_id;
	private String vaccine_name;
	private Date vaccine_date;
	private Integer dose_number;
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
	 * @return the vaccine_name
	 */
	public String getVaccine_name() {
		return vaccine_name;
	}
	/**
	 * @param vaccine_name the vaccine_name to set
	 */
	public void setVaccine_name(String vaccine_name) {
		this.vaccine_name = vaccine_name;
	}
	/**
	 * @return the vaccine_date
	 */
	public Date getVaccine_date() {
		return vaccine_date;
	}
	/**
	 * @param vaccine_date the vaccine_date to set
	 */
	public void setVaccine_date(Date vaccine_date) {
		this.vaccine_date = vaccine_date;
	}
	/**
	 * @return the dose_number
	 */
	public Integer getDose_number() {
		return dose_number;
	}
	/**
	 * @param dose_number the dose_number to set
	 */
	public void setDose_number(Integer dose_number) {
		this.dose_number = dose_number;
	}
	
}
