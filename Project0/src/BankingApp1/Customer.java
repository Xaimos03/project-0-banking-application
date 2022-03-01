package BankingApp1;
import java.util.Scanner;

public class Customer extends AccountFunctions{

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
	



}
