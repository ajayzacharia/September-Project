package rughma;

import java.util.Scanner;

public class VowelCountMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		VowelCountMethod ob=new VowelCountMethod();
		System.out.println("Enter the sting");
		String s=sc.nextLine();
		s=s.toLowerCase();
		
		System.out.println(ob.check(s));

	}
	
	public int check(String st)
	{
	int count=0;
	for(int i=0;i<st.length();i++)
	{
		if(st.charAt(i)=='i'||st.charAt(i)=='e'||st.charAt(i)=='o'||st.charAt(i)=='a'||st.charAt(i)=='u')
{
	count++;
}
	}
		return count;
		
	}
	
	

}
