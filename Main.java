

/*

 * Use Case 20: Exception Handling During Search Operations
 
 *
 * Description:
 * 
 * This class prevents search operations on an empty train
 * by enforcing fail-fast validation using IllegalStateException.
 *
 * At this stage, the application:
 * 
 * - Creates a bogie collection
 * - Validates state before searching
 * - Throws exception if empty
 * - Displays meaningful error message
 *
 
 *
 * @author B.Sushma Sree
 * @version 20.0
 */

import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        
        System.out.println("UC20 - Exception Handling During Search Operations");


    
        List<String> bogieIds = new ArrayList<>();

        try 
        {
            if (bogieIds.isEmpty()) 
            {
                throw new IllegalStateException("Cannot search: No bogies available in train consist.");
            }

            // If not empty, proceed with search
            String searchKey = "BG309";
            boolean found = false;
            
            for (String id : bogieIds) 
            {
                if (id.equals(searchKey)) 
                {
                    System.out.println("Bogie " + searchKey + " found in train consist.");
                    found = true;
                    
                    break;
                }
            }

            if (!found) 
            {
                System.out.println("Bogie " + searchKey + " not found in train consist.");
            }

        } 
        
        catch (IllegalStateException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }

        
    }
}
