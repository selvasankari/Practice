package com.chella.automation.webservice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class CitiesSearchInvoker {
	private static final String serviceendurl = "http://api.geonames.org/citiesJSON?";

	public static void main(String args[]) throws CitiesValidationException,
			CitiesServiceException {
		CitiesServiceResponse citiesserviceresponse = invoke("44.1", "-9.9",
				"-22.4", "55.2", "de", "demo");
		// invoke("44.1", "9.9", "22.4", "55.2", "de", "demo");
		System.out.println(citiesserviceresponse);

	}

	public static CitiesServiceResponse invoke(String north, String south,
			String east, String west, String lang, String username)
			throws CitiesValidationException, CitiesServiceException {
		CitiesServiceResponse citiesserviceresponse = null;

		String serviceURL = frameserviceURL(north, south, east, west, lang,
				username);
		String httpResponse = invokeServiceURL(serviceURL);
		citiesserviceresponse = extract(httpResponse, citiesserviceresponse);

		return citiesserviceresponse;
	}

	public static CitiesServiceResponse extract(String httpResponse,
			CitiesServiceResponse citiesserviceresponse)
			throws CitiesServiceException {
		Gson gson = new Gson();
		citiesserviceresponse = gson.fromJson(httpResponse,
				CitiesServiceResponse.class);

		return citiesserviceresponse;
	}

	public static String frameserviceURL(String north, String south,
			String east, String west, String lang, String username) {
		StringBuilder serviceURL = new StringBuilder();
		System.out.println(north);
		if (north != null) {
			serviceURL.append(serviceendurl).append("north=").append(north);
		}
		if (south != null) {
			serviceURL.append("&south=").append(south);
		}
		if (east != null) {
			serviceURL.append("&east=").append(east);
		}
		if (west != null) {
			serviceURL.append("&west=").append(west);
		}
		if (lang != null) {
			serviceURL.append("&lang=").append(lang);
		}
		if (username != null) {
			serviceURL.append("&username=").append(username);
		}
		String url = serviceURL.toString();
		System.out.println(url);
		return serviceURL.toString();

	}

	public static String invokeServiceURL(String serviceURL)
			throws CitiesServiceException {
		try {

			URL url = new URL(serviceURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			int responsecode = con.getResponseCode();
			if (responsecode != 200) {
				System.out.println("Wrong URL");
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			String inputLine;
			StringBuilder response = new StringBuilder();
			while ((inputLine = br.readLine()) != null) {
				response.append(inputLine);
			}
			br.close();
			return response.toString();
		} catch (IOException ie) {
			throw new CitiesServiceException(ie.getMessage());
		}

	}

}
