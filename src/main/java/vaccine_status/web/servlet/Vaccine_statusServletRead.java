package vaccine_status.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vaccine_status.dao.Vaccine_statusDao;
import vaccine_status.domain.Vaccine_status;


/**
 * Servlet implementation class UserServlet
 */

public class Vaccine_statusServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Vaccine_statusServletRead() {
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
		Vaccine_status vaccine_status = null;
		Vaccine_statusDao vaccine_statusDao = new Vaccine_statusDao();
		
		try {
			vaccine_status = vaccine_statusDao.findByEmployee_id(Integer.parseInt( request.getParameter("employee_id")));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(vaccine_status.getEmployee_id()!=null){
					//System.out.println(vaccine_status);
					request.setAttribute("vaccine_status", vaccine_status);
					request.getRequestDispatcher("/jsps/vaccine_status/vaccine_status_read_output.jsp").forward(request, response);
			}
			else{
			request.setAttribute("msg", "Entity not found");
			request.getRequestDispatcher("/jsps/vaccine_status/vaccine_status_read_output.jsp").forward(request, response);
		}
	}
}



