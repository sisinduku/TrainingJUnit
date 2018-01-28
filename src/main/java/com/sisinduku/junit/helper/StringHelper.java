package com.sisinduku.junit.helper;

public class StringHelper {
	public String truncateAInFirst2Position(String inputString) {
		if (inputString.length() <= 2) {
			return inputString.replaceAll("A", "");
		}
		
		String first2Chars = inputString.substring(0, 2);
		String stringMinusFirst2Chars = inputString.substring(2);
		
		return first2Chars.replaceAll("A", "")
				+ stringMinusFirst2Chars;
	}
	
	public boolean areFirstAndLastTwoCharsTheSame(String inputString) {
		if (inputString.length() <= 1) {
			return false;
		}
		if (inputString.length() == 2) {
			return true;
		}
		
		String first2Chars = inputString.substring(0, 2);
		String last2Chars = inputString.substring(inputString.length() - 2);
		
		return first2Chars.equals(last2Chars);
	}
}
