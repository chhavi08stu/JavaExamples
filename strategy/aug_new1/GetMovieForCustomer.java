package com.stest.companies.neebal.strategy.aug_new1;

import java.util.List;

public class GetMovieForCustomer {

	public GetMovieForCustomer(String custName, MovieType movieType, String movieName, CustomerDetails cd) {

		List<Rental> list = cd.getRentalList(cd.getCustomerDetails(custName));

		Rental matchingObject = list.stream().filter(p -> p.getMovie().getMovieType() instanceof MovieType
				& p.getMovie().getTitle().equalsIgnoreCase(movieName)).findAny().orElse(null);

		if (matchingObject != null) {

			MovieType mov = matchingObject.getMovie().getMovieType();
			String s = mov.calculatePoints(matchingObject);
			String result = "Rental Record for " + custName + "\n";
			System.out.println("s: " + result + s);
		} else {
			System.out.println("Record is not available.");
		}

	}

}