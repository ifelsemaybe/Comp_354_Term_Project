package com.company;

public class Math_Functions {

    double arccos(double x){ //Alexandar Petrov

        double pi = 3.1415926535897932;

        if (x > 1 || x < -1){

            throw new IllegalArgumentException("Math Error: x must follow -1 ≤ x ≥ 1, domain rule");

        }

//        return pi/2 - x - (x * x * x)/6 - (3 * x * x * x * x * x)/40 - (5 * x * x * x * x * x * x * x)/112 - (35 * x * x * x * x * x * x * x * x * x)/1152 - (63 * x * x * x * x * x * x * x * x * x * x * x)/2816 - (231 * x * x * x * x * x * x * x * x * x * x * x * x * x)/13312 - (143 * x * x * x * x * x * x * x * x * x * x * x * x * x * x * x)/10240 - (6435 * x * x * x * x * x * x * x * x * x * x * x * x * x * x * x * x * x)/557056 - (12155 * x * x * x * x * x * x * x * x * x * x * x * x * x * x * x * x * x * x * x)/1245184;

        double a = -0.939115566365855;
        double b = 0.9217841528914573;
        double c = -1.2845906244690837;
        double d = 0.295624144969963174;

        return pi/2 + (a * x + b * x * x * x)/(1 + c * x * x + d * x * x * x * x);

    }

    double ab(double x){ //Jeremy Piperni

        double answer = 2.5;

        return answer;

    }

    double log(int b, double x){ //Dany Pham

        double answer = 2.5;

        return answer;

    }

    double MAD(double x){ //Kevin Patel

        double answer = 2.5;

        return answer;

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
