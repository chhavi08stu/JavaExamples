package com.stest.companies.neebal.strategy.latest1.movieType;

import java.util.Map;


public class Childrens extends Movie {

	public Childrens(String title, int priceCode) {
		super(title, priceCode);
		
	}
	@Override
	public Map<Double, Integer> getPoints(int daysRented) {
		thisAmount += 1.5;
		if (daysRented > 3)
			thisAmount += (daysRented - 3) * 1.5;
		frequentRenterPoints++;
		map.put(thisAmount, frequentRenterPoints);
		return map;
	}
}
