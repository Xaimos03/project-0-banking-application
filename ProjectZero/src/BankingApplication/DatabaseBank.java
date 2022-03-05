package BankingApplication;

import java.util.HashMap;
import java.util.Map;


public class DatabaseBank {
	public String name;
	public String password;
	public String accountType;
	public double balance;
	public double balance2;
	
	
	static Map<String,DatabaseBank> map=new HashMap<String,DatabaseBank>();
	
	
	
	public void map(String name,String password,String accountType,double balance) {
		DatabaseBank a=new DatabaseBank();
		a.name=name;
		a.password=password;
		a.accountType=accountType;
		a.balance=balance;
		DatabaseBank.map.put(name,a);
	}
	//PRINT MAP
	public void printMap() {
		
		System.out.println(map);
	}
	
//	public void serialize() {
//		
//	}
	
	
	
	

	

}
