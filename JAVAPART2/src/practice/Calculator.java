package practice;

import java.util.Scanner;

public class Calculator {
static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the 1st number:");
		int n1=s.nextInt();
		System.out.println("enter the 2nd number:");
		int n2=s.nextInt();
		
		BaseClass b=new BaseClass(n1, n2);
		System.out.println("Select the Operation:\n1.+ \n2.- \n3.* \n4./");
		char c=s.next().charAt(0);
		
		
		switch (c) {
		case '+':
			System.out.println(b.add());
			break;
		
		case '-':
			System.out.println(b.sub());
			break;
			
		case '*':
			System.out.println(b.mul());
			break;
			
		case '/':
			System.out.println("quotient"+b.div());
			System.out.println("reminder"+b.mod());
			break;
			
		default:
			System.out.println("Invalid Operator");
			break;
		}
	}

}
