package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double i1 = 0, i2 = 0;
        try {
            System.out.print("Enter a numeric value: ");
            i1 = scanner.nextDouble();
            System.out.print("Enter a numeriv value: ");
            i2 = scanner.nextDouble();

        } catch (InputMismatchException e) {
            System.out.println("Could not format as a number");
            return;
        }
        System.out.print("Select an operation (+ - * /): ");
        String operation = scanner.next();

        double result;
        String message = "The answer is ";

        switch (operation) {
            case "+":
                result = i1 + i2;
                message += result;
                break;
            case "-":
                result = i1 - i2;
                message += result;
                break;
            case "*":
                result = i1 * i2;
                message += result;
                break;
            case "/":
                result = i1 / i2;
                message += result;

                break;
            default:
                message = "Operation not supported";
        }
        System.out.println(message);
    }

}

