package com.company;

import java.util.*;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String operation = sc.next();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = 0;
        switch (operation) {

            case "add":
                result = num1 + num2;
                System.out.println("Sum of " + num1 + " and " + num2 + " is : " + result);
                break;

            case "sub":
                result = num1 - num2;
                System.out.println("Difference of " + num1 + " and " + num2 + " is : " + result);
                break;

            case "mul":
                result = num1 * num2;
                System.out.println("Multiplication of " + num1 + " and " + num2 + " is : " + result);
                break;

            case "div":
                result = num1 / num2;
                System.out.println("Dividend of " + num1 + " and " + num2 + " is : " + result);
                break;

            default:
                System.out.println("invalid Data");

                sc.close();

        }
    }
}
