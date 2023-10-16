

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class p
 */
@WebServlet("/p")
public class p extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public p() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String n = request.getParameter("uname"); 
		String f = request.getParameter("pass");
	   String b="ranjith";
	   String a="12345";
	    if( n.equals(b)&& f.equals(a)) {
	        out.print(" successfully registered");
			RequestDispatcher rd = request.getRequestDispatcher("adminlog.html");
			rd.forward(request, response);
			}
		else {
	        out.print(" unsuccessfully registered");
			RequestDispatcher rd = request.getRequestDispatcher("registerstudent.html");
			rd.include(request, response);
		}
	}
	}

