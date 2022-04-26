package entity1.service;


import entity1.dao.Vaccine_statusDao;
import entity1.domain.Vaccine_status;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 *
 */
public class Entity1Service {
	private Vaccine_statusDao entity1Dao = new Vaccine_statusDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Vaccine_status form) throws Entity1Exception, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Vaccine_status entity1 = entity1Dao.findByUsername(form.getUsername());
		if(entity1.getUsername()!=null && entity1.getUsername().equals(form.getUsername())) throw new Entity1Exception("This user name has been registered!");
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
	public void login(Vaccine_status form) throws Entity1Exception, ClassNotFoundException, InstantiationException, IllegalAccessException {
		Vaccine_status user = entity1Dao.findByUsername(form.getUsername());
		if(user.getUsername()==null) throw new Entity1Exception("The user is not in the database");
		
		String password = user.getPassword();
		
		if(password!=null && !password.equals(form.getPassword()))
			throw new Entity1Exception(" The password is not right");
		
	}
}
