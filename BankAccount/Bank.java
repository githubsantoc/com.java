package second;

public class Bank{
	public static void main(String[] args){
		Account a1 = new Account("Dipak","Banjara","Imadol", 1234, 0);
		System.out.println(a1 + "\n");
		a1.deposit(20);
		a1.withdraw(30);
		System.out.println("After updating the account :\n" + a1);
		}
}
		
		