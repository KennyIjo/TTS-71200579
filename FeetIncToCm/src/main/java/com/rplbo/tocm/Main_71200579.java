package com.rplbo.tocm;

public class Main_71200579 {
    public static double FeetIncToCm(double feet, double inc) {
        if (feet <= 0 && inc <= 0 || inc > 12) {
            return -1;
        } else {
            double feetinc = feet * 12;
            double inccm = (feetinc + inc) * 2.54;
            System.out.println("Nilai dalam centimeter: " + inccm + "cm");
            return inccm;
        }
    }
    public static double FeetIncToCm(int inc) {
        if (inc <= 0) {
            return -1;
        } else {
            double incfeet = inc / 12;
            double incinc = inc % 12;
            System.out.println(inc + " inc = " + incfeet + " feet " + incinc + " inc ");
            FeetIncToCm(incfeet, incinc);
            return incinc;
        }
    }
    public static void main (String[] args){
        FeetIncToCm(1, 3);
        FeetIncToCm(15);
    }
}