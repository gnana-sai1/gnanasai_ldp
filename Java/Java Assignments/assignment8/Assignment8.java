package com.core.java.assignment8;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

class Test{
    public void throwException() throws NullPointerException, FileNotFoundException, ParseException {
//        String empty = null;
//        System.out.println(empty.length());

        File file = new File("example.txt");
        Scanner readFile =new Scanner(file);
//
//        throw new ParseException("Error at line 34",3);

    }
}

public class Assignment8 {
    public static void main(String[] args) throws NullPointerException,FileNotFoundException, ParseException {
        Test test= new Test();
        try {
            test.throwException();
        } catch (Exception e){
            throw new RuntimeException(e);
        }finally{
            System.out.println("Executed");
        }

    }

}
