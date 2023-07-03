package com.core.java;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer,String> mp = new HashMap<Integer,String>();
        mp.put(2,"Cat");
        mp.put(1,"Dog");
        mp.put(8,"Cow");

        for (Map.Entry<Integer,String> var: mp.entrySet()){
            int key= var.getKey();
            String value= var.getValue();
            System.out.println(key+" "+value);
        }
    }

}
