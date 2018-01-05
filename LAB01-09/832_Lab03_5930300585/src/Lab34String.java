// 1.5 การประมวลผลข้อความ String
// Lab 3.4 program Sting and Arrays

import java.util.Scanner;

public class Lab34String 
{

	public static void main(String[] args) 
	{
		
		/*String msg = "Mckazine";
		
		System.out.printf( "msg[0] = {%c} \n" , msg.charAt(0) );
		// msg[0] = {M}
		System.out.printf( "msg[4] = {%c} \n" , msg.charAt(4) );
		// msg[4] = {z} 
		//System.out.printf( "msg[8] = {%c} \n" , msg.charAt(8) );
		// Error เพราะ มันมีแค่ [7]
		System.out.printf( "Length = %d \n" , msg.length() );
		// Length = 8  */
		
		// -----------------------------------------------------------
		
		Scanner scan  = new Scanner(System.in);
		System.out.print( "Enter a string: " );
		String s = scan.nextLine();
		
		int count = 0;
		for( int i = 0 ; i < s.length() ; i++ )
		{
			
			if ( s.charAt(i) == 'e' );
			count++;
			
		}
		
		System.out.printf( "There are %d e's in stings" , count );
		// Enter a string: Love Me Love My life   :   There are 20 e's in stings
		// Enter a string: Wall-E & EVE			  :	  There are 12 e's in stings
		
	}

}
