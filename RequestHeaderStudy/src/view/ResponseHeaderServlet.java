package view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ResponseHeaderServlet")
public class ResponseHeaderServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		// response.setHeader("Refresh", "5;http://www.facebook.com");
		//response.setHeader("Refresh", "5;ResponseHeaderServlet");
		
		//response.setContentType("text/html");
		//response.setContentType("text/plain");
		//response.setContentType("application/pdf");
		//response.setContentType("audio/mp3");
		response.setContentType("application/json");
		
		
		out.println("<html>");
		out.println("<body bgcolor='yellow'>");
		out.println("<h1>Inside Response Header Servlet</h1>");
		Date d = new Date();
		out.println("Date " + d.toString());
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
