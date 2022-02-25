package com.pk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scanner.nextInt();

        boolean divisibleBy3 = (num % 3 == 0);
        boolean divisibleBy5 = (num % 5 == 0);

        if (divisibleBy3 && divisibleBy5)
            System.out.println("FIzzBuzz");
        else if (divisibleBy5)
            System.out.println("Fizz");
        else if (divisibleBy3)
            System.out.println("Buzz");
        else
            System.out.println(num);
    }
}
