package com.pac.sample.core.service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RobCastellow on 8/21/16.
 */
public class Factor {

    private final long id;
    private final int value;
    private final List<Integer> factorValues;

    public Factor(long id, int value) {
        this.id = id;
        this.value = value;
        this.factorValues = determineFactor(value);
    }

    private List<Integer> determineFactor(int value) {
        List<Integer> factors = new ArrayList<>();
        for (int n = 1; n <= value / 2; n++) {
            if (value % n == 0) factors.add(n);
        }
        factors.add(value); // Include 1 and the number itself
        return factors;
    }

    public long getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public List<Integer> getFactorValues() {
        return factorValues;
    }
}
