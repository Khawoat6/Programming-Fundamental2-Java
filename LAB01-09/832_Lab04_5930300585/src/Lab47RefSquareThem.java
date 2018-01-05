// Lab 4.7

import java.util.Scanner;
public class Lab47RefSquareThem 
{
    public static void squareThem( AddInt x, AddInt y )
    {
        x.value = x.value * x.value ;
        y.value = y.value * y.value ;
        x = null;
        y = null;
    }
 
	public static void main(String[] args) 
	{
		
        Scanner scan = new Scanner( System.in );
        
        AddInt num1  = new AddInt(0);
        AddInt num2  = new AddInt(0);
        
        System.out.printf( "Enter number#1 : " );
        num1.value = scan.nextInt();
        
        System.out.printf( "Enter number#2 : " );
        num2.value = scan.nextInt();
        
        squareThem( num1, num2 );
        
        System.out.printf( "Results are {%d} and {%d}", num1.value, num2.value );
        
        //Enter number#1 : 8
        //Enter number#2 : 5
        //Results are {64} and {25}
	
	}

}
