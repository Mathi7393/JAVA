package Encapsulation1;

public class Bank {
	private int Balance=10000;
	private int AccNumber=25256644;
	Bank(int balance) {
		this.Balance = balance;
	}
	Bank(){

	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		this.Balance = balance;
	}
	public int getAccNumber() {
		return AccNumber;
	}
//	public void setAccNumber(int accNumber) {
//		this.AccNumber = accNumber;
//	}
	
	
	
}
