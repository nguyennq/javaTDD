package vn.nguyen.service.impl;

/**
 * Created by nals on 2/2/18.
 */
public class StringCalculator {
    public static int add(String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",");
//        if(numbersArray.length > 2){
//            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
//        }
//        else {
            for (String number : numbersArray){
                if(! number.trim().isEmpty()) {
                    returnValue = Integer.parseInt(number.trim()) + returnValue;
                }
            }
//        }
        return returnValue;
    }
}
