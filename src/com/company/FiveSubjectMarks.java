package com.company;

import java.util.Scanner;

public class FiveSubjectMarks {
    public static void main(String[] args) {
    
          try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter marks for 5 Subjects");
            System.out.println("English");
            float a = sc.nextFloat();
            System.out.println("Maths");
            float b = sc.nextFloat();
            System.out.println("Chemistry");
            float c = sc.nextFloat();
            System.out.println("Physics");
            float d = sc.nextFloat();
            System.out.println("Biology");
            float e = sc.nextFloat();
            float sum = a+b+c+d+e;
            System.out.println("Your total Marks");
            System.out.println(sum);
         }


    
    





         

        
    }

}
