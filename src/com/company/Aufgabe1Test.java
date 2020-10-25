package com.company;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class Aufgabe1Test {
    /* Ich habe Fisture versucht, execute hat er nicht
    @BeforeEach
    public void MysetUp(){
        System.out.print("SetUp "+ '\n');
        Aufgabe1 auf1 = new Aufgabe1();
        ArrayList<Integer> grades_list = new ArrayList<Integer>(10);
        grades_list.add(35);
        grades_list.add(93);
        grades_list.add(75);
        grades_list.add(83);
        grades_list.add(82);
        grades_list.add(23);
        grades_list.add(19);
        grades_list.add(39);
        ArrayList<Integer> expected_grades = new ArrayList<Integer>(10);
        expected_grades.add(35);
        expected_grades.add(23);
        expected_grades.add(19);
        expected_grades.add(39);
    }
*/


    @org.junit.jupiter.api.Test
    void nicht_ausreichend() {
        Aufgabe1 auf1 = new Aufgabe1();
        ArrayList<Integer> grades_list = new ArrayList<Integer>(10);
        grades_list.add(35);
        grades_list.add(93);
        grades_list.add(75);
        grades_list.add(83);
        grades_list.add(82);
        grades_list.add(23);
        grades_list.add(19);
        grades_list.add(39);
        ArrayList<Integer> expected_grades = new ArrayList<Integer>(10);
        expected_grades.add(35);
        expected_grades.add(23);
        expected_grades.add(19);
        expected_grades.add(39);
        assertEquals( expected_grades,auf1.nicht_ausreichend(grades_list));
        //expected_grades.add(36);
        //assertEquals( expected_grades,auf1.nicht_ausreichend(grades_list));// Expecting the test to fail:check

    }

    @org.junit.jupiter.api.Test
    void durchschnitt() {
        Aufgabe1 auf1 = new Aufgabe1();
        ArrayList<Integer> grades_list = new ArrayList<Integer>(10);
        grades_list.add(40);
        grades_list.add(75);
        assertEquals(57.5, auf1.durchschnitt(grades_list));
    }

    @org.junit.jupiter.api.Test
    void abgerundet() {
        Aufgabe1 auf1 = new Aufgabe1();
        ArrayList<Integer> grades_list = new ArrayList<Integer>(10);
        grades_list.add(40);
        grades_list.add(72);
        grades_list.add(74);
        grades_list.add(37);
        ArrayList<Integer> grades_expected = new ArrayList<Integer>(10);
        grades_expected.add(40);
        grades_expected.add(72);
        grades_expected.add(75);
        grades_expected.add(37);
        assertEquals( grades_expected,auf1.abgerundet(grades_list));
    }

    @org.junit.jupiter.api.Test
    void maximal_abgerundet() {
        Aufgabe1 auf1 = new Aufgabe1();
        ArrayList<Integer> grades_list = new ArrayList<Integer>(10);
        grades_list.add(40);
        grades_list.add(72);
        grades_list.add(74);
        grades_list.add(37);
        assertEquals( 75,auf1.maximal_abgerundet(grades_list));

    }
}