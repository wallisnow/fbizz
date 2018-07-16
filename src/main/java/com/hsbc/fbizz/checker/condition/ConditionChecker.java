package com.hsbc.fbizz.checker.condition;

import java.util.regex.Pattern;

public class ConditionChecker {

	public static boolean isDevisableByThree(int i) throws Exception {
		if (i <= 0) {
			throw new Exception("input should not be null or <=0");
		}
		return i % 3 == 0 ? true : false;
	}

	public static boolean isDevisableByFive(int i) throws Exception {
		if (i <= 0) {
			throw new Exception("input should not be null or <=0");
		}
		return i % 5 == 0 ? true : false;
	}

	public static boolean hasFive(int i) throws Exception {
		if (i <= 0) {
			throw new Exception("input should not be null or <=0");
		}
		String num = String.valueOf(i);
		return Pattern.compile("5").matcher(num).find();
	}

	public static boolean hasThree(int i) throws Exception {
		if (i <= 0) {
			throw new Exception("input should not be null or <=0");
		}
		String num = String.valueOf(i);
		return Pattern.compile("3").matcher(num).find();
	}

	public static void main(String[] args) {
		try {
			System.out.println(ConditionChecker.hasFive(15));
			System.out.println(ConditionChecker.hasThree(10));
			System.out.println(ConditionChecker.isDevisableByFive(10));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
