


/*
 Use Case 5: Preserve Insertion Order of Bogies

Description: 
 
This class maintains the exact attachment order 
of bogies while also preventing duplicate entries using LinkedHashSet.

At this stage, the application:

Attaches bogies in order
Preserves insertion sequence
Avoids duplicate bogies
Displays final train formation



@author B.Sushma Sree
@version 5.0
*/

import java.util.*;
public class Main 
{
	public static void main(String args[])
	{
		
		System.out.println("UC5-- Maintain Insertion Order Of Bogies ");
		
		
		LinkedHashSet<String> passengerBogies=new LinkedHashSet<>();
		passengerBogies.add("Guard");
		passengerBogies.add("Engine");
		passengerBogies.add("Sleeper"); // insert elements
		passengerBogies.add("AC");
		passengerBogies.add("Cargo");
		
		
		System.out.println("Passenger Bogies "+passengerBogies);
		
		System.out.println("Insert a duplicate bogies");
		
		passengerBogies.add("Cargo");
		passengerBogies.add("Guard");
		
		System.out.println("Passenger Bogies "+passengerBogies);
		
		
	
		
		
		
	}

}
