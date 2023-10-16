

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class up
 */
@WebServlet("/up")
public class up extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public up() {
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
		String n = request.getParameter("name"); 
		String f = request.getParameter("father");
		String p = request.getParameter("pass");
		String g = request.getParameter("gender");
	    String d= request.getParameter("depart"); 
	    String pn = request.getParameter("phone");
	    String a = request.getParameter("add");
	    String dd= request.getParameter("date");
	    String e=request.getParameter("email");
	    
	    if (connection.update(n,f,p,g,d,pn,a,dd,e)) {
	        out.print(" update successfully");
			RequestDispatcher rd = request.getRequestDispatcher("server.java");
			rd.forward(request, response);
			}
		else {
	        out.print(" unsuccessfully update");
			RequestDispatcher rd = request.getRequestDispatcher("registerstudent.html");
			rd.include(request, response);
		}
	}
	}


