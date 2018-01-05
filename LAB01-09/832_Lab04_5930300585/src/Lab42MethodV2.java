// 1.3 การคืนค่าให้ Method
// Lab 4.2

public class Lab42MethodV2 
{
	public static void printClassV2(String name , int length)
	{
		for ( int i = 0 ; i < length ; i++ )
		{
			System.out.print( "=" );
		}
		System.out.printf( " Class : %s \n" , name );
	}

	public static void main(String[] args) 
	{
		printClassV2 (" Objects" , 15 ); 		// =============== Class :  Objects 
		printClassV2 (" Argument" , 25 );		// ========================= Class :  Argument 
		//printClassV2 ( 45, "Attribute");		// Error

	}

}
