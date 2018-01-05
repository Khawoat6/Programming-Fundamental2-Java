
public class Lab36MutiArrays 
{
	
	public static void main(String[] args)
	{
		
		int[][] Matrix = new int[][]{
			{ 90, 5, 12, -3 },
			{ -8, 15, -7, 52 },
			{ 0, 23, -8, 1 }
		};
		
		System.out.println("Matrix A is");
		
		for( int i = 0 ; i < 3 ; i++ )
		{
			
			for( int j = 0 ; j < 4 ; j++ )
			{
				
				System.out.printf( "%d\t", Matrix[i][j] );
				
			}
			System.out.println();
			//Matrix A is
			//90 	5 	12 	-3 	
			//-8 	15 	-7 	52 	
			//0 	23 	-8 	1 
			
		}
		
	}

}
