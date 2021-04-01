package com.testprogramming.maven.Assignment02;
import com.testprogramming.maven.Assignment02.AdvancedCalculator;

public class Main {

	public static void main(String[] args) {
		BasicCalculator basic = new BasicCalculator();
		System.out.println("9+4="+basic.addition(9, 4));
		System.out.println("9-4="+basic.subtraction(9, 4));
		System.out.println("9*4="+basic.multiplicatio(9, 4));
		System.out.println("9/4="+basic.division(9, 4));
		
		AdvancedCalculator advanced = new AdvancedCalculator();
		System.out.println("9^2="+advanced.square(9));
		System.out.println("9^4="+advanced.power(9, 4));
		System.out.println("root 9="+advanced.squareRoot(9));
		System.out.println("abs 9="+advanced.absolute(9));
		System.out.println("9!="+advanced.factorial(9));
	}
}
