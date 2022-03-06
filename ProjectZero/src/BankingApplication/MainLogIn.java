package BankingApplication;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class MainLogIn {
	
	
	
	public static void main(String[] args) {
		Users a=new Users();
		DatabaseBank b=new DatabaseBank();
		AccountFunctions c=new AccountFunctions();	
		
		b.map("bob","how","Individual",500);
		b.map("lyle","password","Joint",1500);
		//b.printMap();
		
		
		try {
			FileOutputStream fileOut=new FileOutputStream("./src/customer.ser");
			ObjectOutputStream out=new ObjectOutputStream(fileOut);
			out.writeObject(b);
			//out.writeObject(c);
			out.close();
			fileOut.close();
			//System.out.println("Data Saved to file");
		}catch (IOException ex){
			ex.printStackTrace();
		}
		
		
//		DatabaseBank e =null;
//		try {
//			FileInputStream fileIn=new FileInputStream("./src/customer.ser");
//			ObjectInputStream in=new ObjectInputStream(fileIn);
//			e=(DatabaseBank) in.readObject();
//			System.out.println("Name "+e.name);
//			System.out.println("Password "+e.password);
//			System.out.println("Account Type "+e.accountType);
//			System.out.println("Balance "+e.balance);
//			in.close();
//			fileIn.close();	
//		}catch (IOException ex){
//			ex.printStackTrace();
//		} catch (ClassNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		
		//c.viewAccount("bob");
		//c.viewAccount("lyle");
		
		a.initLogIn();
		

	}
	
//	public static void serialize (DatabaseBank b) {
//		try {
//			//DatabaseBank b=new DatabaseBank();
//			FileOutputStream fileOut=new FileOutputStream("./src/customer.ser");
//			ObjectOutputStream out=new ObjectOutputStream(fileOut);
//			out.writeObject(b);
//			//out.writeObject(c);
//			out.close();
//			fileOut.close();
//			//System.out.println("Data Saved to file");
//		}catch (IOException ex){
//			ex.printStackTrace();
//		}	
//	}
	

}
