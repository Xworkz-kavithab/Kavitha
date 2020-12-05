package com.xworkz;

public class PrintName {
	  String name; 
	
public static void main(String[] args) {
		PrintName pname=new PrintName();
		System.out.println(pname);
		
		
	}
	
	
	static {
		System.out.println("printing name");
	}
	
	{
		name="kavi";
		System.out.println(name);
		
	}
	
}


		

   /*   void   methodName()
      {
	   // init block can also invoked inside any method
	   {
		   
	   }
    	  
      
}*/

