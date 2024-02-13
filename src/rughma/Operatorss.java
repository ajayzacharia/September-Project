package rughma;

public class Operatorss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arthrimetic
		
		int a=20,b=10;
		System.out.println("a+b="+(a+b));
		System.out.println(a/b); //quotient
		System.out.println(a%b); //reminder

		//assignment
	
		System.out.println(a);
		System.out.println(a+=b); //a=a+b;
		System.out.println(a);
		int c=a;
		System.out.println(c);
		
		//relational
		System.out.println(a==b);
		System.out.println(a!=b);
		
		//logical(&&,||,!)
		/*
		A     B    A&&B    A||B    !A   !B
	    0	  0     0		0		1	1	
	    1	  0		0		1       0	1
	    
	    0	  1		0		1		1	0
	    1	  1		1		1		0	0
	    */
		String username="ajay";
		String password="abel";
		
		System.out.println(username=="ajay"&&password=="abel");
		System.out.println(!(username=="ajay"));	
		
		//unary operators 
		
		int d=10;
		//d++;  //post increment
		//++d;   //pre increment
		
		System.out.println(d++); //10
		System.out.println(d);
		System.out.println(++d);
		
		//ternary operator
		
		int e=10,f=4;
		String v=e>f?"e is greater":"f is greater";
		
		}

}
