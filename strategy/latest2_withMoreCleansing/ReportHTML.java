package com.stest.strategy.latest2_withMoreCleansing;

public class ReportHTML implements ReportInterface
{
	@Override
    public void printReport(String data) {
        System.out.println("Html Report with data="+data);  
    }
}