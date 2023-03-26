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

    /**
     *Calculates the standard deviation of a population
     *
     * Calculates the average distancing of each of the value in parameter x
     *
     * @param x, an array representing unordered data
     * @return answer, the standard deviation of a population
     */
    double σ(double [] x){ //Benjamin Pizarro
        double mean = 0;
        double variation = 0;
        double answer = 0;

        //mean = summation(x[i]) / x.length, from i = 0 to x.length
        for (int i = 0 ; i < x.length ; i++){
        	mean = mean + x[i];
        }
        mean = (mean / x.length);
        System.out.println("mean: " + mean);

        //variation(σ^2) = Summation((x[i] - mean)^2) / x.length , from i = 0 to x.length
        for (int i = 0 ; i < x.length ; i++){
            variation = variation + ((x[i] - mean) * (x[i] - mean));
        }

        variation = variation / x.length;
        System.out.println("variation (σ^2): " + variation);

        answer = sqr(variation); //σ = sqr(σ^2)
        return answer;

    }

    /**
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

    double sinh(double x){ //Miraj Patel

        double answer = 2.5;

        return answer;

    }

    double x(double y){ //Kirk

        double answer = 2.5;

        return answer;

    }
}
