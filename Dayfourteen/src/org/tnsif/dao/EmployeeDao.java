package org.tnsif.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//data access object layer
public class EmployeeDao {
	public Connection createConnection()
	{
		String url="jdbc:mysql://localhost:3306/n3";
		String user="root";
		String password="12345678";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//com.mysql.cj.conf.ConnectionUrl
		}
		catch(ClassNotFoundException e) {
			System.out.println("Driver name not found"+e);
		}
		Connection connection;
		try {
			connection=DriverManager.getConnection(url, user, password);
		}
		catch(SQLException e) {
			connection=null;
			System.out.println("User/url/password error"+e);
		}
		return connection;
	}

}
