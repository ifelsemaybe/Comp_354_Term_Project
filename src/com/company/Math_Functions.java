package com.company;

public class Math_Functions {

    double arccos(double x){ //Alexandar Petrov

        double answer = 2.5;

        return answer;

    }

    double ab(double x){ //Jeremy Piperni

        double answer = 2.5;

        return answer;

    }

    double log(int b, double x){ //Dany Pham

        double answer = 2.5;

        return answer;

    }
    /**
     * Calculates the mean of an array of doubles
     * @param x
     * @return the mean as a double
     */
    double meanArray(double [] x){ //Kevin Patel
        double sum = 0;
        //add each element of the array to the sum
        for(int i = 0; i < x.length; i++){
            sum += x[i];
        }
        //return the mean
        return sum / x.length;
    }

    /**
     * Returns the absolute value of the input without using Math library
     * @param x
     * @return absolute value as double
     */
    static double abs(double x){ //Kevin Patel
        if(x < 0)
            return -x;
        return x;
    }
    /**
     * Returns the mean absolute deviation of the input array
     * @param x
     * @return the mean absolute deviation as a double
     */
    double MAD(double [] x){ //Kevin Patel
        double sum = 0;
        double mean = 0;
        //array for absolute differences
        double [] absDiff = new double[x.length];
        mean = meanArray(x);

        //calculate absolute difference for each element
        for(int i = 0; i < x.length; i++)
            absDiff[i] = abs(x[i] - mean);
        //calculate sum of the absolute differences
        for(int i = 0; i < absDiff.length; i++)
            sum += absDiff[i];

        //return the mean absolute deviation
        return sum / absDiff.length;
    }

    double σ(double x){ //Benjamin Pizarro

        double answer = 2.5;

        return answer;

    }

    double sinh(double x){ //Miraj Patel

        double answer = 2.5;

        return answer;

    }

    double x(double y){ //Kirk

        double answer = 2.5;

        return answer;

    }
}
