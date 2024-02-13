package rughma;

import java.util.Scanner;

public class CountofPosNegZerousingarray {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] numbers=new int[5];
		int p=0;
		int n=0;
		int z=0;
		
		
		 System.out.println("Enter numbers");
		 Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
		 numbers[i]=sc.nextInt();
		}
		
		 for(int i=0;i<5;i++)
		 {
			 if(numbers[i]<0)
			 {
				 n++;
			 }
			 else if(numbers[i]>0)
{
				p++;
			 }
else
{
	z++;
}
			

		 }
		 System.out.println("Neg"+n);
		 System.out.println("Pos"+p);
		 System.out.println("Zero"+z);

	}

}
