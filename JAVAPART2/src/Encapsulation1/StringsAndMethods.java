package Encapsulation1;

public class StringsAndMethods {

	public static void main(String[] args) {
		String s=new String("hai");
		String s1="helLO";
		System.out.println(s);
		System.out.println(s1);
		char[] c= {'a','b'};
		String s2=new String(c);
		String s5="HELlo";
		String s4=new String("helLO");
		System.out.println(s2 );
		byte[] b= {65,66,67,68,69,70,71,72};
		String s3=new String(b);
		System.out.println(s3);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.concat(s));
		System.out.println(s1.trim().concat(s));
		System.out.println(s1.length());
		System.out.println(s1.charAt(s1.length()-2));
		System.out.println(s1.indexOf('c'));
		System.out.println(s1.equals(s4));
		System.out.println(s1==s4);
		System.out.println(s1.equals(s5));
		System.out.println(s1.equalsIgnoreCase(s5));
		System.out.println(s5);
		System.out.println(s5.contains("Ll"));
		String s9="hai good morning";
		char[] s10=s9.toCharArray();
		String[] str1=s9.split(" ");
		System.out.print("{");
		for (int i = 0; i < str1.length; i++) {
			System.out.print(str1[i]+" ");
			if (i<str1.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("}");
		System.out.print("{");
		for (int i = 0; i < s10.length; i++) {
			System.out.print(s10[i]+" ");
			if (i<s10.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("}");
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2, 4));
		String str2="malayalam";
		String str3="";
		System.out.println(str2.indexOf('a'));
		System.out.println(str2.indexOf('a', 5));
		System.out.println(str2.indexOf("la"));
		System.out.println(str2.indexOf("la", 3));
		System.out.println(str2.lastIndexOf('a'));
		System.out.println(str2.lastIndexOf("la"));
		System.out.println(str2.isEmpty());
		System.out.println(str3.isEmpty());
		byte[] str4=str2.getBytes();
		System.out.print("{");
		for (int i = 0; i < str4.length; i++) {
			System.out.print(str4[i]+" ");
			if (i<str4.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("}");
		System.out.println(s1.compareTo(s5));
		System.out.println(s1.compareToIgnoreCase(s5));
	}

}
