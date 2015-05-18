

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.UploadStatisticsBean;

/**
 * Servlet implementation class UploadStatisticsAction
 */
public class UploadStatisticsAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadStatisticsAction() {
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
		beans.UploadStatisticsBean upload=new UploadStatisticsBean();
		HttpSession session=request.getSession();
		if(request.getAttribute("imageuploaded")!=null)
		{
		if(request.getAttribute("imageuploaded").equals(true))
		{
			upload.setImgid(Integer.parseInt(request.getAttribute("imgid").toString()));
			upload.setThreats(request.getParameter("threats"));
		}
		}
		else
		{
			upload.setClimatic_cond(request.getParameter("climatic_cond"));
			upload.setLifespan(Integer.parseInt(request.getParameter("lifespan")));
			upload.setName(request.getParameter("name"));
			upload.setPhy_char(request.getParameter("phy_char"));
			upload.setStattype(request.getParameter("stattype"));
			upload.setSci_name(request.getParameter("sci_name"));
			upload.setThreats(request.getParameter("threats"));
		}
		if(upload.getValid()==true)
		{
			request.setAttribute("datauploaded",true);
			javax.servlet.RequestDispatcher rd=request.getRequestDispatcher("UploadStatistics.jsp");
			rd.forward(request, response);
		}
		else
		{

			request.setAttribute("datauploaded",false);
			javax.servlet.RequestDispatcher rd=request.getRequestDispatcher("UploadStatistics.jsp");
			rd.forward(request, response);
		}
		if(upload.getImageuploaded()==true)
		{
			session.setAttribute("datauploaded",true);
		}
	}

}
