package com.selvamano.interview.searchapi;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.selvamano.interview.searchapi.SearchResponse.Result;



public class SearchAPITest {

	private static final int HTTP_SUCCESS_STATUS_CODE = 200;
	private static final int HTTP_BAD_REQ_STATUS_CODE = 400;


	@Test
	public void validateInput() {
		SearchServiceHelper.callService(null, 0, null, null, HTTP_SUCCESS_STATUS_CODE);
	}
	
	
	@Test
	public void validateBadRequest() {
		SearchServiceHelper.callService("Michael Jackson", 5, "US", "movie", HTTP_BAD_REQ_STATUS_CODE);
	}
	
	
	/**
	 * Validating some artist name, currency , country and track milliseconds
	 */
	@Test
	public void validateResponse(){
		int actualLimit = 5;
		
		SearchResponse itunesResponse = SearchServiceHelper.callService("Michael+Jackson", actualLimit, "US", "music", HTTP_SUCCESS_STATUS_CODE);
		//Checking the data is not null
		Assert.assertTrue(itunesResponse!=null);
		//Checking the limit functionality
		Assert.assertEquals(actualLimit, itunesResponse.getResultCount());
		
		List<Result> results = itunesResponse.getResults();
	
		for(Result result : results)
		{
			//Checking Country
			Assert.assertEquals("USA", result.getCountry());
			//Checking Term in the ArtistName 
			Assert.assertEquals("Michael Jackson", result.getArtistName());
		
			//checking currency
			Assert.assertEquals(result.getCurrency(), "USD");
			//checking TrackTimeMillis >0
			Assert.assertTrue(result.getTrackTimeMillis()>0);
			
		}
		
	}
	
	/**
	 * Validating Result Count
	 */
	@Test
	public void validateResultCount(){
		int actualLimit = 5;
		
		SearchResponse itunesResponse = SearchServiceHelper.callService("Michael+Jackson", actualLimit, "US", "music", HTTP_SUCCESS_STATUS_CODE);
		//Checking the data is not null
		Assert.assertTrue(itunesResponse!=null);
		//Checking the limit functionality
		Assert.assertEquals(actualLimit, itunesResponse.getResultCount());
		
		List<Result> results = itunesResponse.getResults();
	
		Assert.assertEquals(results.size(), actualLimit);
		
	}
	
	/**
	 * Validating Artist Id
	 */
	@Test
	public void validateArtistId(){
		int actualLimit = 5;
		
		SearchResponse itunesResponse = SearchServiceHelper.callService("Michael+Jackson", actualLimit, "US", "music", HTTP_SUCCESS_STATUS_CODE);
		//Checking the data is not null
		Assert.assertTrue(itunesResponse!=null);
		//Checking the limit functionality
		Assert.assertEquals(actualLimit, itunesResponse.getResultCount());
		
		List<Result> results = itunesResponse.getResults();
		
		for(Result result : results){
			Assert.assertTrue(result.getArtistId()!=null);
		}
	

		
	}
}
