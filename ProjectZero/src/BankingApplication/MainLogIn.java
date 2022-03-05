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
		
		//c.viewAccount("bob");
		//c.viewAccount("lyle");
		
		a.initLogIn();	
		
		try {
			writeToFile(b);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
//		try {
//			readFile();
//		} catch (ClassNotFoundException | IOException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}

	}
	
	public static void writeToFile(DatabaseBank map) throws FileNotFoundException, IOException {
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("./src/bankcustomer.ser"));
		out.writeObject(map);
		out.close();	
	}
	public static void readFile() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("./src/serialization.ser"));
		DatabaseBank info=(DatabaseBank) in.readObject();
		System.out.println(info);
	}

}
