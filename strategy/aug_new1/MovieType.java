package com.stest.companies.neebal.strategy.aug_new1;

public class MovieType {
	public double totalAmount = 0;
	public double thisAmount = 0;
	public int frequentRenterPoints = 0;
	public String result = "";
	private int priceCode;

	MovieType movieType = null;

	public int getPriceCode() {
		return priceCode;
	}

	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}

	public String calculatePoints(Rental rental) {
		return result;
	}

	public MovieType getMovieType(int priceCode) {
		switch (priceCode) {
		case 0:
			movieType = new Regular();

		case 1:
			movieType = new NewRelease();
		case 2:
			movieType = new ChildrenType();

		default:
			System.out.println("No Movie Tyoe");

			return movieType;

		}
	}
}






/*
 * public static final int CHILDRENS = 2; public static final int REGULAR = 0;
 * public static final int NEW_RELEASE = 1;
 */