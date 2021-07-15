package com.reservation;

import java.io.IOException;

public class Hotel {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcom to Hotel Reservation Systems");

		
		//setting values for lakewood
		
		HotelReservationSystem lakewood = new HotelReservationSystem("Likewood");
		lakewood.setWeekDayRegularRate(110);
		lakewood.setWeekDayRewardRate(80);
	
		
		//setting values for bridgeewood
		
		HotelReservationSystem bridgewood = new HotelReservationSystem("Bridgewood");
		bridgewood.setWeekDayRegularRate(160);
		bridgewood.setWeekDayRewardRate(110);

		
		//setting values for ridgewood 
		
		HotelReservationSystem ridgewood = new HotelReservationSystem("Ridgewood");
		ridgewood.setWeekDayRegularRate(160);
		ridgewood.setWeekDayRewardRate(110);


	}
}
