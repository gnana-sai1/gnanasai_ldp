package com.core.java;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String greet = "Hi";
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println(greet+" "+name);
    }
}
