// Lab 4.5 
public class Lab45MethodArrays 
{
	
	/*public static void showMatrix( int[][] A )
	{
		for( int i = 0 ;i < A.length; i++ )
		{
			for( int j = 0 ; j < A[i].length ; j++ )
			{
				System.out.printf( "\t%d",A[i][j] );
			}
			System.out.println("");
		}
	}
	
	public static void main( String[] args ) 
	{
		int[][] A ={
				{5,3,8},
				{2,6,10},
				{1,8,25},
				{12,3,30}
		};
		
		System.out.println( "Matrix A:" );
		showMatrix(A);
		//Matrix A:
		//	5	3	8
		//	2	6	10
		//	1	8	25
		//	12	3	30
	} */
	
	
    public static void showMatrix( int[][] x )
    {
    	
        for( int i = 0; i < x.length ; i++ )
        {
            for( int j = 0; j < x[i].length ; j++ )
            {
            	System.out.printf("    %d", x[i][j] );
            }
            System.out.println();
        }
    }
    
    public static void showAddMatrix( int[][] y, int[][] z )
    {
    	
        int[][] a = new int[y.length][y[0].length];
        for( int b = 0 ;b < y.length ; b++ )
        {
            for( int c = 0; c < y[b].length ; c++ )
            {
                a[b][c] = y[b][c] + z[b][c];
                System.out.printf("    %d", a[b][c] );
            }
            
            System.out.println();
        }
    }
    
    public static void main( String[] args )
    {
    	
        int[][] A = {
        		{-3,5,6},
        		{5,0,-2}
        		};
        int[][] B = {
        		{9,0,-5},
        		{-3,-2,-1}
        		};
        
        System.out.println( "Matrix A: " );
        showMatrix( A );
        System.out.println("Matrix B: " );
        showMatrix( B );
        System.out.println("Matrix A+B: " );
        showAddMatrix( A, B );
        //Matrix A: 
        //    -3    5    6
        //    5    0    -2
        //Matrix B: 
        //    9    0    -5
        //    -3    -2    -1
        //Matrix A+B: 
        //    6    5    1
        //    2    -2    -3
        
    }
    
}
