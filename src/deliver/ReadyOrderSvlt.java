package deliver;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ReadyOrderSvlt")
public class ReadyOrderSvlt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<ReadyOrder> ReadyOrderDetails = EmployeeBDUtil.getDetails();
		request.setAttribute("ReadyOrderDetails",ReadyOrderDetails);
		
		RequestDispatcher dis = request.getRequestDispatcher("/pages/ReadyOrder.jsp");
		dis.forward(request, response);
	}

}
