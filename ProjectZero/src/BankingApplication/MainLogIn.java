package BankingApplication;


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
		
		

	}

}
