

/*
 * ============================================================
 * Use Case 13: Performance Comparison (Loops vs Streams)
 * ============================================================
 *
 * Description:
 * This class compares execution time of loop-based
 * versus stream-based filtering logic using nanoTime().
 *
 * At this stage, the application:
 * - Creates a list of bogies
 * - Measures loop execution time
 * - Measures stream execution time
 * - Displays both results
 *
 * This maps performance benchmarking using nanoTime().
 *
 * @author B.Sushma Sree
 * @version 13.0
 */

import java.util.*;
import java.util.stream.*;



public class Main 
{
    public static void main(String[] args) 
    {
        List<Bogie> bogies = Arrays.asList(
            new Bogie("Sleeper", 72),
            new Bogie("AC Chair", 56),
            new Bogie("First Class", 24),
            new Bogie("Sleeper", 70),
            new Bogie("AC Chair", 60)
        );


        System.out.println("UC13 - Performance Comparison (Loops vs Streams)");
        

        // Loop-based filtering
        
        long loopStart = System.nanoTime();
        
        List<Bogie> loopFiltered = new ArrayList<>();
        
        for (Bogie b : bogies) 
        {
            if (b.capacity > 60) 
            {
                loopFiltered.add(b);
            }
        }
        
        long loopEnd = System.nanoTime();
        
        long loopTime = loopEnd - loopStart;

        // Stream-based filtering
        
        long streamStart = System.nanoTime();
        
        List<Bogie> streamFiltered = bogies.stream()
            .filter(b -> b.capacity > 60)
            .collect(Collectors.toList());
        
        long streamEnd = System.nanoTime();
        long streamTime = streamEnd - streamStart;

        System.out.println("Loop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);

    }
}
