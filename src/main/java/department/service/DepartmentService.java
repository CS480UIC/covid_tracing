package department.service;


import department.dao.DepartmentDao;
import department.domain.Department;

/**
 * logic functions such as register, login
 * @author Haeun Kim
 *
 */
public class DepartmentService {
	private DepartmentDao departmentDao = new DepartmentDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Department form) throws DepartmentException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Department entity1 = departmentDao.findByDepartmentID(form.getDepartment_id());
		if(entity1.getDepartment_id() != null && entity1.getDepartment_id().equals(form.getDepartment_id())) throw new DepartmentException("This department id has been registered before!");
		departmentDao.add(form);
	}

}
