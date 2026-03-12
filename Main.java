package com.Train;

/*

 * Use Case 17: Sort Bogie Names 

 *
 * Description:
 * 
 * This class sorts bogie type names alphabetically
 * using Java’s built-in Arrays.sort() method.
 *
 * At this stage, the application:
 * 
 * - Creates an array of bogie names
 * - Calls Arrays.sort() to sort them
 * - Displays sorted result
 *

 *
 * @author B.Sushma Sree
 * @version 17.0
 */

import java.util.Arrays;

public class Main 
{
    public static void main(String[] args) 
    {
       
        System.out.println("UC17 - Sort Bogie Names Using Arrays.sort()");
        

        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Original Bogie Names:");
        
        System.out.println(Arrays.toString(bogieNames));

        // Sort using built-in Arrays.sort()
        Arrays.sort(bogieNames);

        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

      
    }
}
