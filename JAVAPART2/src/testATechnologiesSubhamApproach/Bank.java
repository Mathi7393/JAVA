package testATechnologiesSubhamApproach;
import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> listAccount;
	
	Bank() {
		this.listAccount = new ArrayList<>();
	}

	public void addAccount(Account account) {
		
		listAccount.add(account);
	}

	public void removeAccount(Account account) {
		listAccount.remove(account);
	}

	public void deposit(Account account, double amount) {
		account.deposit(amount);
	}

	public void withdraw(Account account, double amount) {
		account.withdraw(amount);
	}

	public void printAccountBalance() {
		for(Account account : listAccount) {
			System.out.println("Balance : "+account.getBalance());
		}
	}
}
