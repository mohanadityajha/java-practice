package com.company;

import java.util.Scanner;


public class CWH_05_TakingUserInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From User");
        try (Scanner sc = new Scanner(System.in)) {
            //System.out.println("Enter number 1");
            //int a = sc.nextInt();
            //System.out.println("Enter number 2");
            //int b = sc.nextInt();
            //int sum = a+b;
      // System.out.println("The sum of two numbers is");
      // System.out.println(sum);
      System.out.println("Enter number 1");
      float a  = sc.nextFloat();
      System.out.println("Enter number 2");
      float b  = sc.nextFloat();
      float sum = a+b;
      System.out.println("the sum of two numbers");
      System.out.println(sum);
        }


        
    }
    
}
