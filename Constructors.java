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
public class Constructors {

    // Static variable
    static String schoolName = "XYZ High School";

    // Instance variables
    String name;
    int age;

    // Static block
    static {
        System.out.println("Static block: School name initialized.");
    }

    // Instance block
    {
        System.out.println("Instance block: Student object is created.");
    }

    // Default constructor
    public Constructors() {
        name = "Default Name";
        age = 0;
        System.out.println("Default Constructor: Student created.");
    }

    // Parameterized constructor
    public Constructors(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor: Student created.");
    }

    // Static method
    public static void showSchool() {
        System.out.println("School: " + schoolName);
    }

    // Instance method
    public void showStudentInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Call static method
        Constructors.showSchool();

        // Create student objects
        Constructors student1 = new Constructors();  // Calls default constructor
        student1.showStudentInfo();

        Constructors student2 = new Constructors("Alice", 18);  // Calls parameterized constructor
        student2.showStudentInfo();
    }
}
