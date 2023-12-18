package multiThreading;

public class Thread2 extends Thread{

	Example e;
	Thread2(Example e){
		this.e=e;
	}
	
	public void run() {
		e.m2();
	}
}
