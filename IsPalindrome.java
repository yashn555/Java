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

public class IsPalindrome{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
    
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase(); // Convert to lowercase for case insensitivity
        String reversed = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // Reverse the string
        }
        
        return str.equals(reversed); // Check if original and reversed strings are the same
    }
}
