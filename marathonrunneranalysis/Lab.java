/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marathonrunneranalysis;

/**
 *
 * @author HP Elite Core-i5
 */
public class Lab {

    public static void main(String[] args) {
        // Array holding the names of the runners
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", 
            "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"
        };

        // Array holding the corresponding times of the runners in minutes
        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265
        };

        // Find the index of the fastest runner
        int win = fastestIndex(times);
        // Find the index of the second fastest runner
        int second = secondFastestIndex(times);
        
        // Print the name and time of the fastest runner
        System.out.printf("The fastest runner is: %s (%d Minutes)%n", names[win], times[win]);
        // Print the name and time of the second fastest runner
        System.out.printf("The second fastest runner is: %s (%d Minutes)%n", names[second], times[second]);
    } // end main

    /**
     * This method returns the index of the fastest time in the array.
     * @param times Array of times in which to search for the fastest time.
     * @return Index of the fastest time.
     */
    public static int fastestIndex(int[] times) {
        int fastestIndex = 0; // Start by assuming the first runner is the fastest

        // Loop through all times to find the fastest
        for (int counter = 1; counter < times.length; counter++) {
            // If the current runner's time is less than the fastest time found
            if (times[counter] < times[fastestIndex]) {
                fastestIndex = counter; // Update fastestIndex to the current runner
            }
        }

        return fastestIndex; // Return the index of the fastest time
    }

    /**
     * This method returns the index of the second fastest time in the array.
     * @param times Array of times in which to search for the second fastest time.
     * @return Index of the second fastest time.
     */
    public static int secondFastestIndex(int[] times) {
        int fastestIdx = fastestIndex(times); // Get the index of the fastest time
        int secondFastestIdx = (fastestIdx == 0) ? 1 : 0; // Start by assuming the first or second runner is the second fastest

        // Loop through all times to find the second fastest
        for (int counter = 0; counter < times.length; counter++) {
            // Check if the current time is faster than the current second fastest
            // and it is not the fastest time
            if (times[counter] < times[secondFastestIdx] && counter != fastestIdx) {
                secondFastestIdx = counter; // Update secondFastestIdx to the current runner
            }
        }

        return secondFastestIdx; // Return the index of the second fastest time
    }

} // end class Lab

