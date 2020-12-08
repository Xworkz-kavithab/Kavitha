package com.xworkz.util;

import java.util.Date;

import com.xworkz.sports.Sports;

public class SportsUtil {
	public static void main(String[] args) {
		
		Sports s=new Sports();
		s.setName("Chess");
		s.setIdNo(7);
		s.setTypes(2);
		s.setPlayers(2);
		System.out.println();
		System.out.println(s.getName()+" "+s.getIdNo()+" "+s.getTypes()+" "+s.getPlayers());
		
	}

}
