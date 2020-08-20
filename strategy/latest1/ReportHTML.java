package com.stest.companies.neebal.strategy.latest1;

public class ReportHTML implements ReportInterface
{
	@Override
    public void printReport(String data) {
        System.out.println("Html Report with data="+data);  
    }
}