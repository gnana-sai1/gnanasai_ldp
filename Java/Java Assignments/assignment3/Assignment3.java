package com.core.java.assignment3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class Assignment3 {
    public static void pingHost(String ipAddress) throws UnknownHostException, IOException {
        InetAddress address = InetAddress.getByName(ipAddress);
        long startTime = new GregorianCalendar().getTimeInMillis();
        long endTime = 0;
        List<Long> pingTimes = new ArrayList<>();
        for (int i=0;i<10;i++){
            if (address.isReachable(5000)) {
                endTime = new GregorianCalendar().getTimeInMillis();
                long pingTime = endTime - startTime;
                pingTimes.add(pingTime);

                System.out.println("Time taken: " + pingTime + "ms");
            }
        }


        if (!pingTimes.isEmpty()) {

            Collections.sort(pingTimes);
            int size = pingTimes.size();
            double median;
            if (size % 2 == 0) {
                median = (pingTimes.get((size / 2) - 1) + pingTimes.get(size / 2)) / 2.0;
            } else {
                median = pingTimes.get(size / 2);
            }
            System.out.println("Median time taken: " + median + "ms");
            System.out.println("IP address is reachable");
        }
        else {
            System.out.println("This address can't be reached");
        }
    }


    public static void main(String[] args) throws UnknownHostException,IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ip address:");
        String ipAddress = input.nextLine();

        pingHost(ipAddress);



        //192.168.1.121
        //10.10.10.10
        //127.0.0.1

    }
}
