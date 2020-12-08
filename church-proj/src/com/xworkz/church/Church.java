package com.xworkz.church;

public class Church {
private String name;
private String address;
private int noOfPriest;




public Church( ) {
this("asdf",2,"wer");



	
}

public Church(String address,int noOfPriest,String name)
{
	
	this.address=address;
	this.noOfPriest=noOfPriest;
	this.name=name;
	
}



public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
	
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public int getNoOfPriest() {
	
	return noOfPriest;
}

public void setNoOfpriest(int noOfpriest) {
	this.noOfPriest=noOfPriest;
}

}

