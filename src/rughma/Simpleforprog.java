package rughma;

public class Simpleforprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0;i<=10;i++)
{
	System.out.println(i);
}

for(int j=1;j<=10;j++)
{
	int f=j*5;
	System.out.println(j+"*5="+f);
}
	

for(int i=1;i<=3;i++)
{
	for(int j=1;j<=3;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}

for(int i=1;i<=4;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
 int n=1;
for(int i=1;i<=10;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(n+ " ");
		n++;
	}
	System.out.println();
}
int fact=1;
for(int i=1;i<=5;i++)
{
	
	fact=fact*i;
	System.out.println(fact);
	
}
System.out.println(fact);

}
}
