import java.text.DecimalFormat;

// Lab 3.2

public class Lab32Arrays 
{

	public static void main(String[] args) 
	{
		
		/*double[] score = { 80.2 , 67.5 , 70.0 , 68.5 , 82.7 , 55.5 , 78.8 };
		double sum = 0 ;
		
		for ( int i = 0 ; i < 7 ; i++  )
		{
			
			sum += score[ i ];
			System.out.printf( "Score[%d]  = %.2f : Sum = %.2f \n", i, score[i], sum );
				
		}
		DecimalFormat fmt = new DecimalFormat("0.##");
		sum = sum/7 ;
		System.out.println( "Average : " + fmt.format( sum )  ); */
		
		//Score[2]  = 70.00 : Sum = 217.70 
		//Score[3]  = 68.50 : Sum = 286.20 
		//Score[4]  = 82.70 : Sum = 368.90 
		//Score[5]  = 55.50 : Sum = 424.40 
		//Score[6]  = 78.80 : Sum = 503.20 
		//Average : 71.89
		
		// -----------------------------------------------------------------------------
		
		int i;
		int[] data = { 30, 20, 15, 0, 9 };
		
		for ( i = 0 ; i < data.length ; i++ )
		{
			
			System.out.println( data[i] );
			
		}
		System.out.println( "Your data:" );
		
		for( i = 0 ; i < 5 ; i++ )
		{
			
			System.out.printf( "data[%d] = %d \n", i, data[i] );
			//30
			//20
			//15
			//0
			//9
			//Your data:
			//data[0] = 30 
			//data[1] = 20 
			//data[2] = 15 
			//data[3] = 0 
			//data[4] = 9 
			
			
		}
	}
}

	
