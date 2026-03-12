package com.Train;

/*
 * Use Case 18: Linear Search for Bogie ID
 
 *
 * Description:
 * 
 * This class searches for a specific bogie ID
 * in an unsorted list using Linear Search.
 *
 * At this stage, the application:
 * 
 * - Creates an array of bogie IDs
 * - Accepts a search key
 * - Traverses sequentially
 * - Compares each element
 * - Stops when a match is found
 *

 *
 * @author B.Sushma Sree
 * @version 18.0
 */

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        
        System.out.println("UC18 - Linear Search for Bogie ID");
 

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) 
        {
            System.out.println(id);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Bogie ID to search: ");
        
        String searchKey = sc.nextLine();

        boolean found = false;
        for (String id : bogieIds) 
        {
            if (id.equals(searchKey)) 
            {
                System.out.println("\nBogie " + searchKey + " found in train consist.");
                found = true;
                break; 
            }
        }

        if (!found) 
        {
            System.out.println("\nBogie " + searchKey + " not found in train consist.");
        }

      
        sc.close();
    }
}
