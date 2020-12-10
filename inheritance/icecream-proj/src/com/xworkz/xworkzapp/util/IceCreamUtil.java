package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.icecream.Fudge;

public class IceCreamUtil {
public static void main(String[] args) {
	Fudge f=new Fudge();
	f.setType("cup");
	f.setPrice(67.00);
	f.setFlavour(args);
	System.out.println(f.getType() +" "+ f.getPrice() +" "+ f.getFlavour());
	}

}
