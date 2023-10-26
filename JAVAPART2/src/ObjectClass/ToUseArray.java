package ObjectClass;

public class ToUseArray {
	static int[] c;

	public static void main(String[] args) {
		c = new int[5];
		c[0] = 1;
		c[1] = 2;
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

	}

}
