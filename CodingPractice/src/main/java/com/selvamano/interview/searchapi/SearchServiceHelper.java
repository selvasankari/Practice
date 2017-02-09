package com.selvamano.interview.searchapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import junit.framework.Assert;


public class SearchServiceHelper {

	private static final String API_ENDPOINT="https://itunes.apple.com/search";
	
	enum Media{
		movie, podcast, music, musicVideo, audiobook, shortFilm, tvShow, software, ebook;
	}
	
	public static SearchResponse callService(String term, int limit, String country, String media, int validateStatusCode) {
		SearchResponse searchResponse = null;
		//Validate the Input fields
		validateInput(term,limit,country,media);
		//Frame the Service URL for given input fields
		String serviceURL = frameServiceUrl(term, limit, country, media);
		//Invoke the Service for the URL framed
		String httpResponse = invokeService(serviceURL, validateStatusCode);
		//Parse the HTTP Response to Itunes Response
		searchResponse = extracted(searchResponse, httpResponse);
		return searchResponse;
	}

	private static SearchResponse extracted(SearchResponse searchResponse,
			String httpResponse)  {
		try {
			Gson gson = new Gson();
			searchResponse = gson.fromJson(httpResponse, SearchResponse.class);
		} catch (JsonSyntaxException e) {
		System.out.println(e.getMessage());
		}
		return searchResponse;
	}

	private static String invokeService(String serviceURL, int validateStatusCode) {
		try{
			URL url = new URL(serviceURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			Assert.assertTrue(validateStatusCode == con.getResponseCode());
			
			BufferedReader in = new BufferedReader(
			        new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuilder response = new StringBuilder();
	 
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			return response.toString();
		}catch(IOException ex){
			System.out.println(ex.getMessage());
			return null;
		}
	}

	private static void validateInput(String term, int limit, String country,
			String media){
		if(term==null || term.isEmpty()){
			System.out.println("Search Term cannot be NULL");
		}
		
		//check if URL is encoded or not length check
		
		//if Limit isn't specified , default it to 50, as it's required field
		if(limit <0 || limit >200){
			limit = 50;
		}
		
		//if Country code isn't valid, default it to US.
		if(country!=null && country.length()!=2){
			country="US";
		}
		
		boolean validMediaFormat = false;
		if(media!=null){
			for (Media mediaIter : Media.values()) {
		        if (mediaIter.name().equals(media)) {
		        	validMediaFormat = true;
		        	break;
		        }
		    }
		}
		//If Media format isnt valid , use default value.
		if(!validMediaFormat){
			media = "all";
		}
		
		
	}

	private static String frameServiceUrl(String term, int limit, String country,
			String media) {
		StringBuilder serviceUrl = new StringBuilder();
		serviceUrl.append(API_ENDPOINT).append("?");
		if(term!=null){
			serviceUrl.append("term=").append(term);
		}
		if(limit>0){
			serviceUrl.append("&limit=").append(limit);
		}
		if(country!=null){
			serviceUrl.append("&country=").append(country);
		}
		if(media!=null){
			serviceUrl.append("&media=").append(media);
		}
		System.out.println(serviceUrl);
		return serviceUrl.toString();
	}
	
}
