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
		//c.viewAccount("bob");
		//c.viewAccount("lyle");
		
		a.initLogIn();
		b.sermap1();
		b.desmap ();
	}
	

	

}
