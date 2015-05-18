

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import beans.CommentBean;

/**
 * Servlet implementation class CommentAction
 */
public class CommentAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommentAction() {
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
		HttpSession session=request.getSession();
		beans.CommentBean comment=new CommentBean();
		comment.setBy(session.getAttribute("fullname").toString());
		comment.setTopic_id(Integer.parseInt(session.getAttribute("topicid").toString()));
		comment.setComment(request.getParameter("comment"));
		request.setAttribute("comment",comment);
		if(comment.isValid()==true)
		{
			request.setAttribute("commentposted",true);
			javax.servlet.RequestDispatcher rd=request.getRequestDispatcher("Topic.jsp");
			rd.forward(request, response);
		}
		else
		{
			
		}
	}

}
