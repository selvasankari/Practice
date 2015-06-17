package com.chella.automation.webservice;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.chella.automation.webservice.CitiesServiceResponse.Results;

public class CitiesTest {
	@Test
	public void test() throws CitiesServiceException, CitiesValidationException {
		CitiesServiceResponse citiesserviceresponse = CitiesSearchInvoker
				.invoke("44.1", "-9.9", "-22.4", "55.2", "de", "demo");

		List<Results> result;
		result = citiesserviceresponse.getResult();

		for (Results res : result) {
			Assert.assertEquals("MX", res.getCountrycode());
		}

	}
}
