package university.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import university.dao.UniversityDao;
import university.domain.University;


/**
 * Servlet implementation class UserServlet
 */

public class UniversityServletDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UniversityServletDelete() {
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
						System.out.println(university);
						request.setAttribute("university", university);
						request.getRequestDispatcher("/jsps/university/university_delete_output.jsp").forward(request, response);			
				}
				else{
				request.setAttribute("msg", "University not found");
				request.getRequestDispatcher("/jsps/university/university_delete_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("delete"))
		{	
			try {
				universityDao.delete(request.getParameter("university_id"));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "University Deleted");
			request.getRequestDispatcher("/jsps/university/university_delete_output.jsp").forward(request, response);
		}
	}
}



