package Exception;

public class LAb92TryCatchFinally {

	public static void main(String[] args)
	{

        int ans = MathDevider2.devider(10, 0);
        System.out.println(ans);
	} 
}
class MathDevider2
{
	public static int devider(int num1, int num2)
	{
		int result = 0;
		try
		{
			result = (int)(num1/num2);
			System.out.println("Print from try");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Print from catch");
		} 
		finally 
		{
			System.out.println("Print from finally");
			
		} 
		return result;
	}
}

