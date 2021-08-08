package com.ramdhanjr690.ai.fuzzy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Gaji {
    private static double gaji;

    public static double getGaji() {
        return gaji;
    }

    public static void setGaji(double gaji) {
        Gaji.gaji = gaji;
    }

    public double kecil(double inGaji){
        double a = 0;
        double c = 1;
        double d = 3;
        double hslPerhitungan = 0;


        if (inGaji < c) {
            hslPerhitungan = 1;
        } else if (inGaji > d ) {
            hslPerhitungan = 0;
        } else if (a <= inGaji && inGaji <= c) {
            hslPerhitungan = 1;
        } else if (c < inGaji && inGaji <= d) {
            hslPerhitungan = -(inGaji - d)/(d - c);
        }
        return hslPerhitungan;
    }

    public double sedang(double inGaji) {
        double a = 1;
        double b = 3;
        double c = 4;
        double d = 6;
        double hslPerhitungan = 0;

        if (inGaji <= a && inGaji >= d) {
            hslPerhitungan = 0;
        } else if (a < inGaji && inGaji < b) {
            hslPerhitungan = (inGaji - a)/(b - a);
        } else if (b <= inGaji && inGaji <= c) {
            hslPerhitungan = 1;
        } else if (c < inGaji && inGaji <= d) {
            hslPerhitungan = -(inGaji - d)/(d - c);
        }
        return hslPerhitungan;
    }

    public double besar(double inGaji) {
        double a = 4;
        double b = 6;
        double c = 7;
        double d = 12;
        double hslPerhitungan = 0;

        if (inGaji <= a && inGaji >= d) {
            hslPerhitungan = 0;
        } else if (a < inGaji && inGaji < b) {
            hslPerhitungan = (inGaji - a)/(b - a);
        } else if (b <= inGaji && inGaji <= c) {
            hslPerhitungan = 1;
        } else if (c < inGaji && inGaji <= d) {
            hslPerhitungan = -(inGaji - d)/(d - c);
        }
        return hslPerhitungan;
    }

    public double sangatBesar(double inGaji) {
        double a = 7;
        double b = 12;
        double hslPerhitungan = 0;

        if (inGaji <= a) {
            hslPerhitungan = 0;
        } else if (a < inGaji && inGaji < b) {
            hslPerhitungan = (inGaji - a)/(b - a);
        } else if (inGaji > b) {
            hslPerhitungan = 1;
        }

        return hslPerhitungan;
    }
}
