package leetcode;

public class ReverseStringInPlace {
	public static void main(String[] args) {
		String testCase = "test123";
		StringBuilder sbTest = new StringBuilder(testCase);
		System.out.println("Test Case: " + testCase);
		System.out.println("Expected Result: " + sbTest.reverse());
		System.out.println("Actual Result: " + reverseString(testCase));
	}

	public static String reverseString(String testCase) {
		StringBuilder sb = new StringBuilder(testCase);
		int length = sb.length();
		char x;
		char y;
		for(int i = 0; i < length/2; i++) {
			x = sb.charAt(i);
			y = sb.charAt(length - i - 1);
			sb.delete(length - i - 1, length - i);
			sb.delete(i, i+1);
			sb.insert(i, y);
			sb.insert(length - 1 - i, x);
		}
		
		return sb.toString();
	}
}