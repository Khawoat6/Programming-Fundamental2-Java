// 1.7
// Lab 4.9

import java.util.Scanner;

public class Lab49ArraysReturn 
{
    static Scanner scan = new Scanner( System.in ) ;
    
    /*public static int[] readArrayData( int num )
    {
    	System.out.println( "Please input your data" );
        int[] data = new int[num] ;
        
        for( int i = 0; i<data.length ; i++ )
        {
            System.out.printf( "data[%d] = ", i + 1 ) ;
            data[i] = scan.nextInt();
        }
        
        return data;
    }
    
	public static void main(String[] args) 
	{
        int n;
        
        System.out.print( "Numbers of data : " ) ;
        n = scan.nextInt();
        
        int[] data;
        data = readArrayData(n);
        
        System.out.print( "Your data is " ) ;
        
        for( int i = 0 ; i<data.length ; i++ )
        {
            System.out.printf("  [%d]", data[i] );
            
            // Output
            //Numbers of data : 3
            //Please input your data
            //data[1] = 90
            //data[2] = 13
            //data[3] = 39
            //Your data is   [90]  [13]  [39]
        }
	} */
    
    
    //----------------------------------------------------
    
    public static int[][] readMatrix( int x , int y )
    {
    	
        int[][] matrix = new int[x][y] ;
        for( int i = 0 ; i < matrix.length ; i++ )
        {
            for( int j = 0 ; j < matrix[i].length ; j++ )
            {
                System.out.printf( "Enter element[%d,%d]: ", i+1 , j+1 ) ;
                matrix[i][j] = scan.nextInt();
            }
        }
        return matrix ;
    }
    
    public static int[][] showMatrix( int[][] A , int numRows , int numCols )
    {
        for( int i = 0 ; i < A.length ; i++ )
        {
            for( int j = 0 ; j < A[i].length ; j++ )
            {
                System.out.printf( "%5d" , A[i][j] ) ;
            }
            System.out.println("");
        }
        return A;
    }
    
    public static void main(String[] args)
    {
        int numRows, numCols;
        int[][] A;
        
        System.out.print( "How many rows : " ) ;
        numRows = scan.nextInt();
        
        System.out.print( "How many columns : " ) ;
        numCols = scan.nextInt();
        
        A = readMatrix(numRows,numCols);
        
        System.out.println( "Matrix A is" ) ;
        showMatrix( A, numRows, numCols ) ;
        
        // Output
        //How many rows : 2
        //How many columns : 3
        //Enter element[1,1]: 9
        //Enter element[1,2]: 8
        //Enter element[1,3]: 7
        //Enter element[2,1]: 6
        //Enter element[2,2]: 5
        //Enter element[2,3]: 4
        //Matrix A is
        //    9    8    7
        //    6    5    4
        
    }
    
}
