package com.company;

import java.math.BigDecimal;

public class Driver {

    public static void main(String[] args) {
        double []  A = {36.67, 8.34, 41.67, 43.34, 71.67, 63.34, 76.67, 56.67, 28.34, 33.34, 63.34, 78.34, 63.34, 71.67, 83.34, 56.67, 46.67, 58.34, 78.34, 73.34, 61.67, 26.67, 53.34, 51.67, 18.34, 31.67, 66.67, 63.34, 83.34, 53.34, 43.34, 36.67, 31.67, 71.67, 66.67, 78.34, 81.67, 48.34, 71.67, 76.67, 61.67, 56.67, 71.67, 63.34, 46.67, 83.34, 71.67, 63.34, 61.67, 8.34, 73.34, 76.67, 73.34, 56.67, 63.34, 68.34, 71.67, 63.34, 73.34, 73.34, 53.34, 71.67, 56.67, 86.67, 93.34, 83.34};

        Math_Functions m = new Math_Functions();

        double [] x = new double[]{1,2,3,4,5,6,7,8,9,10,1.4};
        double mad = m.MAD(x);
        System.out.println(mad);
        m.arccos(5);
        
        // Examples of ab function
        System.out.println(m.ab(-2.4, 1.32, 3.6));
        System.out.println(m.ab(2, 3, 4));

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
        try {
            System.out.println(BigDecimal.valueOf(m.log(1999999999,-10)).toPlainString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Exponentiate function examples
        System.out.println(m.exponentiate(2, 3)); // 8.0
        System.out.println(m.exponentiate(3, -2)); // 0.1111111111111111
        System.out.println(m.exponentiate(2, 0.5)); // 1.4142135623730951
        System.out.println(m.exponentiate(-2, 3)); // -8.0
        try {
            System.out.println(m.exponentiate(-2, 0.5));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
