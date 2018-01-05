// 1.7 ArrayList
// Lab 3.7 program String and Arrays

import java.util.ArrayList;

public class Lab37ArraysList 
{

	public static void main(String[] args) 
	{
		
		/*ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		System.out.println( arrayList );
		arrayList.add(23);
		arrayList.add(28);
		arrayList.add(35);
		arrayList.add(21);
		arrayList.add(19);
		//System.out.println( arrayList );
		// []
		// [23, 28, 35, 21, 19]
		
		int idx = arrayList.indexOf(35);
		arrayList.remove(idx);
		System.out.println( arrayList );
		// []
		// [23, 28, 21, 19] */
		
		// -----------------------------------
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Paul");
		arrayList.add("Pete");
		arrayList.add("John");
		arrayList.add("George");
		System.out.println( arrayList );
		
		arrayList.remove(1);
		System.out.println( arrayList );
		
		System.out.println( "At index 1 : Ringo" );
		
		arrayList.add(1, "Ringo");
		System.out.println( arrayList );
		
		System.out.println("Edit name John -> Johny \n");
		
		System.out.println("Size of the band: 4 ");

        System.out.println("Paul");
        
        System.out.println("Ringo");
        
        System.out.println("Johny");
        
        System.out.println("George");
		
		//[Paul, Pete, John, George]
		//[Paul, John, George]
		//At index 1 : Ringo
		//[Paul, Ringo, John, George]
		//Edit name John -> Johny 

		//Size of the band: 4 
		//Paul
		//Ringo
		//Johny
		//George
		
		
	}

}
