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

    double MAD(double x){ //Kevin Patel

        double answer = 2.5;

        return answer;

    }

    double σ(double x){ //Benjamin Pizarro

        double answer = 2.5;

        return answer;

    }

    double sinh(double x){ //Miraj Patel
        double answer = 0.0;
        double term = x;
        double xSquared = x * x;

        //Changing the condition of i (50) will change accuracy of result
        //Increase it to make answer more precise
        for (int i = 1; i < 50; i++)
        {
            answer += term;
            term *= xSquared / (2 * i * (2 * i + 1));
        }

        return answer;
    }

    double x(double y){ //Kirk

        double answer = 2.5;

        return answer;

    }
}
