package com.core.java.assignment6;

import java.util.ArrayList;
import java.util.List;

public class VampireNumbers {
    public static void main(String[] args) {
        List<Long> vampireNumbers = new ArrayList<>();
        long number = 10;

        while (vampireNumbers.size() < 100) {
            if (isVampireNumber(number)) {
                vampireNumbers.add(number);
            }
            number++;
        }
        System.out.println("First 100 Vampire Numbers:");
        for (int i = 0; i < vampireNumbers.size(); i++) {
            System.out.print(vampireNumbers.get(i)+"\t");
        }
    }

    public static boolean isVampireNumber(long number) {
        String numberString = Long.toString(number);
        int length = numberString.length();
        if (length % 2 != 0) {
            return false;
        }
        int[] numDigits = getDigitCount(numberString);
        for (long i = (long) Math.pow(10, (length / 2) - 1); i <= Math.sqrt(number) + 1; i++) {
            if (number % i == 0) {
                long factor1 = i;
                long factor2 = number / i;

                if (isPossibleVampire(factor1, factor2, numDigits,length)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isPossibleVampire(long factor1, long factor2, int[] numDigits,int originalLength) {
        if(hasTrailingZeroes(factor1) && hasTrailingZeroes(factor2)){
            return false;
        }
        int factorLength = Long.toString(factor1).length();

        if (factorLength != originalLength / 2) {
            return false;
        }
        String concatenated = Long.toString(factor1) + Long.toString(factor2);
        int[] concatDigits = getDigitCount(concatenated);
        if (!compareDigitCount(numDigits, concatDigits)) {
            return false;
        }
        return true;
    }

    public static int[] getDigitCount(String number) {
        int[] digitCount = new int[10];
        for (char ch : number.toCharArray()) {
            int digit = ch - '0';
            digitCount[digit]++;
        }
        return digitCount;
    }

    public static boolean compareDigitCount(int[] numDigits, int[] concatDigits) {
        for (int i = 0; i < 10; i++) {
            if (numDigits[i] != concatDigits[i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean hasTrailingZeroes(long number) {
        return number % 10 == 0;
    }
}