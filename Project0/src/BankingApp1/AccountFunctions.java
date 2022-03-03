package BankingApp1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AccountFunctions extends CustomerAccountActions implements java.io.Serializable {
	

	//LOG IN METHOD
	public void login() throws Exception {
		//CustomerAccountActions b=OverallLogIn.map.get(name); placing the get map object here dosen't grab anything

		//CREATES AN EMPY VARIABLE TO ADD TO NEXT
		String uName;
		//String uPassword;
	
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Your User Name: ");
		uName=s.nextLine();
		
		//ACCESSES THE MAP: and compare it to the users choice
		CustomerAccountActions b=OverallLogIn.map.get(uName);
		
		System.out.println("Enter Your User Password: ");
		String userPassword=s.nextLine();
		
		
		if (b!=null && b.password.equals(userPassword)) {
			System.out.println("Welcome: Please select the number for one of the following choices: 1-Withdraw, "
					+ "2-Deposit, 3-Transer Funds, 4-View Balance, 5-View Personal Info, "
					+ "6-View Account");
			String accountAct=s.nextLine();
			
			switch (accountAct) {
				case "1":
					withdraw(uName);
					break;
				case "2":
					deposit(uName);
					break;
				case "3":
					transfer(uName);
					break;
				case "4":
					viewBalance(uName);
					break;
				case "5":
					viewPersonalInfo(uName);
					break;
				case "6":
					viewAccount(uName);
					break;
				default:
					throw new Exception ("Sorry that is not a valid choice");		
			}
		}else {
			throw new Exception ("Sorry wrong credentials,please try again");
		}	
		
	}
	
	//CUSTOMER REGISTRATION
	public void customerRegister() {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Please Enter A User Name: ");
		String userName=s.nextLine();
		
		System.out.println("Please Enter A Password: ");
		String userPassword=s.nextLine();
		
		System.out.println("What type of account do you want to create? Select: Individual OR Joint? ");
		String accntType=s.nextLine();
		
		System.out.println("How much would you like to deposit?: $ ");
		double accntDepo=s.nextDouble();
		s.nextLine();//scanner will bug out if this isn't here.
		
		customer(userName,userPassword,accntType,accntDepo);
		
		System.out.println("Welcome: " + userName + " Please select a number for one of the following choices: "
				+ "1-Withdraw, 2-Deposit, 3-Transer Funds, 4-View Balance, 5-View Personal Info, "
				+ "6-View Account");
		String accountAct=s.nextLine();
		
		switch (accountAct) {
			case "1":
			try {
				withdraw(userName);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
				break;
			case "2":
			try {
				deposit(userName);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
				break;
			case "3":
			try {
				transfer(userName);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
				break;
			case "4":
				viewBalance(userName);
				break;
			case "5":
				viewPersonalInfo(userName);
				break;
			case "6":
				viewAccount(userName);
				break;
		}
		
				
		
	}
		
		
	
	
	 
	

}
