package com.company;
import static java.util.AbstractMap.SimpleEntry;
public class Math_Functions {
    public static final double LN10 = 2.30258509299;
    public static final double e = 2.7182818284;

    /**
     * Function 1
     * ArcCos function
     * x must be between -1 and 1
     *
     * @param x
     * @return ArcCos of x
     */
    String arccos(double x) { // Alexandar Petrov

        double pi = 3.1415926535897932;

        if (x > 1 || x < -1){

            return ("ERROR: x must be between -1 and 1");

        }

        if(x > - 0.922 && x < 0.922){

            //Taylor Series Expansion

            return Double.toString(pi/2 - x - (x * x * x)/6 - (3 * x * x * x * x * x)/40 - (5 * x * x * x * x * x * x * x)/112 - (35 * x * x * x * x * x * x * x * x * x)/1152 - (63 * x * x * x * x * x * x * x * x * x * x * x)/2816 - (231 * x * x * x * x * x * x * x * x * x * x * x * x * x)/13312 - (143 * x * x * x * x * x * x * x * x * x * x * x * x * x * x * x)/10240 - (6435 * x * x * x * x * x * x * x * x * x * x * x * x * x * x * x * x * x)/557056 - (12155 * x * x * x * x * x * x * x * x * x * x * x * x * x * x * x * x * x * x * x)/1245184);

        }

        double a = -0.939115566365855;
        double b = 0.9217841528914573;
        double c = -1.2845906244690837;
        double d = 0.295624144969963174;

        return Double.toString(pi/2 + (a * x + b * x * x * x)/(1 + c * x * x + d * x * x * x * x));

    }

    /**
     * Function 2
     * Exponential Growth/Decay function
     * a must be a real number not equal to 0
     * b must be a positive real number not equal to 1
     *
     * @param a initial value
     * @param b growth/decay rate
     * @param x exponent of b
     * @return returns a * b^x
     */
    String ab(double a, double b, double x) { // Jeremy Piperni

        if (a == 0) {
            return "ERROR: a must be a real number not equal to 0";
        } else if (b == 1 || b <= 0) {
            return "ERROR: b must be a positive real number not equal to 1";
        } else {
            return Double.toString(a * Double.parseDouble(pow(b, x)));
        }

    }

    /**
     * Function 3
     * We make use of our own natural logarithm approximation ln(x) and use Using
     * ln(x) = ln(convergingX * 10^(k) = ln(convergingX) + k * ln(10).
     * Indeed, ln(x) approximation converge when 0 < x < 2, so we need x to be in
     * that range.
     *
     * @param base the base of a logarithm
     * @param x    the argument of a logarithm
     * @return The log of base b of an argument x
     */
    String log(double base, double x) { // Dany Pham
        if (x == 1) {
            // handles case where x is 1, because every base raised to the power 0 is equal
            // to 1
            return "0.0";
        } else if (x <= 0 || base <= 0 || base == 1) {
            // handles case where x is negative or 0, or if the base is invalid
            return "ERROR: parameters cannot be <= 0, base can't be 1";
        }

        // Get tuple (convergingX, k) such that x = convergingX * 10^(k)
        SimpleEntry<Double, Double> tupleArg = convertToConvergenceValue(x);
        SimpleEntry<Double, Double> tupleBase = convertToConvergenceValue(base);
        double convergingX = tupleArg.getKey();
        double argExponent = tupleArg.getValue();
        double convergingBase = tupleBase.getKey();
        double baseExponent = tupleBase.getValue();

        // Using ln(x) = ln(convergingX * 10^(k) = ln(convergingX) + k * ln(10)
        return Double.toString((ln(convergingX) + (argExponent * LN10)) / (ln(convergingBase) + (baseExponent * LN10)));

    }

    /**
     * Function 4
     * Returns the mean absolute deviation of the input array
     *
     * @param x
     * @return the mean absolute deviation as a double
     */
    String MAD(double[] x) { // Kevin Patel
        double sum = 0;
        double mean = 0;
        // array for absolute differences
        double[] absDiff = new double[x.length];
        mean = meanArray(x);

        // calculate absolute difference for each element
        for (int i = 0; i < x.length; i++)
            absDiff[i] = abs(x[i] - mean);
        // calculate sum of the absolute differences
        for (int i = 0; i < absDiff.length; i++)
            sum += absDiff[i];

        // return the mean absolute deviation
        return Double.toString(sum / absDiff.length);
    }

