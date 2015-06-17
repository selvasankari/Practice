package com.chella.practice.string;

/**
 * 
 * @author Selvasankari
 *
 */
public class RemoveOccurences {
	public static void main(String args[]) {
		// Given String
		String inputString = "javaprogram";
		// Given Character
		char inputChar = 'a';

		RemoveOccurences result = new RemoveOccurences();

		// resultString1 is the string that holds the manipulated String
		// achieved through iteration.
		String resultString1 = result.iterationMethod(inputString, inputChar);
		System.out.println("resultString1 : " + resultString1);

		// resultString2 is the string that holds the manipulated String
		// achieved through built in function.
		String resultString12 = result.builtInFunction(inputString, inputChar);
		System.out.println("resultString2 : " + resultString12);

	}

	/** Start Method -- Iterate through the String, one character at a time */
	public String iterationMethod(String inputString, Character inputChar)
			throws IllegalArgumentException {
		// Checking if input string is empty or NULL
		if (inputString == null || inputString.isEmpty() || inputChar == null) {
			throw new IllegalArgumentException();
		}

		// Get the size of the length
		int length = inputString.length();
		// Using String Builder to append string
		StringBuilder outputStringBuilder = new StringBuilder();
		// Iterate through the String, one character at a time
		for (int i = 0; i < length; i++) {
			/**
			 * if the character is not equals the given character, add that
			 * character to the resultString1
			 */
			char currentChar = inputString.charAt(i);
			if (currentChar != inputChar) {
				outputStringBuilder.append(currentChar);
			}
		}
		return outputStringBuilder.toString();

	}

	// End of the Method - iterationMethod

	/**
	 * Start Method 
	 * builtInFunction-- use String's Build In function 
	 */
	public String builtInFunction(String inputString, Character inputChar)
			throws IllegalArgumentException {
		// Checking if input string is empty or NULL
		if (inputString == null || inputString.isEmpty() || inputChar == null) {
			throw new IllegalArgumentException();
		}
		// replace method wil replace the given character with null
		String outputString = inputString.replace(inputChar.toString(), "");

		return outputString;

	}
	// End of the Method - builtInFunction

}
