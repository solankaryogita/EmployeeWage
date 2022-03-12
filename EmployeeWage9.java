package com.Bridgelabz;

public class EmployeeWage9 {
	
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHrsPerMonth;
	
	public EmployeeWage9(String company, int empRatePerHour, int numOfWorkingDays, int maxHrsPerMonth)
	{
		super();
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHrsPerMonth = maxHrsPerMonth;
	}
	public static void main(String[] args) {
		EmployeeWage9 emp = new EmployeeWage9("Relince", 20, 2, 10);
		
		int empHrs = 0, totalEmpHrs = 0, totalWrkingDays = 0,  totalEmpWage=0;
		while(totalEmpHrs <= emp.maxHrsPerMonth && totalWrkingDays < emp.numOfWorkingDays)
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
		    totalEmpWage = totalEmpHrs *emp.empRatePerHour;
			System.out.println("totalEmp wage for Company is: "+totalEmpWage);
	}
}
