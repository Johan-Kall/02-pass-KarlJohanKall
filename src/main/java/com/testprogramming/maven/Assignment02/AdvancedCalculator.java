package com.testprogramming.maven.Assignment02;
//import java.lang.*;
//import com.testprogramming.maven.Assignment02.*;

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations {
	public double square(double i) {
		return i*i;
	}
	public double power(double i, double j) {
		return Math.pow(i, j);
	}
	public double squareRoot(double i) {
		return Math.sqrt(i);
	}
	public double absolute(double i) {
		return Math.abs(i);
	}
	public double factorial(double i) {
		double j = Math.round(i);
		double fct = 1;
		if(j>=1) {
			for(int n = 1; n <= i; n++) {
				fct = fct*n;
			}
			return fct;
		}else {
			return 1;
		}
	}
}
