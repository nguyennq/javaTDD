package vn.nguyen.service.impl;

import vn.nguyen.service.NumberSource;

/**
 * Created by nals on 11/27/17.
 */
public class NumberSourceImpl implements NumberSource {
    private NumberSource numberSource;

    public NumberSourceImpl(NumberSource numberSource) {
        this.numberSource = numberSource;
    }

    public long fetchNumber() {
        return 0;
    }

    public long addTwoNumber(long firstNumber, long secondNumber) {
        return firstNumber + secondNumber;
    }

}
