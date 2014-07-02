package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<body >");

		String str1 = request.getParameter("num1");
		String str2 = request.getParameter("num2");

		try {
			int x = Integer.parseInt(str1);
			int y = Integer.parseInt(str2);

			int sum = x + y;

			out.println("<h1>Sum is  " + sum + "</h1>");

		} catch (NumberFormatException nfe) {
			out.println("<font color='red'>You entered invalid data "
					+ nfe.getMessage() + "</font>");
		}

		out.println("</body>");
		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
