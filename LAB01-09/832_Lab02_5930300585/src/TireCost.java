
public class TireCost 
{
	public static double areaOfCircle( double radius )
	{
		double pi = 3.14159 ;
		return ( pi * ( Math.pow(radius, 2) ));		
	}
	
	public static double volumeOfTire( double radius , double depth )
	{
		double areaOfCircle;
	    areaOfCircle = areaOfCircle( radius ) * depth;
	    return areaOfCircle;
	}
	
	public static void main( String[] args )
	{
		double costPerCubic = 225.50 ;
		double costSaVingratio = 0.10 ;
		double maxSaVingratio = 0.50 ;
		double tireRadius = 1.2 ;
		double tireDepth = 0.4 ;
		
		for ( int i = 1; i < 10; i++ )
		{
			int capital = i * 1000 ;
			int numPieces = 0 ;
			double saving = costSaVingratio ;
			
			while ( capital > 0.0 )
			{
				double cost = volumeOfTire( tireRadius, tireDepth ) * costPerCubic ;
				cost *= 1.0 - saving;
	    		if ( saving < maxSaVingratio )
	    		{
	    			saving = saving * ( 1.0 + costSaVingratio );
	    		}
	    		else
	    		{
	    			saving = maxSaVingratio;
	    		}
	    		if ( cost <= capital )
	    		{
	    			numPieces += 1;
	    			capital -= cost;
	    		}
	    		else
	    		{
	    			break;
	    		}
				
			}
			System.out.println( "Capital : " + i * 1000 + " -> " + numPieces + "tires." );
			
			//Capital : 1000 -> 2tires.
			//Capital : 2000 -> 5tires.
			//Capital : 3000 -> 8tires.
			//Capital : 4000 -> 11tires.
			//Capital : 5000 -> 15tires.
			//Capital : 6000 -> 20tires.
			//Capital : 7000 -> 25tires.
			//Capital : 8000 -> 30tires.
			//Capital : 9000 -> 35tires.

		}		
	}
}