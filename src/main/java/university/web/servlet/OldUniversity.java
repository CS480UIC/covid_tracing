package university.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import university.service.UniversityService;

/**
 * Servlet implementation class findAll
 */

public class OldUniversity extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UniversityService universityService = new UniversityService();
		try {
			request.setAttribute("UniversityList", universityService.findOldUniversity());
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
//		try {
//			List<Object> li = universityService.findall();
//			for(int i = 0; i < li.size();i++){
//				System.out.println(li.get(i).toString());
//			}
//			
//		} catch (InstantiationException | IllegalAccessException
//				| ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
		
		request.getRequestDispatcher("/jsps/university/q2_old_university.jsp").forward(request, response);
	}

}
