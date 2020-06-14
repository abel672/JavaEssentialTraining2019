package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        var file = new File("hello.txt");
        System.out.println("File exists: " + file.exists());

        // objects in () will be close automatically after their use (to evade lick memory)
        // objects that needs to be close, have the interface "Closeable" in their implementation
        try (FileReader reader = new FileReader(file);
             BufferedReader br = new BufferedReader(reader)) {

            var text = br.readLine();
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
