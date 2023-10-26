package Encapsulation1;

public class School {

	public static void main(String[] args) {
		Son1 s1= new Son1();
		s1.SchoolFees();
		s1.Salary();
		s1.pension();
		Son2 s2= new Son2();
		s2.Salary();
		System.out.println("Son2 is studying in "+s2.standard);
		Son3 s3=new Son3();
		s3.Salary();
		System.out.println("son3 is studying"+s3.standard);
//		Father f=new Father();
//		f.Salary();
//		f.SchoolFees();//CTE//child only inheriting parent so with parent reference 
//		we can't access child class
	}

}
