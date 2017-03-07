package com.Uzduotis;
import java.util.Scanner;


public class Uzduotis1_6 {

    public Uzduotis1_6() {
    }

    public void nuskaitymas2() {

        Scanner s = new Scanner(System.in);

        System.out.println("ivesk kiek nori zodziu");

        int n = s.nextInt();

        String arr[] = new String[n];

        System.out.println("vesk " + n + " zodzius");

        for (int i = 0; i < n; i++) {
            arr[i] = s.next();

        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}