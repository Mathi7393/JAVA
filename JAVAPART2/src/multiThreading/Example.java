package multiThreading;

public class Example {

	synchronized public void m1() {
		System.out.println("m1 starts");
		System.out.println("m1 got the lock");
		System.out.println("m1 is executing by "+Thread.currentThread().getName());
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("m1 released the lock");
		System.out.println("m1 ends");
	}
	
	synchronized public void m2() {
		System.out.println("m2 starts");
		System.out.println("m2 got the lock");
		System.out.println("m2 is executing by "+Thread.currentThread().getName());
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("m2 release the lock");
		System.out.println("m2 ends");
	}
}
