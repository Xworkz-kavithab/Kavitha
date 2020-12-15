package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.speaker.Speaker;

public class SpeakerUtil {
	public static void main(String[] args) {
		Speaker s=new Speaker(2000.0,9);
		System.out.println(s.brandName);
		//System.out.println(s.batterybackuphours());
		System.out.println(s.isConnected());
		
		s.onOrOff();
		s.increaseVol();
		s.increaseVol();
		s.increaseVol();
		s.onOrOff();
		s.decVol();
		s.decVol();
		s.onOrOff();
		s.decVol();

		
	}

}
