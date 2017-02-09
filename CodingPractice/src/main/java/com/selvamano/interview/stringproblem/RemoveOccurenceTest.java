package com.selvamano.interview.stringproblem;

import org.testng.Assert;
import org.testng.annotations.Test;


public class RemoveOccurenceTest {

	/**
	 * This test validates the input String and Input character passed to the method
	 */
	@Test(expectedExceptions=IllegalArgumentException.class)
	public void testInvalidInputs(){
		RemoveOccurences removeOccurences = new RemoveOccurences();
		removeOccurences.builtInFunction(null, null);
		removeOccurences.iterationMethod(null, null);
		
		removeOccurences.builtInFunction("", 'a');
		removeOccurences.iterationMethod("", ' ');
	}
	
	/**
	 * This test validates the iterative approach for given the input String and Input character
	 */
	@Test
	public void testIterativeApproach(){
		RemoveOccurences removeOccurences = new RemoveOccurences();
		String outputBasic = removeOccurences.iterationMethod("javaprogram", 'a');
		Assert.assertEquals("jvprogrm", outputBasic);
		String outputWithNumber = removeOccurences.iterationMethod("javaprogram123123", '1');
		Assert.assertEquals("javaprogram2323", outputWithNumber);
		String outputWithSpace = removeOccurences.iterationMethod("java program string", ' ');
		Assert.assertEquals("javaprogramstring", outputWithSpace);
		String outputWithSpecialChar = removeOccurences.iterationMethod("java-program-string", '-');
		Assert.assertEquals("javaprogramstring", outputWithSpecialChar);
	}
	
	/**
	 * This test validates the buildInFunction approach for given the input String and Input character
	 */
	@Test
	public void testBuiltInFunction(){
		RemoveOccurences removeOccurences = new RemoveOccurences();
		String outputBasic = removeOccurences.builtInFunction("javaprogram", 'a');
		Assert.assertEquals("jvprogrm", outputBasic);
		String outputWithNumber = removeOccurences.builtInFunction("javaprogram123123", '1');
		Assert.assertEquals("javaprogram2323", outputWithNumber);
		String outputWithSpace = removeOccurences.builtInFunction("java program string", ' ');
		Assert.assertEquals("javaprogramstring", outputWithSpace);
		String outputWithSpecialChar = removeOccurences.builtInFunction("java-program-string", '-');
		Assert.assertEquals("javaprogramstring", outputWithSpecialChar);
	}
}
