package testATechnologiesSubhamApproach;
public class Main {
	public static void main(String[] args) {
		Bank bank=new Bank();
		SavingAccount savingaccount=new SavingAccount(1000.0, 1.25);
		System.out.println("Saving Account:\nInitial Deposit: Rs1000.00\nInterest rate1.25%");
		
		CurrentAccount currentaccount=new CurrentAccount(5000.00, 1000.00);
		System.out.println("Current Account:\nInitial Deposit: Rs5000.00\nOverdraftLimit 1000");
		
		bank.addAccount(savingaccount);
		bank.addAccount(currentaccount);
		
		System.out.println("\nNow deposit 100 to Saving Account");
		bank.deposit(savingaccount, 100.0);
		System.out.println("Now deposit 500 to Current Account");
		bank.deposit(currentaccount, 500.0);
		
		System.out.println("Withdraw 150 from Saving Account");
		bank.withdraw(savingaccount, 150.0);
		
		System.out.println("\nSaving A/c and Current A/c..");
		bank.printAccountBalance();
		
		System.out.println("\nApplying intrest on Saving A/c for 1 years");
		savingaccount.applyInterest();
		
		System.out.println("Saving A/c and Current A/c");
		bank.printAccountBalance();
	}
}
