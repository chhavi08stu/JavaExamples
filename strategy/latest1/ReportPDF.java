package com.stest.companies.neebal.strategy.latest1;

public class ReportPDF implements ReportInterface {
	@Override
	public void printReport(String data) {
		System.out.println("PDF Report with data=" + data);
	}
}