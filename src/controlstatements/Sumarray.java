package controlstatements;

import java.util.Scanner;

public class Sumarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter arrray size");
		int arraysize=sc.nextInt();
		
		int[] a=new int[arraysize];
		System.out.println("Enter numbers");
		
		int sum=0;
		
		for(int i=0;i<arraysize;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		
System.out.println("sum ="+sum);
System.out.println("avg="+sum/arraysize);
	}

}
