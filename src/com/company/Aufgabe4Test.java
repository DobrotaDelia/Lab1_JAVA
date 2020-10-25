package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Aufgabe4Test {

    @Test
    void billigste_Tastatur() {
        Aufgabe4 auf4 = new Aufgabe4();
        Integer t[] = new Integer[] { 20, 35, 18, 70, 15};
        assertEquals(15, auf4.billigste_Tastatur(t));
    }

    @Test
    void teuerste_Gegenstand() {
        Aufgabe4 auf4 = new Aufgabe4();
        Integer t[] = new Integer[] { 20, 35, 18, 70, 15};
        Integer g[] = new Integer[] { 50, 80, 100, 70, 15};
        assertEquals(100, auf4.teuerste_Gegenstand(g,t));
    }

    @Test
    void teuerste_Laufwerk() {
        Aufgabe4 auf4 = new Aufgabe4();
        Integer usb[] = new Integer[] { 85, 84, 83, 82, 80, 79};
        int Budget=80;
        assertEquals(80, auf4.teuerste_Laufwerk(usb,Budget));
    }

    @Test
    void markus_sichleistet() {
        Aufgabe4 auf4 = new Aufgabe4();
        Integer usb[] = new Integer[] { 15, 20, 30, 35};
        Integer tast[] = new Integer[] { 60, 70, 75, 90, 95};
        int Budget=106;
        assertEquals(105, auf4.markus_sichleistet(usb,tast,Budget));
    }
}