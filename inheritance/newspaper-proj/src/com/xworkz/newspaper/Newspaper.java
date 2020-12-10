package com.xworkz.newspaper;

public class Newspaper {
	String language;
	int noOfPages;
	 public Newspaper(String language,int noOfPages) {
		this.language=language;
		this.noOfPages=noOfPages;
		
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

}
