package rughma;



class Father
{
	public void job()
	{
		System.out.println("Enginer");
	}
}
	
	class Child extends Father
	{

		@Override
		public void job() {
			System.out.println("HR");
			super.job();
		}
		
	}
public class Overrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child ob=new Child();
		ob.job();
	
	}

}
