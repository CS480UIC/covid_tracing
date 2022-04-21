package university.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


// testing commit

//import java.util.ArrayList;
//import java.util.List;

import university.domain.University;


/**
 * DDL functions performed in database
 */
public class UniversityDao {
	
	/**
	 * user name to connect to the database 
	 */
	private String MySQL_user = "covid_tracing"; //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "annandliz"; //TODO change password

	public University findByUniversityID(Integer university_id_p) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		University university = new University();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore", MySQL_user, MySQL_password);
		    String sql = "select * from university where university_id =? ";
		    	    
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,university_id_p);
		    ResultSet resultSet = preparestatement.executeQuery();

		    while(resultSet.next()){
		    	Integer university_id = Integer.parseInt(resultSet.getString("university_id"));
		    	if(university_id == university_id_p){
		    		university.setUniversity_id(university_id);
		    		university.setUniversity_name(resultSet.getString("university_name"));
		    		university.setUniversity_user_id((resultSet.getString("university_user_id")));
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return university;
	}	
	
	/**
	 * insert Department
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(University form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore", MySQL_user, MySQL_password);
			
			String sql = "insert into university (university_id, university_name, university_user_id) values(?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getUniversity_id());
		    preparestatement.setString(2,form.getUniversity_name());
		    preparestatement.setString(3,form.getUniversity_user_id());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	/**
	 * @param form
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	
//	public void update(Entity1 form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore", MySQL_user, MySQL_password);
//			
//			String sql = "UPDATE entity1 SET password = ?, email = ? where username = ?;";
//			PreparedStatement preparestatement = connect.prepareStatement(sql); 
//		    preparestatement.setString(1,form.getPassword());
//			preparestatement.setString(2,form.getEmail());
//		    preparestatement.setString(3,form.getUsername());
//		    preparestatement.executeUpdate();
//		    connect.close();
//		} catch(SQLException e) {
//			throw new RuntimeException(e);
//		}
//	}
//	
//	
	/**
	 * @param username
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public void delete(String university_id) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore", MySQL_user, MySQL_password);
			
			String sql = "set foreign_key_checks=0; delete from university where university_id = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1, Integer.parseInt(university_id));
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	
}
