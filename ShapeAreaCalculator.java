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

// Parent class Shape
class prac8 {
    // Default constructor
    public prac8() {
    }

    // Method to calculate area (in case no parameter is provided)
    public void calculateArea() {
        System.out.println("Area calculation is not implemented.");
    }
}

// Child class Triangle
class Triangle extends prac8 {
    // Overloaded method to calculate area of a triangle (base and height)
    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }
}

// Child class Square
class Square extends prac8 {
    // Overloaded method to calculate area of a square (side length)
    public double calculateArea(double side) {
        return side * side;
    }
}

// Child class Circle
class Circle extends prac8 {
    // Overloaded method to calculate area of a circle (radius)
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create objects of derived classes
        Triangle triangle = new Triangle();
        Square square = new Square();
        Circle circle = new Circle();

        // Display menu to the user
        System.out.println("Select the shape to calculate area:");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // For Triangle
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                double triangleArea = triangle.calculateArea(base, height);
                System.out.println("Area of the Triangle: " + triangleArea);
                break;

            case 2:
                // For Square
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                double squareArea = square.calculateArea(side);
                System.out.println("Area of the Square: " + squareArea);
                break;

            case 3:
                // For Circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double circleArea = circle.calculateArea(radius);
                System.out.println("Area of the Circle: " + circleArea);
                break;

            default:
                System.out.println("Invalid choice! Please select a valid option.");
        }

        scanner.close();
    }
}

