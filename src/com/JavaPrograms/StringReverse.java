package com.JavaPrograms;

import java.util.*;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input=sc.nextLine();
        System.out.println("Reversed string is:");
        for(int i=input.length()-1;i>=0;i--)
        {
            System.out.print(input.charAt(i));
        }
    }
}
