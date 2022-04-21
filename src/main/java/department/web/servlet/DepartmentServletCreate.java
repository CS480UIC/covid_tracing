package department.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import department.domain.Department;
import department.service.DepartmentException;
import department.service.DepartmentService;


/**
 * Servlet implementation class UserServlet
 */

public class DepartmentServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentServletCreate() {
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
		DepartmentService entity1service = new DepartmentService();
		Map<String,String[]> paramMap = request.getParameterMap();
		Department form = new Department();
		List<String> info = new ArrayList<String>();

		for(String name : paramMap.keySet()) {
			String[] values = paramMap.get(name);
			info.add(values[0]);
		}
		form.setDepartment_id(Integer.parseInt(info.get(0)));
		form.setDepartment_name(info.get(1));
		form.setDepartment_number(Integer.parseInt(info.get(2)));
		form.setUniversity_id(Integer.parseInt(info.get(3)));
		
		try {
			entity1service.create(form);
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			
		} catch (ClassNotFoundException | DepartmentException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} 
		
	}

}
