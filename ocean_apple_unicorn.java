// Bridging the Gap - start

import java.util.*;

public class BridgingTheGap {
    public static void main(String[] args) {
        // Variables
        int number, sum = 0;
        double average;
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter the number of elements: ");
        number = scanner.nextInt();
        
        // Creating an array to store the entered numbers
        int[] array = new int[number];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Calculating the sum of array elements
        for (int i = 0; i < number; i++) {
            sum = sum + array[i];
        }
        
        // Calculating the average
        average = sum / number;
        System.out.println("Average of array elements is: " + average);
        
        // Identifying numbers in the array that are greater than the average
        System.out.print("Numbers greater than the average are: ");
        for (int i = 0; i < number; i++) {
            if (array[i] > average) {
                System.out.print(array[i] + " ");
            }
        }
        
        // Identifying numbers in the array that are less than the average
        System.out.print("\nNumbers less than the average are: ");
        for (int i = 0; i < number; i++) {
            if (array[i] < average) {
                System.out.print(array[i] + " ");
            }
        }
        
        // Closing the scanner
        scanner.close();
    }
}

// Bridging the Gap - end