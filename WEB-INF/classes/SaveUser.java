

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class SaveUser
 */
public class SaveUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		beans.SaveUserBean save=new beans.SaveUserBean();
		save.setFirstname(request.getParameter("firstname"));
		save.setLastname(request.getParameter("lastname"));
		save.setEmailid(request.getParameter("emailid"));
		save.setPassword(request.getParameter("password"));
		save.setSex(request.getParameter("sex"));
		save.setDay(Integer.parseInt(request.getParameter("day")));
		save.setMobileno(Long.parseLong(request.getParameter("mobileno")));
		save.setUsername(request.getParameter("username"));
		save.setMonth(request.getParameter("month"));
		save.setYear(Integer.parseInt(request.getParameter("year")));
		request.setAttribute("saveuser",save);
		if(save.isSuccess()==true)
		{
			HttpSession session=request.getSession();
			session .setAttribute("fullname",save.getFirstname()+" "+save.getLastname());
			session.setAttribute("usertype",save.getUser_type());
			session.setAttribute("firstname",save.getFirstname());
			session.setAttribute("lastname",save.getLastname());
			session.setAttribute("sex",save.getSex());
			session.setAttribute("mobileno",save.getMobileno());
			session.setAttribute("emailid",save.getEmailid());
			session.setAttribute("day",save.getDay());
			session.setAttribute("month",save.getMonth());
			session.setAttribute("year",save.getYear());
			session.setAttribute("username",save.getUsername());
			response.sendRedirect("home.jsp");
		}else
		{
			response.sendRedirect("index.jsp");
			
		}
	}

}
