package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("org.postgresql.Driver");
	
	
	Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost/govind","postgres","Deadp00l");
	
	Statement stmt=conn.createStatement();
	
	int result=stmt.executeUpdate("update iaemp set ename='govind' where eid=101");
	
	
	System.out.println("update successfully"+ result);
	
	conn.close();
	
	
	
	}

	
}
