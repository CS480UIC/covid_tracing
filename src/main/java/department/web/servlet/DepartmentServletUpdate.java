package department.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import department.dao.DepartmentDao;
import department.domain.Department;

/**
 * Servlet implementation class UserServlet
 */

public class DepartmentServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DepartmentServletUpdate() {
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
				request.setAttribute("department", department);
				request.getRequestDispatcher("/jsps/department/department_update_output.jsp").forward(request, response);

			}
			else{
				request.setAttribute("msg", "Department not found");
				request.getRequestDispatcher("/jsps/department/department_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			Department form = new Department();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				String[] values = paramMap.get(name);
				info.add(values[0]);
			}
			form.setDepartment_id(Integer.parseInt(request.getParameter("department_id")));
			form.setDepartment_name(request.getParameter("department_name"));
			form.setDepartment_number(Integer.parseInt(request.getParameter("department_number")));
			form.setUniversity_id(Integer.parseInt(request.getParameter("university_id")));
			

			try {
				departmentDao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Department Updated");
			request.getRequestDispatcher("/jsps/department/department_read_output.jsp").forward(request, response);
		}
	}
}



