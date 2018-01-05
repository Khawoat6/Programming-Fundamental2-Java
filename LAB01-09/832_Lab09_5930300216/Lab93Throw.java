package Exception;

public class Lab93Throw {

	public static void main(String[] args) throws Exception
	{
		try
		{
			int ans = MathDevider3.devider(10, 0);
			System.out.println(ans);
		}
		
		catch(ArithmeticException e)
		
		{
			System.out.println("ArithmeticException");
		}
	
	}
}
class MathDevider3
{
	public static int devider(int num1, int num2) throws Exception
	{
		int result = (int)(num1/num2);
		return result;
	}
	public static int checkZero(int num2) throws Exception
	{	
		if(num2 == 0) throw new Exception("Zero Zero");
		
		else
			return num2;
	}
	

	
}
