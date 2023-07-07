package com.core.java.assignment4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Assignment4 {

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[][] input = new String[n][2];
        String signupDateStr="";
        String currentDateStr="";
        for(int i=0;i<n;i++){
            String line = scanner.nextLine();
            String[] dates = line.split(" ");
            signupDateStr = dates[0];
            currentDateStr = dates[1];
        }


        for (int i = 0; i < n; i++) {



            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date signupDate = dateFormat.parse(signupDateStr);
            Date currentDate = dateFormat.parse(currentDateStr);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(signupDate);
            int signUpYear= calendar.get(Calendar.YEAR);

            Calendar presentDate = Calendar.getInstance();
            presentDate.setTime(currentDate);

            int presentYear = presentDate.get(Calendar.YEAR);

            Calendar startDate = (Calendar) calendar.clone();
            startDate.add(Calendar.DAY_OF_MONTH,-30);
            startDate.set(Calendar.YEAR,presentYear);


            Calendar endDate = (Calendar) calendar.clone();
            endDate.set(Calendar.YEAR,presentYear);
            endDate.add(Calendar.DAY_OF_MONTH,30);

            if(presentDate.after(startDate)  && presentDate.before(endDate)){
                String startDateStr = dateFormat.format(startDate.getTime());
                String endDateStr = dateFormat.format(presentDate.getTime());
                System.out.println(startDateStr + " " + endDateStr);
            }

            else if(presentDate.after(endDate)){
                String startDateStr = dateFormat.format(startDate.getTime());
                String endDateStr = dateFormat.format(endDate.getTime());
                System.out.println(startDateStr + " " + endDateStr);
            }

            else if(presentYear == signUpYear){
                System.out.println("No range");
            }
        }

//        5
//        16-07-1998 27-06-2017
//        04-02-2016 04-04-2017
//        04-05-2017 04-04-2017
//        04-04-2015 04-04-2016
//        04-04-2015 15-03-2016

    }
}