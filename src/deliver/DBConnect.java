package deliver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
		
		//method for get connection
		public static Connection getConnection() throws ClassNotFoundException, SQLException {
			
			//all connection details
			String url = "jdbc:mysql://localhost:3306/employee";
			String user = "root";
			String pass = "root";
			
			//establish connection
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			
			return con;
		}
	}