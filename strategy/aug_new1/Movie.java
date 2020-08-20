package com.stest.companies.neebal.strategy.aug_new1;

public class Movie {

	private String title;

	private MovieType movieType;

	public MovieType getMovieType() {
		return movieType;
	}

	public void setMovieType(MovieType movieType) {
		this.movieType = movieType;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Movie(String title, MovieType movieType) {
		this.title = title;

		this.movieType = movieType;
	}

	public String getTitle() {
		return title;
	}

	public String toString() {
		return "Movie: " + this.getTitle() + " " + this.getMovieType();
	}
}