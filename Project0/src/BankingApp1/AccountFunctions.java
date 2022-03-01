package BankingApp1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AccountFunctions extends CustomerAccountActions implements java.io.Serializable {
	
	//LOG IN METHOD
	public void login() throws Exception {
		//ACCESSES THE MAP
		CustomerAccountActions b=OverallLogIn.map.get(name);

		//SETS THE USERNAME AND PASSWORD TO A VARIABLE
		String uName= b.name;
		String uPassword= b.password;
		
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Your User Name: ");
		String userName=s.nextLine();
		
		System.out.println("Enter Your User Password: ");
		String userPassword=s.nextLine();
		

		if (uName.equals(userName) && uPassword.equals(userPassword)) {
			System.out.println("Welcome: Please select one of the following: Withdraw, "
					+ "Deposit, Transer Funds, View Balance, View Personal Info, "
					+ "View Account");
			String accountAct=s.nextLine();
			
			switch (accountAct) {
				case "Withdraw":
					withdraw(userName);
					break;
				case "Deposit":
					deposit(userName);
					break;
				case "Transfer Funds":
					transfer(userName);
					break;
				case "View Balance":
					viewBalance(userName);
					break;
				case "View Personal Info":
					viewPersonalInfo(userName);
					break;
				case "View Account":
					viewAccount(userName);
					break;
			}
		}else {
			throw new Exception ("Sorry please type one of the choices exactly as seen");
		}	
		
	}
	
	//CUSTOMER REGISTRATION
	public void customerRegister() {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Please Enter A User Name: ");
		String userName=s.nextLine();
		
		System.out.println("Please Enter A Password: ");
		String userPassword=s.nextLine();
		
		System.out.println("What type of account do you want to create: Individual or Joint? ");
		String accntType=s.nextLine();
		
		System.out.println("How much would you like to deposit?: $ ");
		double accntDepo=s.nextDouble();
		s.nextLine();//scanner will bug out if this isn't here.
		
		customer(userName,userPassword,accntType,accntDepo);
		
		System.out.println("Welcome: " + userName + " Please select one of the following: "
				+ "Withdraw, Deposit, Transer Funds, View Balance, View Personal Info, "
				+ "View Account");
		String accountAct=s.nextLine();
		
		switch (accountAct) {
			case "Withdraw":
				withdraw(userName);
				break;
			case "Deposit":
				deposit(userName);
				break;
			case "Transfer Funds":
				transfer(userName);
				break;
			case "View Balance":
				viewBalance(userName);
				break;
			case "View Personal Info":
				viewPersonalInfo(userName);
				break;
			case "View Account":
				viewAccount(userName);
				break;
		}
		
				
		
	}
		
		
	
	
	 
	

}
