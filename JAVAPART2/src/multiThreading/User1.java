package multiThreading;

public class User1 {

	public static void main(String[] args) {
		MyThread t1=new MyThread();
		MyThread2 t2=new MyThread2("gaurav");
		t1.setName("Mathi");
	//	t2.setName("Gaurav");
		t2.start();
		t1.start();
		t1.setPriority(8);
		t2.setPriority(3);
		System.out.println(t1.getId());
		System.out.println(t2.getId());
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(Thread.currentThread().getName());
	}
}
