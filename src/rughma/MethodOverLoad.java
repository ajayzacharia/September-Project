package rughma;

public class MethodOverLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoad obj=new MethodOverLoad();
		obj.add();
		obj.add(1,2.5);
		obj.add(1,2);
		obj.add(1.7, 2, 4);

	}

	public void add()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
		
	}
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
		
	}
	public void add(double a, int b, int c)
	{
		double d=a+b+c;
		System.out.println(d);
	}
public void add(int a, double b)
{
	double c=a+b;
	System.out.println(c);
}
	
	
}
