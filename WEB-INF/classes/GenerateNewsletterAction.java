

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.GenerateNewsletterBean;

/**
 * Servlet implementation class GenerateNewsletterAction
 */
public class GenerateNewsletterAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GenerateNewsletterAction() {
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
		beans.GenerateNewsletterBean generate=new GenerateNewsletterBean();
		generate.setSubject(request.getParameter("subject"));
		generate.setContent(request.getParameter("content"));
		request.setAttribute("generate",generate);
		if(generate.getValid()==true)
		{
			request.setAttribute("generated",true);
			javax.servlet.RequestDispatcher rd=request.getRequestDispatcher("AdminHome.jsp");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("generated",false);
			javax.servlet.RequestDispatcher rd=request.getRequestDispatcher("AdminHome.jsp");
			rd.forward(request, response);
		}
	}

}
