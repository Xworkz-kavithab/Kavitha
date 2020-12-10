package com.xworkz.xworkzapp.icecream;

public class IceCream {
	
private	String type;
private double price;
private String[] flavour;

//public IceCream(String type,double price,String flavour) {
//	
//}

public void setType(String type) {
	this.type = type;
}

public String getType() {
	return type;
}

public void setPrice(double price) {
	this.price = price;
}

public double getPrice() {
	return price;
}
public void setFlavour(String[] flavour)
{
	this.flavour=flavour;
}
public String[] getFlavour()
{
	return flavour;
}


 
//	public void healRemedy()
//	{
//		System.out.println("suggested by dentist");
//	}

}
