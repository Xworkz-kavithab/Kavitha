package com.xworkz.util;

import com.xworkz.newspaper.Hindu;

public class NewspaperUtil {
public static void main(String[] args) {
	Hindu h=new Hindu("hindu",23);
	System.out.println(h.getLanguage()+" "+h.getNoOfPages());
}
}
