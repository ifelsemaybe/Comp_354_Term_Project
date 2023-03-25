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

    double σ(double [] x){ //Benjamin Pizarro
        double mean = 0;
        double sum = 0;
        double answer = 0;

        for (int i = 0 ; i < x.length ; i++){
        	mean = mean + x[i];
        }
        mean = (mean / x.length);
        System.out.println("mean " + mean);

        for (int i = 0 ; i < x.length ; i++){
            sum = sum + ((x[i] - mean) * (x[i] - mean));
        }
        System.out.println("summation " + sum);
        answer = sum / x.length;

        answer = sqr(answer);
        return answer;

    }
    // square root using newtons method 10 iterations
    double sqr(double x) {
		double x1 = 1;
		for(int i = 1; i <= 10; i++) {
			x1 = x1 - (((x1 * x1)- x)/ (2*x1));
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
