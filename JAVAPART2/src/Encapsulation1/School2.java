package Encapsulation1;

public class School2 {
//son2 is studying
	public static void main(String[] args) {
		Son2 s2=new Son2();
		s2.SchoolFees2();
		s2.Salary();
		System.out.println(s2.pension);
//		s2.pension();
//		Father f=new Father();
//		f.Salary();
//		f.SchoolFees();//CTE//child only inheriting parent so with parent reference 
//		we can't access child class
	}

}
