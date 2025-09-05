/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41;

/**
 *
 * @author sagar
 */
import java.util.Scanner;

public class ArraySum{
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array of size 'n'
        int[] numbers = new int[n];

        // Ask the user to input the elements of the array
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum of the array elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // Calculate the average
        double average = (double) sum / n;

        // Output the result
        System.out.println("The average of the array is: " + average);
        
        // Close the scanner
        scanner.close();
    }
}

