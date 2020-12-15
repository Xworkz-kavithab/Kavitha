
package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.headphones.Headphones;

public class HeadphonesUtil {
	public static void main(String[] args) {
		Headphones h=new Headphones(2289.76,"BLACK");
		
		System.out.println(h.brandName);
		//System.out.println(h.isConnected());
		
		h.isConnected();
		h.increaseVol();
h.increaseVol();
//		h.increaseVol();
//		h.isConnected();
//		h.decVol();
//		h.decVol();
//		
	}

	
}
