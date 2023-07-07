package com.core.java.assignment2;

import java.util.Scanner;


public class Assignment2 {
    public static boolean checkText(String var) {
        return var.toLowerCase()
                .replaceAll("[^a-z]", "")
                .replaceAll("(.)(?=.*\\1)", "")
                .length() == 26;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = input.nextLine();
        boolean[] visited = new boolean[26];
        int j=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i) >='a' && text.charAt(i)<='z'){
                j = text.charAt(i)-'a';
            }
            else if(text.charAt(i)>='A' && text.charAt(i)<='Z'){
                j= text.charAt(i)-'A';
            }

            visited[j]=true;
        }
        boolean check = true;
        for(int i=0;i<26;i++){
            if(!visited[i]){
                check= false;
                break;
            }
        }
        if(check){
            System.out.println("Matched with given condition");
        }
        else {
            System.out.println("Not matched with given condition");
        }
        //Time Complexity - O(n)
        //Space Complexity - O(n)
    }
}
