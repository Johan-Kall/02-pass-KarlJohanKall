package com.testprogramming.maven.Assignment02;
//import com.testprogramming.maven.Assignment02.*;
//import java.lang.*;

import static org.junit.Assert.*;

class CalculatorTest {
	BasicCalculator basic = new BasicCalculator();
	AdvancedCalculator advanced = new AdvancedCalculator();
	
	void testAddition() {
		assertEquals(basic.addition(2.4, 3.72),6.12, 0);
		assertEquals(basic.addition(0, 0),0,0);
		assertEquals(basic.addition(2.32, -2.32),0,0);
		assertEquals(basic.addition(-3.5, -6.13),-9.63,0);
		double test1 = Math.random()*100;
		double test2 = Math.random()*100;		
		assertEquals(basic.addition(test1, test2), test1+test2,0);
	}

	void testSubtraction() {
		assertEquals(basic.subtraction(3.72, 2.60),1.12, 0);
		assertEquals(basic.subtraction(0, 0),0,0);
		assertEquals(basic.subtraction(2.32, 2.32),0,0);
		assertEquals(basic.subtraction(3.5, 6.13),-3.37,0);
		assertEquals(basic.subtraction(-3.5, -6.13),2.63,0);
		double test1 = Math.random()*100;
		double test2 = Math.random()*100;		
		assertEquals(basic.subtraction(test1, test2), test1-test2,0);
	}
	
	void testMultiplication() {
		assertEquals(basic.multiplication(3, 2),6, 0);
		assertEquals(basic.multiplication(1, 0),0,0);
		assertEquals(basic.multiplication(2.32, 2),4.64,0);
		assertEquals(basic.multiplication(-3, -4),12,0);
		assertEquals(basic.multiplication(-3, 4),-12.63,0);
		double test1 = Math.random()*100;
		double test2 = Math.random()*100;		
		assertEquals(basic.multiplication(test1, test2), test1*test2,0);
	}
	
	void testDivision() {
		assertEquals(basic.division(3, 2),1.5, 0);
		assertEquals(basic.division(1, 0.5),2,0);
		assertEquals(basic.division(4.64, 2),2.32,0);
		assertEquals(basic.division(-3, -4),0.75,0);
		assertEquals(basic.division(-3, 4),-0.75,0);
		double test1 = Math.random()*100;
		double test2 = Math.random()*10 + 0.1;		
		assertEquals(basic.division(test1, test2), test1/test2,0);
	}
	
	void testSquare() {
		assertEquals(advanced.square(2.5),6.25, 0);
		assertEquals(advanced.square(0),0,0);
		assertEquals(advanced.square(-3),9,0);
		double test = Math.random()*100;
		assertEquals(advanced.square(test), test,0);
	}

	void testPower() {
		assertEquals(advanced.power(-2, 3),-8, 0);
		assertEquals(advanced.power(-1, 0),1,0);
		assertEquals(advanced.power(2.3, 1.4),Math.pow(2.3, 1.4),0);
		assertEquals(advanced.power(2, -1),0.5,0);
		double test1 = Math.random()*10;
		double test2 = Math.random()*10;
		assertEquals(advanced.power(test1, test2), Math.pow(test1, test2),0);
	}
	
	void testSquareRoot() {
		assertEquals(advanced.squareRoot(4),2, 0);
		assertEquals(advanced.squareRoot(0),0,0);
		assertEquals(advanced.squareRoot(2.5),Math.sqrt(2.5),0);
		assertEquals(advanced.squareRoot(-4),Math.sqrt(-4),0);
		double test = Math.random()*10;
		assertEquals(advanced.squareRoot(test), Math.sqrt(test),0);
	}
	
	void testAbsolute() {
		assertEquals(advanced.absolute(-3),3, 0);
		assertEquals(advanced.absolute(5.432),5.432,0);
		assertEquals(advanced.absolute(0),0,0);
		double test = -Math.random()*10;
		assertEquals(advanced.absolute(test), Math.abs(test),0);
	}
	
	void testFactorial() {
		assertEquals(advanced.factorial(4),24, 0);
		assertEquals(advanced.factorial(5.432),120,0);
		assertEquals(advanced.factorial(-2.65),1,0);
	}
}