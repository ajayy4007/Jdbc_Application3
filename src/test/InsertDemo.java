package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo {
public static void main(String[] args) {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
		Statement stmt=con.createStatement();
		stmt.executeUpdate("insert into student01 values(1001,'ajay',99)");
		System.out.println("One value is inserted successfully");
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
}
}
