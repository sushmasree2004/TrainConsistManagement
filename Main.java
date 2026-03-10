

package com.Train;
/*
 
Use Case 8: Filter Passenger Bogies Using Streams

Description:  

This class filters passenger bogies based on 
seating capacity using Java Stream API.

At this stage, the application:

Creates a list of bogies
Converts list into stream
Applies filter condition
Collects filtered result
Displays qualifying bogies



@author B.Sushma Sree
@version 9.0
*/

import java.util.*;
import java.util.stream.*;

public class Main 
{
	 public static void main(String[] args) 
	 {
	        List<Bogie> bogies = Arrays.asList(
	            new Bogie("Sleeper", 72),
	            new Bogie("AC Chair", 56),
	            new Bogie("First Class", 24),
	            new Bogie("Sleeper", 70),
	            new Bogie("AC Chair",60)
	        );

	        System.out.println("Original List:");
	        
	        bogies.forEach(System.out::println);
	        
	        
	        Map<String,List<Bogie>> groupedBogies=bogies.stream().
	        		                                    collect(Collectors.groupingBy(b->b.name));
	        
	        for (String key : groupedBogies.keySet()) 
	        {
	            System.out.println(key + ":");
	            
	            for (Bogie b : groupedBogies.get(key)) 
	            {
	                System.out.println("   " + b);
	            }
	        }
	        

	        
	    }
	
							
	}





	