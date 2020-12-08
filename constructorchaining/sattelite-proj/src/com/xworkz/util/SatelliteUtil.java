package com.xworkz.util;

import java.util.Date;

import com.xworkz.satellite.Satellite;

public class SatelliteUtil {
public static void main(String[] args) {
	
	Satellite s=new Satellite();
	s.setName("Landsatellite");
	s.setId(1234);
	s.setDate(new Date());
	System.out.println();
	System.out.println(s.getName()+" "+s.getId()+" "+s.getDate());
	
	
}
}
