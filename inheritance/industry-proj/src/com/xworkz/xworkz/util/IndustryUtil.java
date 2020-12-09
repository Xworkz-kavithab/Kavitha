package com.xworkz.xworkz.util;

import com.xworkz.xworkz.SteelIndustry;

public class IndustryUtil {
	public static void main(String[] args) {
		SteelIndustry ind=new SteelIndustry("cons", 45, "HSRlayout");
		//ind.type="manyfacturing";
		//ind.noOfWorkers=14;
		//ind.area="WhiteField";
	//	System.out.println(ind.type+" "+ind.noOfWorkers+" "+ind.area);
System.out.println(ind.getType()+" "+ind.getNoOfWorkers()+" "+ind.getArea());
	}

}
