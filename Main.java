package com.Train;


/*
 * Description:  
 * 
 * This class represents how passenger bogies can be
 * manages dynamically using ArrayList
 * 
 * At this stage, the application:
 * Adds new bogies
 * Removes existing bogies
 * Check for bogie avalilability
 * Display final consist


@Author B.Sushma Sree
@Version 2.0
*/
import java.util.*;
public class Main 
{
	public static void main(String args[])
	{
		
		List<String> passengerBogies=new ArrayList<>();
		passengerBogies.add("Sleeper"); // insert elements
		passengerBogies.add("First Class");
		passengerBogies.add("AC Chair");
		
		System.out.println("Passenger Bogies "+passengerBogies);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Bogie to search : ");
		String rem=sc.next();
		
		passengerBogies.remove(rem); //remove sleeper element
		
		System.out.println("Passenger Bogies "+passengerBogies);
		
		
		System.out.println("Enter the Bogie to search : ");
		String search=sc.next();
		
		if(passengerBogies.contains(search))
		{
			System.out.println(search +"  is present in Train ");
		}
		else
		{
			System.out.println(search +"  is not present in Train ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
