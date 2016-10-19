package first;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/Http1")
public class Http1 extends HttpServlet {

	public void service(ServletRequest req, ServletResponse res)
	/*     */throws ServletException, IOException
	/*     */{
		/*     */try
		/*     */{
			/* 724 */HttpServletRequest request = (HttpServletRequest) req;
		//	/* 725 */response = (HttpServletResponse) res;
			/*     */} catch (ClassCastException e) {
			HttpServletResponse response;
			/* 727 */throw new ServletException("non-HTTP request or response");
		}
		/*     */HttpServletResponse response;
		/* 729 */HttpServletRequest request;
		//service(request, response);
		/*     */}
}
