package com.Bridgelabz.employeeWage;

public class Company {
	String name;
	int wagePerHrs;
	int workingDays;
	int workingHoursMonthly;
	int monthlyWage;	
	int[] dailyWage = new int [20];
	
	void setInfo(String name,int wagePerHrs,int workingDays, int workingHoursMonthly) {
		 this.name = name;
		 this.wagePerHrs = wagePerHrs;
		 this.workingDays = workingDays;
		 this.workingHoursMonthly = workingHoursMonthly;
			   
	}
		   
	void companyMonthlyWage(int monthlyWage) {
		this.monthlyWage = monthlyWage;
	}
	
	void dialyWage(int dailyWage, int total) {
		this.dailyWage[total] = dailyWage;
	}
	

}
