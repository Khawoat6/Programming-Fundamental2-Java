// 1.1 Method
// 1.2 Method ชนิดไม่คืนค่าข้อมูล
// Lab 4.1

public class Lab41Method 
{

	public static void printClass() 
	{
		for ( int i = 0 ; i < 10 ; i++ )
		{
			System.out.print("=");
		}
		System.out.print(" Class : Fundamental-II \n");
		// ========== Class : Fundamental-II 
	}
	
	public static void printUniversity()
	{
		for ( int j = 0 ; j < 6 ; j++)
		{
			System.out.print('=');
		}
		System.out.print(" University: Kasetsart Sriracha \n") ;
		// ====== University: Kasetsart Sriracha 
	}
	
	public static void main(String[] args)
	{
		printClass();
		printUniversity();
		printClass();
		printUniversity();
		//========== Class : Fundamental-II 
		//====== University: Kasetsart Sriracha 
		//========== Class : Fundamental-II 
		//====== University: Kasetsart Sriracha 

		
	}
}
