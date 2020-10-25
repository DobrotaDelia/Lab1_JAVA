package com.company;
import java.math.BigInteger;
import java.util.Arrays;

/*
 Es gibt 2 große Zahlen. Die Zahlen sind als Array dargestellt.
         Berechnen Sie die Summe. Die Zahlen haben die gleiche Anzahl an Ziffern.
         z.B. [1 3 0 0 0 0 0 0 0] + [8 7 0 0 0 0 0 0 0] = [1 0 0 0 0 0 0 0 0 0]
         Berechnen Sie die Differenz. Die Zahlen haben die gleiche Anzahl an Ziffern.
         z.B. [8 3 0 0 0 0 0 0 0] - [5 4 0 0 0 0 0 0 0] = [2 9 0 0 0 0 0 0 0]
         Berechnen Sie die Multiplikation. Erste Zahl ist ein große Zahl, der Zweite Zahl ist nur ein Ziffer.
         z.B. [2 3 6 0 0 0 0 0 0] * 2 = [4 7 2 0 0 0 0 0 0]
         Berechnen Sie die ganzzahlige Division. Erste Zahl ist ein große Zahl, der Zweite Zahl ist nur ein Ziffer.
         z.B. [2 3 6 0 0 0 0 0 0] / 2 = [1 1 8 0 0 0 0 0 0]
*/
public class Aufgabe3 {


    public  BigInteger sum( int []a, int [] b){
        //Converting the arrays to string:
        String str1 = Arrays.toString(a).replaceAll("\\[|\\]|,|\\s", "");
        String str2 = Arrays.toString(b).replaceAll("\\[|\\]|,|\\s", "");
        //System.out.print(str1+'\n'+str2);

        //a+b=result
        BigInteger result;
        //string->BigInteger
        BigInteger nr1 = new BigInteger(str1);
        BigInteger nr2 = new BigInteger(str2);
        //using add method for BigInteger
        return result=nr1.add(nr2);


    }
    public  BigInteger diff( int []a, int [] b){
        //Converting the arrays to string:
        String str1 = Arrays.toString(a).replaceAll("\\[|\\]|,|\\s", "");
        String str2 = Arrays.toString(b).replaceAll("\\[|\\]|,|\\s", "");
        //System.out.print(str1+'\n'+str2);

        //a+b=result
        BigInteger result;
        //string->BigInteger
        BigInteger nr1 = new BigInteger(str1);
        BigInteger nr2 = new BigInteger(str2);
        //using add method for BigInteger
        return result=nr1.subtract(nr2);


    }

    public  BigInteger mul( int []a, int b){
        //Converting the large number(array) to string:
        String str1 = Arrays.toString(a).replaceAll("\\[|\\]|,|\\s", "");

        //a*b=result
        BigInteger result;
        //string->BigInteger
        BigInteger nr1 = new BigInteger(str1);
        //int->BitInteger; cannot use"*" with BigInteger
        BigInteger nr2 = BigInteger.valueOf(b);
        //using multiply method for BigInteger
        return result=nr1.multiply(nr2);

    }
    public  BigInteger div( int []a, int b){
        //Converting the large numebr(array) to string:
        String str1 = Arrays.toString(a).replaceAll("\\[|\\]|,|\\s", "");

        //a/b=result
        BigInteger result;
        //string->BigInteger
        BigInteger nr1 = new BigInteger(str1);
        BigInteger nr2 = BigInteger.valueOf(b);
        //using divide method for BigInteger
        return result=nr1.divide(nr2);

    }
}
