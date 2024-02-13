package rughma;

public class Employee {
	int empid;
	 String empname;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 Employee emp=new Employee(101,"arya");
 emp.display();
 Employee emp1=new Employee(102,"ajay");
 emp1.display();
 
 

 
 
	}
	
	public Employee(int empid, String empname)
	{
		this.empid=empid;
		this.empname=empname;
	}
	
	public void display()
	{
		System.out.println(empid);
		System.out.println(empname);
	}

}
