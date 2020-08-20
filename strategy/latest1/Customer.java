
package com.stest.companies.neebal.strategy.latest1;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<Rental>();

	public Customer(String name, List<Rental> list) {
		this.name = name;
		rentals.addAll(list);
	}

	public void addRental(Rental arg) {
		rentals.add(arg);
	}

	public String get_name() {
		return name;
	}

	public void set_name(String name) {
		this.name = name;
	}

	public List<Rental> get_rentals() {
		return rentals;
	}
/*
	public void set_rentals(List<Rental> _rentals) {
		this.rentals= rentals;
	}
*/
	public String getName() {
		return name;
	}
}