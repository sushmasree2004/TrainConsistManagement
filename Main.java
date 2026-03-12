
/*

 * Use Case 16: Sort Passenger Bogies by Capacity (Bubble Sort)

 *
 * Description:
 * 
 * This class sorts passenger bogie capacities using
 * the Bubble Sort algorithm instead of library methods.
 *
 * At this stage, the application:
 * 
 * - Creates an array of bogie capacities
 * - Iterates with nested loops
 * - Compares adjacent values
 * - Swaps values if out of order
 * - Displays sorted result
 *

 *
 * @author B.Sushma Sree
 * @version 16.0
 */

public class Main 
{
    public static void main(String[] args) 
    {
      
        System.out.println("UC16 - Sort Passenger Bogies by Capacity");
        

        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Original Capacities:");
        for (int c : capacities) 
        {
            System.out.print(c + " ");
        }
        
        System.out.println();

        // Bubble Sort Algorithm
        for (int i = 0; i < capacities.length - 1; i++) 
        {
            for (int j = 0; j < capacities.length - i - 1; j++) 
            {
                if (capacities[j] > capacities[j + 1]) 
                {
                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted Capacities :");
        
        for (int c : capacities) 
        {
            System.out.print(c + " ");
        }

       
    }
}
