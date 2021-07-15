package com.reservation;

public class HotelReservationSystem {
	private String name;
	private double weekDayRegularRate;
	private double weekDayRewardRate;


	public HotelReservationSystem(String name) {
		this.name = name;
	}
	public double getWeekDayRegularRate() {
		return weekDayRegularRate;
	}

	public void setWeekDayRegularRate(double weekDayRegularRate) {
		this.weekDayRegularRate = weekDayRegularRate;
	}

	public double getWeekDayRewardRate() {
		return weekDayRewardRate;
	}

	public void setWeekDayRewardRate(double weekDayRewardRate) {
		this.weekDayRewardRate = weekDayRewardRate;
	}

}
