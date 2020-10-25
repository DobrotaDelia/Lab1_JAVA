package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Aufgabe2Test {

   /* @BeforeEach
    void setUp() { nu imi cunoaste in celalte functii declaratiile din setup si nu stiu de ce
        Aufgabe2 auf2 = new Aufgabe2();
        ArrayList<Integer> numbers = new ArrayList<Integer>(5);
        numbers.add(60);
        numbers.add(2);
        numbers.add(25);
        numbers.add(10);
    } */

    @Test
    void maxim() {
        Aufgabe2 auf2 = new Aufgabe2();
        ArrayList<Integer> numbers = new ArrayList<Integer>(5);
        numbers.add(60);
        numbers.add(2);
        numbers.add(25);
        numbers.add(10);
        assertEquals(60,auf2.maxim(numbers));
    }

    @Test
    void minim() {
        Aufgabe2 auf2 = new Aufgabe2();
        ArrayList<Integer> numbers = new ArrayList<Integer>(5);
        numbers.add(60);
        numbers.add(2);
        numbers.add(25);
        numbers.add(10);
        assertEquals(2,auf2.minim(numbers));
    }

    @Test
    void sum_max() {
        Aufgabe2 auf2 = new Aufgabe2();
        ArrayList<Integer> numbers = new ArrayList<Integer>(5);
        numbers.add(60);
        numbers.add(2);
        numbers.add(25);
        numbers.add(10);
        assertEquals(95,auf2.sum_max(numbers));

    }

    @Test
    void sum_min() {
        Aufgabe2 auf2 = new Aufgabe2();
        ArrayList<Integer> numbers = new ArrayList<Integer>(5);
        numbers.add(60);
        numbers.add(2);
        numbers.add(25);
        numbers.add(10);
        assertEquals(37,auf2.sum_min(numbers));
    }
}