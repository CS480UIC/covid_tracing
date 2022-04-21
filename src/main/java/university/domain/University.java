package university.domain;

/**
 * University object
 * 
 * @author Haeun Kim
 * 
 */
public class University {
	/*
	 * Correspond to the user table
	 */
	
	private Integer university_id;
	private String university_name; 
	private String university_user_id;
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
	/**
	 * @return the university_name
	 */
	public String getUniversity_name() {
		return university_name;
	}
	/**
	 * @param university_name the university_name to set
	 */
	public void setUniversity_name(String university_name) {
		this.university_name = university_name;
	}
	/**
	 * @return the university_user_id
	 */
	public String getUniversity_user_id() {
		return university_user_id;
	}
	/**
	 * @param university_user_id the university_user_id to set
	 */
	public void setUniversity_user_id(String university_user_id) {
		this.university_user_id = university_user_id;
	}
	
}
