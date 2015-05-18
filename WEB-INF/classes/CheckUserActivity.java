

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckUserActivity
 */
public class CheckUserActivity extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckUserActivity() {
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
		String activity=request.getParameter("button");
		if(activity.equals("Forums"))
		{
			response.sendRedirect("Forums.jsp");
		}
		else if(activity.equals("Logout"))
		{
			javax.servlet.RequestDispatcher rd=request.getRequestDispatcher("LogOut");
			rd.forward(request, response);
		}
		else if(activity.equals("Home"))
		{
			response.sendRedirect("index.jsp");
		}
		else if(activity.equals("Newsletters"))
		{
			response.sendRedirect("Newsletter.jsp");
		}
		else if(activity.equals("Queries"))
		{
			response.sendRedirect("Query.jsp");
		}
		else if(activity.equals("Profile"))
		{
			response.sendRedirect("Profile.jsp");
		}
		if(activity.equals("Statistics"))
		{
			response.sendRedirect("Statistics.jsp");
		}
	}

}
