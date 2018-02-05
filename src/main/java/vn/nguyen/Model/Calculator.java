package vn.nguyen.Model;

import vn.nguyen.service.NumberSource;

/**
 * Created by nals on 11/27/17.
 */
public class Calculator {
    final NumberSource numberSource;
    public Calculator(final NumberSource numberSource) {
        this.numberSource = numberSource;
    }

    public long fetchTwoAndAdd(){
        long firstNumber = numberSource.fetchNumber();
        long secondNumber = numberSource.fetchNumber();
        return firstNumber+secondNumber;
    }
}
