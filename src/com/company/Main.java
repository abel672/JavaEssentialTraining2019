package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String prompt = "Enter a numeric value: ";

        var sc = new Scanner(System.in);

        double d1 = getInput(sc, prompt + "1");

        double d2 = getInput(sc, prompt + "2");

        double result = d1 / d2;

        System.out.println("The answer is " + result);
    }

    private static double getInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextDouble();
    }

}
