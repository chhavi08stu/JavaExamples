package com.stest.companies.neebal.strategy.aug_new1;

public class ChildrenType extends MovieType {
	@Override
	public String calculatePoints(Rental rental) {

		thisAmount += 1.5;
		if (rental.getDaysRented() > 3)
			thisAmount += (rental.getDaysRented() - 3) * 1.5;

		// add frequent renter points
		frequentRenterPoints++;

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
