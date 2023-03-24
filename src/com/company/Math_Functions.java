package com.company;

import static java.util.AbstractMap.SimpleEntry;
public class Math_Functions {
    public static final double LN10 = 2.30258509299;
    double arccos(double x){ //Alexandar Petrov

        double answer = 2.5;

        return answer;

    }

    double ab(double x){ //Jeremy Piperni

        double answer = 2.5;

        return answer;

    }

    /**
     * We make use of our own natural logarithm approximation ln(x) and use Using ln(x) = ln(convergingX * 10^(k) = ln(convergingX) + k * ln(10).
     * Indeed, ln(x) approximation converge when 0 < x < 2, so we need x to be in that range.
     *
     * @param base the base of a logarithm
     * @param x the argument of a logarithm
     * @return The log of base b of an argument x
     */
    double log(double base, double x){ //Dany Pham
        if(x == 1){
            // handles case where x is 1, because every base raised to the power 0 is equal to 1
            return 0.0;
        } else if(x <= 0 || base <= 0 || base == 1) {
            // handles case where x is negative or 0, or if the base is invalid
            throw new IllegalArgumentException("Undefined, argument and base cannot be <= 0, base can't be 1");
        }

        // Get tuple (convergingX, k) such that x = convergingX * 10^(k)
        SimpleEntry<Double,Double> tupleArg = convertToConvergenceValue(x);
        SimpleEntry<Double,Double> tupleBase = convertToConvergenceValue(base);
        double convergingX = tupleArg.getKey(); double argExponent = tupleArg.getValue();
        double convergingBase = tupleBase.getKey(); double baseExponent = tupleBase.getValue();

        // Using ln(x) = ln(convergingX * 10^(k) = ln(convergingX) + k * ln(10)
        return (ln(convergingX) + (argExponent * LN10)) / (ln(convergingBase) + (baseExponent * LN10));

    }

    /**
     * Using Taylor series centered at 1 to approximate natural logarithm ln
     * Where the argument x converges in the interval 0 < x <= 2
     * We use 10 000 terms of the natural logarithm Taylor series, we can add more term for more precision.
     *
     * @param x an argument to the natural log
     * @return The natural logarithm of an argument x
     */
    double ln(double x){

        double answer = 0.0;

        // Taylor Series Approximation centered at x = 1 for natural logarithm.
        // ln(x) = sum of n = 1 to infinity of ((-1)^(n+1) * (x - 1)^n) / n
        // In this case instead of infinity, let's use 10 000 terms.
        for(int n = 1; n <= 10000; n++){

            // Calculate (x - 1)^n
            double term1 = 1.0;
            for(int t1 = 0; t1 < n; t1++){         // We multiply x - 1, n times
                term1 *= (x - 1.0);
            }

            // if-else to represent (-1)^(n+1) from the taylor series
            if((n+1) % 2 == 0){
                answer += (term1) / n;
            } else {
                answer -= (term1) / n;
            }
        }

        return answer;
    }

    /**
     * Convert an argument x to its equivalent convergingX * 10^(k). A tuple (convergingX , k) is returned.
     * This allows the use of the identity ln(x) = ln(convergingX * 10^(k) = ln(convergingX) + k * ln(10).
     * convergingX will be within the convergence interval of our Taylor series (i.e., 0 < x < 2), not too close to the bounds.
     *
     * @param x a double value to convert into a converging value between 0 and 2, but not too close to the boundaries
     * @return A tuple (convergingX, exponent) where convergingX and an exponent k are such that x = convergingX * 10^(k)
     */
    SimpleEntry<Double, Double> convertToConvergenceValue(double x){

        double convergingX = x;
        double exponent = 0.0;

        //while x > 1 or x < 0.1, try to find a valid convergingX (0 < convergingX < 2, not too close to the boundaries)
        while(convergingX > 1 || convergingX < 0.1){
            //if x < 0.1
            if(convergingX < 0.1){
                convergingX *= 10.0;
                exponent -= 1.0;      // to maintain equality, convergingX * 10^(exponent)
            } else {
                convergingX /= 10.0;
                exponent += 1.0;      // to maintain equality, convergingX * 10^(exponent)
            }
        }

        return new SimpleEntry<>(convergingX, exponent);
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
