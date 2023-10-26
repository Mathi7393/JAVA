package Encapsulation1;

public class AbstractionUser {

	public static void main(String[] args) {
		Abstraction2 ref= new Abstraction2();
		ref.name();
		ref.name2();
		Abstraction1 ref1= new Abstraction2();
//		Abstraction1 ref1=ref;
//		Abstraction1 ref1= new Abstraction1();
		ref1.name();
		ref1.name2();
		System.out.println(ref);

	}

}
