import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.atm.machine.Account;
import com.atm.machine.AccountDao;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("____________Online Atm Machine______________ ");
		System.out.println("");
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		
		while(true) {
		System.out.println("Press 1 - for new account ");
		System.out.println("Press 2 - for login ");
		System.out.println("Press 3 - for delete account");
		System.out.println("Press 4 - for Change your account name ");
		System.out.println("Press 5 - for Display all accounts and information");
		System.out.println("Press 6 - for exit application");
		System.out.println("");
		int a=Integer.parseInt(br.readLine());
		//options
		if(a==1) {
			
			//new account 
			System.out.println("Enter your new account no.");
			int accountno = Integer.parseInt(br.readLine());
			System.out.println("Enter your name ");
			String name = br.readLine();
			System.out.println("Enter your Phone no. ");
			String phone = br.readLine();
			System.out.println("Enter your City ");
			String city = br.readLine();
			System.out.println("");
			
			//set password
			System.out.println("PLEASE SET YOU PASSWORD");
			System.out.println("-------------------------------------------");
			System.out.println("Warning - Please dont forget your password it cannot be change");
			System.out.println("-------------------------------------------");
			String password = br.readLine();
			System.out.println("Your account was created please login");
			System.out.println("");
			//object
			Account ac = new Account(accountno,name,phone,city,password);
			//for displaying object values
			System.out.println(ac);
			
			Boolean answer=AccountDao.insertAccountToDB(ac);
			if(answer) {
				System.out.println("Account Successfully Added");
				System.out.println("");
			}
			else {
				System.out.println("Something went Wrong");
				
				
			}
			
			
		}
		else if (a==2){
			//login
			System.out.println("Enter your Account no. ");
			int accountno = Integer.parseInt(br.readLine());
			System.out.println("Enter your Password");
			String password = br.readLine();
			
			AccountDao.userlogin(accountno,password);
		}
		else if (a==3) {
			
			// delete account
			System.out.println("Enter your account no.");
			int accountId = Integer.parseInt(br.readLine());
			Boolean answer=AccountDao.deleteAccount(accountId);
			if(answer) {
				System.out.println("Account Deleted Succesfully....");
				System.out.println("");
			}
			else {
				System.out.println("Something went Wrong");
			}
		}
		else if(a==4) {
			// for changing account name 
			System.out.println("Enter your account no.");
			System.out.println("Enter your name for change");
			System.out.println("Enter your Password");
			
			int accountno = Integer.parseInt(br.readLine());
			String name = br.readLine();
			String password =br.readLine();
			
			Boolean answer=AccountDao.updatename(accountno , name ,password);
			if(answer) {
				System.out.println("Account name changed");
			}
			else {
				System.out.println("Some thing went wrong......");
			}
			
			
			
		}
		else if(a==5) {
			// displaying all account data
			
			Boolean answer=AccountDao.displaydata();
			if(answer) {
				System.out.println("All Account data displayed");
			}
			else {
				System.out.println("");
				System.out.println("Some thing went wrong....... ");
			}
			
		}
		else if(a==6) {
			//exit app
			break;
		}
		else {
			
		}
		}
		System.out.println("Thank you for using machine ");
		System.out.println("see you soon......");
		
		
	}

}
