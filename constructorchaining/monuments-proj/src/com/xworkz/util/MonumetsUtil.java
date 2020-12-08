package com.xworkz.util;

import java.util.Date;

import com.xworkz.monuments.Monuments;

public class MonumetsUtil {
public static void main(String[] args) {
	
	Monuments m= new Monuments();
	m.setName("Landsatellite");
	m.setCode(1234);
	m.setDate(new Date());
	m.setPlace("Hampi");
	System.out.println();
	System.out.println(m.getName()+" "+m.getCode()+" "+m.getDate()+" "+m.getPlace());
	
}
}
