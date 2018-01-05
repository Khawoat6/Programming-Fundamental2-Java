// 1.6
// Lab 4.8

import java.util.Scanner;
public class Lab48RefReadTwoNumber 
{
    public static void readTwoInput( AddInt x , AddInt y )
    {
        x.value = x.value ;
        y.value = y.value ;
    }
  
	public static void main(String[] args) 
	{
        Scanner scan = new Scanner( System.in ) ;
        
        AddInt num1 = new AddInt( 10 ) ;
        AddInt num2= new AddInt( 5 ) ;
        
        System.out.printf( "Enter number#1 : " ) ;
        num1.value = scan.nextInt();
        
        System.out.printf( "Enter number#2 : " ) ;
        num2.value = scan.nextInt();
        
        readTwoInput(num1,num2);
        
        System.out.printf( "Two numbers are {%d} and {%d}", num1.value, num2.value ) ;
		
        //Enter number#1: 10
        //Enter number#2: 5
        //Two numbers are {10} and {5}

	}

}
