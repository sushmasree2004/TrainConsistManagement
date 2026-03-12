

/*
 * Description:  
 
This class models the physical chaining of train bogies 
using LinkedList for ordered operations.

At this stage, the application:

Adds bogies in sequence
Inserts bogies at specific positions
Removes bogies from front and rear
Displays updated train structure


@author B.Sushma Sree
@version 4.0
*/

import java.util.*;
public class Main 
{
	public static void main(String args[])
	{
		
		System.out.println("UC4-- Maintain Ordered Bogie Consist ");
		
		
		LinkedList<String> passengerBogies=new LinkedList<>();
		passengerBogies.add("Engine");
		passengerBogies.add("Sleeper"); // insert elements
		passengerBogies.add("AC");
		passengerBogies.add("Cargo");
		passengerBogies.add("Guard");
		
		System.out.println("Passenger Bogies "+passengerBogies);
		
		System.out.println("Insert a Pantry Car at position 2");
		passengerBogies.add(1, "Pantry Car");
		
		
		System.out.println("Passenger Bogies "+passengerBogies);
		
		System.out.println("Remove the first and last bogie.");
		
		passengerBogies.removeFirst();
		passengerBogies.removeLast();
		
		
		System.out.println("Passenger Bogies "+passengerBogies);
		
		
		
	}

}
