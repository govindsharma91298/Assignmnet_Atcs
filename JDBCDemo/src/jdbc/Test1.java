package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException   {
		Class.forName("org.postgresql.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost/govind","postgres","Deadp00l");
		
		Statement stmt=conn.createStatement();
		
		boolean result=stmt.execute("create table iaemp1(eid int,ename varchar(10))");
		
		System.out.println("Table created "+result);
		
		conn.close();
		
	}

}
