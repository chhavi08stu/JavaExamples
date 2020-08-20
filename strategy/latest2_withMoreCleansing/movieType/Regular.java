package com.stest.strategy.latest2_withMoreCleansing.movieType;

import java.util.Map;

import com.stest.strategy.latest2_withMoreCleansing.Movie;


public class Regular extends Movie {

	public Regular(String title, int priceCode) {
		super(title, priceCode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Map<Double, Integer> getPoints(int daysRented) {
		thisAmount += 2;
		if (daysRented > 2)
			thisAmount += (daysRented - 2) * 1.5;
		frequentRenterPoints++;

		// HashMap<Double, Integer> map = new HashMap<Double, Integer>();
		map.put(thisAmount, frequentRenterPoints);
		return map;
	}
}
