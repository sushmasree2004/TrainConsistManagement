

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
@version 8.0
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
	            new Bogie("General", 90)
	        );

	        System.out.println("Original List:");
	        bogies.forEach(System.out::println);

	        // Filter bogies with capacity > 60 and sort ascending
	        List<Bogie> filteredSortedAsc = bogies.stream()
	            .filter(b -> b.capacity > 60)
	            .sorted(Comparator.comparingInt(b -> b.capacity))
	            .collect(Collectors.toList());

	        System.out.println("\nFiltered (capacity > 60)");
	        filteredSortedAsc.forEach(System.out::println);

	        
	    }
	
				
				
	}





	