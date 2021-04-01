package com.testprogramming.maven.Assignment02;
import com.testprogramming.maven.Assignment02.BasicOperations;

public class BasicCalculator implements BasicOperations {
	public double addition(double i, double j) {
		return i+j;
	}
	
	public double subtraction(double i, double j) {
		return i-j;
	}
	
	public double multiplicatio(double i, double j) {
		return i*j;
	}
	
	public double division(double i, double j) {
		if(j!=0) {
			return i/j;
		}else {
			return 0;
		}
	}
}