    /**
     * Function 5
     * Calculates the standard deviation of a population
     * Calculates the average distancing of each of the value in parameter x
     *
     * @param x, an array representing unordered data
     * @return answer, the standard deviation of a population
     */
    String std(double[] x){ //Benjamin Pizarro
        double mean = 0;
        double variation = 0;
        double answer = 0;

        //mean = summation(x[i]) / x.length, from i = 0 to x.length
        for (int i = 0 ; i < x.length ; i++){
            mean = mean + x[i];
        }
        mean = (mean / x.length);
        //System.out.println("mean: " + mean);

        //variation(σ^2) = Summation((x[i] - mean)^2) / x.length , from i = 0 to x.length
        for (int i = 0 ; i < x.length ; i++){
            variation = variation + ((x[i] - mean) * (x[i] - mean));
        }

        variation = variation / x.length;
        //System.out.println("variation (σ^2): " + variation);

        answer = sqr(variation); //σ = sqr(σ^2)
        return Double.toString(answer);

    }

    /**
     * Function 6
     * Calculates Sinh of x
     *
     * @param x
     * @return Sinh of x
     */
    String sinh(double x){ //Miraj Patel
        double answer = 0.0;
        double term = x;
        double xSquared = x * x;

        // Changing the condition of i (50) will change accuracy of result
        // Increase it to make answer more precise
        for (int i = 1; i < 1000; i++) {
            answer += term;
            term *= xSquared / (2 * i * (2 * i + 1));
        }

        return Double.toString(answer);
    }


    /**
     * Function 7
     * Returns the result of x^y
     *
     * @param x base of y
     * @param y exponent of x
     * @return returns x^y
     */
    String pow(double x, double y) { // Kirk
        if (x < 0 && (y % 1) == 0) {
            String oddOrEven = "";
            if (y % 2 == 0) {
                oddOrEven = oddOrEven + "even";
            } else {
                oddOrEven = oddOrEven + "odd";
            }
            if (oddOrEven.equals("even")) {
                return Double.toString(exp(y * Double.parseDouble(log(e, abs(x)))));
            } else {
                double value = exp(y * Double.parseDouble(log(e, abs(x))));
                return "-" + Double.toString(value);
            }
        } else if (x > 0) {
            return Double.toString(exp(y * Double.parseDouble(log(e, x))));
        } else {
            return "ERROR: x cannot be negative if y is not an integer";
        }
    }

    /**
     * INTERMEDIATE FUNCTION
     * Returns the result of e^x
     *
     * @param x the exponent of e
     * @return the result of e^x
     */
    private double exp(double x) {
        double value = 1;

        // Calculate integer value of x
        int valueInt = (int) x;
        if (x > 0) {
            for (int i = 0; i < valueInt; i++) {
                value = value * e;
            }
        } else if (x < 0) {
            for (int i = 0; i > valueInt; i--) {
                value = value * (1 / e);
            }
        }

        // Calculate decimal value of x
        double valueDecimal = x - valueInt;
        double valueCorrection = 1 + valueDecimal * (1 + (valueDecimal / 2)
                * (1 + (valueDecimal / 3) * (1 + (valueDecimal / 4) *
                (1 + (valueDecimal / 5) * (1 + (valueDecimal / 6) * (1 + (valueDecimal / 7) * (1 + (valueDecimal
                        / 8) *
                        (1 + (valueDecimal / 9) * (1
                                + (valueDecimal / 10) * (1 + (valueDecimal / 11) * (1 + (valueDecimal / 12) *
                                (1 + (valueDecimal / 13) * (1 + (valueDecimal / 14) * (1
                                        + (valueDecimal / 15) * (1 + (valueDecimal / 16))))))))))))))));

        return value * valueCorrection;

    }

