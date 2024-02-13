package controlstatements;

public class Remployee {
int empid;  // instance variable
String empdesi;
String empname;
static String compname="luminar"; // static variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Remployee obj=new Remployee();
		obj.empid=1;
		obj.empdesi="ajay";
		obj.empname="abel";	
		
		System.out.println(obj.empdesi+ " " +obj.empid+ " " +obj.empname);
		}
	
	public void salaryinfo()
	{
		int basicpay=1200; // local variable
		System.out.println("Salary");
	}

}
