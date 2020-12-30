package com.xworkz.xworkzapp.operation;

import com.xworkz.xworkzapp.hoteldto.HotelDTO;
import com.xworkz.xworkzapp.hoteldto.Location;

public class HotelOperation {
	public HotelDTO[] hotel=new HotelDTO[1];
	public FoodItems[] food=new FoodItems[11];
	public int index;
	
	public void addHotelInformation(HotelDTO hotel) {
		System.out.println("adding all hotel information");
		if(hotel.getName()!=null && hotel.getLocation()!=null ) {
			this.hotel[index++]=hotel;
			System.out.println("added all hotel information");
			
		}else {
			System.out.println("hotel information is not added");
		}
	}
	
	public void addFoodItemInformation(FoodItems food) {
		System.out.println("adding all food items information");
		if(food.getName()!=null)  {
			this.food[index++]=food;
			System.out.println("added all food item information");
			
		}else {
			System.out.println("food item information is not added");
		}
	}
	
	public void display()
	{
		System.out.println("displaying hotel information");
		for (int i = 0; i < hotel.length; i++) {System.out.println("in for");
			if(hotel[i]!=null) {System.out.println("in if");
				System.out.println("Food name is:"+hotel[i].getFoodItems()+" "+"Type of Hotel:veg or non veg:"+hotel[i].getHotelType()+" "+"hotel name:"+hotel[i].getName()+" "+"owner name:"+hotel[i].getOwnerName()+" "+"address of hotel:"+hotel[i].getLocation()+" "+"hotel service is good or bad ,if good print true:"+hotel[i].getService());
			System.out.println("out for");}
			else {
				System.out.println("hotel information is not available");
			}
			
		}
	}
	
	public void displayFoodItems()
	{
		System.out.println("displaying food items information");
		for (int i = 0; i < food.length; i++) {
			if(food[i]!=null) {
				System.out.println(food[i].getName());
				System.out.println("end of if condition");
			}
			else {
				System.out.println("food item information is not available");
			}
			
		}
	}



	
	public HotelDTO returnOwnerNameByHotelName(String name)
	{
	HotelDTO dto=null; 
	System.out.println("returning the statements");
	for (int i = 0; i < hotel.length; i++) {
		if(hotel[i]!=null) {
			if(hotel[i].getName().equals(name)) {System.out.println("in if");
				System.out.println("returning owner name that is :"+hotel[i].getOwnerName());
			}else
			{
				System.out.println("not returning");
			}
		}
		
	}
	return dto;
		
	}

}
