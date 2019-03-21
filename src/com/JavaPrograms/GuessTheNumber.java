package com.JavaPrograms;

import java.util.*;

public class GuessTheNumber {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number :");
        int input=sc.nextInt();
        Random random=new Random();
        int random_integer=random.nextInt(100);
        if(input==random_integer)
            System.out.println("Random integer : "+random_integer+" is equals to "+input);
        else if(random_integer<input)
            System.out.println("Random integer : "+random_integer+" is less than "+input);
        else
            System.out.println("Random integer : "+random_integer+" is greater than "+input);
    }
}
