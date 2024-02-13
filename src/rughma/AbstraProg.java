package rughma;


abstract class Car
{
	abstract public void acce();
	
	public void carenginer()
	{
		System.out.println("Carenginer");
	}
}

class Kia extends Car
{

	@Override
	public void acce() {
		System.out.println("Kia");
		
	}
	
}

class Bmw extends Car
{

	@Override
	public void acce() {
		// TODO Auto-generated method stub
		System.out.println("Bmw");
		
	}
	
}

public class AbstraProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kia ob=new Kia();
		ob.acce();
		ob.carenginer();
		Bmw obj=new Bmw();
		obj.acce();
		obj.carenginer();
	}

}
