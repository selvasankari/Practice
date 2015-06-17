package com.chella.automation.webservice;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.chella.automation.webservice.AddressResponse.Entities;

public class AddressServiceTest {
	private AddressResponse addressresponse = null;

	@Test
	public void checkPostcode() throws AddressServiceException,
			AddressValidationException {

		addressresponse = AddressServiceInvoker.invoke("byPostCode",
				"postCode", "600021");
		Assert.assertEquals(addressresponse.getStatusType(), "OK");
		List<Entities> entity = addressresponse.getEntity();

		for (Entities en : entity) {
			Assert.assertEquals(en.getPostCode(), "600021");
		}

	}

	@Test
	public void checkCountry() throws AddressServiceException,
			AddressValidationException {
		addressresponse = AddressServiceInvoker.invoke("byCountry", "country",
				"USA");
		Assert.assertEquals(addressresponse.getStatusType(), "OK");
		List<Entities> entity = addressresponse.getEntity();

		for (Entities en : entity) {
			Assert.assertEquals(en.getCountry(), "USA");
		}

	}

	@Test
	public void nullcheckCountry() throws AddressServiceException,
			AddressValidationException {
		addressresponse = AddressServiceInvoker.invoke("byCountry", "country",
				" ");
		Assert.assertEquals(addressresponse.getStatusType(), "OK");
		List<Entities> entity = addressresponse.getEntity();

		Assert.assertTrue(entity.isEmpty());
	}

	@Test
	public void nullcheckPostCode() throws AddressServiceException,
			AddressValidationException {
		addressresponse = AddressServiceInvoker.invoke("byPostCode",
				"postCode", " ");
		Assert.assertEquals(addressresponse.getStatusType(), "OK");
		List<Entities> entity = addressresponse.getEntity();

		Assert.assertTrue(entity.isEmpty());
	}

}
