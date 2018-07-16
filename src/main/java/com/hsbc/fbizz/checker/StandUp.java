package com.hsbc.fbizz.checker;

import java.util.stream.IntStream;

import com.hsbc.fbizz.checker.condition.ConditionChecker;

public class StandUp {

	public static void getSequence(int classSize) {
		IntStream.rangeClosed(1, classSize).forEach(i -> {
			String shouldSay = Integer.toString(i);
			try {
				if (ConditionChecker.isDevisableByThree(i) && !ConditionChecker.isDevisableByFive(i)) {
					shouldSay = "Fizz";
				} else if (!ConditionChecker.isDevisableByThree(i) && ConditionChecker.isDevisableByFive(i)) {
					shouldSay = "Bizz";
				} else if (ConditionChecker.isDevisableByThree(i) && ConditionChecker.isDevisableByFive(i)) {
					shouldSay = "FizzBizz";
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(shouldSay);
		});
	}
	
	public static void main(String[] args) {
		StandUp.getSequence(100);
		System.out.println(
				" Step 2 question is not clear, it does not mentioned the condition: if the number is devisable both by 3 and 5, both has 3 and 5");
	}
}
