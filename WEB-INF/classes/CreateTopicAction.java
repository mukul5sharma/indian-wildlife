

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.CreateTopicBean;

/**
 * Servlet implementation class CreateTopicAction
 */
public class CreateTopicAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateTopicAction() {
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
		beans.CreateTopicBean create=new CreateTopicBean();
		create.setName(request.getParameter("name"));
		create.setBy(session.getAttribute("fullname").toString());
		create.setContent(request.getParameter("content"));
		request.setAttribute("create",create);
		if(create.isValid()==true)
		{
			session.setAttribute("mytopic",true);
			request.setAttribute("topiccreated",true);
			javax.servlet.RequestDispatcher rd=request.getRequestDispatcher("Forum.jsp");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("topiccreated",false);
			javax.servlet.RequestDispatcher rd=request.getRequestDispatcher("Forum.jsp");
			rd.forward(request, response);
		}
	}

}
