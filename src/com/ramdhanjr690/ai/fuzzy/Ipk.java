package com.ramdhanjr690.ai.fuzzy;

public class Ipk {
    private static double ipk;

    public static double getIpk() {
        return ipk;
    }

    public static void setIpk(double ipk) {
        Ipk.ipk = ipk;
    }

    public double buruk(double inIpk){
        double a = 0;
        double c = 2.00;
        double d = 2.75;
        double hslPerhitungan = 0;


        if (inIpk < c) {
            hslPerhitungan = 1;
        } else if (inIpk > d ) {
            hslPerhitungan = 0;
        } else if (a <= inIpk && inIpk <= c) {
            hslPerhitungan = 1;
        } else if (c < inIpk && inIpk <= d) {
            hslPerhitungan = -(inIpk - d)/(d - c);
        }
        return hslPerhitungan;
    }

    public double cukup(double inIpk) {
        double a = 2.00;
        double b = 2.75;
        double c = 3.25;
        double hslPerhitungan = 0;

        if (inIpk <= a && inIpk >= c) {
            hslPerhitungan = 0;
        } else if (a < inIpk && inIpk <= b) {
            hslPerhitungan = (inIpk - a)/(b - a);
        } else if (b < inIpk && inIpk <= c) {
            hslPerhitungan = -(inIpk - c)/(c - b);
        }
        return hslPerhitungan;
    }

    public double bagus(Double inIpk) {
        double a = 2.75;
        double b = 3.25;
        double c = 4.00;
        double hslPerhitungan = 0;

        if (inIpk <= a ) {
            hslPerhitungan = 0;
        } else if (inIpk >= c) {
            hslPerhitungan = 1;
        } else if (a < inIpk && inIpk < b) {
            hslPerhitungan = (inIpk - a)/(b - a);
        } else if (b <= inIpk && inIpk <= c) {
            hslPerhitungan = 1;
        }
        return hslPerhitungan;
    }
}
