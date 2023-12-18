package multiThreading;

public class User2 {

	public static void main(String[] args) {
		Example e=new Example();
		
		Thread1 t1=new Thread1(e);
		Thread2 t2=new Thread2(e);
		
		t1.setName("dinga");
		t2.setName("dingi");
		
		t1.start();
		t2.start();
	}
}
