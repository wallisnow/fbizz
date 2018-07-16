package com.hsbc.fbizz.checker.condition;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConditionCheckerTest {
	
	@Test
	public void isDevisableByThreeTest() throws Exception {
		int i = 13;
		int j = 3;
		assertEquals(false, ConditionChecker.isDevisableByThree(i));
		assertEquals(true, ConditionChecker.isDevisableByThree(j));
	}
	
	@Test
	public void hasThreeTest() throws Exception {
		int i = 13;
		int j = 55;
		assertEquals(true, ConditionChecker.hasThree(i));
		assertEquals(false, ConditionChecker.hasThree(j));
	}
}
