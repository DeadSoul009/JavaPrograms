package com.JavaPrograms;

import java.util.*;

public class Summation {

    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string of numbers:");
        String input = sc.nextLine();
        int sum = 0;
        boolean flag=true;
        String[] input_numbers = input.split(" ");
        for (int i = 0; i < input_numbers.length; i++) {
            try {
                sum = sum + Integer.parseInt(input_numbers[i]);
            } catch(Exception e){
                System.out.println(input_numbers[i]+" is not a valid number");
                flag=false;

            }
        }
        if(flag)
            System.out.println(sum);

    }
}
