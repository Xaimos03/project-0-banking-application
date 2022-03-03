package BankingApp1;
import java.util.Scanner;

public class Employee extends CustomerAccountActions {
	CustomerAccountActions a=new CustomerAccountActions();
	CustomerAccountActions b=OverallLogIn.map.get(name);
	private String customer;

	
	//IMPLEMENT EMPLOYEE ACCOUNT LOGIN
	public void elogin() throws Exception {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Welcome:Please enter the user name of the customer");
		String customer=s.nextLine();
		
		System.out.println("What would you like to do?: Please select a number: 1-Withdraw, 2-Deposit, "
				+ "3-Transer Funds, 4-View Balance, 5-View Personal Info,"
				+ "6-Cancel Account, 7-Approve Account, 8-Deny Account");
		String accountAct=s.nextLine();
		
		switch (accountAct) {
			case "1":
				withdraw(customer);
				break;
			case "2":
				deposit(customer);
				break;
			case "3":
				transfer(customer);
				break;
			case "4":
				viewBalance(customer);
				break;
			case "5":
				viewPersonalInfo(customer);
				break;
			case "6":
				cancelAccount(customer);
				break;
			case "7":
				approveAccount(customer);
				break;
			case "8":
				denyAccount(customer);
				break;
			default:
				throw new Exception ("Sorry that is not a valid choice");				
		}
		
	}
	
	

}
