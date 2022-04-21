package university.service;


import java.util.List;

import university.dao.UniversityDao;
import university.domain.University;

/**
 * logic functions such as register, login
 * @author Haeun Kim
 *
 */
public class UniversityService {
	private UniversityDao universityDao = new UniversityDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(University form) throws UniversityException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		University entity1 = universityDao.findByUniversityID(form.getUniversity_id());
		if(entity1.getUniversity_id() != null && entity1.getUniversity_id().equals(form.getUniversity_id())) throw new UniversityException("This university id has been registered before!");
		universityDao.add(form);
	}
	public List<Object> findOldUniversity() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return universityDao.findOldUniversity();
		
	}
}
