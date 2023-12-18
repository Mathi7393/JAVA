package multiThreading;

public class Read extends Thread{
	
	DataInConsistancy dc;
	Read(DataInConsistancy dc){
		this.dc=dc;
	}
	//Overrride run()
	public void run() {
		dc.read();
	}
	
}
