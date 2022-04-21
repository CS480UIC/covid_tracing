package department.domain;

/**
 * Department object
 * 
 * @author Haeun Kim
 * 
 */
public class Department {
	/*
	 * Correspond to the user table
	 */
	
	private Integer department_id;
	private String department_name; 
	private Integer department_number;
	private Integer university_id;
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
	 * @return the department_name
	 */
	public String getDepartment_name() {
		return department_name;
	}
	/**
	 * @param department_name the department_name to set
	 */
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	/**
	 * @return the department_number
	 */
	public Integer getDepartment_number() {
		return department_number;
	}
	/**
	 * @param department_number the department_number to set
	 */
	public void setDepartment_number(Integer department_number) {
		this.department_number = department_number;
	}
	/**
	 * @return the university_id
	 */
	public Integer getUniversity_id() {
		return university_id;
	}
	/**
	 * @param university_id the university_id to set
	 */
	public void setUniversity_id(Integer university_id) {
		this.university_id = university_id;
	}

	

	
	
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	@Override
//	public String toString() {
//		return "User [ username=" + username + ", password="
//				+ password + ", email=" + email +"]";
//	}
}
