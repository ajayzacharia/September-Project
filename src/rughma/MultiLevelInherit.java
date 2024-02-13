package rughma;

class Animal{
	public void animalMethod()
	{
		System.out.println("Animal");
	}
	
}

class Dog extends Animal
{
	public void dogMethod()
	{
		System.out.println("Dog");
	}
}

class BabyDog extends Dog
{
	public void babyDogMethod()
	
{
	System.out.println("BabyDog");
}

public class MultiLevelInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BabyDog ob=new BabyDog();
ob.animalMethod();
ob.dogMethod();
ob.animalMethod();
	}

}
}
