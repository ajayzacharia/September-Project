package rughma;
import java.util.Scanner;
interface Bank
{
	public void accointdetails(String name);
	public void balance();
	public void withdraw();
	public void deposit();
}

class SBI implements Bank
{
	static String bankname="SBI";
int balance=10000;
int deposit;
int withdraw;
int accono;

	Scanner sc=new Scanner(System.in);
	@Override
	public void accointdetails(String name) {
		// TODO Auto-generated method stub
		System.out.println("Enter acc number");
		accono=sc.nextInt();
		System.out.println("your accnumbers is "+accono +"your name is"+name+"your bankname" +bankname);
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("Balance is"+balance);
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Enter withdraw amount");
		withdraw=sc.nextInt();
		balance=balance-withdraw;
		System.out.println("balance after withdraw"+balance);
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Enter deposit amount");
		deposit=sc.nextInt();
		balance=balance+deposit;
		System.out.println("balance after deposit"+balance);
		
	}
	
}
public class Bankapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI obj=new SBI();
		obj.accointdetails("Ajay");
		obj.balance();
		obj.withdraw();
		obj.deposit();
		
		

	}

}
