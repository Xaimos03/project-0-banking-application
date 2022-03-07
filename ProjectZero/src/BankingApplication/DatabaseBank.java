package BankingApplication;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DatabaseBank implements java.io.Serializable {
	public String name;
	public String password;
	public String accountType;
	public double balance;
	//public double balance2;
	
	
	static Map<String,DatabaseBank> map=new HashMap<String,DatabaseBank>();
	//static Map<String,DatabaseBank> map2=new HashMap<String,DatabaseBank>();
	
	//Existing Customer Map
	public void map(String name,String password,String accountType,double balance) {
		
		DatabaseBank a=new DatabaseBank();
		a.name=name;
		a.password=password;
		a.accountType=accountType;
		a.balance=balance;
		DatabaseBank.map.put(name,a);
		
	}
	
	//Existing Customer Map
	public void map2(String name,String password,String accountType,double balance) {
			
		DatabaseBank a=new DatabaseBank();
		a.name=name;
		a.password=password;
		a.accountType=accountType;
		a.balance=balance;
		DatabaseBank.map.put(name,a);
			
	}
	
	//PUT INFO IN MAP-Serializations
	public void sermap(String name) {

		DatabaseBank a=DatabaseBank.map.get(name);
		
		//SERIALIZE
		try {
			FileOutputStream fileOut=new FileOutputStream("./src/customer.ser");
			ObjectOutputStream out=new ObjectOutputStream(fileOut);
			out.writeObject(a);
			//out.writeObject(c);
			out.close();
			fileOut.close();
			//System.out.println("Data Saved to file");
		}catch (IOException ex){
			ex.printStackTrace();
		}	
	}
	
	//PUT INFO IN MAP AT END-Serializations 
		public void sermap1() {

			DatabaseBank a=DatabaseBank.map.get(name);
			
			//SERIALIZE
			try {
				FileOutputStream fileOut=new FileOutputStream("./src/customer.ser");
				ObjectOutputStream out=new ObjectOutputStream(fileOut);
				out.writeObject(a);
				//out.writeObject(c);
				out.close();
				fileOut.close();
				//System.out.println("Data Saved to file");
			}catch (IOException ex){
				ex.printStackTrace();
			}	
		}
	
	
	
	//GET INFO FROM MAP-Deserialize
	public void desmap () {
		DatabaseBank e =null;
		try {
			FileInputStream fileIn=new FileInputStream("./src/customer.ser");
			ObjectInputStream in=new ObjectInputStream(fileIn);
			e=(DatabaseBank) in.readObject();
			System.out.println("Name "+e.name);
			System.out.println("Password "+e.password);
			System.out.println("Account Type "+e.accountType);
			System.out.println("Balance "+e.balance);
			in.close();
			fileIn.close();	
		}catch (IOException ex){
			ex.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	
	//PRINT MAP
	public void printMap() {

		//username=((Customer)m.getValue()).getUserName();
		
		//for(Map.Entry name:DatabaseBank.map.entrySet()) {
			//(map) a.getValue()).printCustomer();
			//System.out.println(map.Keyset()+name.getValue());
		//}
		
		//WORKS BUT NOT REALLY
//		for(Map.Entry<String, DatabaseBank> set:map.entrySet()) {
//			System.out.println(set.getKey()+":"+set.getValue().toString());
//		}
		
		//WORKS BUT NOT REALLY
		Iterator<Entry<String,DatabaseBank>> new_Iterator=map.entrySet().iterator();
		while (new_Iterator.hasNext()) {
			Map.Entry<String, DatabaseBank> new_Map=(Map.Entry<String, DatabaseBank>)new_Iterator.next();
			System.out.println(new_Map.getKey()+":"+new_Map.getValue().toString());
		}
		
//		for(DatabaseBank i:map.values()) {
//			System.out.println(map.get(i));
//		}
		
		
		//System.out.println(DatabaseBank.map.toString());	
	}
	
	
	
	

	

}
