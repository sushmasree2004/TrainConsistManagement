package com.Train;

/*

 * Use Case 12: Safety Compliance Check for Goods Bogies
 
 *
 * Description:
 * 
 * This class enforces safety rules for goods bogies
 * using Streams and conditional logic.
 *
 * At this stage, the application:
 * 
 * - Creates a list of goods bogies
 * - Converts list into stream
 * - Applies allMatch() to validate rules
 * - Ensures Cylindrical bogies only carry Petroleum
 * - Displays safety compliance status
 *

 *
 * @author B.Sushma Sree
 * @version 12.0
 */

import java.util.*;
import java.util.stream.*;

class GoodsBogie 
{
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) 
    {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() 
    {
        return type + " -> " + cargo;
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        List<GoodsBogie> goodsBogies = Arrays.asList(
            new GoodsBogie("Cylindrical", "Petroleum"),
            new GoodsBogie("Open", "Coal"),
            new GoodsBogie("Box", "Grain"),
            new GoodsBogie("Cylindrical", "Coal") // un safe 
        );

    
        System.out.println("UC12 - Safety Compliance Check for Goods Bogies");
        

        System.out.println("Goods Bogies in Train:");
        
        goodsBogies.forEach(System.out::println);

        //  rule: Cylindrical bogies must carry Petroleum only
        boolean isSafe = goodsBogies.stream()
            .allMatch(b -> !(b.type.equals("Cylindrical") && !b.cargo.equals("Petroleum")));

        System.out.println("\nSafety Compliance Status: " + isSafe);
        
        if (isSafe) 
        {
            System.out.println("Train formation is SAFE.");
        } 
        else 
        {
            System.out.println("Train formation is NOT SAFE.");
        }

      
    }
}
