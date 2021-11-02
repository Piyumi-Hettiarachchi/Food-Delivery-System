package deliver;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UpdateServlet() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//update
		
		String deid = request.getParameter("eid");
		String dname = request.getParameter("name");
		String dtele = request.getParameter("tele");
		String dstatus = request.getParameter("status");
		
		boolean TrueValue;
		
		TrueValue =EmployeeBDUtil.updateDeliverBoy(deid, dname, dtele, dstatus);
			
		if(TrueValue == true) {
			
			List<DeliveryBoy> BoyDetails = EmployeeBDUtil.updatedDetails(deid);
			request.setAttribute("BoyDetails", BoyDetails);

				RequestDispatcher disp = request.getRequestDispatcher("/pages/DeliveryBoy.jsp");
				disp.forward(request, response);
				
			}
			else {
				
				List<DeliveryBoy> BoyDetails = EmployeeBDUtil.updatedDetails(deid);
				request.setAttribute("BoyDetails", BoyDetails);

				RequestDispatcher disp = request.getRequestDispatcher("/pages/DeliveryBoy.jsp");
				disp.forward(request, response);
					
				
				
			}
		}
		
}
