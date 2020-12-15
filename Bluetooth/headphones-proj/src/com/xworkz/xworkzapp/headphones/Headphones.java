package com.xworkz.xworkzapp.headphones;

public class Headphones {
	public String brandName="BOAT";
	public double price;
	public String color;
	
	public Headphones(double price,String color) {
		this.color=color;
		this.price=price;
		System.out.println("cost of BOAT headphones:"+this.price);
		System.out.println("color of BOAT headphones:"+this.color);
	}
	
	public int maxVol=5;
	public int minVol=0;
	public int currentVol;
	public boolean connected;
	
	
	public boolean isConnected()
	{
		System.out.println("initially headphones are OFF");
System.out.println("inside isConnected checking whether headphone is on or off");
  if(isConnected()==false)
{
	   this.connected=true;
	   System.out.println(this.connected);
	   
}
else if(isConnected()==true )
{
	   this.connected=false;
	   System.out.println(this.connected);
}
return connected;

	}
	
	 public void increaseVol() {
		   System.out.println("inside increasevol");
		   
		   
		   if(connected==true) {// connecting hence true condition enters loop
			   if(this.currentVol<this.maxVol) {//0<5 true
				   this.currentVol=this.currentVol+1;//0+1=1
				   System.out.println("increasing volume by +1");
				   System.out.println("current vol is:"+this.currentVol);//prints =1(initial 0)
			   }
			   else {
				   System.out.println("max vol reached");//prints if limits exceeds the current value
			   }
		   }else {
			   System.out.println("speaker not connected");//prints when condition fails
		   }
	   }
	   public void decVol() {
		   System.out.println("inside decVol");
		   if(connected==false) {
			   if(this.currentVol>this.minVol) {
				   this.currentVol=this.currentVol-1;
				   System.out.println("current vol is:"+this.currentVol);
			   }
		   else {
			   System.out.println("min vol reach");
		   }
		   }else {
			   System.out.println("speaker not connected");
		   }
	
	
}
}



