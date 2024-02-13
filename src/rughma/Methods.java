package rughma;

import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		Methods ob=new Methods();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int v1=sc.nextInt();
		int v2=sc.nextInt();
		ob.add();
		int subt=ob.sub();
		System.out.println(subt);
		int mult=ob.mul(v1, v2);
		System.out.println(mult);
		ob.div(v1, v2);
		

	}
	
	
	//method without return type and without para
	
	public void add()
	{
		int a=20;
		int b=10;
		int c;
		c=a+b;
		System.out.println(c);
		
	}
	
	//method with return type and without para
	
	public int sub()
	{
		int a=20;
		int b=10;
		int c;
		c=a-b;
		return c;
		
	}
	
	//method with return type and with para
	
	public int mul(int a, int b)
	
	{
	int c=a*b;	
	return c;
	}
	
	
	//method without return type and with para
	
	public void div(int a, int b)
	{
		double c=a/b;
		System.out.println(c);
	}
		
	}
