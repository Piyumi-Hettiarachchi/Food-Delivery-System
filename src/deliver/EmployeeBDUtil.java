package deliver;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class EmployeeBDUtil{
	
	
	private static boolean Success;
	private static Connection con=null;
	private static Statement st= null;
	private static ResultSet result=null;
	    	
	
//implementing the validate() method 	
	public static boolean validate(String Uname,String Pass,String emp) {
		
		try {
//database connection			
			con = DBConnect.getConnection();
			st = con.createStatement();
			String sql="Select * from login where UserName='"+Uname+"' and Password='"+Pass+"' and Emptype='"+emp+"'";
			result=st.executeQuery(sql);
			
			if (result.next()) {
				Success= true;
			}
			else {
				Success= false;
			}
		}
		
		catch (Exception e){
			e.printStackTrace();
		}
   
	return Success;

}

	
	
	
//implemeting insertStatus() methode
//update Status
	public static boolean insertStatus(String status,String orderno) {
		
		boolean success = false;
	try {

		con = DBConnect.getConnection();
		st = con.createStatement();
		String sql = "update readyorder set Status= ('"+status+"')  where OrderNo='"+orderno+"'";
	    int result = st.executeUpdate(sql);
	    
	    if(result>0) {
	    	success=true;
	    }
	    else {
	    	
	    }
	    	success=false;
	   }
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return success;
	}
	
	

//implementing getDetails() method
//detail list of Ready Orders
//for show the all the data in the ReadyOrder table
	public static List<ReadyOrder>getDetails()
	{
		ArrayList<ReadyOrder>ReadyOrder = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			st = con.createStatement();
			String sql = "select * from ReadyOrder";
			result = st.executeQuery(sql);
			
			while (result.next()) {
				String orderno = result.getString(1);
				String des = result.getString(2);
				String tp = result.getString(3);
				String address = result.getString(4);
				String receiptno= result.getString(5);
				String status =result.getString(6);
			
				
				ReadyOrder rorder = new ReadyOrder(orderno,des,tp,address,receiptno,status);
				ReadyOrder.add(rorder);
			}
		}
		catch (Exception e){
			
			e.printStackTrace();
			
		}
		return ReadyOrder;
		
	}
	
	

	
//implementing getFreeBoyDetails()
//get boy details who are not in the feild now
// select from deliveryboy table where status=free

	public static List<DeliveryBoy>getFreeBoyDetails()
	{
		ArrayList<DeliveryBoy>DeliveryBoy = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			st = con.createStatement();
			String sql = "select * from deliverboy where Status = 'Free'";
			result = st.executeQuery(sql);
			
			while (result.next()) {
				
				String empid = result.getString(1);
				String name = result.getString(2);
				String tele = result.getString(3);
				String status = result.getString(4);
			
				DeliveryBoy deliveryboy = new DeliveryBoy(empid,name,tele,status);
				DeliveryBoy.add(deliveryboy);
			}
		}
		catch (Exception e){
			
			e.printStackTrace();
			
		}
		return DeliveryBoy;
		
	}
	
	
	
	
	
//implementing getBoyDetails()
// When a deliver boy login into the system using his un and pw it will navigate to deliverboy.jsp page
//when he navigate his user profile will display
//get only relevant person details
	
	public static List<DeliveryBoy>getBoyDetails(String Username)
	{
		ArrayList<DeliveryBoy> DBoy = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			st = con.createStatement();
			String sql = "SELECT * FROM deliverboy WHERE DBEmpID in ( SELECT EmployeeID  from login  WHERE UserName = '"+Username+"');";
			result = st.executeQuery(sql);
			
			while (result.next()) {
				
				String empid = result.getString(1);
				String name = result.getString(2);
				String tele = result.getString(3);
				String status = result.getString(4);
			
				DeliveryBoy DBoy1= new DeliveryBoy(empid,name,tele,status);
				DBoy.add(DBoy1);
			}
		}
		catch (Exception e){
			
			e.printStackTrace();
			
		}
		return DBoy;
		
	}
	
	

