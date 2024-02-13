package controlstatements;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numer");
		int n=sc.nextInt();
		
		int temp=n;
		int rem;
		int rev=0;
		
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		if(temp==rev)
		{
			System.out.println("pallindrome");
		}else
		{
			System.out.println("not palindrom");
		}

			
		}

	}

