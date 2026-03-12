

/*

 * Use Case 19: Binary Search for Bogie ID

 *
 * Description:
 * 
 * This class searches for a specific bogie ID
 * in a sorted list using Binary Search.
 *
 * At this stage, the application:
 * 
 * - Creates an array of bogie IDs
 * - Sorts the array
 * - Accepts a search key
 * - Applies binary search logic
 * - Displays result
 *

 *
 * @author B.Sushma Sree
 * @version 19.0
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{

		System.out.println("UC19 - Binary Search for Bogie ID");


		String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

		System.out.println("Available Bogie IDs:");

		Arrays.sort(bogieIds); // sort bogies
		System.out.println(Arrays.toString(bogieIds));

		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Bogie ID to search: ");
		String searchKey = sc.nextLine();

		// Binary Search Implementation
		int low = 0, high = bogieIds.length - 1;
		boolean found = false;

		while (low <= high) 
		{
			int mid = (low + high) / 2;
			int comparison = bogieIds[mid].compareTo(searchKey);

			if (comparison == 0) 
			{
				System.out.println("\nBogie " + searchKey + " found in train consist.");
				found = true;
				break;
			} 
			else if (comparison < 0) 
			{
				low = mid + 1; // Search right half
			} 
			else 
			{
				high = mid - 1; // Search left half
			}
		}

		if (!found) 
		{
			System.out.println("\nBogie " + searchKey + " not found in train consist.");
		}

		System.out.println("\nUC19 search completed...");
		sc.close();
	}
}
