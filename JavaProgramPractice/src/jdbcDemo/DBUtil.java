package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	public static Connection getOracleConnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.orale driver");
			
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521.XE", "system", "abc");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
public static Connection getMySQLConnection() {
	
	Connection con = null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mySQL://localhost:3306", "root", "root");
	} catch (Exception e) {
				e.printStackTrace();
	}
	return con;	
}

public static void cleanup (Connection con , Statement st,ResultSet rs) {
		try {
			if (rs !=null)
				rs.close();
			if(st!=null)
				st.close();
			if(con!=null)
				con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

		public static void cleanup (Connection con, Statement st) {
			try {
				if(st!=null)
					st.close();
				if(con!=null)
					con.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}


