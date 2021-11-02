package deliver;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DBoyServlet")
public class DBoyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		List<DeliveryBoy> DeliveryBoyDetails = EmployeeBDUtil.getFreeBoyDetails();
		request.setAttribute("DeliveryBoyDetails",DeliveryBoyDetails);
		
		
		RequestDispatcher dis = request.getRequestDispatcher("/pages/FreeDboy.jsp");
		dis.forward(request, response);
		
	}
		
	}	



