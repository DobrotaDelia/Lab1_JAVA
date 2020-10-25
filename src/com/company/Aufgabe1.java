package com.company;
import java.util.*;
/*
     ----------------------------------------------------------------------------------------------------------------
    Die Java Universität hat die folgenden Benotung Regel:
    Jeder Student bekommt eine Note zwischen 0 und 100.
    Eine Note weniger als 40 ist eine nicht ausreichende Note.
    Der Professor rundet die Note mit die folgenden Regel ab:
    Ob die Differenz zwischen die Note und die nächste multipel von 5 weniger als 3 ist, dann wird die Note zu die nächste multipel von 5 abgerundet.
    Ob die Note weniger als 38 ist, wird die Note nicht abgerundet.
    z.B. 84 => 85
         29 => 29
    Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als die Rückgabewert soll die Methode ein Array mit nicht ausreichende Note liefern.
    Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als die Rückgabewert soll die Methode den Durchschnittswert liefern.
    Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als die Rückgabewert soll die Methode eine Array mit die abgerundete Note liefern.
    Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als die Rückgabewert soll die Methode die maximale abgerundete Note liefern.
     */
public class Aufgabe1 {


    public ArrayList<Integer> nicht_ausreichend(ArrayList<Integer> grades){
        ArrayList<Integer> grades_failed = new ArrayList<Integer>(grades.size()); //Array mit nichtausreichenden Noten
        for(int grade: grades)
        {
            if(grade<40)      //prufen ob eine Note ausrewichend ist
            { grades_failed.add(grade);
             // System.out.println("Nicht ausreichend" + grade);
            }
        }
        return (grades_failed);
    }

    public float durchschnitt(ArrayList<Integer> grades){
        float ct=0,sum=0;
        for(int grade: grades)
        { sum+=grade; //Summe von alle Noten
          ct++;       //Teiler

        }
        float dursch=sum/ct;
        return dursch;
      //  return sum/ct;

    }
    //Abrunden einer Note
    public int abrunden(int x ){
        if(x<38)
            return x;
        int dif =5-(x%5); //Differenz zwischen die Note und die nächste multipel von 5
        if(dif < 3)       // weniger als 3 ist
            x=x+dif;      //abgerundete Note
        return x;


    }
    public ArrayList<Integer> abgerundet(ArrayList<Integer> grades){
        ArrayList<Integer> grades_abgerundet = new ArrayList<Integer>(10); //Array mit die abgerundeten Noten
        for(int grade: grades) {
            grades_abgerundet.add(abrunden(grade));
        }
        return(grades_abgerundet);
    }

    public int maximal_abgerundet(ArrayList<Integer> grades){
       grades= abgerundet(grades);

       //Update:
        return Collections.max(grades); //max in list grades
      /*Old:
      int max=0;
       for(int grade:grades) {//maximale Note suchen
           if (grade > max)
               max=grade;
       }
           return max; */
    }






}