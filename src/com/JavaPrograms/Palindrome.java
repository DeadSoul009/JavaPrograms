package com.JavaPrograms;

import java.util.*;

public class Palindrome {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check:");
        int input=sc.nextInt();
        int input_copy=input;
        int rev=0;
        int rem=0;
        int sum=0;
        while(input_copy!=0)
        {


            rem=input_copy%10;
            if(rem%2==0)
                sum=sum+rem;
            rev=rev*10+rem;
            input_copy=input_copy/10;

        }
        if(input==rev) {
            if(sum>25)
                System.out.println("Given number is palindrome and the sum  of even digits is greater than 25");
            else
                System.out.println("Given number is palindrome and the sum of even digits  is less than 25");
        }
        else
            System.out.println("Given number is not a palindrome");
        System.out.println("palindrome");
    }
}
