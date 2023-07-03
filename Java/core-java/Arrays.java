package com.core.java;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers={3,6,8,9};

        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        int [][] multi = {{8,6,7},{7,90,87,45},{89,43,23,15}};
        for (int i=0 ;i< multi.length;i++){
            for (int j=0;j<multi[i].length;j++){
                System.out.print(multi[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
