package com.JavaPrograms;

import java.util.*;

public class NSubstring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input_string=sc.nextLine();
        System.out.println("Enter a number");
        int input_num=sc.nextInt();
        for(int i=0;i<((input_string.length())-input_num);i++)
            System.out.println(input_string.substring(input_string.length()-input_num));
    }
}