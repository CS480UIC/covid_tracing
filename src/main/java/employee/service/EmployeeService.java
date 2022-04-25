package employee.service;


import employee.dao.EmployeeDao;
import employee.domain.Employee;

/**
 * logic functions such as register, login
 * @author Liz Morales
 *
 */
public class EmployeeService {
	private EmployeeDao entity1Dao = new EmployeeDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Employee form) throws EmployeeException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Employee entity1 = entity1Dao.findByEmployeeId(form.getUsername());
		if(entity1.getUsername()!=null && entity1.getUsername().equals(form.getUsername())) throw new EmployeeException("This user name has been registered!");
		entity1Dao.add(form);
	}
	/**
	 * Login function
	 * @param form
	 * @return
	 * @throws UserException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void login(Employee form) throws EmployeeException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		Employee user = entity1Dao.findByEmployeeId(form.getUsername());
		if(user.getUsername()==null) throw new EmployeeException("The user is not in the database");
		
		String password = user.getPassword();
		
		if(password!=null && !password.equals(form.getPassword()))
			throw new EmployeeException(" The password is not right");
		
	}
}
