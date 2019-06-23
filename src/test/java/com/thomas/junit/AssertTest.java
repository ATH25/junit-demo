package com.thomas.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		boolean condition = true;
		assertEquals(1, 1);
		assertFalse( !condition);
		assertArrayEquals(new int[] {1,2}, new int[]{1,2});
	}

}
