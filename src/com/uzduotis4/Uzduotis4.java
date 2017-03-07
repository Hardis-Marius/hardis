package com.uzduotis4;


import java.util.Scanner;

public class Uzduotis4 {
    public Uzduotis4() {
        double x, y, z, d;
        System.out.println("Iveskite savo mase kd");
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        System.out.println("Iveskite savo ugi metrais");
        y = in.nextDouble();
        y = Math.pow(y, 2);
        z = (y * 100) / x;
        d = Math.floor(z);
        System.out.println("Jusu KMI" + d);
    }
}
