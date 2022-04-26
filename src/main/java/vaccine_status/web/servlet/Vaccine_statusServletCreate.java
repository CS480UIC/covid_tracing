package vaccine_status.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vaccine_status.domain.Vaccine_status;
import vaccine_status.service.Vaccine_statusException;
import vaccine_status.service.Vaccine_statusService;


/**
 * Servlet implementation class UserServlet
 */

public class Vaccine_statusServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Vaccine_statusServletCreate() {
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
		Vaccine_statusService entity1service = new Vaccine_statusService();
		Map<String,String[]> paramMap = request.getParameterMap();
		Vaccine_status form = new Vaccine_status();
		List<String> info = new ArrayList<String>();

		for(String name : paramMap.keySet()) {
			String[] values = paramMap.get(name);
			info.add(values[0]);
		}

		form.setEmployee_id(Integer.parseInt(info.get(0)));
		form.setVaccine_name(info.get(1));
		form.setVaccine_date(java.sql.Date.valueOf( info.get(2)));
		form.setDose_number(Integer.parseInt(info.get(3)));
		
		try {
			entity1service.create(form);
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			
		} catch (ClassNotFoundException | Vaccine_statusException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} 
		
	}

}
