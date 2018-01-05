import java.util.Scanner;

// Lab 2.4

public class Lab4While 
{

	public static void main(String[] args) 
	{
		
		/*int i , N ;
		Scanner scan = new Scanner ( System.in );
		System.out.print( "Enter N : " );
		N = scan.nextInt();
		
		i = N ;
		while ( i >= 1 ) 
		{
			System.out.println( i );
			i -- ;
			// Enter N : 5
			// 5
			// 4
			// 3
			// 2
			// 1 */
		
		int i , N ;
		Scanner scan = new Scanner ( System.in );
		System.out.print( "Enter N : " );
		N = scan.nextInt();
		
		i = N;
		while ( i >= 1 )
		{
			if ( i % 2 == 1 )
			{ 
				System.out.println( i );
				// Enter N : 5
				// 5
				// 3
				// 1
			}
			i -- ;	
		}

	}

}
