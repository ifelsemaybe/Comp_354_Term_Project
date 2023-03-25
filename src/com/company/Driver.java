package com.company;

import java.math.BigDecimal;

public class Driver {

    public static void main(String[] args) {

        Math_Functions m = new Math_Functions();
        double [] x = new double[]{1,2,3,4,5,6,7,8,9,10,1.4};
        double mad = m.MAD(x);
        System.out.println(mad);
        m.arccos(5);

        System.out.println(BigDecimal.valueOf(m.log(10,0.9999999)).toPlainString());
        System.out.println(BigDecimal.valueOf(m.log(10,1000000000)).toPlainString());
        System.out.println(BigDecimal.valueOf(m.log(10,41)).toPlainString());
        System.out.println(BigDecimal.valueOf(m.log(0.2,5)).toPlainString());
        System.out.println(BigDecimal.valueOf(m.log(5,0.1)).toPlainString());
        System.out.println(BigDecimal.valueOf(m.log(5,0.000000000000001)).toPlainString());
        System.out.println(BigDecimal.valueOf(m.log(1000000000,100)).toPlainString());
        System.out.println(BigDecimal.valueOf(m.log(10,1999999999)).toPlainString());
        System.out.println(BigDecimal.valueOf(m.log(1999999999,10)).toPlainString());
        System.out.println(BigDecimal.valueOf(m.log(10,1999999999E24)).toPlainString());
        System.out.println(BigDecimal.valueOf(m.log(1999999999,-10)).toPlainString());
    }
}
