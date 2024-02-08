package org.example.exceptionss;

import java.util.Scanner;

public class TryWithResource {
    public static void main(String[] args) {
        try(Scanner s= new Scanner(System.in)) {
            System.out.println("Enter a num");
            int num = s.nextInt();
            System.out.println("Enter value"+ num);

        }
    }
}
