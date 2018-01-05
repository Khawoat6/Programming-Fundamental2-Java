import java.util.Scanner;

public class Lab6ForLoop 
{

	public static void main(String[] args) 
	{
		
		/*int i , N ;
		Scanner scan = new Scanner ( System.in );
		System.out.print( "Enter N : " );
		N = scan.nextInt();
		
		for ( i = 1 ; i <= N ; i++ )
		{
			System.out.println( i );
			
		} */
		
		// Lab2.6
		
		/*int i , N ;
		Scanner scan = new Scanner ( System.in );
		System.out.print( "Enter N : " );
		N = scan.nextInt();
		
		for ( i = 0 ; i >= N ; i-- )
		{
			System.out.println( i );
			// Enter N : -5
			// -1
			// -2
			// -3
			// -4
			// -5
			
		}*/
		
		int i , N ;
		Scanner scan = new Scanner (System.in);
		System.out.print( "Enter N : " );
		N = scan.nextInt();
		
		for ( i = 1 ; i <= N ; i ++ ) 
		{
			System.out.println( i * 7 );
			// Enter N : 10
			// 7
			// 14
			// 21
			// 28
			// 35
			// 42
			// 49
			// 56
			// 63
			// 70
		}
				
		
	}

}
