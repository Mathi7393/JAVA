package testATechnologies;

public class SavingsAccount implements Account  {
	double balance=0.0;
	double interestRate;
	SavingsAccount(double initialDeposit, double interestRate) {
		this.balance=this.balance+initialDeposit;
		this.interestRate=interestRate;
	}
	@Override
	public void deposit(double amount) {
		this.balance=this.balance+amount;
		System.out.println("Rs. "+amount+" is Deposited");
	}
	@Override
	public void withdraw(double amount) {
		this.balance=this.balance-amount;
		System.out.println("Rs. "+amount+" is Withdrawn");
	}
	@Override
	public double getBalance() {
		return balance;
	}
	public void applyInterest() {
		double intrest=balance*(interestRate/100);
		balance=balance+intrest;		
	}
}
