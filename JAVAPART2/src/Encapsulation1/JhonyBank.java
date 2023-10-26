package Encapsulation1;

public class JhonyBank {
static int CurrentBalance=1000;
	
	public static void greetcustomer() {
		System.out.println("Hello, welcome to hdfc Bank");
	}
	public void deposit(int amount) {
		CurrentBalance = CurrentBalance + amount;
		System.out.println(amount+" is deposited succesfully");
}
	public static void withDrawel(int amount) {
		CurrentBalance = CurrentBalance - amount;
		System.out.println(amount+" is withdraw succesfully");
		
		
	}
	public int getCurrentBalance() {
		return CurrentBalance;
		
	}
	

	public static void main(String[] args) {
		greetcustomer();
		JhonyBank Bank = new JhonyBank();
		System.out.println("current balance is : "+Bank.getCurrentBalance());
		Bank.deposit(500);
		System.out.println("current balance is : "+Bank.getCurrentBalance());
        withDrawel(300);
		System.out.println("current balance is : "+Bank.getCurrentBalance());

	}

}
