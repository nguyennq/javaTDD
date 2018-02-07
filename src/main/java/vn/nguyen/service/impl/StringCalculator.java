package vn.nguyen.service.impl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nals on 2/2/18.
 */
public class StringCalculator {
    public static int add(String numbers) {
        String delimiter = ",|\n";
        String numbersWithoutDelimiter = numbers;
        if(numbers.startsWith("//")){
            int delimiterIndex = numbers.indexOf("//") + 2;
            delimiter = numbers.substring(delimiterIndex,delimiterIndex + 1);
            numbersWithoutDelimiter = numbers.substring(numbers.indexOf("\n") + 1);
        }
        return add(numbersWithoutDelimiter,delimiter);
//        int returnValue = 0;
//        String[] numbersArray = numbers.split(",|n");
////        if(numbersArray.length > 2){
////            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
////        }
////        else {
//            for (String number : numbersArray){
//                if(! number.trim().isEmpty()) {
//                    returnValue = Integer.parseInt(number.trim()) + returnValue;
//                }
//            }
////        }
//        return returnValue;
    }

    private static int add(String numbersWithoutDelimiter, String delimiter) {
        int returnValue = 0;
        String[] numbersArray = numbersWithoutDelimiter.split(delimiter);
        List<Integer> negativeNumbers = new ArrayList<Integer>();

        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                int numberInt = Integer.parseInt(number.trim());
                if(numberInt < 0){
                    negativeNumbers.add(numberInt);
                }

                returnValue = numberInt + returnValue;
            }
        }
        if(negativeNumbers.size() > 0){
            throw new RuntimeException("Negative not allowed: " + negativeNumbers.toString());
        }
        return returnValue;
    }
}
