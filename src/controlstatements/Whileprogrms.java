package controlstatements;

public class Whileprogrms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=567;
		int rem;
		int rev=0;
		
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
System.out.println(rev);
	}

}
