package com.company;

public class Driver {

    public static void main(String[] args) {

        Math_Functions m = new Math_Functions();
        double [] x = new double[]{1,2,3,4,5,6,7,8,9,10,1.4};
        double mad = m.MAD(x);
        System.out.println(mad);
        m.arccos(5);

    }
}
