package com.Bridgelabz;

public class EmployeeWage9 {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NO_OF_WORKING_DAYS= 2;
	public static final int MAX_HRS_IN_MONTH = 100;
	
	public int calculateempwageforCompany(String company, int empRate, int numOfDays, int maxHrs)
	{
		int empHrs = 0, totalEmpHrs = 0, totalWrkingDays = 0,  totalEmpWage=0;
		while(totalEmpHrs <= maxHrs && totalWrkingDays <numOfDays)
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
		    
			
			int salary = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("salary ----------"+salary);
			totalEmpWage = totalEmpWage+totalEmpHrs *empRate;
			System.out.println("totalEmp wage for company: " +company+" is: "+totalEmpWage);
			return totalEmpWage;
	}
	public static void main(String[] args) {
		EmployeeWage9 emp = new EmployeeWage9();
		EmployeeWage9 emp1 = new EmployeeWage9();
		emp.calculateempwageforCompany("Relince", 20, 5, 16);
		System.out.println("-----------------------------------------");
		emp1.calculateempwageforCompany("City Central Mall", 10, 2, 7);
	}
}
