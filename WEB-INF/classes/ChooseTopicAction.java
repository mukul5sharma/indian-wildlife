

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.ChooseTopicBean;

/**
 * Servlet implementation class ChooseTopicAction
 */
public class ChooseTopicAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChooseTopicAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		beans.ChooseTopicBean choose=new ChooseTopicBean();
		choose.setName(request.getParameter("name"));
		session.setAttribute("choose",choose);
		if(choose.isValid()==true)
		{
			if(choose.getCommentfound()==true)
			{
				session.setAttribute("commentfound",true);
			}
			else
			{
				session.setAttribute("commentfound",false);
			}
			session.setAttribute("topic",choose.getTopic_name());
			session.setAttribute("topicid",choose.getTopic_id());
			response.sendRedirect("Topic.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
