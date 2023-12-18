package Encapsulation1;

public class Main {

	public static void main(String[] args) {
//		int num=5;
//		for (int i = 1; i <=10; i++) {
//			System.out.printf("%d x %d=%d\n",i,num,i*num);
//		}
//		String str="haiiiii jhjhjk";
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i)==' ') {
//				System.out.println(str.charAt(i-1));
//				
//			}
//		}
		System.out.println(Dosomething("hai how are you??"));
	}
	static String Dosomething(String input){
		StringBuilder output=new StringBuilder();
		char[] charArray=input.toCharArray();
		for (char c : charArray) {
			if (!Character.isWhitespace(c)) {
				output.append(c);
			}
		}
		return output.toString();
		

	}
	

}
