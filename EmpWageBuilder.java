package com.Bridgelabz;

public class EmpWageBuilder {
	
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHrsPerMonth;
	
	public EmpWageBuilder(String company, int empRatePerHour, int numOfWorkingDays, int maxHrsPerMonth)
	{
		super();
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHrsPerMonth = maxHrsPerMonth;
	}
	private int computeEmpWage()
	{
		int empHrs = 0, totalEmpHrs = 0, totalWrkingDays = 0,  totalEmpWage=0;
		while(totalEmpHrs <= maxHrsPerMonth && totalWrkingDays < numOfWorkingDays)
		{
			totalWrkingDays++;
			int empCheck = (int)Math.floor(Math.random() * 10) %3;
			
			switch(empCheck) 
			{
				//case 0:  System.out.println("Employee is Absent");
				//break;
   
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
		    totalEmpWage = totalEmpHrs *empRatePerHour;
			System.out.println("totalEmp wage for Company "+company +" is: "+totalEmpWage);
			return totalEmpWage;
	}
	public static void main(String[] args) {
		EmpWageBuilder relience = new EmpWageBuilder("Relince", 20, 2, 10);
		relience.computeEmpWage();
		System.out.println("-----------------------------------------");
		EmpWageBuilder ajinkyabazar = new EmpWageBuilder("AjinkyaBazar", 20, 2, 10);
		ajinkyabazar.computeEmpWage();
		System.out.println("------------------------------------------");
		EmpWageBuilder trends = new EmpWageBuilder("Trends", 20, 2, 10);
		trends.computeEmpWage();
	}
}
