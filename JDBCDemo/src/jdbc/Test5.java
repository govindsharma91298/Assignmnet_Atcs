package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter username ");
		String uname=sc.next();
		System.out.println("enter password");
		String pwd=sc.next();
		
		
		Class.forName("org.postgresql.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost/govind","postgres","Deadp00l");
		
		PreparedStatement stmt=conn.prepareStatement("select * from users where username=? and password=?");
		
		 stmt.setString(1, uname);
         stmt.setString(2, pwd);
         
         ResultSet result=stmt.executeQuery();
         
         if(result.next()) {
       	  System.out.println("login succuss");
         }else
         {
       	  System.out.println("login denied....enter correct details");
         }
         
         conn.close();
		

	}

}
