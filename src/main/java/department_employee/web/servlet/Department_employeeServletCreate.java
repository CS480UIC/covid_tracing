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

import department_employee.domain.Department_employee;
import department_employee.service.Department_employeeException;
import department_employee.service.Department_employeeService;


/**
 * Servlet implementation class UserServlet
 */

public class Department_employeeServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Department_employeeServletCreate() {
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
//		Department_employeeService entity1service = new Department_employeeService();
//		Map<String,String[]> paramMap = request.getParameterMap();
//		Department_employee form = new Department_employee();
//		List<String> info = new ArrayList<String>();
//
//		for(String name : paramMap.keySet()) {
//			String[] values = paramMap.get(name);
//			info.add(values[0]);
//		}
////		form.setUsername(info.get(0));
////		form.setPassword(info.get(1));
////		form.setEmail(info.get(2));		
//		
//		try {
//			entity1service.create(form);
//			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
//			
//		} catch (ClassNotFoundException | Department_employeeException e) {
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			e.printStackTrace();
//		} 
		
	}

}
