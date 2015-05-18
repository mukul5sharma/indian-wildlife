

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.SubmitQueryBean;

/**
 * Servlet implementation class SubmitQueryAction
 */
public class SubmitQueryAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubmitQueryAction() {
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
		
        beans.SubmitQueryBean check =new SubmitQueryBean();
		HttpSession session=request.getSession();
		check.setBy(session.getAttribute("fullname").toString());
		check.setSubject(request.getParameter("subject"));
		check.setContent(request.getParameter("content"));
		
		
		request.setAttribute("checkquery",check);
		
	//	HttpSession session=request.getSession();
		
		if(check.getValid()== true)
		{
			request.setAttribute("querysubmitted", true);
			javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("SubmitQuery.jsp");
			rd.forward(request, response);
		
		
		}
		else
		{
			request.setAttribute("querysubmitted", false);
			javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("SubmitQuery.jsp");
			rd.forward(request, response);
					}
		
		
		
		
		
		
	}

}