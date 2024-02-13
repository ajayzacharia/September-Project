package stringpackage;

public class Stringops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//concate
		
		String s="Hello";
		String s1="  Welcome   ";
		String s3="Hello Welcome";
		System.out.println(s+s1);
		System.out.println(2+3+s+5+6);
		
		//equals 
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		
		//contaiins
		System.out.println(s3.contains("Welcome"));
		
		//toupper case and to lower case
		System.out.println(s.toUpperCase());
		System.out.println(s3.toLowerCase());
		
		//length
		System.out.println(s.length());
		
		//starts with and endswith
		System.out.println(s3.startsWith("Hello"));
		System.out.println(s3.endsWith("welcome"));
		
		//trim white space in front and end are removed
		System.out.println(s1.trim());
		
		//replace
		System.out.println(s3.replace("Hello", "Hi"));
	
		//substring
		System.out.println(s.substring(1));
		System.out.println(s.substring(0, 2));
		System.out.println(s.substring(1,3));
		
		//split
		String s4="hello welcome to luminar technolab";
		String [] st=s4.split(" ");
		for(String e:st)
		{
		System.out.println(e);
	}
		
		//tochararray
		
		String s5="hello";
		char[] a=s5.toCharArray();
		for(char e:a)
		{
			System.out.println(e);
		}

}
}
