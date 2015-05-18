

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.ViewReplyBean;

/**
 * Servlet implementation class ViewReplyAction
 */
public class ViewReplyAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewReplyAction() {
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
		beans.ViewReplyBean view =new ViewReplyBean();
		view.setId(Integer.parseInt(request.getParameter("queryid")));
		request.setAttribute("view",view);
		if(view.getValid()==true)
		{
			request.setAttribute("isreply",true);
			javax.servlet.RequestDispatcher rd=request.getRequestDispatcher("ViewReply.jsp");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("isreply",false);
			javax.servlet.RequestDispatcher rd=request.getRequestDispatcher("ViewReply.jsp");
			rd.forward(request, response);
		}
	}

}
