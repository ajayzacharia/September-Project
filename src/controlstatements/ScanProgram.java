package controlstatements;

import java.util.Scanner;

public class ScanProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		
		

		String s1=sc.nextLine();
		char a=s1.charAt(1);
		

		System.out.println(s1);
		System.out.println(a);
		
		System.out.println("Enter a char");
		char b=sc.next().charAt(0);
		System.out.println(b);
		

	}

}
