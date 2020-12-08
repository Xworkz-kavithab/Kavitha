package com.xworkz.restuarant;

public class Restuarant {
	int id;
	{
		id=123;
	System.out.println(id);		
	}
	void serveFood(int i)
	{
		
		System.out.println(i);
		
	}
	
	public static void main(String[] args) {
		
		Restuarant rest=new Restuarant();
		System.out.println(rest);
		rest.serveFood(10);
	}
	static {
		System.out.println("gettogether");
	}

	
}
	
		







////        String name1="stories";
//		String Address="rrnagar";
//		String name2="stories";
//		String name3=new String("stories");
//		System.out.println(name1);
//		
//}
//
//	
