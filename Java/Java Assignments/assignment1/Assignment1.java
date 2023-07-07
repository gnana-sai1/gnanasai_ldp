package com.core.java.assignment1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the regular expression: ");
            String regex = scanner.nextLine();


            if (regex.equalsIgnoreCase("q")) {
                break;
            }

            searchFiles(regex);
        }

        scanner.close();
    }

    private static void searchFiles(String regex) {
        File directoryPath = new File("C:\\Users\\Gnana Sai\\IdeaProjects\\Java-Assignments\\src\\com\\core\\java\\assignment1");
        String contents[] = directoryPath.list();
        List<String> matchingFiles = new ArrayList<>();
        for(int i=0; i<contents.length; i++) {
            boolean matches = Pattern.matches(regex, contents[i]);
            if(matches){
                matchingFiles.add(contents[i]);
            }
        }

        if (matchingFiles.size() > 0) {
            System.out.println("Matching files found:");
            for (String file : matchingFiles) {
                File fileName = new File(file);
                System.out.println("File path: "+fileName.getAbsolutePath());
            }
        } else {
            System.out.println("No matching files found.");
        }
    }
}
// [\w\-. ]+\.(txt|png)
// example.txt
// exam[\w.-]+



