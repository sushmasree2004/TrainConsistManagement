

/*
 
 * Use Case 14: Handle Invalid Bogie Capacity (Custom Exception)

 *
 * Description:
 * 
 * This class prevents invalid passenger bogies from being
 * created by enforcing capacity rules with a custom exception.
 *
 * At this stage, the application:
 * 
 * - Defines a custom exception InvalidCapacityException
 * - Validates capacity inside Bogie constructor
 * - Throws exception if capacity ≤ 0
 * - Ensures only valid bogies are added
 *

 *
 * @author B.Sushma Sree
 * @version 14.0
 */


import java.util.*;

class InvalidCapacityException extends Exception 
{
    public InvalidCapacityException(String message) 
    {
        super(message);
    }
}


public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("UC14 - Handle Invalid Bogie Capacity");
  

        try 
        {
            Bogie b1 = new Bogie("Sleeper", 72);
            System.out.println("Created Bogie: " + b1);

            // This will throw the custom exception
            Bogie b2 = new Bogie("AC Chair", 0);
            System.out.println("Created Bogie: " + b2);

        } 
        catch (InvalidCapacityException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }

       
    }
}
