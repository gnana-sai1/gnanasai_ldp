package com.core.java;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        int a =30;
        if(a>25){
            System.out.println("Greater than 25");
        }
        else if (a<20){
            System.out.println("Less than 20");
        }
        else{
            System.out.println("None of the above");
        }


        Scanner input= new Scanner(System.in);
        System.out.println("Enter your instructions");
        String text = input.nextLine();

        switch (text){
            case"run":
                System.out.println("Program is running");
                break;
            case "stop":
                System.out.println("Stop the program");
                break;
            default:
                System.out.println("Invalid instructions");
        }

    }
}
