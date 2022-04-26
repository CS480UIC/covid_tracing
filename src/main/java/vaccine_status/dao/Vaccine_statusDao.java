package vaccine_status.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


// testing commit

//import java.util.ArrayList;
//import java.util.List;

import vaccine_status.domain.Vaccine_status;

/**
 * DDL functions performed in database
 */
public class Vaccine_statusDao {
	
	/**
	 * user name to connect to the database
	 */
	private String MySQL_user = "covid_tracing"; //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "annandliz"; //TODO change password

	public Vaccine_status findByEmployee_id(Integer employee_id_p) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Vaccine_status vaccine_status = new Vaccine_status();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore", MySQL_user, MySQL_password);
		    String sql = "select * from vaccine_status where employee_id=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,employee_id_p);
		    ResultSet resultSet = preparestatement.executeQuery();

		    while(resultSet.next()){
		    	Integer employee_id = Integer.parseInt( resultSet.getString("employee_id"));
		    	if(employee_id == (employee_id_p)){	
		    		
		    		vaccine_status.setEmployee_id(employee_id);
		    		vaccine_status.setVaccine_name(resultSet.getString("vaccine_name"));
		    		vaccine_status.setVaccine_date(java.sql.Date.valueOf(resultSet.getString("vaccine_date")));
		    		vaccine_status.setDose_number(Integer.parseInt( resultSet.getString("dose_number")));
		    		
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return vaccine_status;
	}	
	
	/**
	 * insert Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(Vaccine_status form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore", MySQL_user, MySQL_password);
			
			String sql = "insert into vaccine_status (employee_id, vaccine_name, vaccine_date, dose_number) values(?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    
		    preparestatement.setInt(1, form.getEmployee_id());
		    preparestatement.setString(2, form.getVaccine_name());
		    preparestatement.setDate(3, form.getVaccine_date());
		    preparestatement.setInt(4, form.getDose_number());
		    
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
	public void update(Vaccine_status form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore", MySQL_user, MySQL_password);
			
			String sql = "UPDATE vaccine_status SET vaccine_name = ?, vaccine_date = ?, dose_number = ? where employee_id = ?;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			
			preparestatement.setString(1,form.getVaccine_name());
			preparestatement.setDate(2,form.getVaccine_date());
		    preparestatement.setInt(3,form.getDose_number());
			preparestatement.setInt(4,form.getEmployee_id());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	/**
	 * @param employee_id_p
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public void delete(String employee_id_p) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore", MySQL_user, MySQL_password);
			
			String sql = "delete from vaccine_status where employee_id = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,Integer.parseInt( employee_id_p));
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
