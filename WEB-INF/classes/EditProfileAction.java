

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import beans.EditProfileBean;


/**
 * Servlet implementation class EditProfileAction
 */
public class EditProfileAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditProfileAction() {
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
		beans.EditProfileBean edit= new EditProfileBean();
		
		HttpSession session=request.getSession();
		if(request.getAttribute("imageuploaded")!=null)
		{
		if(request.getAttribute("imageuploaded").equals(true))
		{
			edit.setEmailid(session.getAttribute("emailid").toString());
			edit.setImgid(Integer.parseInt(request.getAttribute("imgid").toString()));
			edit.setUsername(session.getAttribute("username").toString());
		}
		}
		else
		{/*
			if(request.getParameter("about_me").length()>0){edit.setAbout_me(request.getParameter("about_me"));}else{if(session.getAttribute("aboutme")!=null){edit.setAbout_me(session.getAttribute("aboutme").toString());}}
			if(request.getParameter("address").length()>0){edit.setAddress(request.getParameter("address"));}else{if(session.getAttribute("address")!=null){edit.setAddress(session.getAttribute("address").toString());}}
			if(request.getParameter("day").length()>0){edit.setDay(Integer.parseInt(request.getParameter("day")));}else{if(session.getAttribute("day")!=null){edit.setDay(Integer.parseInt(session.getAttribute("day").toString()));}}
			if(request.getParameter("employer").length()>0){edit.setEmployer(request.getParameter("employer"));}else{if(session.getAttribute("employer")!=null){edit.setEmployer(session.getAttribute("employer").toString());}}
			if(request.getParameter("expedition").length()>0){edit.setExpedition(request.getParameter("expedition"));}else{if(session.getAttribute("expedition")!=null){edit.setExpedition(session.getAttribute("expedition").toString());}}
			if(request.getParameter("firstname").length()>0){edit.setFirstname(request.getParameter("firstname"));}else{if(session.getAttribute("firstname")!=null){edit.setFirstname(session.getAttribute("firstname").toString());}}
			if(request.getParameter("last_school").length()>0){edit.setLast_school(request.getParameter("last_school"));}else{if(session.getAttribute("last_school")!=null){edit.setLast_school(session.getAttribute("last_school").toString());}}
			if(request.getParameter("lastname").length()>0){edit.setLastname(request.getParameter("lastname"));}else{if(session.getAttribute("lastname")!=null){edit.setLastname(session.getAttribute("lastname").toString());}}
			if(request.getParameter("mobileno").length()>0){edit.setMobileno(Long.parseLong(request.getParameter("mobileno")));}else{if(session.getAttribute("mobileno")!=null){edit.setMobileno(Long.parseLong(session.getAttribute("mobileno").toString()));}}
			if(request.getParameter("month").length()>0){edit.setMonth(request.getParameter("month"));}else{System.out.println("Hell....o");if(session.getAttribute("month")!=null){edit.setMonth(session.getAttribute("month").toString());}}
			if(request.getParameter("qualification").length()>0){edit.setQualification(request.getParameter("qualification"));}else{if(session.getAttribute("qualification")!=null){edit.setQualification(session.getAttribute("qualification").toString());}}
			if(request.getParameter("since_day").length()>0){edit.setSince_day(Integer.parseInt(request.getParameter("since_day")));}else{if(session.getAttribute("sinceday")!=null){edit.setSince_day(Integer.parseInt(session.getAttribute("since_day").toString()));}}
			if(request.getParameter("since_month").length()>0){edit.setSince_month(request.getParameter("since_month"));}else{if(session.getAttribute("sincemonth")!=null){edit.setSince_month(session.getAttribute("since_month").toString());}}
			if(request.getParameter("year").length()>0){edit.setYear(Integer.parseInt(request.getParameter("year")));}else{if(session.getAttribute("year")!=null){edit.setYear(Integer.parseInt(session.getAttribute("year").toString()));}}
			if(request.getParameter("username").length()>0){edit.setUsername(request.getParameter("username"));}else{if(session.getAttribute("username")!=null){edit.setUsername(session.getAttribute("username").toString());}}*/
			edit.setAbout_me(request.getParameter("about_me"));
			edit.setAddress(request.getParameter("address"));
			edit.setDay(Integer.parseInt(request.getParameter("day")));
			edit.setEmailid(session.getAttribute("emailid").toString());
			edit.setEmployer(request.getParameter("employer"));
			edit.setExpedition(request.getParameter("expedition"));
			edit.setFirstname(request.getParameter("firstname"));
			edit.setLast_school(request.getParameter("last_school"));
			edit.setLastname(request.getParameter("lastname"));
			edit.setMobileno(Long.parseLong(request.getParameter("mobileno")));
			edit.setMonth(request.getParameter("month"));
			edit.setQualification(request.getParameter("qualification"));
			edit.setSince_day(Integer.parseInt(request.getParameter("since_day")));
			edit.setSince_month(request.getParameter("since_month"));
			edit.setYear(Integer.parseInt(request.getParameter("year")));
			edit.setUsername(request.getParameter("username"));
		}
		if(edit.getValid()==true)
		{
			request.setAttribute("profileuploaded",true);
			javax.servlet.RequestDispatcher rd=request.getRequestDispatcher("EditProfile.jsp");
			rd.forward(request, response);
		}
		else
		{

			request.setAttribute("profileuploaded",false);
			javax.servlet.RequestDispatcher rd=request.getRequestDispatcher("EditProfile.jsp");
			rd.forward(request, response);
		}
		if(edit.getImageuploaded()==true)
		{
			session.setAttribute("datauploaded",true);
		}
	}

}
