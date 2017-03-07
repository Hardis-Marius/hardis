package com.Uzduotis;

import java.util.Scanner;

public class Uzduotis1_5 {
    int[] masyvas;

    public Uzduotis1_5() {
    }

    public void nuskaitymas(int ilgis) {

        Scanner sc = new Scanner(System.in);
        masyvas = new int[ilgis];
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("Iveskite" + (i + 1) + "a skaicius, skaicius turi buti");
            masyvas[i] = sc.nextInt();
        }
    }

    public void skaiciavimas() {
        int suma = 0;
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("Ivesti skaiciai" + masyvas[i]);
            suma += masyvas[i];
        }
        System.out.println("Visu Skaiciu Suma Ira" + suma);
    }
}


