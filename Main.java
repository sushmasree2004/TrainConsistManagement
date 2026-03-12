

/*

 * Use Case 15: Safe Cargo Assignment Using try-catch-finally

 *
 * Description:
 * 
 * This class validates cargo assignment at runtime
 * and handles unsafe assignments gracefully using
 * structured exception handling.
 *
 * At this stage, the application:
 * 
 * - Defines a custom runtime exception CargoSafetyException
 * - Attempts cargo assignment
 * - Throws exception if unsafe
 * - Catches exception to display error
 * - Executes finally block for logging
 *

 *
 * @author B.Sushma Sree
 * @version 15.0
 */

import java.util.*;

class CargoSafetyException extends RuntimeException 
{
    public CargoSafetyException(String message) 
    {
        super(message);
        
    }
}


public class Main 
{
    public static void main(String[] args)
    {
        
        System.out.println("UC15 - Safe Cargo Assignment");
       

        GoodsBogie cylindrical = new GoodsBogie("Cylindrical");
        cylindrical.assignCargo("Petroleum"); //  safe

        GoodsBogie rectangular = new GoodsBogie("Rectangular");
        rectangular.assignCargo("Petroleum"); //  unsafe

       
    }
}
