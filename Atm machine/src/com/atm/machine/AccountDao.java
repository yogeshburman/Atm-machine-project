package com.atm.machine;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class AccountDao {
	
	public static Boolean insertAccountToDB(Account ac) {
		 Boolean f=false;
		// jdbc code 
		try {
			Connection con = DatabaseConnection.createC();
			String q="insert into accounts(account_no,name,phone,city,password) values(?,?,?,?,?)";
			PreparedStatement pstmp = con.prepareStatement(q);
			//set the value of parameter
			pstmp.setInt(1,ac.getAccountno());
			pstmp.setString(2,ac.getName());
			pstmp.setString(3,ac.getPhone());
			pstmp.setString(4,ac.getCity());
			pstmp.setString(5,ac.getPassword());
			
			// execute
			pstmp.executeUpdate();
			
			f=true;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return f;
	}

	public static Boolean deleteAccount(int accountId) {
		// TODO Auto-generated method stub
		 Boolean f=false;
			// jdbc code 
			try {
				Connection con = DatabaseConnection.createC();
				String q="delete from accounts where account_no=?";
				PreparedStatement pstmp = con.prepareStatement(q);
				//set the value of parameter
				pstmp.setInt(1,accountId);
				
				
				// execute
				pstmp.executeUpdate();
				
				f=true;
			}
			catch(Exception e) {
				System.out.println(e);
				
			}
			
			return f;
	}

	public static Boolean displaydata() {
		// TODO Auto-generated method stub
		Boolean f=false;
		// jdbc code 
		try {
			Connection con = DatabaseConnection.createC();
			String q="Select * from accounts";
			
			Statement stmp =con.createStatement();
			ResultSet set = stmp.executeQuery(q);
			
			while(set.next()) {
				
				int account=set.getInt(1);
				String name =set.getString(2);
				String phone = set.getString(3);
				String city = set.getString(4);
				
				System.out.println(" Account no. = "+ account);
				System.out.println(" Name = " + name);
				System.out.println(" Phone = " + phone);
				System.out.println(" City = " + city);
				System.out.println("++++++++++++++++++++++++++++++");
			}
			
			
			f=true;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return f;
	}

	public static Boolean updatename(int accountno , String name ,String password) {
		// TODO Auto-generated method stub
		
		Boolean f=false;
		// jdbc code 
		try {
			Connection con = DatabaseConnection.createC();
			String q="Update accounts Set name = ? Where account_no = ? AND password=?";
			PreparedStatement pstmp = con.prepareStatement(q);
			
			//set the value of parameter
			pstmp.setString(1,name);
			pstmp.setInt(2,accountno);
			pstmp.setString(3,password);
			
			
			// execute
			pstmp.executeUpdate();
			
			f=true;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return f;
	}

	public static Boolean userlogin(int accountno, String password) {
		// TODO Auto-generated method stub
		
		Boolean f=false;
		// jdbc code 
		try {
			Connection con = DatabaseConnection.createC();
			String q="Select * from accounts where account_no= ? AND password = ?";
			PreparedStatement pstmp = con.prepareStatement(q);
			
			//set the value of parameter
			
			pstmp.setInt(1,accountno);
			pstmp.setString(2,password);
			
			
			// execute
			pstmp.executeUpdate();
			
			f=true;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return f;
		
	}


}
