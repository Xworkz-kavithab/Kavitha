package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.river.Ganga;

public class RiverUtil {
	public static void main(String[] args) {
		Ganga ganga=new Ganga();
		ganga.setBirthPlace("Gangothri");
		ganga.setRiverType("short");
		ganga.setEndPlace("BayOfBengal");
		System.out.println(ganga.getBirthPlace() +" "+ ganga.getRiverType()+" "+ganga.getEndPlace());
	
	
	
	}

}
