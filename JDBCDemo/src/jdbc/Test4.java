package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	
	Class.forName("org.postgresql.Driver");

	Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost/govind","postgres","Deadp00l");
	
	Statement stmt=conn.createStatement();
	
	
	ResultSet result=stmt.executeQuery("select * from iaemp");
	
	
	while(result.next()) {
		System.out.println(result.getInt(1)+" "+result.getString(2));
		
			}
	
	conn.close();
	
}
}
