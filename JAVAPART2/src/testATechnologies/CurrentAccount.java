package testATechnologies;

public class CurrentAccount implements Account {
	double balance = 0.0;
	double overdraftLimit;

	CurrentAccount(double initialDeposit, double overdraftLimit) {
		this.balance = this.balance + initialDeposit;
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void deposit(double amount) {
		this.balance = this.balance + amount;
		System.out.println("Rs. "+amount+" is Deposited");
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void withdraw(double amount) {
		if (this.balance + overdraftLimit >= amount) {
			this.balance = this.balance - amount;
			System.out.println("Rs. "+amount+" is Withdrawn");
		} else {
			System.out.println("Insufficient funds!");
		}
	}
	@Override
	public double getBalance() {

		return balance;
	}
}
