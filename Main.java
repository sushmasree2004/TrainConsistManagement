
/*
 
Use Case 7: Sort Bogies by Capacity

Description:  

This class sorts passenger bogies based on 
seating capacity using a custom Comparator.

At this stage, the application:

Creates bogie objects
Stores them in a List
Displays unsorted data
Sorts using Comparator logic


@author B.Sushma Sree
@version 7.0
*/

import java.util.*;
public class Main 
{
	public static void main(String args[])
	{
		
		List<Bogie> bogies=new ArrayList<>();
		
		Bogie b1=new Bogie("Sleeper",72);
		Bogie b2=new Bogie("AC Chair",56);
		Bogie b3=new Bogie("First Class",24);
		Bogie b4=new Bogie("	General",90);
		
		
		System.out.println("Before Sorting ");
		
		
		bogies.add(b1);
		bogies.add(b2);
		bogies.add(b3);
		bogies.add(b4);
		
		for(Bogie b:bogies)
		{
			String name=b.name;
			int c=b.capacity;
			
			System.out.println(name+" --> "+c);
		}
		Comparator<Bogie> newComp = Comparator.comparingInt(b -> b.capacity);
		Collections.sort(bogies , newComp);
		

		System.out.println("\n\n After  Sorting ");
		
		for(Bogie b:bogies)
		{
			String name=b.name;
			int c=b.capacity;
			
			System.out.println(name+" --> "+c);
		}
		
		
		
				
	}

}