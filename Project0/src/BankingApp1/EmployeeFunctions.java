package BankingApp1;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;



public class EmployeeFunctions  {
	
	public static void main(String[] args) {
			
			
		//step2: pulling the bytecode info from the .ser file and be able to use it 
	/*	AccountFunctions e =null;
			try {
				FileInputStream fileIn=new FileInputStream("./src/customer.ser");
				ObjectInputStream in=new ObjectInputStream(fileIn);
				e=(AccountFunctions) in.readObject();
				System.out.println("Name "+e.name);
				System.out.println("Address "+e.password);
				//can grab other data from the .ser file with the print statements
				in.close();
				fileIn.close();	
			}catch (IOException ex){
				ex.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	
		}*/
	}
}
