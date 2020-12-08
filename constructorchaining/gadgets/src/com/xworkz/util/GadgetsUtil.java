package com.xworkz.util;

import com.xworkz.gadgets.Gadgets;

public class GadgetsUtil {
public static void main(String[] args) {
	
	Gadgets g=new Gadgets("SmartWatch",2345.00);
	System.out.println(g.name+" "+g.price);
	Gadgets g1=new Gadgets("blue");
	System.out.println(g1.color);
	
	
}
}
