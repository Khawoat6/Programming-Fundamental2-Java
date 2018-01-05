// 1.8 JAVA : Basic Method and Argument
// Lab 2.7

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab7SimpleMethod 
{

	public static void main(String[] args) 
	{
		
		int radius;
		double area , circumference;
		Scanner scan = new Scanner(System.in);
		
		System.out.print( "Enter the circle's radius : " );
		radius = scan.nextInt();
		
		area = Math.PI * Math.pow( radius, 2 );
		circumference = 2 * Math.PI * radius;
		
		DecimalFormat fmt = new DecimalFormat ( "0.###" );
		System.out.println( "The circle's area: " + fmt.format( area ) );
		System.out.println( "The circle's circumference : " + fmt.format( circumference ) );
		
		// Enter the circle's radius : 10
		// The circle's area: 314.159
		// The circle's circumference : 62.832

	}

}
