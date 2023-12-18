package multiThreading;

public class DataInConsistancy {
	StringBuilder s = new StringBuilder("java");

	synchronized public void read() {
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	synchronized public void write(StringBuilder s) {
		this.s = s;
	}
}
