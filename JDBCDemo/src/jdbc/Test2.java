
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		
		Connection conn1=DriverManager.getConnection("jdbc:postgresql://localhost/govind","postgres","Deadp00l");
		
		Statement stmt1=conn1.createStatement() ;
		 int result=stmt1.executeUpdate("insert into iaemp values(101,'karan')");
		 
		 
		 System.out.println("values inserted"+result);
		
		 conn1.close();
	}
}

		