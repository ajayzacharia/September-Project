package rughma;



class Employese
{
	private String empname;
	private String empdesi;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdesi() {
		return empdesi;
	}
	public void setEmpdesi(String empdesi) {
		this.empdesi = empdesi;
	}
	
}
public class Encapprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employese obj=new Employese();
		obj.setEmpname("Ajay");
		obj.setEmpdesi("Tester");
		System.out.println(obj.getEmpname());
		System.out.println(obj.getEmpdesi());

	}

}
