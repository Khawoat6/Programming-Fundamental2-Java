// Lab 4.3
public class Lab43MethodV3 
{
	public static void DrawSqure( char c , int length)
	{
		int a = 0;
		 while(a < length)
		{
			for ( int i = 0 ;i < length-1; i++ )
			{
				System.out.printf( "  %c ",c );	
			}
			System.out.printf( "  %c \n",c );
			a++ ;
		}
		
	}

	public static void main(String[] args) 
	{
		
		DrawSqure('*', 5);
		  // *   *   *   *   * 
		  //*   *   *   *   * 
		  //*   *   *   *   * 
		  //*   *   *   *   * 
		  //*   *   *   *   * 
	}

}
