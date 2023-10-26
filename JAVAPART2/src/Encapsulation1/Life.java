package Encapsulation1;

public class Life {

	public static void main(String[] args) {
		Heart hr=new Heart();
		System.out.println(hr.Pulse);
		hr.health();
//		System.out.println(hr.hu.Name);
//		hr.hu.profession();
		Human hu1= new Human();//late instantiation 
		System.out.println(hu1.Name);
		hu1.profession();

	}

}
