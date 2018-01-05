import java.text.DecimalFormat;
import java.util.Scanner;

// Lab 2.8

public class Lab8CalCircle 
{

	public static double calArea( int radius )
	{
		return ( double )( Math.PI * Math.pow( radius , 2 ) );
	}
	
	public static double calFerence( int radius )
	{
		return ( double )( 2 * Math.PI * radius );
	}
	
	public static void main(String[] args )
	{
		int radius;
		double area, circumFerence;
		Scanner scan = new  Scanner(System.in);
		
		System.out.print( "Enter the circle's radius : " );
		radius = scan.nextInt();
		
		area = calArea( radius );
		circumFerence = calFerence( radius );
		
		DecimalFormat fmt = new DecimalFormat ( "0.###" );
		System.out.println( "The circle's area: " + fmt.format( area ) );
		System.out.println( "The circle's circumference : " + fmt.format( circumFerence ) );
		//Enter the circle's radius : 10
		//The circle's area: 314.159
		//The circle's circumference : 62.832

		
	}

}
