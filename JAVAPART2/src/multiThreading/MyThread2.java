package multiThreading;

public class MyThread2 extends Thread{
	MyThread2(String name){
		super(name);
	}

	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("my thread2 is executing");
		}
		System.out.println(Thread.currentThread().getName());
	}
	
}
