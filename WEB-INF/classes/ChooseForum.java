

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class ChooseForum
 */
public class ChooseForum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChooseForum() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		beans.ChooseForumBean choose=new beans.ChooseForumBean();
		choose.setFullname(session.getAttribute("fullname").toString());
		choose.setName(request.getParameter("name"));
   		session.setAttribute("chooseforum",choose);
		if(choose.isValid()==true)
		{
			session.setAttribute("mytopic",true);
			session.setAttribute("forum",choose.getName());
			response.sendRedirect("Forum.jsp");
		}
		else
		{
			session.setAttribute("mytopic",false);
			session.setAttribute("forum",choose.getName());
			response.sendRedirect("Forum.jsp");
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}
