import java.util.Scanner;
													//Name= Yogeshwar Gurav
													//Div- B



//Q WAP to demonstrate ternary operator .define a variable marks  .
//ask its value from user and using ternary operator check if marks > 40 store "Pass" in result varible else store "Fail"


class Student
{
	int marks;
	String result;
	Scanner sc=new Scanner (System.in);
	
	
	void inmarks()
	{
		System.out.println("Enter Marks= ");
		marks=sc.nextInt();
	}
	
	void dispmarks()
	{
		result = marks>40 ? "Pass": "Fail";
		System.out.println("Result= "+result);
	}
}
public class Q1 {

	public static void main(String[] args) 
	{
		
		Student s1=new Student();
		s1.inmarks();
		s1.dispmarks();
	}

}
