package multiThreading;

public class Consumer extends Thread{

	CF c;
	Consumer(CF c){
		super("consumer");
		this.c=c;
	}
	
	public void run(){
		for(int i=1;i<=5;i++) {
			c.consumer();
		}
	}
}
