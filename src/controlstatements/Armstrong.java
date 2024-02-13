package controlstatements;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=153;
		int temp=n;
	int r,s=0;
		
		while(n>0)
		{
			r=n%10;
			s=s+r*r*r;
			n=n/10;
			
		}
		if(temp==s)
		{
			System.out.println("arms");
		}else
		{
			System.out.println("not arms");
		}

	}

}
