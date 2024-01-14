package second;

public class Account{
	private String firstName;
	private String lastName;
	String address;
	private long accountNumber;
	int balance;
	
	Account(String firstName, String lastName, String address,long accountNumber, int balance){    
		this.firstName = firstName;  
		this.lastName = lastName;
		this.address = address; 
        this.accountNumber = accountNumber;
        this.balance = balance;	
	}  
	
	@Override
	public String toString(){ 
		return "Name = " + firstName +" "+ lastName
		+ "\n Address = "+address
		+"\n Balance = "+ balance;  
	}
	
	public void deposit(int cash){
		this.balance=(balance + cash);
	}
	
	public void withdraw(int cash){
		int x = (balance - cash);
		if(x <= 0){
			System.out.println("Insufficient balance \n");
			return;
		} else{
		this.balance = x; 
		}
	}
}