package com.JavaPrograms;
import java.util.*;
public class FindCharacter{

    public static void main(String[] args)
    {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        char input=sc.next().charAt(0);
        int input_num =(int) input;
        if(input_num>=97 && input_num<=122)
            System.out.println(input+" is a small letter");
        else if(input_num>=65 && input_num<=90)
            System.out.println(input+" is a capital letter");
        else if(input_num>=48 && input_num<=57)
            System.out.println(input+" is a number");
        else
            System.out.println(input+" is a special character");
    }
}