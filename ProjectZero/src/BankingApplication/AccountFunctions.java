package BankingApplication;

import java.util.Scanner;



public class AccountFunctions  {
	
	DatabaseBank p=new DatabaseBank();
	

	//VIEW ACCOUNT METHOD
	public void viewAccount (String name) {
		DatabaseBank b=DatabaseBank.map.get(name);
		if (b!=null) {
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("User Name: "+b.name+"\nUser Password: "+b.password+"\nAccount Type: "+b.accountType+"\nAccount Balance: "+ b.balance);
		}else {
			System.out.println("Customer object is null");
		}
	}
	
	//WITHDRAW METHOD
	public void withdraw(String name) throws Exception {
		DatabaseBank b=DatabaseBank.map.get(name);
		Scanner s=new Scanner(System.in);
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("How much would you like to withdraw?");
		double moneyWithdraw=s.nextDouble();
		s.nextLine();
		double moneyWithdrew=b.balance-moneyWithdraw;
		System.out.println("Your account balance is now: $"+moneyWithdrew);
		if (b.balance<0) {
			throw new Exception ("Sorry you have overdrawn your account.");
		}
	}
	
	//DEPOSIT METHOD
	public void deposit(String name) throws Exception {
		DatabaseBank b=DatabaseBank.map.get(name);
		Scanner s=new Scanner(System.in);
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("How much would you like to deposit?");
		double moneyDeposit=s.nextDouble();
		s.nextLine();
		if (moneyDeposit>0) {
		double moneyDeposited=b.balance+moneyDeposit;
		System.out.println("Your account balance is now: $"+moneyDeposited);	
		}else {
			throw new Exception ("Sorry that is an invalid amount.");
		}
	}	
	
	//TRANSFER METHOD
	public void transfer(String name) throws Exception {
		DatabaseBank b=DatabaseBank.map.get(name);
		Scanner s=new Scanner(System.in);
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Who's account do you want to transfer to?: $");
		String transferAccnt=s.nextLine(); 
		//s.nextLine();
		DatabaseBank k=DatabaseBank.map.get(transferAccnt);
		System.out.println("How much would you like to transfer?: $");
		double moneyTransfer=s.nextDouble(); 
		s.nextLine();
		if (moneyTransfer>0) {
		double moneyTransfered=b.balance-moneyTransfer;
		double moneyRecieved=k.balance+moneyTransfer;
		System.out.println("Your account balance is now: "+moneyTransfered);
		System.out.println("The balance for: "+transferAccnt+" before: $"+k.balance+" is now $"+moneyRecieved);
		}else {
			throw new Exception ("Sorry that is an invalid amount.");
		}
	}
	
	//VIEW BALANCE METHOD
	public void viewBalance(String name) {
		DatabaseBank b=DatabaseBank.map.get(name);
		if (b!=null) {
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Account Balance: $"+b.balance);
		}else {
			System.out.println("Customer object is null");
		}
	}
	
	//VIEW PERSONAL INFORMATION METHOD
	public void viewPersonalInfo(String name) {
		DatabaseBank b=DatabaseBank.map.get(name);
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Your account type is an: " +b.accountType+"\nUser Name: " +b.name+"\nUser Password: " +b.password);
	}
	
	//EMPLOYEE ONLY METHODS
	
		//Cancel Account Method
		public void cancelAccount(String name) {
			DatabaseBank r=new DatabaseBank();
			System.out.println("Existing Accounts:");
			DatabaseBank b=DatabaseBank.map.get(name);
			System.out.println("-----------------------------------------------------------------------------------------");
			r.printMap();
			DatabaseBank p=DatabaseBank.map.remove(name);
			System.out.println("You have just canceled the account.");
			r.printMap();
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
