package com.xworkz.museum;

public class Museum {
	public int id;   //these are instance mem
	public String name;
	public String address;
	public int noOfFloors;
	public String depart;
	
	public Museum()
	{
		System.out.println("museum withno arg");
		
	}
	public Museum(int id,String name,String address,int noOfFloors,String depart)  //constructor is the best way to intialisation in java
	{                                   //  parametrised const
		System.out.println("museum with arg");
		
		this.id=id;               //these are instance mem
		 this.name=name;
		this.address=address;
		this.noOfFloors=noOfFloors;
		this.depart=depart;
		
		
}

}
