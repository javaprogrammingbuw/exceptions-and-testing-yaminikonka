import java.util.Random;

public class BankAccount{
	private final String bic="ABCDDEFFXXX";
	private String IBAN="DE00123456780000000000";
	private int securityNumber;
	private double limit;
	private double balance;
	private Person owner;
	public BankAccount(Person owner, double balance, double limit){
		this.owner=owner;
		this.balance=balance;
		this.limit=limit;
		String s="";
		for(int i=0;i<6;i++){
		    s+=new Random().nextInt(10);
	    }
	    this.securityNumber=Integer.parseInt(s);
	    String d="";
	    String s1= IBAN.substring(0,12);

		for(int j=0;j<10;j++){
			// String s+=IBAN.charAt(i);
			// String s2=IBAN.substring(15, IBAN.length());
			 d+= new Random().nextInt(10);
		}
            this.IBAN=s1+d;
		// this.IBAN=IBAN.replace("0","")
		
	}
	public BankAccount(Person owner, double balance){
		this.owner=owner;
		this.balance=balance;
		this.limit=0.0;
		String s="";
		for(int i=0;i<6;i++){
		    s+=new Random().nextInt(10);
	    }
	    this.securityNumber=Integer.parseInt(s);
	    String d="";
	    String s1= IBAN.substring(0,12);
		for(int j=0;j<10;j++){
			d+= new Random().nextInt(10);
		}
            this.IBAN=s1+d;

	}
	public String getIBAN(){
		return this.IBAN;
	}
	public Person getOwner(){
		return this.owner;
	}
	public double getLimit(){
		return this.limit;
	}
	public double getBalance(){
		return this.balance;
	}
	public int getSecurityNumber(){
		return this.securityNumber;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double deposit(double amount, int securityNumber){
		if(securityNumber==this.securityNumber){
			return balance+=amount;
		}else{
			return balance;
		}
	}
	public double withdraw(double amount, int securityNumber){
         if(securityNumber==this.securityNumber&&amount<balance+limit){
               return balance-=amount;
         }else{
         	return balance;
         }
	}
	public void transfer(BankAccount remote, double amount, int securityNumber){
		 if(securityNumber==this.securityNumber&&amount<balance+limit){
		 	remote.setBalance(remote.getBalance()+amount);
		 	setBalance(balance-amount);
		 }else{
             System.out.println("your limit and securitynumber have some problems, check");
		 }
	}
	public void print(){
		System.out.println(this.IBAN+" and "+this.securityNumber);
	}
}