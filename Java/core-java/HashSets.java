package com.core.java;

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        HashSet<String> test1 = new HashSet<String>();
        test1.add("blue");
        test1.add("green");
        test1.add("yellow");
        test1.add("white");
        test1.add("black");
        for(String color: test1){
            System.out.println(color);
        }
        if(test1.contains("orange")){
            System.out.println("Contains orange");
        }
        if(test1.contains("white")){
            System.out.println("Contains white");
        }


        HashSet<String> test2 = new HashSet<String>();
        test2.add("blue");
        test2.add("green");
        test2.add("yellow");
        test2.add("white");
        test2.add("black");
        test2.add("purple");

//        HashSet<String> commonItems = new HashSet<String>(test1);
//        commonItems.retainAll(test2);
//        System.out.println(commonItems);
        HashSet<String> diffItems = new HashSet<String>(test2);
        diffItems.removeAll(test1);
        System.out.println(diffItems);
    }
}
