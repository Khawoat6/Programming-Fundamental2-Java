import java.util.Scanner;

// Lab 2.3

public class Lab3lfClass 
{

	public static void main(String[] args) 
	{
		
		int height;
		System.out.print( "Please input your height : " );
		Scanner scan_int = new Scanner(System.in);
		height = scan_int.nextInt();
	
	
	if ( height <= 90 )
	{
		System.out.println( "Your ticket price is 0 baht." );
		// Please input your height : 89
		// Please input your height : 90
		// Your ticket price is 0 baht.	
	}
	
	else if ( height <= 121  )
	{
		System.out.println( "Your ticket price is 890 baht." );
		// Please input your height : 91
		// Please input your height : 121
		// Your ticket price is 890 baht.
	}
	
	else
	{
		System.out.println( "Your ticket price is 1190 baht." );
		// Please input your height : 122
		// Your ticket price is 1190 baht.
	}
		
	}	
}