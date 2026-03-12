package com.Train;

/*
 *
 * Use Case 11: Validate Train ID and Cargo Code
  *
 * Description:
 * 
 * This class validates Train ID and Cargo Code formats
 * using Regular Expressions (Regex).
 *
 * At this stage, the application:
 * 
 * - Accepts user input for Train ID and Cargo Code
 * - Compiles regex patterns
 * - Applies matcher to check validity
 * - Displays validation results
 *
 * This maps input format enforcement using Regex.
 *
 * @author B.Sushma Sree
 * @version 11.0
 */

import java.util.Scanner;
import java.util.regex.*;

public class Main 
{
    public static void main(String[] args) 
    {
       
        System.out.println("UC11 - Validate Train ID and Cargo Code");


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = sc.nextLine();

        // Define regex patterns
        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        // Match inputs
        boolean trainValid = trainPattern.matcher(trainId).matches();
        boolean cargoValid = cargoPattern.matcher(cargoCode).matches();

        System.out.println("\nValidation Results:");
        
        System.out.println("Train ID Valid: " + trainValid);
        System.out.println("Cargo Code Valid: " + cargoValid);

     
        sc.close();
    }
}
