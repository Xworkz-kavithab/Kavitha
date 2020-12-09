package com.xworkz.util;

import com.xworkz.country.India;

public class CountryUtil {
	public static void main(String[] args) {
		
		India in=new India("Delhi",1, 28);
//		in.capitals="Delhi";
//		in.noOfCapitals=2;
//		in.noOfStates=28;
//		System.out.println(in.capitals+" "+in.noOfCapitals+" "+in.noOfStates);

	System.out.println(in.getCapitals()+" "+in.getNoOfStates()+" "+in.getNoOfCapitals());
	}

}

