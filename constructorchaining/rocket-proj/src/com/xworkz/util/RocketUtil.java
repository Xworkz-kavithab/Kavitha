package com.xworkz.util;

import java.util.Date;

import com.xworkz.rocket.Rocket;

public class RocketUtil {
	
	
public static void main(String[] args) {
	Rocket rocket=new Rocket();
	rocket.setName("pvsl");
	rocket.setId(123);
	rocket.setDate(new Date());
	System.out.println();
	System.out.println(rocket.getName()+" "+rocket.getId()+" "+rocket.getDate());
	
	
	
	
	
	
	
//	Rocket rocket=new Rocket("PSLV",123);
	//rocket.date=new Date();
	//System.out.println(rocket.name+" "+rocket.id+" "+rocket.date);
	
	
	
}
}
