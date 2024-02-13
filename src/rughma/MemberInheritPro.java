package rughma;

class Member{
	String name;
	int age;
	int phoneno;
	String address;
	
	public void printDetails()
	{
		System.out.println("name is "+name+"age is "+age+"phone is "+phoneno+"address is "+address);
		
	}
}

class Employee6 extends Member
{
	String dataMemberspec;
	
}

class Manager extends Member
{
	String department;
}
public class MemberInheritPro {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee6 emp=new Employee6();
		emp.name="Ajay";
		emp.age=21;
		emp.phoneno=12312312;
		emp.address="123 north ring road";
		emp.printDetails();
		emp.dataMemberspec="Engineer";
		System.out.println(emp.dataMemberspec);
		
		Manager man=new Manager();
		man.name="rock";
		man.age=18;
		man.phoneno=1132312;
		man.address="233 north ring road";
		man.printDetails();
		man.department="HR";
		System.out.println(man.department);

	}

}
