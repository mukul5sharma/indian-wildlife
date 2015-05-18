

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ManageUserAction
 */
public class ManageUserAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManageUserAction() {
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
		beans.ManageUserBean search=new beans.ManageUserBean();
        search.setUser(request.getParameter("name"));
        request.setAttribute("search",search);
        if(search.isValid()==true)
        {
        	request.setAttribute("searchfound",true);
			javax.servlet.RequestDispatcher rd=request.getRequestDispatcher("ManageUser.jsp");
			rd.forward(request, response);
        }
        else
        {
        	request.setAttribute("searchfound",false);
			javax.servlet.RequestDispatcher rd=request.getRequestDispatcher("ManageUser.jsp");
			rd.forward(request, response);
        }
        
	}

}
