package controlstatements;

import java.util.Scanner;

public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a[]=new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;*/
		
		int a[]=new int[3];
		System.out.println("Enter numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println(a[i]);
		 }

	}

}
