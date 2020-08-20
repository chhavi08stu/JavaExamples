package com.stest.companies.neebal.strategy.aug_new1;

public class Rental {
	private Movie movie;
	private int daysRented;

	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public int getDaysRented() {
		return daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public String toString() {
		return "movie " + "{" + "\"" + movie.getTitle() +"\"," + movie.getMovieType() + "}"
				+ " rented for " + daysRented + " days";
	}
}