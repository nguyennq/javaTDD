package vn.nguyen.service;

/**
 * Created by nals on 11/27/17.
 */
public interface NumberSource {
    long fetchNumber();
    long addTwoNumber(long firstNumber, long secondNumber);
}
