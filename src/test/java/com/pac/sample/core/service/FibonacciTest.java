package com.pac.sample.core.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RobCastellow on 8/21/16.
 */
public class FibonacciTest {

    @Test
    public void getId() throws Exception {
        Fibonacci fibonacci = new Fibonacci(1l, 3);
        assertEquals(1l, fibonacci.getId());
    }

    @Test
    public void getValue() throws Exception {
        Fibonacci fibonacci = new Fibonacci(1l, 3);
        assertEquals(3, fibonacci.getValue());
    }

    @Test
    public void getFibonacciValue() throws Exception {
        Fibonacci fibonacci = new Fibonacci(1l, 15);
        assertEquals(610, fibonacci.getFibonacciValue());
    }

}