    /**
     * INTERMEDIATE FUNCTION
     * Using Taylor series centered at 1 to approximate natural logarithm ln
     * Where the argument x converges in the interval 0 < x <= 2
     * We use 10 000 terms of the natural logarithm Taylor series, we can add more
     * term for more precision.
     *
     * @param x an argument to the natural log
     * @return The natural logarithm of an argument x
     */
    double ln(double x) {

        double answer = 0.0;

        // Taylor Series Approximation centered at x = 1 for natural logarithm.
        // ln(x) = sum of n = 1 to infinity of ((-1)^(n+1) * (x - 1)^n) / n
        // In this case instead of infinity, let's use 10 000 terms.
        for (int n = 1; n <= 10000; n++) {

            // Calculate (x - 1)^n
            double term1 = 1.0;
            for (int t1 = 0; t1 < n; t1++) { // We multiply x - 1, n times
                term1 *= (x - 1.0);
            }

            // if-else to represent (-1)^(n+1) from the taylor series
            if ((n + 1) % 2 == 0) {
                answer += (term1) / n;
            } else {
                answer -= (term1) / n;
            }
        }

        return answer;
    }

    /**
     * Convert an argument x to its equivalent convergingX * 10^(k). A tuple
     * (convergingX , k) is returned.
     * This allows the use of the identity ln(x) = ln(convergingX * 10^(k) =
     * ln(convergingX) + k * ln(10).
     * convergingX will be within the convergence interval of our Taylor series
     * (i.e., 0 < x < 2), not too close to the bounds.
     *
     * @param x a double value to convert into a converging value between 0 and 2,
     *          but not too close to the boundaries
     * @return A tuple (convergingX, exponent) where convergingX and an exponent k
     *         are such that x = convergingX * 10^(k)
     */
    SimpleEntry<Double, Double> convertToConvergenceValue(double x) {

        double convergingX = x;
        double exponent = 0.0;

        // while x > 1 or x < 0.1, try to find a valid convergingX (0 < convergingX < 2,
        // not too close to the boundaries)
        while (convergingX > 1 || convergingX < 0.1) {
            // if x < 0.1
            if (convergingX < 0.1) {
                convergingX *= 10.0;
                exponent -= 1.0; // to maintain equality, convergingX * 10^(exponent)
            } else {
                convergingX /= 10.0;
                exponent += 1.0; // to maintain equality, convergingX * 10^(exponent)
            }
        }

        return new SimpleEntry<>(convergingX, exponent);
    }

    /**
     * INTERMEDIATE FUNCTION
     * Calculates the mean of an array of doubles
     *
     * @param x
     * @return the mean as a double
     */
    double meanArray(double[] x) { // Kevin Patel
        double sum = 0;
        // add each element of the array to the sum
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        // return the mean
        return sum / x.length;
    }

    /**
     * INTERMEDIATE FUNCTION
     * Returns the absolute value of the input without using Math library
     *
     * @param x
     * @return absolute value as double
     */
    static double abs(double x) { // Kevin Patel
        if (x < 0)
            return -x;
        return x;
    }

    /**
     * INTERMEDIATE FUNCTION
     * Calculates the square root of a number using Newtons method.
     *
     * Let: x(0) = 1 be an initial guess for a zero(root)  or x-intercept
     * for g(x) = 0. square root of num is x = sqrt(num) --> (num^2) = x --> (x^2-num) = 0
     * then, g(x) = (x^2-num) and g'(x) = 2x
     * Newtons method X(k+1) = x(0) - (g(x(k))/g'(x(k))) for k = 0,1,2,...
     *
     * @param num, an argument to the square root function
     * @return x1, the square root of num
     *
     * x1 represents X(k+1)
     */
    double sqr(double num) {
        double x1 = 1;
        for(int i = 1; i <= 10; i++) {
            x1 = x1 - (((x1 * x1)- num)/ (2*x1));
        }
        return x1;
    }

    /**
     * Returns the result of x + y
     *
     * @param x the fist value to add
     * @param y the second value to add
     * @return the result of x + y
     */
    String add(double x, double y)
    {
        double sum = x + y;
        return Double.toString(sum);
    }

    /**
     * Returns the result of x - y
     *
     * @param x the value to subtract from
     * @param y the value of the subtraction
     * @return the result of x - y
     */
    String subtract(double x, double y)
    {
        double sum = x - y;
        return Double.toString(sum);
    }

    /**
     * Returns the result of x * y
     *
     * @param x the fist value to multiply
     * @param y the second value to multiply
     * @return the result of x * y
     */
    String multiply(double x, double y)
    {
        double sum = x * y;
        return Double.toString(sum);
    }

    /**
     * Returns the result of x / y
     *
     * @param x the value to divide from
     * @param y the value of the division
     * @return the result of x / y
     */
    String divide(double x, double y)
    {
        double sum = x / y;
        return Double.toString(sum);
    }
}
