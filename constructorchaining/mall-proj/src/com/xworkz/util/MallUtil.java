package com.xworkz.util;

import com.xworkz.mall.Mall;

public class MallUtil {
public static void main(String[] args) {
	
	Mall m= new Mall();
	m.setName("PepUpSquare");
	m.setAddress("MGRoad");
	System.out.println(m.getName()+" "+m.getAddress());
}
}
