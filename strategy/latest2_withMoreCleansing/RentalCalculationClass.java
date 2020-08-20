package com.stest.strategy.latest2_withMoreCleansing;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.stest.strategy.latest2_withMoreCleansing.movieType.MovieType;


public class RentalCalculationClass implements RentalCalculationStrategyInterface {
	double totalAmount = 0;
	int frequentRenterPoints = 0;
	String title = "";
	
	private Movie movie;
	private Customer customer;

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String statement() {
		List<Rental> _rentals = this.getCustomer().get_rentals();
		MovieType movieType = new MovieType();
		Iterator<Rental> rentals = _rentals.iterator();// .elements();
		String result = "Rental Record for " + this.getCustomer().getName() + "\n";

		while (rentals.hasNext()) {
			Rental each = (Rental) rentals.next();
			title = each.getMovie().getTitle();
			Movie movie = movieType.getMovie(each.getMovie(), each.getMovie().getPriceCode());
			Map<Double, Integer> mape = movie.getPoints(each.getDaysRented());
			for (Map.Entry<Double, Integer> map : mape.entrySet()) {
				totalAmount = map.getKey();
				frequentRenterPoints = map.getValue();
			}
		}
		result += "\t" + title + "\t" + title + "\n";
		// add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points. ";
		return result;
	}
}
