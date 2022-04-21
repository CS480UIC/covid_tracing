package department.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import department.dao.DepartmentDao;
import department.domain.Department;


/**
 * Servlet implementation class UserServlet
 */

public class DepartmentServletDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentServletDelete() {
        super();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getParameter("method");
		DepartmentDao departmentDao = new DepartmentDao();
		Department department = null;
		if(method.equals("search"))
		{
			try {
				department = departmentDao.findByDepartmentID(Integer.parseInt(request.getParameter("department_id")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
		
			if(department.getDepartment_id()!=null){
						System.out.println(department);
						request.setAttribute("department", department);
						request.getRequestDispatcher("/jsps/department/department_delete_output.jsp").forward(request, response);			
				}
				else{
				request.setAttribute("msg", "Department not found");
				request.getRequestDispatcher("/jsps/department/department_delete_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("delete"))
		{	
			try {
				departmentDao.delete(request.getParameter("department_id"));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Department Deleted");
			request.getRequestDispatcher("/jsps/department/department_delete_output.jsp").forward(request, response);
		}
	}
}



