package com.atm.machine;

public class Account {

	private int accountno;
	private String name;
	private String phone;
	private String city;
	private String password;
	
	public Account(int accountno, String name, String phone, String city ,String password) {
		super();
		this.accountno = accountno;
		this.name = name;
		this.phone = phone;
		this.city = city;
		this.password = password;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String password) {
		super();
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	

	public Account(String name, String phone, String city) {
		super();
		this.name = name;
		this.phone = phone;
		this.city = city;
		
	}

	

	
	
	
	
	
}
