package com.thomas.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {
	
	MyMath myMath = new MyMath();
	
	/*@Before will be running before every test*/
	@Before
	public void before(){
		System.out.println("before method");
	}
	
	/*@After will be running after every test*/
	@After
	public void afterTest(){
		System.out.println("after method");
	}
	
	/*@BeforeClass and @AfterClass will be run one time before and after all tests*/
	@BeforeClass
	public static void beforeClass(){
		System.out.println("beforeClass");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("afterClass");
	}
	
	/*junit doesn't guarantee the order in which the tests are run. */
	/*lets add 3 numbers and test if the sum is right*/
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
