package department.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


// testing commit

//import java.util.ArrayList;
//import java.util.List;

import department.domain.Department;


/**
 * DDL functions performed in database
 */
public class DepartmentDao {
	
	/**
	 * user name to connect to the database 
	 */
	private String MySQL_user = "covid_tracing"; //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "annandliz"; //TODO change password

	public Department findByDepartmentID(Integer department_id_p) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Department department = new Department();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore", MySQL_user, MySQL_password);
		    String sql = "select * from department where department_id =?";
		    	    
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,department_id_p);
		    ResultSet resultSet = preparestatement.executeQuery();

		    while(resultSet.next()){
		    	Integer department_id1 = Integer.parseInt(resultSet.getString("department_id"));
		    	if(department_id1 == department_id_p){
		    		department.setDepartment_id(department_id1);
		    		department.setDepartment_name(resultSet.getString("department_name"));
		    		department.setDepartment_number(Integer.parseInt(resultSet.getString("department_number")));
		    		department.setUniversity_id(Integer.parseInt(resultSet.getString("university_id")));
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return department;
	}	
	
	/**
	 * insert Department
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(Department form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore", MySQL_user, MySQL_password);
			
			String sql = "insert into department (department_id, department_name, department_number, university_id) values(?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getDepartment_id());
		    preparestatement.setString(2,form.getDepartment_name());
		    preparestatement.setInt(3,form.getDepartment_number());
		    preparestatement.setInt(4,form.getUniversity_id());
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
	
	public void update(Department form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore", MySQL_user, MySQL_password);
			
			String sql = "UPDATE department SET department_name = ?, department_number = ?, university_id = ? where department_id = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,form.getDepartment_name());
			preparestatement.setInt(2,form.getDepartment_number());
		    preparestatement.setInt(3,form.getUniversity_id());
		    preparestatement.setInt(4,form.getDepartment_id());

		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	/**
	 * @param username
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public void delete(String department_id_p) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore", MySQL_user, MySQL_password);
//			
//			String sql = "delete from department where department_id = ?";
//			PreparedStatement preparestatement = connect.prepareStatement(sql); 
//		    preparestatement.setInt(1, Integer.parseInt(department_id_p));
//		    preparestatement.executeUpdate();
//		    connect.close();
		    
		    
			String sql0 = "set foreign_key_checks=0";	
			String sql = "delete from department where department_id = ?";
			PreparedStatement preparestatement0 = connect.prepareStatement(sql0); 
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement0.executeUpdate();
		    preparestatement.setInt(1, Integer.parseInt(department_id_p));
		    preparestatement.executeUpdate();
		    connect.close();
		    
		    
		    
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	
	

	
	
	
}
