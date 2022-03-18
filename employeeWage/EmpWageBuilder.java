package com.Bridgelabz.employeeWage;

import java.util.ArrayList;
interface CompanyCollection {
	
	void showInfo(Company company);
	void addCompany(Company company);
}

public class EmpWageBuilder {
	static ArrayList<Company> companyList = new ArrayList<Company>();
	 
	 public void showInfo(Company company) {
		 System.out.println("Company name: "+company.name);
		 System.out.println("Total Wage :"+company.monthlyWage);
	 }
	 
	 public void addCompany(Company company) {
		 companyList.add(company);

	 }

}
