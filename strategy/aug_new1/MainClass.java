package com.stest.companies.neebal.strategy.aug_new1;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// Insert data for testing
		CustomerDetails cd = insertData();

		// Get report from existing data
		GetMovieForCustomer getDet = new GetMovieForCustomer("Chhavi", new Regular(), "Jab tak hain Jaan", cd);

		// Strategy for Report Generation
		ReportGeneration rg = new PDFReport();

		ReportInstance repI = new ReportInstance(rg);
		repI.generateReport();
	}
	/* Insert data into class before testing the problem statement */
	private static CustomerDetails insertData() {
		List<Rental> list = new ArrayList<Rental>();

		Rental r1 = new Rental(new Movie("Title", new Regular()), 10);
		Rental r2 = new Rental(new Movie("Jab tak hain Jaan", new NewRelease()), 10);
		Rental r3 = new Rental(new Movie("Ham", new ChildrenType()), 15);
		Rental r4 = new Rental(new Movie("Raja Hindustani", new NewRelease()), 15);

		list.add(r1);
		list.add(r2);
		list.add(r3);
		list.add(r4);

		Customer c = new Customer("Chhavi");
		c.setRentalList(list);

		List<Customer> listC = new ArrayList<Customer>();
		listC.add(c);

		CustomerDetails cd = new CustomerDetails();
		cd.setCustomerList(listC);
		return cd;
	}
}
