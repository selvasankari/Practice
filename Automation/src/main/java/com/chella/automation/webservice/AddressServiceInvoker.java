package com.chella.automation.webservice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import com.chella.automation.webservice.AddressResponse.Entities;
import com.google.gson.Gson;

public class AddressServiceInvoker {

	private static final String serviceendURL = "http://localhost:8080/WebServices/rest/";

	public static void main(String args[]) throws AddressServiceException,
			AddressValidationException {
		AddressResponse addressresponse = new AddressResponse();
		addressresponse = invoke("byPostCode", "postCode", "600021");
		
		/**
		Entities entity = new Entities();
		entity.setCity("Chennai");
		entity.setCountry("INDIA");
		entity.setNumber("5");
		entity.setPostCode("600021");
		entity.setStreet("J.P.Koil St");
		
		httpPost(serviceendURL, entity);
		*/
		System.out.println(addressresponse);
		

	}

	// http://localhost:8080/WebServices/rest/byPostCode?postCode=95125
	public static AddressResponse invoke(String byCode, String code,
			String codeValue) throws AddressServiceException,
			AddressValidationException {
		AddressResponse addressresponse = null;
		// String serviceurl =frameURL("byPostCode", "postCode","95126");
		String serviceurl = frameURL(byCode, code, codeValue);
		String httpResponse = invokeServiceURl(serviceurl);
		addressresponse = extract(httpResponse, addressresponse);
		return addressresponse;

	}

	public static String frameURL(String byCode, String code, String codeValue) {
		StringBuilder serviceurl = new StringBuilder();
		serviceurl.append(serviceendURL);
		System.out.println(byCode);
		if (byCode != null) {
			serviceurl.append(byCode).append("?");
			System.out.println(serviceurl.toString());
		}
		if (code != null) {

			serviceurl.append(code).append("=");
		}
		if (codeValue != null) {
			serviceurl.append(codeValue);
		}
		System.out.println(serviceurl.toString());
		return serviceurl.toString();
	}

	public static String invokeServiceURl(String serviceurl)
			throws AddressServiceException {
		try {
			URL url = new URL(serviceurl);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			int responsecode = con.getResponseCode();
			if (responsecode != 200) {
				// throw new
				// AddressServiceException("Service returned Failure Status Code");
				System.out.println("wrong url");
			}
			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			String inputLine;
			StringBuilder response = new StringBuilder();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			return response.toString();

		} catch (IOException ie) {
			System.out.println("");
			throw new AddressServiceException(ie.getMessage());
		}

	}

	public static String httpPost(String serviceurl, Entities entity) throws AddressValidationException,
			AddressServiceException {
		try {
			URL url = new URL(serviceurl);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setUseCaches(false);
			conn.setAllowUserInteraction(false);
			conn.setRequestProperty("Content-Type",
					"application/x-www-form-urlencoded");
			
			
			OutputStream out= conn.getOutputStream();
			Writer writer = new OutputStreamWriter(out, "UTF-8");
			writer.write("address");
		    writer.write("=");
		    
		    Gson gson = new Gson();
		    writer.write(URLEncoder.encode(gson.toJson(entity), "UTF-8"));
		    writer.close();
		    out.close();
		    
		    if (conn.getResponseCode() != 200) {
		        throw new IOException(conn.getResponseMessage());
		      }
			
		} catch (IOException ie) {
			throw new AddressServiceException(ie.getMessage());
		}

		String str = "";
		return str;
	}

	public static AddressResponse extract(String httpResponse,
			AddressResponse addressresponse) throws AddressServiceException {
		Gson gson = new Gson();
		addressresponse = gson.fromJson(httpResponse, AddressResponse.class);
		return addressresponse;

	}

}
