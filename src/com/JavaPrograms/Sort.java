package com.JavaPrograms;

import java.util.*;

public class Sort {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        ArrayList<Integer> input_list= new ArrayList<>();
        int input_num=sc.nextInt();
        int n=input_num;
        int i=0;
        int sum=0;
        while(n!=0)
        {
            int rem=n%10;
            input_list.add(rem);
            n=n/10;
        }
        Collections.sort(input_list,Collections.reverseOrder());
        for(int j=0;j<input_list.size();j++)
        {
            System.out.println(input_list.get(j));
            if((input_list.get(j)%2)==0)
            {
                sum=sum+input_list.get(j);
            }
        }
        System.out.println(sum+" is the sum");
        if(sum>15)
            System.out.println("Sum is greater than 15");
        else
            System.out.println("Sum is less than 15");
    }
}
