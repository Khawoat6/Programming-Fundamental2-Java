
public class java1234
{

	public static void main(String[] args) 
	{
		int a = 7, b= 3, ans = 0;
		if ((a != 2) || (b < (1)))
		{
			switch( a % 5)
			{
			
			case 0 :
			case 1 : System.out.println(ans);
			break;
			case 2 : ans += 2;
			case 3 : ans += b--;
			/*case 4 : ans -= 3;
				System.out.println("Ans : " + a + b + ans );
				break;
				default : System.out.println("Error");
			}*/
			System.out.print(ans);
			}
		}
	}
}
