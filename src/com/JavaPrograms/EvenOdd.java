package com.JavaPrograms;
import java.util.*;

public class EvenOdd {

    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check:");
        int n = sc.nextInt();
        if (n > 20 && n < 30) {
            if (n % 2 == 0)
                System.out.println("Jerry");
            else
                System.out.println("tom");
        }
        else
            System.out.println("Enter in given range");
    }
}
