package com.chella.automation.webservice;


import java.util.List;

public class CitiesServiceResponse {
	
	private List <Results> result;
	
	
	public List<Results> getResult() {
		return result;
	}


	public void setResult(List<Results> result) {
		this.result = result;
	}


	static class Results
	{
		private long lng;
		private int geonameId;
		private String countrycode;
		private String name;
		private String 	fclName;
		private String toponymName;
		private String fcodeName;
		private String wikipedia;
		private long  lat;
		private String fcl;
		private int population;
		public long getLng() {
			return lng;
		}
		public void setLng(long lng) {
			this.lng = lng;
		}
		public int getGeonameId() {
			return geonameId;
		}
		public void setGeonameId(int geonameId) {
			this.geonameId = geonameId;
		}
		public String getCountrycode() {
			return countrycode;
		}
		public void setCountrycode(String countrycode) {
			this.countrycode = countrycode;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getFclName() {
			return fclName;
		}
		public void setFclName(String fclName) {
			this.fclName = fclName;
		}
		public String getToponymName() {
			return toponymName;
		}
		public void setToponymName(String toponymName) {
			this.toponymName = toponymName;
		}
		public String getFcodeName() {
			return fcodeName;
		}
		public void setFcodeName(String fcodeName) {
			this.fcodeName = fcodeName;
		}
		public String getWikipedia() {
			return wikipedia;
		}
		public void setWikipedia(String wikipedia) {
			this.wikipedia = wikipedia;
		}
		public long getLat() {
			return lat;
		}
		public void setLat(long lat) {
			this.lat = lat;
		}
		public String getFcl() {
			return fcl;
		}
		public void setFcl(String fcl) {
			this.fcl = fcl;
		}
		public int getPopulation() {
			return population;
		}
		public void setPopulation(int population) {
			this.population = population;
		}
		public String getFcode() {
			return fcode;
		}
		public void setFcode(String fcode) {
			this.fcode = fcode;
		}
		private String fcode;
	}

}
