package multiThreading;

public class User {

	public static void main(String[] args) {
		DataInConsistancy dc=new DataInConsistancy();
		
		//start the thread
		Read r=new Read(dc);
		Write w=new Write(dc,new StringBuilder("python"));
		
		r.start();
		w.start();
		
		//System.out.println(dc.s);
	}
}
