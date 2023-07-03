package com.core.java;

import java.io.IOException;
import java.text.ParseException;

public class MultipleExceptionsDriver {
    public static void main(String[] args) {
        MultipleExceptions me = new MultipleExceptions();
        try {
            me.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            //throw new RuntimeException(e);
            System.out.println("Incorrect syntax");
        }
        try {
            me.example();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
