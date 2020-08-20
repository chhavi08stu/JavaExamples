package com.stest.strategy.latest2_withMoreCleansing.movieType;

import java.util.Map;

import com.stest.strategy.latest2_withMoreCleansing.Movie;


public class NewRelease extends Movie {

	public NewRelease(String title, int priceCode) {
		super(title, priceCode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Map<Double, Integer> getPoints(int daysRented) {
		thisAmount += daysRented * 3;
		frequentRenterPoints++;
		// HashMap<Double, Integer> map = new HashMap<Double, Integer>();
		if (daysRented > 1)
			frequentRenterPoints++;
		map.put(thisAmount, frequentRenterPoints);
		return map;
	}
}