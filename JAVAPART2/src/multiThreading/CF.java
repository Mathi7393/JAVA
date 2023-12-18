package multiThreading;

public class CF {

	int cb=0;
	
	synchronized public void producer() {
		if(cb==5) {
			try {
				wait();
				producer();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		else {
			for(int i=1;i<=5;i++) {
				cb++;
				System.out.println(i+"chocolate added");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			notify();
			
		}
	}
	
	synchronized public void consumer() {
		if(cb==0) {
			try {
				wait();
				consumer();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		else {
			for(int i=1;i<=5;i++) {
				cb--;
				System.out.println(i+"chocolate ate");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			notify();
			
		}
	}
}
