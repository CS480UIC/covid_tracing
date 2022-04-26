package vaccine_status.service;


import vaccine_status.dao.Vaccine_statusDao;
import vaccine_status.domain.Vaccine_status;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 *
 */
public class Vaccine_statusService {
	private Vaccine_statusDao vaccine_statusDao = new Vaccine_statusDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Vaccine_status form) throws Vaccine_statusException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Vaccine_status entity1 = vaccine_statusDao.findByEmployee_id(form.getEmployee_id());
		if(entity1.getEmployee_id()!=null && entity1.getEmployee_id().equals(form.getEmployee_id())) throw new Vaccine_statusException("This vaccine status has been registered!");
		vaccine_statusDao.add(form);
	}
	
}
