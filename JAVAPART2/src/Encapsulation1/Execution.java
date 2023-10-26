package Encapsulation1;

public class Execution {

	public static void main(String[] args) {
		Parent p= new Child();//Up casting
		Child c=(Child) p;
		System.out.println(p.a);
		System.out.println(p.b);
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
		System.out.println(c.e);
	}

}
