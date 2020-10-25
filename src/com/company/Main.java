package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //  AUFGABE1
        System.out.print("Aufgabe1" + '\n');
        Aufgabe1 auf1 = new Aufgabe1();
        ArrayList<Integer> grades = new ArrayList<Integer>(10);
        grades.add(29);
        grades.add(94);
        grades.add(73);
        grades.add(72);
        grades.add(38);
        auf1.nicht_ausreichend(grades);
        System.out.println("a)" + auf1.nicht_ausreichend(grades));
        System.out.println("b)" + auf1.durchschnitt(grades));
        //System.out.println( auf1.abrunden(55));
        System.out.println("c)" + auf1.abgerundet(grades));
        System.out.println( "d)" +auf1.maximal_abgerundet(grades)+ '\n');

        //AUFGABE2
        System.out.print("Aufgabe2" + '\n');
        Aufgabe2 auf2 = new Aufgabe2();
        ArrayList<Integer> numbers = new ArrayList<Integer>(5);
        numbers.add(20);
        numbers.add(2);
        numbers.add(25);
        numbers.add(7);
        System.out.print("a)" + auf2.maxim(numbers));
        System.out.print('\n' + "b)" + auf2.minim(numbers));
        System.out.print('\n' + "c)" + auf2.sum_max(numbers));
        System.out.print('\n' + "d)" + auf2.sum_min(numbers) + '\n');

        //AUFGABE3
        System.out.print('\n' +  "Aufgabe3" + '\n');
        Aufgabe3 auf3 = new Aufgabe3();
        int a[] = new int[] { 1, 3, 0, 0, 0, 0, 0, 0, 0};
        int b[] = new int[] { 8, 7, 0, 0, 0, 0, 0, 0, 0};
        //String strOfInts = Arrays.toString(a).replaceAll("\\[|\\]|,|\\s", "");
        System.out.print("a)" + auf3.sum(a,b));
        int c[] = new int[] { 8, 3, 0, 0, 0, 0, 0, 0, 0};
        int d[] = new int[] { 5, 4, 0, 0, 0, 0, 0, 0, 0};
        System.out.print('\n' + "b)" + auf3.diff(c,d));
        int e[] = new int[] { 2, 3, 6, 0, 0, 0, 0, 0, 0};
        int f =2;
        System.out.print('\n' + "c)" + auf3.mul(e,f));
        System.out.print('\n' + "d)" + auf3.div(e,f)+ '\n');

        //AUFGABE4
        System.out.print('\n' +  "Aufgabe4" + '\n');
        Aufgabe4 auf4 = new Aufgabe4();
        Integer t[] = new Integer[] { 40, 35, 20, 70, 15};
        System.out.print("a)" + auf4.billigste_Tastatur(t));
        Integer g[] = new Integer[] { 50, 80, 200, 70, 15};
        System.out.print('\n' + "b)" + auf4.teuerste_Gegenstand(g,t));
        Integer usb[] = new Integer[] { 86, 82, 83, 84, 70, 15};
        int Budget=85;
        System.out.print('\n' + "c)" + auf4.teuerste_Laufwerk(usb,Budget));
        System.out.print('\n');
        Integer tast4[] = new Integer[] { 40, 50, 60};
        Integer usb4[] = new Integer[] { 8, 12};
        int budget=60;
        System.out.print( "d)" + auf4.markus_sichleistet(usb4,tast4,budget));




    }

}


