package calculator;

import java.util.Scanner;


public class calculator {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int s1;
		int s2;
		System.out.print("Enter the number");		
		s1=in.nextInt();
		System.out.print("Enter the number");
		s2=in.nextInt();

		int d3=s1+s2;
		System.out.print(d3);

	}



}
