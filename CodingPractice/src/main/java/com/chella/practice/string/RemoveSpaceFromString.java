package com.chella.practice.string;

public class RemoveSpaceFromString {

	public static void main(String args[]) {
		RemoveSpaceFromString removeoccurencesobject = new RemoveSpaceFromString();
		removeoccurencesobject.removeSpaceFromString("che ll a");
	}

	public void removeSpaceFromString(String str) {
		char[] input = str.toCharArray();
		StringBuffer output = new StringBuffer();
		for (int i = 0; i < input.length; i++) {
			if (input[i] != ' ' && input[i] != '\t') {
				output.append(input[i]);

			}
		}
		System.out.println(output);

	}

}
