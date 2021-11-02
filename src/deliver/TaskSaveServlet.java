package deliver;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TaskSaveServlet")
public class TaskSaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String OrderNo = request.getParameter("orderno");
		String EmployeeId = request.getParameter("empid");
		String Status= request.getParameter("status");
		
	boolean correct;
	boolean isTrue;
		
		correct = EmployeeBDUtil.insertTask(OrderNo,EmployeeId);
		
		if (correct == false) {
			// this mean database connection success..data inserted to DB
			RequestDispatcher dis1= request.getRequestDispatcher("/pages/DeliverManager.jsp");
			dis1.forward(request, response);
		}
		else{
			
			RequestDispatcher dis2 = request.getRequestDispatcher("/pages/FreeDboy.jsp");
			dis2.forward(request, response);
		}
		
		isTrue = EmployeeBDUtil.insertStatus(Status, OrderNo);
		if(isTrue == true) {
			
		}
		else {
			
		}
	}

}
