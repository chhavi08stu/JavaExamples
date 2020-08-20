package com.stest.companies.neebal.strategy.latest1;

import java.util.HashMap;
import java.util.Map;

import com.stest.companies.neebal.strategy.latest1.movieType.MovieType;

public class Movie {
	protected double thisAmount = 0;
	protected int frequentRenterPoints;
	private String _title;
	private int _priceCode;
	protected Map<Double, Integer> map = new HashMap<Double, Integer>();
	
	public Map<Double, Integer> getPoints(int daysRented) {
		this.thisAmount = 0;

		frequentRenterPoints = 0;

		
		map.put(thisAmount, frequentRenterPoints);
		return map;
	}

	private MovieType movieType;

	public Movie(String title, int priceCode) {
		_title = title;
		_priceCode = priceCode;
	}

	public int getPriceCode() {
		return _priceCode;
	}

	public void setPriceCode(int arg) {
		_priceCode = arg;
	}

	public String getTitle() {
		return _title;
	}

	public MovieType getMovieType() {
		return movieType;
	}

	public void setMovieType(MovieType movieType) {
		//movieType.getMovieType(this._priceCode);
		this.movieType = movieType;
	}
	/*
	 * public Map<Double,Double> getPoints(){
	 * 
	 * }
	 */
}