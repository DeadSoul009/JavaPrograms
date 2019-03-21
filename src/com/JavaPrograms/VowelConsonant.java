package com.JavaPrograms;

import java.util.*;

public class VowelConsonant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char char_a = input.charAt(i);
            if ((char_a >= 'a' && char_a <= 'z') || (char_a >= 'a' && char_a <= 'z')) {
                if (char_a == 'a' || char_a == 'e' || char_a == 'i' || char_a == 'o' || char_a == 'u')
                    System.out.println(char_a + " is a vowel");
                else
                    System.out.println(char_a + " is a Consonant");
            } else
                System.out.println(char_a + " is not a character");
        }
    }
}
