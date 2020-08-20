
package com.stest.companies.neebal.strategy.aug_new1;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<Rental>();

	public Customer(String name) {
		this.name = name;
	}

	public void setRentalList(List<Rental> arg) {
		rentals.addAll(arg);
	}

	public List<Rental> getRentalList() {
		return rentals;
	}

	public String getName() {
		return name;
	}
}