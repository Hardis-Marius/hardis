package com.Uzduotis;

import java.util.Scanner;

public class Uzduotis1_5 {
    public Uzduotis1_5(int ilgis) {
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        int[] masyvas = new int[ilgis];
        for (int i = 0; i < masyvas.length;  i++){
            System.out.println("Iveskite"+(i+1)+"a skaicius, skaicius turi buti");
            masyvas[1]= sc.nextInt();
    }
    int suma = 0;
        for (int i = 0; i< masyvas.length; i++){
            System.out.print("Ivesti skaiciai"+masyvas[i]);
            suma += masyvas[i];
        }
        System.out.print("Visu Skaiciu Suma Ira"+suma);
    }

}
