// Lab 3.5 โปรแกรมนับกลุ่มของอักขระ

import java.util.Scanner;

public class Lab35String 
{

	public static void main(String[] args) 
	{
		
		int cntDigit = 0, cntUpper = 0,cntLower=0,cntOther = 0 ;
		Scanner scan = new Scanner( System.in );
		System.out.print( "Enter a String : " );
		String s = scan.nextLine();
		
		for( int i = 0 ; i < s.length() ; i++ )
		{
            if( (s.charAt(i) >= '0' ) && ( s.charAt(i) <='9') )
            {
                cntDigit++;
            }
            else if( (s.charAt(i)>='A' ) && ( s.charAt(i) <='Z') )
            {
                cntUpper++;
            }
            else if( (s.charAt(i)>='a'  ) && (s.charAt(i)<='z') )
            {
                cntLower++;
            }
            else
            {
                cntOther++;
            }
		}
		
        System.out.printf( "There are %d digits \n",cntDigit );
        System.out.printf( "There are %d uppercase letters \n", cntUpper );
        System.out.printf( "There are %d lowercase letters \n", cntLower );
        System.out.printf( "There are %d other letters \n", cntOther );
        
        //Enter a String : Welcome KU-76
        //There are 2 digits 
        //There are 3 uppercase letters 
        //There are 6 lowercase letters 
        //There are 2 other letters 
	}

}
