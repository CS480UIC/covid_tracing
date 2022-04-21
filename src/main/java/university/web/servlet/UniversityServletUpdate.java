package university.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import university.dao.UniversityDao;
import university.domain.University;

/**
 * Servlet implementation class UserServlet
 */

public class UniversityServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UniversityServletUpdate() {
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
		UniversityDao universityDao = new UniversityDao();
		University university = null;

		if(method.equals("search"))
		{
			try {
				university = universityDao.findByUniversityID(Integer.parseInt(request.getParameter("university_id")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}

			if(university.getUniversity_id()!=null){
				request.setAttribute("university", university);
				request.getRequestDispatcher("/jsps/university/university_update_output.jsp").forward(request, response);

			}
			else{
				request.setAttribute("msg", "University not found");
				request.getRequestDispatcher("/jsps/university/university_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			University form = new University();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				String[] values = paramMap.get(name);
				info.add(values[0]);
			}
//			form.setUniversity_id(info.get(2));
//			form.setEmail(info.get(3));
//			form.setUsername(request.getParameter("username"));
			
			
			form.setUniversity_id(Integer.parseInt(request.getParameter("university_id")));
			form.setUniversity_name(request.getParameter("university_name"));
			form.setUniversity_user_id((request.getParameter("university_user_id")));
			
			try {
				universityDao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "University Updated");
			request.getRequestDispatcher("/jsps/university/university_read_output.jsp").forward(request, response);
		}
	}
}



