

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.ViewNewsletterBean;

/**
 * Servlet implementation class ViewNewsletterAction
 */
public class ViewNewsletterAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewNewsletterAction() {
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
		beans.ViewNewsletterBean view=new ViewNewsletterBean();
		view.setButton(request.getParameter("button"));
		request.setAttribute("view",view);
		if(view.getValid()==true)
		{
			if(view.getButton().equalsIgnoreCase("Read Latest Realize"))
			{
				request.setAttribute("viewlatest",true);
				javax.servlet.RequestDispatcher rd=request.getRequestDispatcher("ViewNewsletter.jsp");
				rd.forward(request, response);
			}
			else if(view.getButton().equalsIgnoreCase("Read Previous Realize"))
			{
				request.setAttribute("viewlatest",false);
				javax.servlet.RequestDispatcher rd=request.getRequestDispatcher("ViewNewsletter.jsp");
				rd.forward(request, response);
			}
		}
		else
		{
			request.setAttribute("view",false);
			javax.servlet.RequestDispatcher rd=request.getRequestDispatcher("Newsletter.jsp");
			rd.forward(request, response);
		}
	}

}
