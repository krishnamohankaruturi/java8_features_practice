package org.example.exceptionss;

import java.util.Scanner;

public class UserTest {
    static void status(int age)  throws  InvaliAgeException
    {
        if (age > 20) {
            System.out.println("Eligible for marriage");
        } else {
            throw new InvaliAgeException("Not eligible for marriage");
        }
    }

    public static void main(String[] args)   throws  InvaliAgeException
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your age");
        int age = s.nextInt();
        UserTest.status(age);

    }
}
