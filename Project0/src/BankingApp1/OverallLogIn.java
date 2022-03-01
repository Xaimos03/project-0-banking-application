package BankingApp1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;

public class OverallLogIn {
	
	static Map<String,CustomerAccountActions> map=new HashMap<String,CustomerAccountActions>();
	

	public static void main(String[] args) {
		
		Customer c=new Customer();
		AccountFunctions af=new AccountFunctions();
		Employee ee=new Employee();
		CustomerAccountActions caa=new CustomerAccountActions();
		OverallLogIn ol=new OverallLogIn();
		
		//ADDS INITIAL INFORMATION TO THE MAP SO THE EXISTING CUSTOMER/EMPLOYEE CAN ACCESS
		//CustomerAccountActions b=OverallLogIn.map.get(name);
		//af.name="Lyle";
		af.password="password";
		af.accountType="Joint";
		af.balance=40000;
		OverallLogIn.map.put("lyle",af);
		
		System.out.println(map);
		
		
		//SERIALIZE THE CUSTOMER ACCOUNT ACTIONS CLASS
		/*try {
			FileOutputStream fileOut=new FileOutputStream("./src/customer.ser");
			ObjectOutputStream out=new ObjectOutputStream(fileOut);
			out.writeObject(caa);
			out.close();
			fileOut.close();	
		}catch (IOException ex){
			ex.printStackTrace();
		}
		
		//SERIALIZE THE ACCOUNT FUNCTIONS CLASS
		try {
			FileOutputStream fileOut=new FileOutputStream("./src/customer.ser");
			ObjectOutputStream out=new ObjectOutputStream(fileOut);
			out.writeObject(af);
			out.close();
			fileOut.close();	
		}catch (IOException ex){
			ex.printStackTrace();
		}*/
		

		//INITIAL PROMPT INTO BANKING APP:
		Scanner s=new Scanner(System.in);
		
		System.out.println("Welcome to Bank of I NOM NOM YOUR MONEY, are you a: Customer or Employee? ");
		String userType=s.nextLine();
		
		if (userType.equals("Customer")) {
			//call Customer Class
			c.clogin();
		}else {
			//call Employee Class
			ee.elogin();
		}
			

	}



}
