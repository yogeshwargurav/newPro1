import java.util.Scanner;

//Q 2 using ternary check if number eneterd by user is positive or negative .
//In case number is positive store "Positive number" else store negative number to Result variable




public class Q2 {
	

	public static void main(String[] args) 
	
	{
		int number;
		String result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No= ");
		number=sc.nextInt();
		
		result= number>0?"Positive Number":"Negative Number";
		System.out.println("Result= "+result);
		
		

	}

}
