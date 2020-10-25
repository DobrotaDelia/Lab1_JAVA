package com.company;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class Aufgabe3Test {

    @Test
    void sum() {
        Aufgabe3 auf3 = new Aufgabe3();
        int a[] = new int[] { 9, 9, 0, 0, 0, 0, 0, 0};
        int b[] = new int[] { 8, 7, 0, 0, 0, 0, 0, 0};
        BigInteger result = new BigInteger("186000000");
        assertEquals(result, auf3.sum(a,b));
    }

    @Test
    void diff() {
        Aufgabe3 auf3 = new Aufgabe3();
        int a[] = new int[] { 9, 9, 0, 0, 0, 0, 0, 0};
        int b[] = new int[] { 8, 7, 0, 0, 0, 0, 0, 0};
        BigInteger result = new BigInteger("12000000");
        assertEquals(result, auf3.diff(a,b));
    }

    @Test
    void mul() {
        Aufgabe3 auf3 = new Aufgabe3();
        int a[] = new int[] { 9, 9, 0, 0, 0, 0, 0, 0};
        int b=2;
        BigInteger result = new BigInteger("198000000");
        assertEquals(result, auf3.mul(a,b));
    }

    @Test
    void div() {
        Aufgabe3 auf3 = new Aufgabe3();
        int a[] = new int[] { 9, 9, 0, 0, 0, 0, 0, 0};
        int b=2;
        BigInteger result = new BigInteger("49500000");
        assertEquals(result, auf3.div(a,b));
    }
}