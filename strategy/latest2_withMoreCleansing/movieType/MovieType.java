package com.stest.strategy.latest2_withMoreCleansing.movieType;

import com.stest.strategy.Constants;
import com.stest.strategy.latest2_withMoreCleansing.Movie;
import com.stest.strategy.latest2_withMoreCleansing.MovieTypeInterface;

public class MovieType implements MovieTypeInterface {
	public Movie getMovieType(Movie movie, int movieEnum) {

		Movie m = null;
		if (movieEnum == Constants.CHILDRENS) {
			m = new Childrens(movie.getTitle(), movie.getPriceCode());
		}
		if (movieEnum == Constants.REGULAR) {
			m = new Regular(movie.getTitle(), movie.getPriceCode());
		}
		if (movieEnum == Constants.NEW_RELEASE) {
			m = new NewRelease(movie.getTitle(), movie.getPriceCode());
		}
		return m;
	}

	// @Override
	public Movie getMovie(Movie movie, int moviePriceCode) {

		// Movie movie1 = new MovieType().getMovieType(movie, moviePriceCode);
		return new MovieType().getMovieType(movie, moviePriceCode);
	}
}
