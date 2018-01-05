import java.util.*;

public class AddRandom 
{

	public static void main(String[] args) 
	{
		
		Random random = new Random() ;
		double a = random.nextDouble();
		double b = random.nextDouble();
		System.out.println( "Sum of " + (a*100) + " + " + (b*100) + " = "  + ((a + b)*100) );
		
		// Sum of 58.60599387027886 + 60.10629499246086 = 118.71228886273973
	}

}
