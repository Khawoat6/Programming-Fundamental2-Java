import java.util.Scanner;

// 1.7 JAVA : Control Structures
// Lab 2.2


public class Lab2lfClass 
{

	public static void main(String[] args) 
	{
		
		Scanner scan_double = new Scanner ( System.in );
		Scanner scan_str = new Scanner ( System.in );
		String str;
		char member;
		double price;
		 
		System.out.print( "Please input your price : " );
		price = scan_double.nextDouble();
		// Please input your price : 250
		// Please input your price : 300
		
		System.out.print( "Are you my member? : " );
		str = scan_str.nextLine();
		member = str.charAt(0);
		
		if( member == 'N' )
		{
			System.out.println( "Your price is " + price + " baht. Thank you." );
			// Are you my member? : N
			// Your price is 250.0 bath. Thank you.
		}
		
		else
		{
			System.out.println( "Your discount is " + (( price * 10 ) / 100 ) + " baht." );
			double x = ( price * 90 / 100 );
			System.out.println( "Your price is " +  x  + ". Thank you." );
			// Are you my member? : Y
			// Your discount is 30.0 baht.
			// Your price is 270.0. Thank you.
		}
		
	}
}
