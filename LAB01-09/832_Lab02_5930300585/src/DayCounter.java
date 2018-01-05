import java.util.Scanner;
public class DayCounter 
{
	public static int leapYear( int y ) 
	{
		int n =0;
	    if ( y % 4 == 0 )
	    {
	    	n = 29;
	    }
	    
	    if ( y % 100 == 0 )
	    {
	    if ( y % 4 == 0 )
	    {
	    	n = 28;
	    }
	   }
	    if ( y % 400 == 0 )
	    {
	    	n = 29;
	    }
	return n;
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner( System.in );
	    System.out.print( "Enter month: " );
	    int a = scan.nextInt();
	    Scanner scan1 = new Scanner( System.in );
	    System.out.print( "Enter year: " );
	    int year = scan1.nextInt();    
	    int [] month = new int [12];
	    month[0] = 31;
	    month[1] = leapYear(year);
	    month[2] = 31;
	    month[3] = 30;
	    month[4] = 31;
	    month[5] = 30;
	    month[6] = 31;
	    month[7] = 31;
	    month[8] = 30;
	    month[9] = 31;
	    month[10] = 30;
	    month[11] = 31;
	    int day = 0;
	    for ( int i =0; i<a; i++ )
	    {
	    	day += month[i];
	    }
	    System.out.println("Total days = " + day);
	    //Enter month: 4
	    //Enter year: 2012
	    //Total days = 121

	}
}
