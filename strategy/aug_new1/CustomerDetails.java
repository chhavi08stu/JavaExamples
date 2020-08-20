package com.stest.companies.neebal.strategy.aug_new1;

import java.util.ArrayList;
import java.util.List;

public class CustomerDetails {
	List<Customer> list = new ArrayList<Customer>();

	public void setCustomerList(List<Customer> list) {
		this.list = list;
	}

	public Customer getCustomerDetails(String name) {

		Customer matchingObject = list.stream().filter(p -> p.getName().equals(name)).findAny().orElse(null);

		return matchingObject;

	}

	public void setCustomerRentalList(String name, List<Rental> rental) {
		Customer c = getCustomerDetails(name);
		c.setRentalList(rental);
	}

	public List<Rental> getRentalList(Customer c) {
		return c.getRentalList();
	}
	
}
