package vn.nguyen.Model;

/**
 * Created by nals on 3/21/18.
 */
public class FizzBuzz {
    public String numberFizzBuzz(int number) {
        if ((number % 3 == 0) & (number % 5 == 0)){
            return "FizzBuzz";
        }
        else if (number % 3 == 0){
            return "Fizz";
        }
        else if (number % 5 == 0){
            return "Buzz";
        }

        return String.valueOf(number);
    }
}
