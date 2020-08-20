package com.stest.strategy.latest2_withMoreCleansing;

public class ReportPDF implements ReportInterface {
	@Override
	public void printReport(String data) {
		System.out.println("PDF Report with data=" + data);
	}
}