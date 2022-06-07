package com.company;

public class CWH_14_string_methods {
    public static void main(String[] args) {

        String name = "Harry";
        //System.out.println(name);

        int value = name.length();
        System.out.println(value);

        //String lstring = name.toLowerCase();
        //System.out.println(lstring);

        //String ustring  = name.toUpperCase();
        // System.out.println(ustring);
        
        //String nonTrimmedString = "       Harry     ";
        //System.out.println(nonTrimmedString);

        //String trimmedString = nonTrimmedString.trim();
        //System.out.println(trimmedString);

        System.out.println(name.substring(1));
        System.out.println(name.substring(1,5));

        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("r","ier"));

        System.out.println(name.startsWith("Har"));
        System.out.println(name.endsWith("dd"));

        






        
    }
    
}
