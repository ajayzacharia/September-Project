package rughma;


class Ajay
{
	public void display()
	{
		System.out.println("display");
	}
}

class Chi extends Ajay
{
	public void show()
	{
		System.out.println("Show");
		}
}
public class SingleLevelInheriit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chi ob=new Chi();
	ob.display();
	ob.show();
	
	Ajay obj=new Ajay();
	obj.display();
	}

}
