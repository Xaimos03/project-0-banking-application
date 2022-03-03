package BankingApp1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;

public class OverallLogIn implements java.io.Serializable  {
	
	static Map<String,CustomerAccountActions> map=new HashMap<String,CustomerAccountActions>();

	

	public static void main(String[] args) {
		
		Customer c=new Customer();
		AccountFunctions af=new AccountFunctions();
		Employee ee=new Employee();
		CustomerAccountActions ca=new CustomerAccountActions();
		OverallLogIn ol=new OverallLogIn();
		
		//ADDS INITIAL INFORMATION TO THE MAP SO THE EXISTING CUSTOMER/EMPLOYEE CAN ACCESS
		//CustomerAccountActions b=OverallLogIn.map.get(name);
		af.name="lyle";
		af.password="password";
		af.accountType="Joint";
		af.balance=40000;
		OverallLogIn.map.put("lyle",af);
		
		//System.out.println(map);
		
		
		//SERIALIZE THE CUSTOMER ACCOUNT ACTIONS CLASS
		try {
			FileOutputStream fileOut=new FileOutputStream("./src/customer.ser");
			ObjectOutputStream out=new ObjectOutputStream(fileOut);
			out.writeObject(ca);
			out.close();
			fileOut.close();	
		}catch (IOException ex){
			ex.printStackTrace();
		}
		
		//SERIALIZE THE ACCOUNT FUNCTIONS CLASS
		try {
			FileOutputStream fileOut=new FileOutputStream("./src/customer.ser");
			ObjectOutputStream out=new ObjectOutputStream(fileOut);
			out.writeObject(ol);
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
		}
		
		
		//INITIAL PROMPT INTO BANKING APP:
		Scanner s=new Scanner(System.in);
		
		System.out.println("Welcome to Bank of I NOM NOM YOUR MONEY, please select from the following: 1 = Customer OR 2= Employee ");
		String userType=s.nextLine();
		
		if (userType.equals("1")) {
			//call Customer Class
			c.clogin();
		}else {
			//call Employee Class
			try {
				ee.elogin();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		/*//DESERIALIZATION
		//step2: pulling the bytecode info from the .ser file and be able to use it 
		//AccountFunctions e =null;
		//CustomerAccountActions f=null;
		//OverallLogIn g=null;
		try {
			FileInputStream fileIn=new FileInputStream("./src/customer.ser");
			ObjectInputStream in=new ObjectInputStream(fileIn);
			af=(AccountFunctions) in.readObject();
			//f=(CustomerAccountActions) in.readObject();
			ol=(OverallLogIn) in.readObject();
			//System.out.println("Name "+af.name);
			System.out.println(map);
			//can grab other data from the .ser file with the print statements
			in.close();
			fileIn.close();	
		}catch (IOException ex){
			ex.printStackTrace();
			} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		
	}
		


}
