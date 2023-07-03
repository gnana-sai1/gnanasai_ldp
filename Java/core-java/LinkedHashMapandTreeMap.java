package com.core.java;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapandTreeMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
        TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
        //sortedMaps(linkedHashMap);
        sortedMaps(treeMap);


    }

    public static void sortedMaps(Map<Integer,String> map){
        map.put(2,"Milk shake");
        map.put(0,"Coffee");
        map.put(4,"Tea");
        map.put(9,"Soft drink");
        map.put(23,"Juice");
        map.put(6,"Butter milk");

        for(Integer numbers: map.keySet()){
            String value = map.get(numbers);
            System.out.println(numbers + " " + value);
        }

    }
}
