package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // take two values, divide one by the other.
        // both must be double

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a numeric value: ");
        double n1 = scanner.nextDouble();
        System.out.print("Enter a numeric value: ");
        double n2 = scanner.nextDouble();

        double answer = n1 / n2;
        System.out.println("The answer is " + answer);
    }
}
