package employee.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


// testing commit

//import java.util.ArrayList;
//import java.util.List;

import employee.domain.Employee;

/**
 * DDL functions performed in database
 */
public class EmployeeDao {
	
	/**
	 * user name to connect to the database
	 */
	private String MySQL_user = "covid_tracing"; //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "annandliz"; //TODO change password

	public Employee findByEmployeeId(Integer employee_id_p) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Employee employee = new Employee();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore", MySQL_user, MySQL_password);
		    String sql = "select * from employee where employee_id = ?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,employee_id_p);
		    ResultSet resultSet = preparestatement.executeQuery();

		    while(resultSet.next()){
		    	Integer id = Integer.parseInt(resultSet.getString("employee_id"));
		    	if(id == employee_id_p){
		    		employee.setEmployee_id(id);
		    		employee.setEmployee_full_name(resultSet.getString("employee_full_name"));
		    		employee.setDepartment_id(Integer.parseInt(resultSet.getString("department_id")));
		    		employee.setEmployee_start_date(java.sql.Date.valueOf(resultSet.getString("employee_start_date")));
		    		
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return employee;
	}	
	
	/**
	 * insert Employee
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(Employee form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore", MySQL_user, MySQL_password);
			
			//need to change this
			String sql = "insert into employee (employee_id,employee_full_name,department_id, employee_start_date) values(?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getEmployee_id());
		    preparestatement.setString(2,form.getEmployee_full_name());
		    preparestatement.setInt(3,form.getDepartment_id());
		    preparestatement.setDate(4,form.getEmployee_start_date());
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
	public void update(Employee form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore", MySQL_user, MySQL_password);
			
			String sql = "UPDATE employee SET employee_full_name = ?, department_id = ?, employee_start_date = ? where employee_id = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 

			preparestatement.setString(1,form.getEmployee_full_name());
			preparestatement.setInt(2,form.getDepartment_id());
		    preparestatement.setDate(3,form.getEmployee_start_date());
			preparestatement.setInt(4,form.getEmployee_id());
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
	public void delete(String employee_id_p) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore", MySQL_user, MySQL_password);
			
			String sql = "delete from employee where employee_id = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,Integer.parseInt( employee_id_p));
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
