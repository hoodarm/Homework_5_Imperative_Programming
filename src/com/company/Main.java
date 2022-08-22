package com.company;

public class Main
{

    public static void main(String[] args)
    {
        //Part 1
        int A = 134;
        int B = 23;
        boolean check = true;
        if (A < 100)
        {
            check = false;
        }
        if (B > 50)
        {
            check = false;
        }
        if (!check)
        {
            System.out.println(0);
        }
        else
            System.out.println(1);

        //Part 2
        int first = 23;
        int second = 103;
        int bigger;
        int smaller;
        boolean answer = true;

        if (first > second)
        {
            bigger = first;
            smaller = second;
        }
        else
        {
            bigger = second;
            smaller = first;
        }
        if (bigger < 100)
        {
            answer = false;
        }
        if (smaller > 50)
        {
            answer = false;
        }
        if (!answer)
        {
            System.out.println(0);
        }
        else if (first == second)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(1);
        }
    }
}
