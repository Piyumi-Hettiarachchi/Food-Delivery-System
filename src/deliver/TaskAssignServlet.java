package deliver;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TaskAssignServlet")
public class TaskAssignServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String EmployeeId = request.getParameter("check");
		
		
		List<ReadyOrder> taskAssignDetails = EmployeeBDUtil.taskassigned(EmployeeId);
		request.setAttribute("taskAssignDetails",taskAssignDetails);
		
		RequestDispatcher dis = request.getRequestDispatcher("/pages/TaskAssign.jsp");
		dis.forward(request, response);
		
		
		
		
		
		
	}

}
