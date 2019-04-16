package ExamplePackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionManager {

   static Connection con;
   static String url;
         
   public static Connection getConnection()
   {
     
      try
      {
          Class.forName("com.mysql.jdbc.Driver");

    	  
         String url = "jdbc:mysql://localhost:3306/test"; 
         // assuming "DataSource" is your DataSource name

         
         try
         {            	
            con = DriverManager.getConnection(url,"root","root"); 
             								
         // assuming your SQL Server's	username is "username"               
         // and password is "password"
              
         }
         
         catch (SQLException ex)
         {
            ex.printStackTrace();
         }
      }

      catch(ClassNotFoundException e)
      {
         System.out.println(e);
      }

   return con;
}
}