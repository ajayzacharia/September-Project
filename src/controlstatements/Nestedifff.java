package controlstatements;

public class Nestedifff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=55;

if(a%5==0)
{
	if(a%11==0)
	{
		System.out.println("Div by 5 and 11");
	}
	else
	{
		System.out.println("Div by 5 not by 11");
	}
}
else
{
	System.out.println("not div by 5 and 11");
}
	}

}
