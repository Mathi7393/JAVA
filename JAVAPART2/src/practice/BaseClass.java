package practice;

public class BaseClass {
	private int a;
	private int b;
	public BaseClass(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public int add() {
		return a+b;
	}
	public int sub() {
		return a-b;
	}
	public int mul() {
		return a*b;
	}
	public int div() {
		return a/b;
	}
	public int mod() {
		return a%b;
	}

}
