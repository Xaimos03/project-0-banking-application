package BankingApplication;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;



public class PullingData {

	public static void main(String[] args) {
		//step2: pulling the bytecode info from the .ser file and be able to use it 
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
//
	}

}
