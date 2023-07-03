package com.core.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try {
            Scanner readFile = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: "+file.toString());
            //throw new RuntimeException(e);
        }
    }
}
