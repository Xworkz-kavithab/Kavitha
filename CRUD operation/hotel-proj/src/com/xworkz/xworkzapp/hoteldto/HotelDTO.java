package com.xworkz.xworkzapp.hoteldto;

public class HotelDTO {
  private String name;
  private Location location;
  private String ownerName;
  private String hotelType;
  private boolean service;
 // private FoodTypes[] food=new FoodTypes[11];
  private String foodItems;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Location getLocation() {
	return location;
}
public void setLocation(Location location) {
	this.location = location;
}
public String getOwnerName() {
	return ownerName;
}
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}
public String getHotelType() {
	return hotelType;
}
public void setHotelType(String hotelType) {
	this.hotelType = hotelType;
}
public boolean getService() {
	return service;
}
public void setService(boolean service) {
	this.service = service;
}
public String getFoodItems() {
	return foodItems;
}
public void setFoodTypes(String foodItems) {
	this.foodItems = foodItems;
}

  
  
}
