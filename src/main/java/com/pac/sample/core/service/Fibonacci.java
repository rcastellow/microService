package com.pac.sample.core.service;

/**
 * Created by RobCastellow on 8/21/16.
 */
public class Fibonacci {

    private final long id;
    private final int value;
    private final int fibonacciValue;

    public Fibonacci(long id, int value) {
        this.id = id;
        this.value = value;
        this.fibonacciValue = determineFibonacci(value);
    }

    private int determineFibonacci(int n) {
        if (n <= 1) return n;
        return determineFibonacci(n - 1) + determineFibonacci(n - 2);
    }

    public long getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public int getFibonacciValue() {
        return fibonacciValue;
    }
}
