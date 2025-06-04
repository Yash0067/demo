package test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","admin");
		Statement statement = connection.createStatement();
		ResultSet set = statement.executeQuery("select * from products");
		while (set.next()) {
			System.out.println(set.getInt(1));
			System.out.println(set.getString(2));
		}
		connection.close();
	}

}
