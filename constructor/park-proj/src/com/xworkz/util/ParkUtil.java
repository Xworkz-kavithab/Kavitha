package com.xworkz.util;

import com.xworkz.park.Park;

public class ParkUtil {
	public static void main(String[] args) {

		String[] parklocation = { "mgroad", "rr" };

	
		Park p = new Park("Rajkumar", "ssrfdr",parklocation);
		for (String p1 : parklocation)
		{
			System.out.println(p1);
		}
		System.out.println(p.name + " " + p.address);

	}

}
