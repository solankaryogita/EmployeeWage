package com.Bridgelabz;

public class EmpWageBuilderArray {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	
	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;
	
	public EmpWageBuilderArray()
	{
		companyEmpWageArray = new CompanyEmpWage[5];
	}
	
	private void addCompanyEmpWage(String company, int empRatePerHour, int numOfworkingDays, int maxHrsPerMonth)
	{
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfworkingDays, maxHrsPerMonth);
		numOfCompany++;
	}
	
	private void computeEmpWage()
	{
		int empHrs = 0, totalEmpHrs = 0, totalWrkingDays = 0; 
		for(int i = 0; i<numOfCompany;i++)
		{
			int totalEmpWage = this.computeEmpWage(companyEmpWageArray[i]);
			System.out.println("Total Emp Wage for Company " +companyEmpWageArray[i].company  + " is: " +totalEmpWage);
			System.out.println("------------------------------------------");
		}
	}
	private int computeEmpWage(CompanyEmpWage companyEmpWage)
	{
		int empHrs = 0, totalEmpHrs = 0, totalWrkingDays = 0;
			while(totalEmpHrs <= companyEmpWage.maxHrsPerMonth && totalWrkingDays <= companyEmpWage.numOfworkingDays)
			{
				totalWrkingDays++;
				int empCheck = (int)Math.floor(Math.random() * 10) %3;
				
				switch(empCheck) 
				{
					case 0:  System.out.println("Employee is Absent");
					empHrs = 0;
					break;

					case 1:  System.out.println("Employee is Present");
					empHrs = 8;
					break;

					case 2:  System.out.println("Employee Working as Part Time");
					empHrs = 4;
					break;
					
					default: System.out.println("End Of The Switch Case");
				}
				totalEmpHrs =totalEmpHrs + empHrs;
				System.out.println("Day#: " + totalWrkingDays + "Emp Hr: " + empHrs);
			}
			return totalEmpHrs * companyEmpWage.empRatePerHour;
		}
	
	 public static void main(String[] args) {
		EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("Relince", 20, 2, 10);
		empWageBuilder.addCompanyEmpWage("City Cenral Mall", 20, 3, 10);
		empWageBuilder.computeEmpWage();
		

	}

}
