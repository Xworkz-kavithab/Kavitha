package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.citywards.CityWardDTO;
import com.xworkz.xworkzapp.citywards.WardInformation;

public class CityWardUtil {
public static void main(String[] args) {
		
		WardInformation wardinfo=new WardInformation();
		CityWardDTO cityward=new CityWardDTO();
		cityward.setWardNo(32);
		cityward.setWardName("FORT");
		cityward.setPopulation(45232L);
		cityward.setCorporateName("raju");
		cityward.setAreaInSqKiloMeters("20sq");
		
		CityWardDTO cityward1=new CityWardDTO();
		cityward1.setWardNo(31);
		cityward1.setWardName("CowlBazar");
		cityward1.setPopulation(99974L);
		cityward1.setCorporateName("kavitha");
		cityward1.setAreaInSqKiloMeters("8sqk");
		
		wardinfo.addWardDetails(cityward);
		wardinfo.addWardDetails(cityward1);
		wardinfo.displayWardDetails();
		
		wardinfo.searchCityWardByWardName("FORT");
		wardinfo.searchCityWardByWardName("CowlBazar");
		
		
		wardinfo.returningCorparatorNameByWardNo(30);
		
		
		
		
	}
	
}
