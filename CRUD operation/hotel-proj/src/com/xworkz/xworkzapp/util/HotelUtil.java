 package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.hoteldto.HotelDTO;
import com.xworkz.xworkzapp.hoteldto.Location;
import com.xworkz.xworkzapp.operation.FoodItems;
import com.xworkz.xworkzapp.operation.HotelOperation;

public class HotelUtil {
public static void main(String[] args) {
	HotelDTO hotel=new HotelDTO();
	
	hotel.setName("polas");
	hotel.setOwnerName("kavitha");
	hotel.setService(true);
	hotel.setHotelType("veg");
	hotel.setLocation(Location.FORT);
	hotel.setService(true);
	hotel.setFoodTypes("chinese");

	HotelOperation op=new HotelOperation();
	op.addHotelInformation(hotel);
	op.display();
	op.returnOwnerNameByHotelName("polas");
	
	FoodItems food =new FoodItems();
	food.setName("IDLI");
	FoodItems foodOne =new FoodItems();
	foodOne.setName("SAMBAR");
	FoodItems foodTwo =new FoodItems();
	foodTwo.setName("NOODLES");
	FoodItems foodThree =new FoodItems();
	foodThree.setName("GOBI");
	FoodItems f =new FoodItems();
	f.setName("BABYCORN");
	op.addFoodItemInformation(food);
	op.addFoodItemInformation(foodOne);
	op.addFoodItemInformation(foodTwo);
	op.addFoodItemInformation(foodThree);
	op.addFoodItemInformation(f);
	
	op.displayFoodItems();
	
	
	
	
op.addFoodItemInformation(food);
op.displayFoodItems();
	
	
	
	/*FoodItems food=new FoodItems("idli","meals");
	FoodItems food1=new FoodItems("idli","meals");
	FoodItems food2=new FoodItems("idli","meals");
	FoodItems food3=new FoodItems("idli","meals");
	FoodItems food4=new FoodItems("idli","meals");
	FoodItems food5=new FoodItems("idli","meals");
	FoodItems food6=new FoodItems("idli","meals");
	FoodItems food7=new FoodItems("idli","meals");
	FoodItems food8=new FoodItems("idli","meals");
	FoodItems food9=new FoodItems("idli","meals");*/
	
}
}
