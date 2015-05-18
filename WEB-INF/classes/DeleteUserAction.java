

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.DeleteUserBean;

/**
 * Servlet implementation class DeleteUserAction
 */
public class DeleteUserAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteUserAction() {
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
		beans.DeleteUserBean delete=new DeleteUserBean();
		delete.setFullname(request.getParameter("name"));
		request.setAttribute("delete",delete);
		if(delete.getUserdeleted()==true)
		{
			request.setAttribute("userdeleted",true);
			javax.servlet.RequestDispatcher rd =request.getRequestDispatcher("ManageUser.jsp");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("userdeleted",false);
			javax.servlet.RequestDispatcher rd =request.getRequestDispatcher("ManageUser.jsp");
			rd.forward(request, response);
		}
	}

}
