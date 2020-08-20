package com.stest.companies.neebal.strategy.aug_new1;

public class ReportGeneration {
	public void printReport() {
	}
}

class PDFReport extends ReportGeneration {
	public void printReport() {
		System.out.println("Print Report in PDF Format");
	}
}

class HTMLReport extends ReportGeneration {
	public void printReport() {
		System.out.println("Print Report in HTML Format");
	}
}

class ReportInstance {
	ReportGeneration repG;

	ReportInstance(ReportGeneration repG) {
		this.repG = repG;
	}

	public void generateReport() {
		this.repG.printReport();
	}
}