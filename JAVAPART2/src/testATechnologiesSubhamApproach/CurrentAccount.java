package testATechnologiesSubhamApproach;
public class CurrentAccount implements Account {
	double balance;
	double overdraftLimit;
	CurrentAccount(){}
	CurrentAccount(double initialDeposit, double overdraftLimit) {
		this.overdraftLimit=overdraftLimit;
		this.balance=balance+initialDeposit;
	}
	@Override
	public void deposit(double amt) {
		System.out.println("Amount is Deposit : "+amt);
		this.balance+=amt;
	}
	@Override
	public void withdraw(double amt){
		if(balance+overdraftLimit>=amt) {
			System.out.println("Amount is Withdraw : "+amt);
			this.balance-=amt;
		}
		
		else {
            System.out.println("Insufficient funds!");
        }
		
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit=overdraftLimit;
	}

	@Override
	public double getBalance() {
		return balance;
	}
}
