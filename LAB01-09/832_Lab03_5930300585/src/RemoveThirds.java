
import java.util.ArrayList;

public class RemoveThirds 
{

	public static void main(String[] args) 
	{
		
		ArrayList<Integer> lst = new ArrayList<Integer>();
		
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(2);
		lst.add(5);
		lst.add(3);
		lst.add(1);
		lst.add(3);
		lst.add(9);
		
		//System.out.println( lst );
		
		//int idx = lst.indexOf(2);
		lst.remove(2);
		lst.remove(4);
		lst.remove(5);
		lst.remove(5);
		
		System.out.println( lst );
		
		// [1, 2, 2, 5, 1]
	}
	// Pyhton Code
	/*lst = [ 1, 2, 3, 2, 5, 3, 1, 3, 9 ]
			i = 0
			while i < len( lst ):
			    if lst[i] % 3 == 0 :
			        lst.pop(i)      # remove + return value remove

			    else:
			        i = i + 1
			print (lst) */
	// ============== RESTART: /Users/Apple/Desktop/pythonToJava03.py ==============
	// [1, 2, 2, 5, 1]

}
