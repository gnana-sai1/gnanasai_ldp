package com.core.java;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListandLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> vals = new ArrayList<Integer>();
        LinkedList<Integer> ll = new LinkedList<Integer>();
        vals.add(4);
        vals.add(7);
        vals.add(10);
        for(Integer val : vals){
            System.out.println(val);
        }
    }
}
