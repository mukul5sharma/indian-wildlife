

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckAdminActivity
 */
public class CheckAdminActivity extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckAdminActivity() {
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
		if(activity.equals("Manage User"))
		{
			response.sendRedirect("ManageUser.jsp");;
		}
		if(activity.equals("Home"))
		{
			response.sendRedirect("AdminHome.jsp");
		}
		if(activity.equals("News Letter"))
		{
			response.sendRedirect("GenerateNewsletter.jsp");
		}
		if(activity.equals("Upload Data"))
		{
			response.sendRedirect("UploadStatistics.jsp");
		}
	}

}
