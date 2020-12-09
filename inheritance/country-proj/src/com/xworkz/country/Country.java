package com.xworkz.country;

public class Country {
	
	private String capitals;
		private int noOfStates;
		private int noOfCapitals;
//	private String capitals;
//	private int noOfStates;
//	private int noOfCapitals;
		
		public Country(String capitals,int noOfStates,int noOfCapitals) {
			this.capitals=capitals;
			this.noOfStates=noOfStates;
			this.noOfCapitals=noOfCapitals;
		}
	
	public String getCapitals() {
		return capitals;
	}
	public void setCapitals(String capitals) {
		this.capitals = capitals;
	}
	public int getNoOfStates() {
		return noOfStates;
	}
	public void setNoOfStates(int noOfStates) {
		this.noOfStates = noOfStates;
	}
	public int getNoOfCapitals() {
		return noOfCapitals;
	}
	public void setNoOfCapitals(int noOfCapitals) {
		this.noOfCapitals = noOfCapitals;
	}
	
	

}
