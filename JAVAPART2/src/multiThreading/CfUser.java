package multiThreading;

public class CfUser {

	public static void main(String[] args) {
		CF c=new CF();
		
		Producer p=new Producer(c);
		Consumer con=new Consumer(c);
		
		p.start();
		con.start();
	}
}
