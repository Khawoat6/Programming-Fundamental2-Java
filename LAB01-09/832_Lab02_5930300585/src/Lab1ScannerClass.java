// Lab 2
// 1.6 JAVA : Scanner Class

import java.util.Scanner;

public class Lab1ScannerClass 
{

	public static void main(String[] args) 
	{
		
		/*Scanner scan = new Scanner( System.in );
		System.out.print( "Enter input : " );
		// int input = scan.nextInt();  	// Output : Error
		// String input = scan.nextLine(); 	// Output : Phattaraphon Chomchaiyaphoom
		double input = scan.nextDouble();   // Output : 3.62
		System.out.println( "Output : " + input );*/
		
		
		// Lab 2.1
		
		Scanner scan = new Scanner( System.in );
		System.out.print( "Enter NAME : " );
		String name = scan.nextLine();
		// My Name is Phattaraphon Chomchaiyaphoom
		
		System.out.print( "Enter ID : " );
		long id = scan.nextLong();
		// ID : 5930300585
		
		System.out.print( "Enter Birthday(dd/mm/yyyy) : " );
		scan.nextLine();
		String birthday = scan.nextLine();
		// Birthday : 23/12/39
		
		System.out.print( "Enter Age : " );
		int age = scan.nextInt();
		// Age : 20
		
		System.out.print( "Enter GPA : " );
		double gpa =scan.nextDouble();
		// GPA : 2.5
		
		System.out.println( "My Name is " + name );
		System.out.println( "Birthday : " + birthday + "\tAge : " + age );
		System.out.println( "ID : "+ id + "\tGPA : " + gpa );
			
	}

}






