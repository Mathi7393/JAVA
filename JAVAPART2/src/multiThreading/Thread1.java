package multiThreading;

public class Thread1 extends Thread{

	Example e;
	Thread1(Example e){
		this.e=e;
	}
	
	public void run() {
		e.m1();
	}
}
