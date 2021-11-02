package deliver;
import java.io.IOException;


import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



// Servlet implementation class LoginServlet
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
//@see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
//to show a error through java script
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		
// variables for hold the values which send by login.jsp page
// parameter name = name inside the name="" in the form
		
		String Username=request.getParameter("Uname");
		String Password=request.getParameter("Pass");
	    String EmployeeType = request.getParameter("employee");


		boolean isTrue;
		isTrue = EmployeeBDUtil.validate(Username, Password, EmployeeType );
		
	    	    	
		if(isTrue == true) {
			
			if(EmployeeType.equals("DeliverManager")){

				//response.sendRedirect("pages/DeliverManager.jsp");
				RequestDispatcher  disp = request.getRequestDispatcher("pages/DeliverManager.jsp");
				disp.forward(request, response);
				
			}
			else if(EmployeeType.equals("Chef")){

				//response.sendRedirect("pages/DeliverManager.jsp");
				RequestDispatcher  disp = request.getRequestDispatcher("pages/InsertReadyOrder.jsp");
				disp.forward(request, response);
			}
				
			else {
				

				List<DeliveryBoy> BoyDetails = EmployeeBDUtil.getBoyDetails(Username);
				request.setAttribute("BoyDetails",BoyDetails);
				
								
				//response.sendRedirect("pages/DeliverBoy.jsp");
				RequestDispatcher  disp = request.getRequestDispatcher("pages/DeliveryBoy.jsp");
				disp.forward(request, response);
	 
			}
						
	    }
	
		else {
			//java script code
			//if username or password incorrect this will navigate again to login page
			out.println("<script type='text/javascript'>");
			out.println("alert('Your username or password is incorrect');");
			out.println("location='pages/Login.jsp'");
			out.println("</script>");
		}
	
		
				
	}

}
