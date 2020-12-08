package com.xworkz.gadgets;

public class Gadgets {
public String name;
public double price;
public String color;





   public Gadgets(String name,double price)
   {
	   this.name=name;
	   this.price=price;
	   
   }
   public Gadgets(String icolor)
   {
	   color=icolor;
	   System.out.println(color);
   }
}
