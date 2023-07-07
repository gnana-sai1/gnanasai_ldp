package com.core.java.assignment9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        boolean check = Pattern.matches("[A-Z][\\w. !?-]+[.]",text);
        if(check){
            System.out.println("Sentence starts with capital letter and ends with a period");
        }
        else{
            System.out.println("Invalid Sentence");
        }
    }
}
