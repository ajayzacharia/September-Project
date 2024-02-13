package rughma;


interface Cardetaails
{
	public void enginespeed();
	void speedlimit();
	
}

interface I2{
	
}

class Ford implements Cardetaails, I2
{

	@Override
	public void enginespeed() {
		// TODO Auto-generated method stub
		System.out.println("eningespeed");
		
	}

	@Override
	public void speedlimit() {
		// TODO Auto-generated method stub
		System.out.println("speedlimit");
		
	}
	
}
public class InterfProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ford obj=new Ford();
		obj.speedlimit();
		obj.enginespeed();

	}

}
