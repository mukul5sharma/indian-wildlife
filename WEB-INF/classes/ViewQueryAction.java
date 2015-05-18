

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.VewQueryBean;

/**
 * Servlet implementation class ViewQueryAction
 */
public class ViewQueryAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewQueryAction() {
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
		if(activity.equals("Home"))
		{
			response.sendRedirect("ReviewerHome.jsp");
		}
		beans.VewQueryBean view=new VewQueryBean();
		request.setAttribute("view",view);
		if(view.getQuery()==true)
		{
			javax.servlet.RequestDispatcher rd= request.getRequestDispatcher("ViewQuery.jsp");
			rd.forward(request, response);
		}
	}

}
