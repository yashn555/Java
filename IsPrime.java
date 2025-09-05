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
public class IsPrime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter N to print prime number :");
        int n=sc.nextInt();
        
        int count= 0,num=2;
        System.out.println("First "+n+" Prime numbers are: ");
        
        while(count<n){
            if(isPrime(num)){
                System.out.println(num+" ");
                count++;
            }
            num++;
        }
    }

    private static boolean isPrime(int num) {
        if(num<2)return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0)return false;
        }
        return true;
    }
    
}
