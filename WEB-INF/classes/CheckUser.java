

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class CheckUser
 */
public class CheckUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckUser() {
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
		beans.CheckUserBean check=new beans.CheckUserBean();
		check.setEmailid(request.getParameter("emailid"));
		check.setUser(request.getParameter("user"));
		check.setPassword(request.getParameter("password"));
		HttpSession session=request.getSession();
		session.setAttribute("checkuser",check);
		if(check.isValiduser()==true && check.getUsertype().equals("reg_user"))
		{
			session.setAttribute("emailid",check.getEmailid());
			session.setAttribute("fullname",(check.getFirstname()+" "+check.getLastname()));
			session.setAttribute("usertype",check.getUsertype());
			session.setAttribute("firstname",check.getFirstname());
			session.setAttribute("lastname",check.getLastname());
			session.setAttribute("sex",check.getSex());
			session.setAttribute("mobileno",check.getMobileno());
			session.setAttribute("telno",check.getTelno());
			session.setAttribute("day",check.getDay());
			session.setAttribute("month",check.getMonth());
			session.setAttribute("year",check.getYear());
			session.setAttribute("address",check.getAddress());
			session.setAttribute("interest",check.getInterest());
			session.setAttribute("qualification",check.getQualification());
			session.setAttribute("username",check.getUsername());
			session.setAttribute("aboutme",check.getAbout_me());
			session.setAttribute("expedition",check.getExpedition());
			session.setAttribute("lastschool",check.getLast_school());
			session.setAttribute("employer",check.getEmployer());
			session.setAttribute("sincemonth",check.getSince_month());
			session.setAttribute("sinceday",check.getSince_day());
			session.setAttribute("imgid",check.getImgid());
			response.sendRedirect("home.jsp");
		}
		else if(check.isValiduser()==true && check.getUsertype().equals("admin"))
		{
			session.setAttribute("emailid",check.getEmailid());
			session.setAttribute("fullname",(check.getFirstname()+" "+check.getLastname()));
			session.setAttribute("usertype",check.getUsertype());
			session.setAttribute("firstname",check.getFirstname());
			session.setAttribute("lastname",check.getLastname());
			session.setAttribute("sex",check.getSex());
			session.setAttribute("mobileno",check.getMobileno());
			session.setAttribute("telno",check.getTelno());
			session.setAttribute("day",check.getDay());
			session.setAttribute("month",check.getMonth());
			session.setAttribute("year",check.getYear());
			session.setAttribute("address",check.getAddress());
			session.setAttribute("interest",check.getInterest());
			session.setAttribute("qualification",check.getQualification());
			session.setAttribute("username",check.getUsername());
			session.setAttribute("aboutme",check.getAbout_me());
			session.setAttribute("expedition",check.getExpedition());
			session.setAttribute("lastschool",check.getLast_school());
			session.setAttribute("employer",check.getEmployer());
			session.setAttribute("sincemonth",check.getSince_month());
			session.setAttribute("sinceday",check.getSince_day());
			session.setAttribute("imgig",check.getImgid());
			response.sendRedirect("AdminHome.jsp");
		}

		else if(check.isValiduser()==true && check.getUsertype().equals("reviewer"))
		{
			session.setAttribute("emailid",check.getEmailid());
			session.setAttribute("fullname",(check.getFirstname()+" "+check.getLastname()));
			session.setAttribute("usertype",check.getUsertype());
			session.setAttribute("firstname",check.getFirstname());
			session.setAttribute("lastname",check.getLastname());
			session.setAttribute("sex",check.getSex());
			session.setAttribute("mobileno",check.getMobileno());
			session.setAttribute("telno",check.getTelno());
			session.setAttribute("day",check.getDay());
			session.setAttribute("month",check.getMonth());
			session.setAttribute("year",check.getYear());
			session.setAttribute("address",check.getAddress());
			session.setAttribute("interest",check.getInterest());
			session.setAttribute("qualification",check.getQualification());
			session.setAttribute("username",check.getUsername());
			session.setAttribute("aboutme",check.getAbout_me());
			session.setAttribute("expedition",check.getExpedition());
			session.setAttribute("lastschool",check.getLast_school());
			session.setAttribute("employer",check.getEmployer());
			session.setAttribute("sincemonth",check.getSince_month());
			session.setAttribute("sinceday",check.getSince_day());
			session.setAttribute("imgig",check.getImgid());
			response.sendRedirect("ReviewerHome.jsp");
		}
		else
		{
			request.setAttribute("wronguser",true);
			javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
	}

}
