


/*
Use Case 3: Track Unique Bogie IDs

Description:  
This class ensures that duplicate bogie IDs
are not added into the train formation using HashSet.


At this stage, the application:

Stores bogie IDs
Prevents duplicates automatically
Displays unique bogie identifiers
This maps uniqueness validation using Set.

@author B.Sushma Sree
@version 3.0
*/
import java.util.*;
public class Main 
{
	public static void main(String args[])
	{
		System.out.print("UC3-Track Unique Bogie ID 's");
		
		Set<String> bogies=new HashSet<>();
		bogies.add("BG101");
		bogies.add("BG102");
		bogies.add("BG103");
		bogies.add("BG104");
		
		System.out.println("Bogie ID's After Insertion");
		System.out.println(bogies);
		
		
		
		System.out.println("After Inserting duplicate IDs ");
		
		bogies.add("BG101");
		bogies.add("BG102");
		
		System.out.println(bogies);
		
		
		
		
		
		
		
		
		
		
		
	}

}
