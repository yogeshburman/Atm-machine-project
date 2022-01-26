package com.atm.machine;

import java.sql.DriverManager;
import java.sql.Connection;

public class DatabaseConnection {
	
	static Connection con;
	public static Connection createC(){
		
		try {
			// load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// creating connection...
			String user="root";
			String password ="1234";
			String url = "jdbc:mysql://localhost:3306/atm_manage";
			
			con = DriverManager.getConnection(url, user, password);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return con;
		}

	
}
