package deliver;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//collect data coming from insertReadyOrder.jsp page	
		String OrderNo = request.getParameter("orderno");
		String OrderDescription = request.getParameter("des");
		String CusTp = request.getParameter("tp");
		String Address = request.getParameter("address");
		String ReceiptNo = request.getParameter("receiptno");
		String status= request.getParameter("status");
		
		boolean correct;
		
		correct = EmployeeBDUtil.insertOrder(OrderNo, OrderDescription, CusTp, Address, ReceiptNo,status);
		
		if (correct == true) {
			// this mean database connection success..data inserted to DB
			RequestDispatcher dis1= request.getRequestDispatcher("/pages/ReadyOrder.jsp");
			dis1.forward(request, response);
		}
		else {
			
			RequestDispatcher dis2 = request.getRequestDispatcher("/pages/InsertReadyOrder.jsp");
			dis2.forward(request, response);
		}
		
	}

}
;