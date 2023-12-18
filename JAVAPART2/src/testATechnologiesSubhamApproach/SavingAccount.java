package testATechnologiesSubhamApproach;
public class SavingAccount implements Account{
	double balance;
	double interestRate;
	SavingAccount(){}
	public SavingAccount(double initialDeposit, double interestRate) {
		this.interestRate=interestRate;
		this.balance=balance+initialDeposit;
		
	}
	@Override
	public void deposit(double amt) {
		System.out.println("Amount is Deposit : "+amt);
		this.balance+=amt;
	}
	@Override
	public void withdraw(double amt) {
		System.out.println("Amount is Withdraw : "+amt);
		this.balance-=amt;
	}
	
	public void applyInterest() {
		double intrest=balance*(interestRate/100);
		balance+=intrest;
	}
	@Override
	public double getBalance() {
		
		return balance;
	}
}
