package multiThreading;

public class Write extends Thread{

	DataInConsistancy dc;
	StringBuilder s;
	Write(DataInConsistancy dc,StringBuilder s){
		this.dc=dc;
		this.s=s;
	}
	
	public void run() {
		dc.write(s);
	}
}
