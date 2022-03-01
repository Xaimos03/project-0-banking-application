package BankingApp1;
import java.util.Scanner;

public class Employee extends CustomerAccountActions {
	CustomerAccountActions a=new CustomerAccountActions();
	CustomerAccountActions b=OverallLogIn.map.get(name);

	
	//IMPLEMENT EMPLOYEE ACCOUNT LOGIN
	public void elogin() {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Welcome:Please enter the user name of the customer");
		String customer=s.nextLine();
		
		
		System.out.println("What would you like to do: Withdraw, Deposit, "
				+ "Transer Funds, View Balance, View Personal Info, View Account,"
				+ "Cancel Account, Approve Account, Deny Account");
		String accountAct=s.nextLine();

		switch (accountAct) {
			case "Withdraw":
				withdraw(customer);
				break;
			case "Deposit":
				deposit(customer);
				break;
			case "Transfer Funds":
				transfer(customer);
				break;
			case "View Balance":
				viewBalance(customer);
				break;
			case "View Personal Info":
				viewPersonalInfo(customer);
				break;
			case "Cancel Account":
				cancelAccount(customer);
				break;
			case "Approve Account":
				approveAccount(customer);
				break;
			case "Deny Account":
				denyAccount(customer);
				break;
				
							
		}
		
	}
	
	

}
