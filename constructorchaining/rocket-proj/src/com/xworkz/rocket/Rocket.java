package com.xworkz.rocket;

import java.util.Date;

public class Rocket {

     //public String  name;
	// public int id;
	// public Date date;
	// public Date date=new Date();
private String name;             //for private mem public geter and seter is used
private int id;                 //the concept is encapsulation (binding of datamem in a block)
 private Date date;
//private Date date=new Date();

	 
	/* public Rocket() {
		System.out.println("created");
		
	}
	 
	public Rocket(String name,int id)
	{
		this.name=name;
		this.id=id;
		//this.date=date;
	
	}*/
 
 public Rocket() {
	
}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)// seter method doesnt hv return type it is jst used to set the data n nly pass the parameters
	{
		this.id=id;
	}
	
public Date getDate()
{
	return date;
}
public void setDate(Date date)
{
	this.date=date;
	
}
	
}
