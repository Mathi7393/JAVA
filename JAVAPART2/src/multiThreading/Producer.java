package multiThreading;

public class Producer extends Thread{

	CF c;
	Producer(CF c){
		super("producer");
		this.c=c;
	}
	
	public void run() {
		for(int i=1;i<=5;i++) {
			c.producer();
		}
	}
}
