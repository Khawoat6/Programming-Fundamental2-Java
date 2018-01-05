// 1.4 การอ้างถึงข้อมูล Arrays
// Lab 3.1

public class Lab31Arrays 
{

	public static void main( String[] args ) 
	{
		
		int[] score = new int[] { 0, 10, 20, 30, 40 };
		int sum = 0 ;
		
		for ( int i = 0 ; i < 5 ; i++ ) 
		{
			
			sum = sum + score[i];
			System.out.printf( "Score[%d] = %d : Sum = %d\n" ,  i , score[i], sum );

		}
		
		System.out.println( "Final sum : " + sum );
		//Score[0] = 0 : Sum = 0
		//Score[1] = 10 : Sum = 10
		//Score[2] = 20 : Sum = 30
		//Score[3] = 30 : Sum = 60
		//Score[4] = 40 : Sum = 100
		//Final sum : 100

	}

}
