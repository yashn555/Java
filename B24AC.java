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
public class B24AC {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of A :");
        double a=sc.nextDouble();
        System.out.println("Enter Value of B :");
        double b=sc.nextDouble();
        System.out.println("Enter Value of C :");
        double c=sc.nextDouble();
        
        double d= b*b - 4*a*c;
        
        System.out.println("b2-4ac = "+d);
        if(d<0){
            System.out.println("--- There is No Real Solution ---- ");
        }
    }
}