//implementing updateDeliverBoy() methode
//user cant update his employee id
//other details can update
	
	public static boolean updateDeliverBoy(String deid,String dname, String dtele, String dstatus) {
		try {
			
			con = DBConnect.getConnection();
			st = con.createStatement();
			String sql = "update deliverboy set Name='"+dname+"',Telephone='"+dtele+"', Status='"+dstatus+"' where DBEmpID = '"+deid+"'";
		    int result = st.executeUpdate(sql);
			
		    if(result > 0){
		    	Success = true;
		    }
		    else {
		    	Success = false;
		    }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return Success;
		
	}

	
	
	public static  List<DeliveryBoy> updatedDetails(String id){
		
		ArrayList<DeliveryBoy> boy = new ArrayList<>();
		try {
			
			con = DBConnect.getConnection();
			st = con.createStatement();
			String sql = "select * from deliverboy where DBEmpID='"+id+"'";
		    result = st.executeQuery(sql);
		    
		    while(result.next()) {
		    	String empid = result.getString(1);
		    	String name = result.getString(2);
		    	String tele = result.getString(3);
		    	String status = result.getString(4);
		    	
		    	
		    	
		    	DeliveryBoy dboy= new DeliveryBoy(empid,name,tele,status);
		    	boy.add(dboy);
		    }
			
		}
		catch(Exception e) {
			
		}
		return boy;
		
	}
	
	
	

//implementing insertOrder() methode
//chef can insert new record of a prepared order

	public static boolean insertOrder(String OrderNo, String OrderDescription, String CusTp,String Address, String ReceiptNo,String status) {
	
		boolean success = false;
	try {

		con = DBConnect.getConnection();
		st = con.createStatement();
		String sql = "insert into readyorder values ('"+OrderNo+"','"+OrderDescription+"','"+CusTp+"','"+Address+"','"+ReceiptNo+"','"+status+"')";
	    int result = st.executeUpdate(sql);
	    
	    if(result>0) {
	    	success=true;
	    }
	    else {
	    	
	    }
	    	success=false;
	   }
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return success;
	}
	



//implementing inserttask() methode
//insert employee id and orderno of order assigned to him

		public static boolean insertTask(String OrderNo, String EmployeeId) {
		
			boolean success = false;
		try {

			con = DBConnect.getConnection();
			st = con.createStatement();
			String sql = "insert into tasksave values ('"+OrderNo+"','"+EmployeeId+"')";
		    int result = st.executeUpdate(sql);
		    
		    if(result>0) {
		    	success=true;
		    }
		    else {
		    	
		    }
		    	success=false;
		   }
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return success;
		}
		

	
	
//implementing taskassigned() methode
//manager input free deliver boy id and order no

	public static List<ReadyOrder>taskassigned( String EmployeeId)
	{
		ArrayList<ReadyOrder>ReadyOrder01 = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			st = con.createStatement();
			
			String sql = "select * from readyorder where OrderNo in (select OrderNo from tasksave where DBEmpID ='"+EmployeeId+"');" ;
			
			result = st.executeQuery(sql);
			while (result.next()) {
				String orderno = result.getString(1);
				String des = result.getString(2); 
				String tp = result.getString(3);
				String address = result.getString(4);
				String receiptno= result.getString(5);
				String status= result.getString(6);
			
				ReadyOrder rorder = new ReadyOrder(orderno,des,tp,address,receiptno,status);
				ReadyOrder01.add(rorder);
			}
		}
		catch (Exception e){
			
			e.printStackTrace();
			
		}
		return ReadyOrder01;
		
	}
	
	
	
	
	// implementing deleteOrder() methode
	//deliver boy can delete that order after finishing his task
	
	public static boolean deleteOrder(String orderno) {
		try {

			con = DBConnect.getConnection();
			st = con.createStatement();
			String sql = "delete from readyorder where OrderNo ='"+orderno+"'";
			int result = st.executeUpdate(sql);
			
			if(result>0) {
				Success = true;
			}
			else {
				Success = false;
				String sql01 = "delete from tasksave where OrderNo ='"+orderno+"'";
				st.executeUpdate(sql01);
				
			}
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		return Success;
	
}

	

}
 






































