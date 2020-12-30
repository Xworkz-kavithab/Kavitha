package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.flightdto.Company;
import com.xworkz.xworkzapp.flightdto.FlightBookingDTO;
import com.xworkz.xworkzapp.operation.FlightBookingOperation;

public class FlightBookingUtil {

	
	public static void main(String[] args) {
		FlightBookingDTO fone=new FlightBookingDTO();
		fone.setAirplaneCode(12);
		fone.setCompany(Company.SPARROW);
		fone.setStartingPoint("bellary");
		fone.setDestination("Bangalore");
		fone.setTotalSeats(54);
		fone.setDomestic(true);
		fone.setBusinessClassPrice(123456);
		fone.setEconomyClassPrice(123);
		
		FlightBookingDTO f_one=new FlightBookingDTO();
		f_one.setAirplaneCode(11);
		fone.setCompany(Company.JETAIRWAYS);
		f_one.setStartingPoint("mumbai");
		f_one.setDestination("manglore");
		f_one.setTotalSeats(50);
		f_one.setDomestic(true);
		f_one.setBusinessClassPrice(12322);
		f_one.setEconomyClassPrice(1234);
		
		FlightBookingOperation op=new FlightBookingOperation();
		op.addflightBookingInformation(fone);
		op.addflightBookingInformation(f_one);
		op.displayAllFlightBookingInformation();
		op.searchByStartingPoint("bellary");
		
		
		
		
		
	}

}
