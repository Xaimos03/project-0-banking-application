package BankingApp1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CustomerAccountActions implements java.io.Serializable {
	public String name;
	public String password;
	public String accountType;
	public double balance;
	//public double balance2;
	
	
		
	//NEW CUSTOMER METHOD THAT ADDS DATA TO THE MAP
	public void customer(String name,String password,String accountType,double balance) {
		CustomerAccountActions a=new CustomerAccountActions();
		a.name=name;
		a.password=password;
		a.accountType=accountType;
		a.balance=balance;
		OverallLogIn.map.put(name,a);
	}
	
	//VIEW ACCOUNT METHOD
	public void viewAccount (String name) {
		CustomerAccountActions b=OverallLogIn.map.get(name);
		if (b!=null) {
		System.out.println("User Name:"+b.name+" User Password:"+b.password+" Account Type:"+b.accountType+" Account Balance:"+ b.balance);
		}else {
			System.out.println("Customer object is null");
		}
	}
	
	//WITHDRAW METHOD
	public void withdraw(String name) {
		CustomerAccountActions b=OverallLogIn.map.get(name);
		Scanner s=new Scanner(System.in);
		System.out.println("How much would you like to withdraw?");
		double moneyWithdraw=s.nextDouble();
		s.nextLine();
		double moneyWithdrew=b.balance-moneyWithdraw;
		System.out.println("Your account balance is now: "+moneyWithdrew);
	}
	
	//DEPOSIT METHOD
	public void deposit(String name) {
		CustomerAccountActions b=OverallLogIn.map.get(name);
		Scanner s=new Scanner(System.in);
		System.out.println("How much would you like to deposit?");
		double moneyDeposit=s.nextDouble();
		s.nextLine();
		double moneyDeposited=b.balance+moneyDeposit;
		System.out.println("Your account balance is now: "+moneyDeposited);
	}	
	
	//TRANSFER METHOD
	public void transfer(String name) {
		CustomerAccountActions b=OverallLogIn.map.get(name);
		Scanner s=new Scanner(System.in);
		System.out.println("How much would you like to transfer?:$ ");
		double moneyTransfer=s.nextDouble();
		s.nextLine();
		double moneyTransfered=moneyTransfer+b.balance;
		System.out.println("Your account balance is now: "+moneyTransfered);
	}
	
	//VIEW BALANCE METHOD
	public void viewBalance(String name) {
		CustomerAccountActions b=OverallLogIn.map.get(name);
		if (b!=null) {
		System.out.println("Account Balance: "+b.balance);
		}else {
			System.out.println("Customer object is null");
		}
	}
	
	//VIEW PERSONAL INFORMATION METHOD
	public void viewPersonalInfo(String name) {
		CustomerAccountActions b=OverallLogIn.map.get(name);
		System.out.println("Your account type is an: " +b.accountType +"User Name: "+b.name+"User Password: " +b.password);
	}
	
	//EMPLOYEE ONLY METHODS
	
		//Cancel Account Method
		public void cancelAccount(String name) {
			System.out.println("You have just canceled the account.");
		}	
		
		//Approve Account Method
		public void approveAccount(String name) {
			System.out.println("You have just approved the account.");
		}
		
		//Deny Account Method
		public void denyAccount(String name) {
			System.out.println("You have just denied the account.");
		}
	
}
