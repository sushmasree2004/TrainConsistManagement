package com.Train;

/*
 *
 * Use Case 10: Count Total Seats in Train
 *
 *
 * Description:
 * This class aggregates seating capacities of all bogies
 * into a single total value using Java Stream reduction.
 *
 * At this stage, the application:
 * 
 * - Reuses the list of bogies
 * - Converts list into stream
 * - Applies map() to extract capacity values
 * - Uses reduce() to sum capacities
 * - Displays total seating capacity
 *
 * This maps functional aggregation using Streams.
 *
 * @author B.Sushma Sree
 * @version 10.0
 */

import java.util.*;
import java.util.stream.*;


public class TotalSeats
{
    public static void main(String[] args) 
    {
        List<Bogie> bogies = Arrays.asList(
            new Bogie("Sleeper", 72),
            new Bogie("AC Chair", 56),
            new Bogie("First Class", 24),
            new Bogie("Sleeper", 70)
        );

    
        System.out.println("UC10 - Count Total Seats in Train");
        

        System.out.println("Bogies in Train:");
        bogies.forEach(System.out::println);

        // Aggregate total capacity using map() + reduce()
        
        int totalCapacity = bogies.stream()
            .map(b -> b.capacity)
            .reduce(0, Integer::sum);

        System.out.println("\nTotal Seating Capacity of Train: " + totalCapacity);

     
    }
}
