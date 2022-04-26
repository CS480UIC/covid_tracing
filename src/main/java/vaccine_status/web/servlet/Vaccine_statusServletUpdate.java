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

import vaccine_status.dao.Vaccine_statusDao;
import vaccine_status.domain.Vaccine_status;

/**
 * Servlet implementation class UserServlet
 */

public class Vaccine_statusServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Vaccine_statusServletUpdate() {
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
		Vaccine_statusDao vaccine_statusdao = new Vaccine_statusDao();
		Vaccine_status vaccine_status = null;

		if(method.equals("search"))
		{
			try {
				vaccine_status = vaccine_statusdao.findByEmployee_id(Integer.parseInt(request.getParameter("employee_id")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}

			if(vaccine_status.getVaccine_name()!=null){
				request.setAttribute("vaccine_status", vaccine_status);
				request.getRequestDispatcher("/jsps/vaccine_status/vaccine_status_update_output.jsp").forward(request, response);

			}
			else{
				request.setAttribute("msg", "vaccine_status not found");
				request.getRequestDispatcher("/jsps/vaccine_status/vaccine_status_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			Vaccine_status form = new Vaccine_status();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				String[] values = paramMap.get(name);
				info.add(values[0]);
			}
//			form.setPassword(info.get(2));
//			form.setEmail(info.get(3));
//			form.setUsername(request.getParameter("username"));
			
			//fix
			form.setEmployee_id(Integer.parseInt(request.getParameter("employee_id")));
			form.setVaccine_name(info.get(2));
			form.setVaccine_date(java.sql.Date.valueOf( info.get(3)));
			form.setDose_number(Integer.parseInt(info.get(4)));

			try {
				vaccine_statusdao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Vaccine_status Updated");
			request.getRequestDispatcher("/jsps/vaccine_status/vaccine_status_read_output.jsp").forward(request, response);
		}
	}
}



