package com.xworkz.xworkzapp.speaker;

public class Speaker {
   private double price;
   private String color;
   private int batterybackuphours;
   
   public Speaker(double price,int batterybackuphours)
   {
	   
	   this.price=price;
	   this.batterybackuphours=batterybackuphours;
	   System.out.println();
	   System.out.println("arg1 is:"+this.price);
	   System.out.println("arg2 is:"+this.batterybackuphours);
	   
   }
   
   
   public static String brandName="noise";
   private int maxVol=6;
   private int minVol=0;
   private boolean connected;
   private int currentvol;
   
  
   
   public void onOrOff()
   {
	   System.out.println("inside onOrOff");
	   if(isConnected1()==false)
	   {
		   this.connected=true;
		   System.out.println(this.connected);
	   }
	   else if(isConnected1()==true )
	   {
		   this.connected=false;
		   System.out.println(this.connected);
	   }
	   
   }
   
   public boolean isConnected1() {
	   return connected;
	   
   }

   public void increaseVol() {
	   System.out.println("inside increasevol");
	   if(connected==true) {
		   if(this.currentvol<this.maxVol) {
			   this.currentvol=this.currentvol+1;
			   System.out.println("current vol is:"+this.currentvol);
		   }
		   else {
			   System.out.println("max vol reached");
		   }
	   }else {
		   System.out.println("speaker not connected");
	   }
   }
   public void decVol() {
	   System.out.println("inside decVol");
	   if(connected==false) {
		   if(this.currentvol>this.minVol) {
			   this.currentvol=this.currentvol-1;
			   System.out.println("current vol is:"+this.currentvol);
		   }
	   else {
		   System.out.println("min vol reach");
	   }
	   }else {
		   System.out.println("speaker not connected");
	   }
   }

		   
	
	   
	 
 

public static String getBrandName() {
	return brandName;
}



public static void setBrandName(String brandName) {
	Speaker.brandName = brandName;
}

public int getMaxVol() {
	return maxVol;
}

public void setMaxVol(int maxVol) {
	this.maxVol = maxVol;
}

public int getMinVol() {
	return minVol;
}

public void setMinVol(int minVol) {
	this.minVol = minVol;
}

public boolean isConnected() {
	return connected;
}

public void setConnected(boolean connected) {
	this.connected = connected;
}
   
   
   
}
