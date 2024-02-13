package rughma;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionprogr {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		FileInputStream ip=new FileInputStream("/Users/ajayzacharia/Desktop");
		try
		{int c=4/0;
		System.out.println(c);}
		
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

		
		try
		{
			String s=null;
			System.out.println(s.length());
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("done");
	}

}
