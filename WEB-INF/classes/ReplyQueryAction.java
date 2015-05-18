

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.ReplyQueryBean;

/**
 * Servlet implementation class ReplyQueryAction
 */
public class ReplyQueryAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReplyQueryAction() {
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
		beans.ReplyQueryBean reply=new ReplyQueryBean();
		reply.setId(Integer.parseInt(request.getParameter("queryid")));
		reply.setReply(request.getParameter("reply"));
		if(reply.getValid()==true)
		{
			request.setAttribute("queryreplied",true);
			javax.servlet.RequestDispatcher rd=request.getRequestDispatcher("ReviewerHome.jsp");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("queryreplied",false);
			javax.servlet.RequestDispatcher rd=request.getRequestDispatcher("ReviewerHome.jsp");
			rd.forward(request, response);
		}
	}

}
