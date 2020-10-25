package com.company;
/*
----------------------------------------------------------------------------------------------------------------
Problem 2:
----------------------------------------------------------------------------------------------------------------
Es gibt eine Array mit n positive Zahlen.
Finden Sie die maximale Zahl.
Finden Sie die minimale Zahl.
Finden Sie die maximale Summe von n-1 Zahlen.
z.B. [4, 8, 3, 10, 17] => 4 + 8 + 10 + 17 = 39
Finden Sie die minimale Summe von n-1 Zahlen.
z.B. [4, 8, 3, 10, 17] => 4 + 8 + 3 + 10 = 25
 */


import java.util.ArrayList;
import java.util.Collections;


public class Aufgabe2 {

    public int maxim(ArrayList<Integer> zahlen){

       /* Old:
       int max=0;
        for(int zahl : zahlen ){
            if (zahl>max)
            {max=zahl;}
        }
        return max; */
        //Update:
        return Collections.max(zahlen);
    }

    public int minim(ArrayList<Integer> zahlen){

       /* Old:
       int min= Integer.MAX_VALUE;
        for(int zahl : zahlen ){
            if (zahl<min)
                min=zahl;
        }
        return min; */
        //Update:
        return Collections.min(zahlen);
    }
    public int sum_max(ArrayList<Integer> zahlen) {
        int sum=0;
       // Collections.sort(zahlen);
       // for(int zahl:zahlen)
         //  System.out.println(zahl);
        for(int zahl:zahlen)
            sum+=zahl;
        return sum-minim(zahlen);
    }

    public int sum_min(ArrayList<Integer> zahlen) {
        int sum=0;
        for(int zahl:zahlen)
            sum+=zahl;
        return sum-maxim(zahlen);



    }
}
