package com.chella.automation.selenium;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindBrokenImage {
static int invalidimg;
static WebDriver driver ;
public static void main(String[] args) {
try {
	
driver = new FirefoxDriver();

driver.get("http://ruchi-myseleniumblog.blogspot.in");
invalidimg = 0;
List allImages = driver.findElements(By.tagName("img"));

System.out.println("Total images are " + allImages.size());
for (int i = 0; i < allImages.size(); i++) {
WebElement img = (WebElement) allImages.get(i);
if (img != null) {
verifyimgActive(img);
}
}

System.out.println("Total invalid images are " + invalidimg);
driver.quit();
} catch (Exception e) {
e.printStackTrace();
System.out.println(e.getMessage());
}
}
/**
 *  Request execution

The most essential function of HttpClient is to execute HTTP methods.
 Execution of an HTTP method involves one or several HTTP request / HTTP response exchanges,
  usually handled internally by HttpClient. 
 The user is expected to provide a request object to execute
  and HttpClient is expected to transmit the request to the target server return a corresponding response object,
  or throw an exception if execution was unsuccessful. 
 * @param img
 */

public static void verifyimgActive(WebElement img) {
try {
//HttpResponse response = new DefaultHttpClient().execute(new HttpGet(img.getAttribute("src")));
	HttpClient httpclient = new DefaultHttpClient();
	HttpGet httpget= new HttpGet(img.getAttribute("src"));
	HttpResponse response =httpclient.execute(httpget);
	
if (response.getStatusLine().getStatusCode() != 200)
invalidimg++;
}
catch (Exception e) {
e.printStackTrace();
}
}
}