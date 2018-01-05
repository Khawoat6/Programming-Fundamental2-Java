// 1.5
// Lab 4.6

public class Lab46PassByRef 
{
	
    public static void doubleMe1( AddInt x )
    {
    	x.value = x.value * 2 ;
        System.out.printf( "In method doubleMe1: x={%d} \n", x.value ) ;
        x = null;
    }
    
    public static void doubleMe2( int x )
    {
        x = x * 2 ;
        System.out.printf( "In method doubleMe2: x={%d} \n", x );
    }
	
	public static void main(String[] args) 
	{
        AddInt a = new AddInt(10);
        int b = 20;
        
        System.out.printf( "Before methods: a={%d}, b={%d} \n", a.value, b );
        doubleMe1( a ) ;
        doubleMe2( b ) ;
        System.out.printf("After methods: a={%d},  b={%d} \n", a.value, b );
        
        //Before methods: a={10}, b={20} 
        //In method doubleMe1: x={20} 
        //In method doubleMe2: x={40} 
        //After methods: a={20},  b={20} 
	}

}

class AddInt
{
    public int value;
    
    //Constructor Method
    public AddInt()
    {
    	this(0);
    }
    public AddInt(int value)
    {
        this.value = value;
    }
}
