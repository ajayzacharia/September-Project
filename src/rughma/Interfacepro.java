package rughma;


interface TVremote
{
public void tv();
}

interface smartTVremote extends TVremote
{
	public void smarttv();
}

class TV implements smartTVremote
{

	@Override
	public void tv() {
		// TODO Auto-generated method stub
		System.out.println("TV");
		
	}

	@Override
	public void smarttv() {
		// TODO Auto-generated method stub
		System.out.println("smarttv");
		
	}
	 
}


public class Interfacepro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV obj=new TV();
		obj.tv();
		obj.smarttv();

	}

}
