package com.company;

import java.util.*;

public class ApnaCollege3rd_Video {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Adult");

        } else {
            System.out.println("Not Adult");

        }
        sc.close();

    }
}
