package rughma;

import java.util.Scanner;

public class AreaUsingMethods {

	public static void main(String[] args) {
		System.out.println("Enter 1 numbers");
		Scanner sc=new Scanner(System.in);
		int v1=sc.nextInt();
		
		AreaUsingMethods ob=new AreaUsingMethods();
	ob.trai();
	double areaofcirc=ob.cir();	System.out.println(areaofcirc);
	ob.squ(v1);
	System.out.println("Enter second  number");
	int v2=sc.nextInt();
	double areaofrect=ob.recet(v1, v2);
	System.out.println(areaofrect);
	

	}
	
	//area of triangle
	
	public void trai()
	{
		int b=10;
		int h=20;
		double areaoftrai=0.5*b*h;
		System.out.println(areaoftrai);
	}
	
	public double cir()
	{
		int r=10;
		double areaofcir=3.14*r*r;
		return areaofcir;
	}

	public void squ(int a)
	{
		int c=a*a;
		System.out.println(c);
	}
	
	public int recet(int a, int b)
	{
		int c=a*b;
		return c;
	}
}
