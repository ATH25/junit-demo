package com.thomas.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyMathTest {
	
	MyMath myMath = new MyMath();
	
	/*lets add 3 nmbers and test if the sum is right*/
	@Test
	public void myMathTestWith3Nos() {
		//fail("Not yet implemented"); 
		System.out.println("Test 1");
		assertEquals(6, myMath.sum(new int[] {1,2,3}) );
	}
	
	@Test
	public void myMathTestWith1Nos() {
		//fail("Not yet implemented"); 
		System.out.println("Test 2");
		assertEquals(10, myMath.sum(new int[] {10}) );
	}
	
}
