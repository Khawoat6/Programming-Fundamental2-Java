// 1.4 การส่งข้อมูลประเภท Array ให้ Method
// Lab 4.4

public class Lab44MethodV4 
{
	public static double calAverage( int[] input )
	{
		double sum = 0 ;
		for ( int i = 0 ; i < input.length ; i++ )
		{
			System.out.printf("%5d \n" , input[i]);
			sum = sum + input[i];
		}
		System.out.println("");
		return (double)(sum/input.length);	
	}

	public static void main(String[] args) 
	{
		double average;
		int[] data = { 120 , 98, 125, 90, 82 };
		average = calAverage( data );
		System.out.printf( "Average : %f" , average );
		
		// Output
		// 120 
		//   98 
		//  125 
		//   90 
		//   82 

		// Average : 103.000000
	}

}
