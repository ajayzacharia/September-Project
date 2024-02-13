package rughma;

class Animal2{
	public void animalMethod()
	{
		System.out.println("Animal");
	}
	
}

class Dog3 extends Animal2
{
	public void dogMethod()
	{
		System.out.println("Dog");
	}
}

class Tiger extends Animal2
{
	public void tiger()
	
{
	System.out.println("Tiger");
}
}
public class HeirechalInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger ob=new Tiger();
		ob.tiger();
		
		Dog ob1=new Dog();
		ob1.dogMethod();
		ob.animalMethod();
		ob1.animalMethod();

	}

}
