package deliver;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String orderno = request.getParameter("delete");
		
		boolean correct;
		correct = EmployeeBDUtil.deleteOrder(orderno);
		
		if(correct==false) {
		
			RequestDispatcher dis = request.getRequestDispatcher("/pages/TaskAssign.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis = request.getRequestDispatcher("/pages/DeliveryBoy.jsp");
			dis.forward(request, response);
		}
		
	}

}
