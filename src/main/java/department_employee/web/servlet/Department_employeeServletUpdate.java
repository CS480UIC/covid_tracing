package department_employee.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import department_employee.dao.Department_employeeDao;
import department_employee.domain.Department_employee;

/**
 * Servlet implementation class UserServlet
 */

public class Department_employeeServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Department_employeeServletUpdate() {
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

//		String method = request.getParameter("method");
//		Department_employeeDao entity1dao = new Department_employeeDao();
//		Department_employee entity1 = null;
//
//		if(method.equals("search"))
//		{
//			try {
//				entity1 = entity1dao.findByDepartment_department_id(request.getParameter("username"));
//			} catch (ClassNotFoundException e1) {
//				e1.printStackTrace();
//			} catch (InstantiationException e1) {
//				e1.printStackTrace();
//			} catch (IllegalAccessException e1) {
//				e1.printStackTrace();
//			}
//
//			if(entity1.getUsername()!=null){
//				request.setAttribute("entity1", entity1);
//				request.getRequestDispatcher("/jsps/entity1/entity1_update_output.jsp").forward(request, response);
//
//			}
//			else{
//				request.setAttribute("msg", "Entity not found");
//				request.getRequestDispatcher("/jsps/entity1/entity1_read_output.jsp").forward(request, response);
//			}
//		}
//		else if(method.equals("update"))
//		{
//			Map<String,String[]> paramMap = request.getParameterMap();
//			Department_employee form = new Department_employee();
//			List<String> info = new ArrayList<String>();
//
//			for(String name : paramMap.keySet()) {
//				String[] values = paramMap.get(name);
//				info.add(values[0]);
//			}
//			form.setPassword(info.get(2));
//			form.setEmail(info.get(3));
//			form.setUsername(request.getParameter("username"));
//
//			try {
//				entity1dao.update(form);
//
//			} catch (ClassNotFoundException e1) {
//				e1.printStackTrace();
//			} catch (InstantiationException e1) {
//				e1.printStackTrace();
//			} catch (IllegalAccessException e1) {
//				e1.printStackTrace();
//			}
//			request.setAttribute("msg", "Entity Updated");
//			request.getRequestDispatcher("/jsps/entity1/entity1_read_output.jsp").forward(request, response);
//		}
	}
}



