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

public class MathOperations {

    // Overloaded methods for integer operations
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }

    // Overloaded methods for double operations
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }

    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            // Display menu
            System.out.println("\nSelect Operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting program...");
                break;
            }

            System.out.print("Choose data type (1 for Integer, 2 for Double): ");
            int dataType = scanner.nextInt();
            if (dataType == 1) {
                // For Integer operations
                System.out.print("Enter first integer: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter second integer: ");
                int num2 = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + mathOps.add(num1, num2));
                        break;
                    case 2:
                        System.out.println("Result: " + mathOps.subtract(num1, num2));
                        break;
                    case 3:
                        System.out.println("Result: " + mathOps.multiply(num1, num2));
                        break;
                    case 4:
                        System.out.println("Result: " + mathOps.divide(num1, num2));
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } else if (dataType == 2) {
                // For Double operations
                System.out.print("Enter first double: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second double: ");
                double num2 = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + mathOps.add(num1, num2));
                        break;
                    case 2:
                        System.out.println("Result: " + mathOps.subtract(num1, num2));
                        break;
                    case 3:
                        System.out.println("Result: " + mathOps.multiply(num1, num2));
                        break;
                    case 4:
                        System.out.println("Result: " + mathOps.divide(num1, num2));
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } else {
                System.out.println("Invalid data type choice!");
            }
        } while (choice != 5);

        scanner.close();
    }
}
