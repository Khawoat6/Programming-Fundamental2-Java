import java.util.Scanner;

// Lab 2.5

public class Lab5DoWhile 
{

	public static void main(String[] args) 
	{
		
		/*int i , N ;
		Scanner scan = new Scanner(System.in);
		System.out.print( "Enter N : " );
		N = scan.nextInt();
		
		i = 1;
		do
		{
			System.out.println( i );
			i ++ ;
			
		} while ( i <= N ); */

		int i , N ;
		Scanner scan = new Scanner(System.in);
		System.out.print( "Enter N : " );
		N = scan.nextInt();
		
		i = N;
		do
		{
			System.out.println( i );
			i -- ;
			
		} while ( i >= 1 );
		// Enter N : 5
		// 5
		// 4
		// 3
		// 2
		// 1
		
	}

}
