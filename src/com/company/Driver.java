package com.company;

import java.util.Scanner;

public class Driver {

	static Math_Functions mathFunctions = new Math_Functions();

    public static void main(String[] args) {
        boolean notEnded = true;
        Scanner scanner = new Scanner(System.in);
        
        while (notEnded) {
        	
        	System.out.print("Enter: ");
        	String userInput = scanner.nextLine();
        	
        	// ends program
        	if (userInput.equals("end")) {
        		notEnded = false;
        	}
        	
        	// calls proper function
        	if (notEnded) {
        		String[] userInputArray = userInput.split("\\(");
        		
        		if (userInputArray.length == 1) {
        			System.out.println("Invalid input");
        		} else {
        			String function = userInputArray[0];
            		String totalParameters = userInputArray[1].split("\\)")[0];
            		
            		switch(function) {
            		case "arccos":
            			arccosCall(totalParameters);
            			break;
            		case "ab":
            			abCall(totalParameters);
            			break;
            		case "log":
            			logCall(totalParameters);
            			break;
            		case "MAD":
            			MADCall(totalParameters);
            			break;
            		case "std":
            			stdCall(totalParameters);
            			break;
            		case "sinh":
            			sinhCall(totalParameters);
            			break;
            		case "pow":
            			powCall(totalParameters);
            			break;
                case "add":
                  addCall(totalParameters);
                  break;
                case "subtract":
                  subCall(totalParameters);
                  break;
                case "multiply":
                  multCall(totalParameters);
                  break;
                case "divide":
                  divCall(totalParameters);
                  break;
            		default:
            			System.out.println("Invalid function");
            		}
        		}
        	}
        }
        
        System.out.println("Program has ended");
        scanner.close();
        
    }
    
    // Call to ArcCos function
    static void arccosCall(String totalParameters) {
    	String[] parameters = totalParameters.split(",");
    	if (parameters.length == 1) {
    		double x = Double.parseDouble(parameters[0]);
    		String result = mathFunctions.arccos(x);
    		System.out.println(result);
    	} else {
    		System.out.println("ERROR: Wrong number of parameters");
    	}
    }
    
    // Call to ab (growth/decay) function
    static void abCall(String totalParameters) {
    	String[] parameters = totalParameters.split(",");
    	if (parameters.length == 3) {
    		double a = Double.parseDouble(parameters[0]);
    		double b = Double.parseDouble(parameters[1]);
    		double x = Double.parseDouble(parameters[2]);
    		String result = mathFunctions.ab(a, b, x);
    		System.out.println(result);
    	} else {
    		System.out.println("ERROR: Wrong number of parameters");
    	}
    }
    
    // Call to log function
    static void logCall(String totalParameters) {
    	String[] parameters = totalParameters.split(",");
    	if (parameters.length == 2) {
    		double base = Double.parseDouble(parameters[0]);
    		double x = Double.parseDouble(parameters[1]);
    		String result = mathFunctions.log(base, x);
    		System.out.println(result);
    	} else {
    		System.out.println("ERROR: Wrong number of parameters");
    	}
    }
    
    // Call to MAD function
    static void MADCall(String totalParameters) {
    	String[] parameters = totalParameters.split(",");
    	double[] array = new double[parameters.length];
    	for (int i = 0; i < array.length; i++) {
    		array[i] = Double.parseDouble(parameters[i]);
    	}
    	String result = mathFunctions.MAD(array);
    	System.out.println(result);
    }
    
    // Call to std function
    static void stdCall(String totalParameters) {
    	String[] parameters = totalParameters.split(",");
    	double[] array = new double[parameters.length];
    	for (int i = 0; i < array.length; i++) {
    		array[i] = Double.parseDouble(parameters[i]);
    	}
    	String result = mathFunctions.std(array);
    	System.out.println(result);
    }
    
    // Call to sinh function
    static void sinhCall(String totalParameters) {
    	String[] parameters = totalParameters.split(",");
    	if (parameters.length == 1) {
    		double x = Double.parseDouble(parameters[0]);
    		String result = mathFunctions.sinh(x);
    		System.out.println(result);
    	} else {
    		System.out.println("ERROR: Wrong number of parameters");
    	}
    }
    
    // Call to pow function
    static void powCall(String totalParameters) {
    	String[] parameters = totalParameters.split(",");
    	if (parameters.length == 2) {
    		double x = Double.parseDouble(parameters[0]);
    		double y = Double.parseDouble(parameters[1]);
    		String result = mathFunctions.pow(x,y);
    		System.out.println(result);
    	} else {
    		System.out.println("ERROR: Wrong number of parameters");
    	}

    }

	static void addCall(String totalParameters) {
		String[] parameters = totalParameters.split(",");
		if (parameters.length == 2) {
			double x = Double.parseDouble(parameters[0]);
			double y = Double.parseDouble(parameters[1]);
			String result = mathFunctions.add(x,y);
			System.out.println(result);
		} else {
			System.out.println("ERROR: Wrong number of parameters");
		}
	}

	static void subCall(String totalParameters) {
		String[] parameters = totalParameters.split(",");
		if (parameters.length == 2) {
			double x = Double.parseDouble(parameters[0]);
			double y = Double.parseDouble(parameters[1]);
			String result = mathFunctions.subtract(x,y);
			System.out.println(result);
		} else {
			System.out.println("ERROR: Wrong number of parameters");
		}
	}

	static void multCall(String totalParameters) {
		String[] parameters = totalParameters.split(",");
		if (parameters.length == 2) {
			double x = Double.parseDouble(parameters[0]);
			double y = Double.parseDouble(parameters[1]);
			String result = mathFunctions.multiply(x,y);
			System.out.println(result);
		} else {
			System.out.println("ERROR: Wrong number of parameters");
		}
	}

	static void divCall(String totalParameters) {
		String[] parameters = totalParameters.split(",");
		if (parameters.length == 2) {
			double x = Double.parseDouble(parameters[0]);
			double y = Double.parseDouble(parameters[1]);
			String result = mathFunctions.divide(x,y);
			System.out.println(result);
		} else {
			System.out.println("ERROR: Wrong number of parameters");
		}
}
