package Encapsulation1;

public class UserAccount {

	public static void main(String[] args) {
		Bank B=new Bank();
//		Bank B1= new Bank(10000);
//		name();
		System.out.println(B.getAccNumber());
		System.out.println(B.getBalance());
		B.setBalance(1500000);
		System.out.println(B.getBalance());
	}
//	public static void name() {
//		System.out.println("man");
//	}
//	public static int name(int a) {
//		System.out.println("man");
//		return a;
//	}

}
