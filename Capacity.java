package com.Train;


/*
 Use Case 6: Store Capacity 
 
Description: 
 
This class associates each bogie with its seating 
load capacity using a key-value mapping structure.

At this stage, the application:
Creates a HashMap for bogie-capacity mapping
Inserts capacity values for each bogie
Iterates through map entries
Displays bogie and capacity information

This maps lookup-based access using HashMap.

@author B.Sushma Sree
@version 6.0
*/

import java.util.*;
public class Capacity
{
	public static void main(String args[])
	{
		
		System.out.println("UC6- Map Bogie to Capacity ");
		
		System.out.println("Bogie Capacity Details ");
		
		Map<String,Integer> map=new HashMap<>();
		
		map.put("First Class ", 24);
		map.put("Cargo ", 120);
		map.put("Sleeper ", 72);
		map.put("AC Chair ", 56);
		
		
		for (Map.Entry<String, Integer> e : map.entrySet()) 
		{
            String bogieType = e.getKey();
            Integer capacity = e.getValue();
            
            System.out.println( bogieType + " -->  " + capacity);
        }
			
				
	}

}