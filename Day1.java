import java.util.Scanner;

class Employee
{
	int a;
	int b;

	Scanner sc=new Scanner(System.in);
	
	void accept()
	{
		System.out.println("Enter Value of A= ");
		a=sc.nextInt();
		System.out.println("Enter Value of B= ");
		b=sc.nextInt();

	}
	
	void display()
	{
		System.out.println("Value of A= "+a);
		System.out.println("Value of B= "+b);
	}

}

public class Day1 
{
	
	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.accept();
		e1.display();
	}

}
