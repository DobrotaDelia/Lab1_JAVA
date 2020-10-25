package com.company;
import java.util.Arrays;
import java.util.Collections;

import java.util.List;

/*
Markus will ein USB Laufwerk und eine Tastatur kaufen. Der Elektronik-Shop hat verschiedene USB Laufwerke und Tastaturen mit verschiedene Preise.
Schreiben Sie eine Methode, die die billigste Tastatur zurückgibt.
z.B. [40 35 70 15 45] => 15
Schreiben Sie eine Methode, die die teuerste Gegenstand zurückgibt.
z.B. Tastatur = [15 20 10 35], USB = [20, 15, 40 15] => 40
Schreiben Sie eine Methode, die die teuerste USB Laufwerk, die Markus kaufen kann, zurückgibt.
z.B. Preise = [15 45 20], Budget = 30 => 20
Finden Sie, anhand des Markus Budget und der Preislisten für die Tastaturen und USB-Laufwerke, den Geldbetrag Markus ausgeben wird. Wenn er nicht genug für beide hat, geben Sie stattdessen -1 zurück. Er kauft nur die zwei benötigten Gegenstände.
z.B. b=60, tastaturen = [40 50 60] und usb Laufwerke = [8 12] => 50 + 8 = 58
 */
public class Aufgabe4 {
    public int billigste_Tastatur(Integer []Tast){
        //minimales Wert von List Tast
         return  Collections.min(Arrays.asList(Tast));

    }

    public int teuerste_Gegenstand(Integer []Gegenstand,Integer []Usb){
        //Wir bilden ein einziges Array um den teuersten Gegnstand zu finden
        int aLen = Gegenstand.length;
        int bLen = Usb.length;

        //der kombinierte Array:
        Integer[] result = new Integer[aLen + bLen];
        System.arraycopy(Gegenstand, 0, result, 0, aLen);
        System.arraycopy(Usb, 0, result, aLen, bLen);

        //Max in der kombinierte Arrya
        return  Collections.max(Arrays.asList(result));
    }
    public int teuerste_Laufwerk(Integer []Usbs, int Budget) {
        //bestdeal fur den niedrigsten Gelunterschied, damit der Budget erfullt ist
        //best buy = den teuersten USB der Markus sich leisten kann
        int bestdeal=Budget,bestbuy=0;

        for (int usb : Usbs) {
            if (usb == Budget)  //Usb ist genau das Budget
                return usb;
            int dif = Budget - usb; //Speichern von Geldunterschied
            if (dif<bestdeal && dif>0) { //Prufen ob das gefundene Deal besser ist, als den vorherigen besten
                bestdeal = dif;
                bestbuy = usb;
            }
        }
        return bestbuy; //Preis von Usb
    }
   public int markus_sichleistet(Integer []Usbs, Integer []Tast, int budget){
        //bestt=Tastatur, bestu=Usb
       int bestt=0, bestu=0;
      /* int []bestt = new int[]; Fur mehrere Moglichkeiten von Preis Kombinationen , hatte ich die Preise ins Array gespeichert
       int i=0;
       int []bestu = new int[];  zb Tastatur 40 mit Usb 10 oder Tastatur 30 mit Usb 20
       int j=0; */

       Collections.sort(Arrays.asList(Usbs));
       Collections.sort(Arrays.asList(Tast));

       //Wir suchen in die sortierte Preise die teuerste Kombination von Tastatur+Usb
       //z.B. b=60, tastaturen = [40 50 60] und usb Laufwerke = [8 12] => 50 + 8 = 58
       for(int t:Tast) {
           for(int usb:Usbs) {
               if (t + usb <= budget) {
                   //bestt[i] = t; i++; System.out.print("Tastatur: " + t); andere Moglichkeit
                   //bestu[j] = usb; j++;  System.out.print("Usb: " + usb + '\n');

                  bestt = t; //System.out.print("Tastatur: " + t);
                  bestu = usb; //System.out.print("Usb: " + usb + '\n');
               }
           }

        }
       if(bestt!=0)
           return bestt+bestu;
       else return  -1; //nicht leisten => Keine Kombination von Tastatur und Ub wurde gefunden
         
    }

}

