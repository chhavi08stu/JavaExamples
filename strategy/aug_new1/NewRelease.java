package com.stest.companies.neebal.strategy.aug_new1;

public class NewRelease extends MovieType {
	@Override
	public String calculatePoints(Rental rental) {
		thisAmount += rental.getDaysRented() * 3;

		// add frequent renter points
		frequentRenterPoints++;
		// show figures for this rental
		result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
		totalAmount += thisAmount;
		if (rental.getDaysRented() > 1)
			frequentRenterPoints++;
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";

		return result;
	}

	public String toString() {
		return this.getClass().getSimpleName();
	}

	/*
	 * public String toString() { return "Movie Type is " +
	 * this.getClass().getSimpleName(); }
	 */
}