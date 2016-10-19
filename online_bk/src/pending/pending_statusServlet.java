package pending;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/pending_statusServlet")
public class pending_statusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		pending_status_Service ps=new pending_status_Service();
		ArrayList<pending_status_Dto> al=ps.view();
		System.out.println(al);
		RequestDispatcher rs=request.getRequestDispatcher("pending_status_view.jsp");
		request.setAttribute("al1", al);
		rs.include(request, response);
	}

}
