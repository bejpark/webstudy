package examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF=8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.println("<head><title>form</title></head>");
		out.println("<body>");
		Enumeration<String> headerNames=request.getHeaderNames();
		while(headerNames.hasMoreElements()) {
			String headerName=headerNames.nextElement();
			String headerValue=request.getHeader(headerName);
			out.println(headerName+" : "+headerValue +"<br> ");
		}
		out.println("</body>");
		out.println("</html>");
	}
	
	

}
