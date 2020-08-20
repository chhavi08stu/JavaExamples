package com.stest.companies.neebal.strategy.aug_new1;

public class Regular extends MovieType {
	@Override
	public String calculatePoints(Rental rental) {
		thisAmount += 2;
		if (rental.getDaysRented() > 2)
			thisAmount += (rental.getDaysRented() - 2) * 1.5;
		// add frequent renter points
		frequentRenterPoints++;
		// add bonus for a two day new release rental
		// show figures for this rental
		result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
		totalAmount += thisAmount;

		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
		return result;
	}

	public String toString() {
		return this.getClass().getSimpleName();
	}
}