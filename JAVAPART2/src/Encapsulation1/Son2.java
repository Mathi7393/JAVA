package Encapsulation1;
//
public class Son2 extends Father{
	String standard="ukg";
	static int age=4;
	public void SchoolFees2() {
		System.out.println("School fees is 3000");
	}
	public static void main(String[] args) {
		System.out.println(age);
		System.out.println(fathersage);
		Son2 s2=new Son2();
		System.out.println(s2.pension);
		s2.pension();
		System.out.println(s2.work);
		s2.Salary();
		System.out.println(s2.standard);
		s2.SchoolFees2();
	}
}
