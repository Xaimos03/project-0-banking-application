package BankingApplication;

import java.util.Scanner;


public class Users  {
	
	
	public void initLogIn() {
		Scanner s=new Scanner(System.in);
		
		System.out.println("--------------------------------------------");
		System.out.println("        BANK OF NOM NOM YOUR MONEY ");
		System.out.println("--------------------------------------------");
		System.out.println("     Please select from the following: \n         1= Customer OR 2= Employee ");

		String userType=s.nextLine();
		
		if (userType.equals("1")) {
			//call Customer Class
			clogin();
		}else {
			//call Employee Class
			try {
				elogin();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	//CUSTOMER LOG-IN
	public void clogin(){
		Scanner s=new Scanner(System.in);
		
		System.out.println("Do you have an existing account?:Y or N ");
		String eAccount=s.nextLine();

		if (eAccount.equals("Y")) {
				try {
					login();
				} catch (Exception e) {
	
					e.printStackTrace();
				}
		}else {
			customerRegister();
		}
	}
	
	//LOG IN METHOD
	public void login() throws Exception {
		
		//CREATES AN EMPTY VARIABLE TO ADD TO NEXT
		String uName;
		
		Scanner s=new Scanner(System.in);
			
		System.out.println("Enter Your Name: ");
		uName=s.nextLine();
			
		//ACCESSES THE MAP: and compare it to the users choice
		DatabaseBank b=DatabaseBank.map.get(uName);
			
		System.out.println("Enter Your User Password: ");
		String userPassword=s.nextLine();
		
		String accountAct;
		if (b!=null && b.password.equals(userPassword)) {
			
			do {
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("Welcome: Please select the number for one of the following choices: \n 1-Withdraw\n "
					+ "2-Deposit\n 3-Transer Funds\n 4-View Balance\n 5-View Personal Info\n "
					+ "6-View Account\n 7-Exit");
			accountAct=s.nextLine();
			AccountFunctions c=new AccountFunctions();	
			
			switch (accountAct) {
				case "1":
					c.withdraw(uName);
					break;
				case "2":
					c.deposit(uName);
					break;
				case "3":
					c.transfer(uName);
					break;
				case "4":
					c.viewBalance(uName);
					break;
				case "5":
					c.viewPersonalInfo(uName);
					break;
				case "6":
					c.viewAccount(uName);
					break;
				case "7":
					break;
				default:
					throw new Exception ("Sorry that is not a valid choice");
			}	
			}while(!accountAct.equals("7"));
		}else {
			throw new Exception ("Sorry wrong credentials,please try again");
		}	
			
	}
		
	//CUSTOMER REGISTRATION
	public void customerRegister() {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Please Enter your Name: ");
		String userName=s.nextLine();
			
		System.out.println("Please Enter A Password: ");
		String userPassword=s.nextLine();
			
		System.out.println("What type of account do you want to create? Select: Individual OR Joint? ");
		String accntType=s.nextLine();
			
		System.out.println("How much would you like to deposit?: $ ");
		double accntDepo=s.nextDouble();
		s.nextLine();//scanner will bug out if this isn't here.
		AccountFunctions c=new AccountFunctions();
		
		DatabaseBank b=new DatabaseBank();
		b.map(userName,userPassword,accntType,accntDepo);
		
		String accountAct;
		
		do {
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Welcome: " + userName + " Please select a number for one of the following choices: \n"
				+ " 1-Withdraw\n 2-Deposit\n 3-Transer Funds\n 4-View Balance\n 5-View Personal Info\n "
				+ "6-View Account\n 7-Exit");
		accountAct=s.nextLine();
			
		switch (accountAct) {
			case "1":
			try {
				c.withdraw(userName);
			} catch (Exception e) {
					
				e.printStackTrace();
			}
			break;
			case "2":
			try {
				c.deposit(userName);
			} catch (Exception e) {
					
				e.printStackTrace();
			}
				break;
			case "3":
			try {
				c.transfer(userName);
			} catch (Exception e) {
					
				e.printStackTrace();
			}
				break;
			case "4":
				c.viewBalance(userName);
				break;
			case "5":
				c.viewPersonalInfo(userName);
				break;
			case "6":
				c.viewAccount(userName);
				break;
			case "7":
				break;
		}
		}while(!accountAct.equals("7"));		
	}
	
	//EMPLOYEE LOGIN
	public void elogin() throws Exception {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Welcome:Please enter your employee ID");
		String emp=s.nextLine();
		
		System.out.println("What type of customer are you helping?: 1-Existing or 2-New");
		String emp1=s.nextLine();
		
		if(emp1.equals("1")) {
		
		System.out.println("Please enter the name of the customer");
		String customer=s.nextLine();
		
		AccountFunctions c=new AccountFunctions();
		
		String accountAct;
		
		do {
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("What would you like to do?: Please select a number: \n 1-Withdraw\n 2-Deposit\n "
				+ "3-Transer Funds\n 4-View Balance\n 5-View Personal Info\n 6-View Account\n"
				+ " 7-Cancel Account\n 8-Approve Account\n 9-Deny Account\n 10-Exit");
		accountAct=s.nextLine();
		
		switch (accountAct) {
			case "1":
				c.withdraw(customer);
				break;
			case "2":
				c.deposit(customer);
				break;
			case "3":
				c.transfer(customer);
				break;
			case "4":
				c.viewBalance(customer);
				break;
			case "5":
				c.viewPersonalInfo(customer);
				break;
			case "6":
				c.viewAccount(customer);
				break;	
			case "7":
				c.cancelAccount(customer);
				break;
			case "8":
				c.approveAccount(customer);
				break;
			case "9":
				c.denyAccount(customer);
				break;
			case "10":
				break;
			default:
				throw new Exception ("Sorry that is not a valid choice");
		
		}
		
		}while(!accountAct.equals("10"));
		}else {
			ecustomerRegister();
		}
	}
	
	// EMPLOYEE CUSTOMER REGISTRATION
		public void ecustomerRegister() {
			Scanner s=new Scanner(System.in);
			
			System.out.println("Please Enter the Customer's User Name: ");
			String userName=s.nextLine();
				
			System.out.println("Please Enter the Customer's Password: ");
			String userPassword=s.nextLine();
				
			System.out.println("What type of account does the customer want to create? Select: Individual OR Joint? ");
			String accntType=s.nextLine();
				
			System.out.println("How much would they like to deposit?: $ ");
			double accntDepo=s.nextDouble();
			s.nextLine();//scanner will bug out if this isn't here.
			
			AccountFunctions c=new AccountFunctions();
			
			DatabaseBank b=new DatabaseBank();
			b.map(userName,userPassword,accntType,accntDepo);
			
			c.approveAccount(userName);
			String accountAct;
			
			do {
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("What would the Customer like to do?: Please select a number for one of the following choices: \n"
					+ " 1-Withdraw\n 2-Deposit\n 3-Transer Funds\n 4-View Balance\n 5-View Personal Info\n "
					+ "6-View Account\n 7-Exit");
			accountAct=s.nextLine();
				
			switch (accountAct) {
				case "1":
				try {
					c.withdraw(userName);
				} catch (Exception e) {
						
					e.printStackTrace();
				}
				break;
				case "2":
				try {
					c.deposit(userName);
				} catch (Exception e) {
						
					e.printStackTrace();
				}
					break;
				case "3":
				try {
					c.transfer(userName);
				} catch (Exception e) {
						
					e.printStackTrace();
				}
					break;
				case "4":
					c.viewBalance(userName);
					break;
				case "5":
					c.viewPersonalInfo(userName);
					break;
				case "6":
					c.viewAccount(userName);
					break;
				case "7":
					break;
			}
			}while(!accountAct.equals("7"));		
		}
	
}
