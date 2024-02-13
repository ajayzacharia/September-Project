package controlstatements;

import java.util.Scanner;

public class Stringaray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] a=new String[4][2];
		System.out.println("Enter username and passowrd");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.next();
			
			}
			
		}
		System.out.println("Entered username and passwird");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<2;j++)
			{
			System.out.print(a[i][j]+ " ");			
			}
			System.out.println();
		}
		

	}

}
