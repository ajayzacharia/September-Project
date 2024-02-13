package stringpackage;

import java.util.Scanner;

public class Stringpalindrome {

	public static void main(String[] args) {
		
		String s1="hai";
		System.out.println(s1.charAt(1));
		// TODO Auto-generated method stub
		System.out.println("Enter string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
		if(rev.equalsIgnoreCase(s))
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("not pallindrome");
		}

	}

}
