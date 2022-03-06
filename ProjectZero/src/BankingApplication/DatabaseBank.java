package BankingApplication;

import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;

public class DatabaseBank implements java.io.Serializable {
	public String name;
	public String password;
	public String accountType;
	public double balance;
	//public double balance2;
	
	
	static Map<String,DatabaseBank> map=new HashMap<String,DatabaseBank>();
	
	
	
	public void map(String name,String password,String accountType,double balance) {
		DatabaseBank a=new DatabaseBank();
		a.name=name;
		a.password=password;
		a.accountType=accountType;
		a.balance=balance;
		DatabaseBank.map.put(name,a);	
	}
	
	public String toString() {
		return this.name + this.password +this.accountType +this.balance;
	}
	
	
	
	//PRINT MAP
	public void printMap() {
		//DatabaseBank a=new DatabaseBank();
		//System.out.println(map.get(a.name)+":"+map.get(a.password)+":"+map.get(a.accountType)+":"+map.get(a.accountType)+":"+map.get(a.balance));
		//System.out.println(map.getKey(a.name)+":"+map.get(a.password));
		System.out.println(DatabaseBank.map.toString());
		//toString();
	}
	

	
	
	
	

	

}
