package com.xworkz.xworkzapp.operation;

import com.xworkz.xworkzapp.flightdto.FlightBookingDTO;

public class FlightBookingOperation {
            public FlightBookingDTO[] booking=new FlightBookingDTO[2];
            public int index;
            
            public void addflightBookingInformation(FlightBookingDTO booking) {
            	System.out.println("adding all flight booking information");
          //	if(booking!=null) {
        if(booking.getAirplaneCode()!=0 && booking.getCompany()!=null && booking.getStartingPoint()!=null) {
       System.out.println("THE FLIGHT BOOKING INFORMATION OF COMPANY "+booking.getCompany());
            	}
        /*else {
            System.out.println("THE FLIGHT BOOKING INFORMATION OF COMPANY");
            					}*/
            		if(booking.getBusinessClassPrice()>1000) {
            			this.booking[index++]=booking;
            				System.out.println("Business Class Price is matched");	
            				} 
            		else {
                        System.out.println("Business Class Price is not matched");  		
            		}}
            		
            		 public void searchByStartingPoint(String startingPoint)
             {
             	System.out.println("searching the StartingPoint");
             	for (int i = 0; i < booking.length; i++) {
             	if(booking[i]!=null) {
             		if(booking[i].getStartingPoint().equals(startingPoint)) {
             			System.out.println("stating point is "+booking[i].getStartingPoint());
             			System.out.println("starting point is found");
             		}else {
             			System.out.println("stating point is not found");
             		}
             	
             	}}}
            		 
             	

            
            	  
            

            					
            	
         
          
            				
            			

            
            		
            
            	
            
            

            public void displayAllFlightBookingInformation()
            {
            	System.out.println("Displaying All Flight Booking Information");
				for (int i = 0; i < booking.length; i++) {
					
				if(booking[i]!=null) {
            			
						System.out.println("AirplaneCode is"+booking[i].getAirplaneCode()+" "+"BusinessClassPrice"+booking[i].getBusinessClassPrice()+" "+"Destination is"+booking[i].getDestination()+" "+
								"Economy Class Price is"+booking[i].getEconomyClassPrice()+" "+"StartingPoint is"+booking[i].getStartingPoint()+" "+"TotalSeats are"+booking[i].getTotalSeats()
            		+" "+"Company is"+booking[i].getCompany());
            		}          
            		
            	
            }
            }
}



