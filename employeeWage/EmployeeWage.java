package com.Bridgelabz.employeeWage;
import java.util.Random;
import java.util.Scanner;

public class EmployeeWage {
	static final int FULL_TIME = 8;
    static final int PART_TIME = 4;
    static int days = 0;
	static int hours = 0;
	static int monthlyWage = 0;
	
	int checkAttendance(int randInt) {
		switch (randInt) {
		case 1:
			System.out.println("Employee is present");
			return FULL_TIME;

		case 2:
			System.out.println(" Employee Working as part time");
			return PART_TIME;
		default:
			System.out.println("Employee is absent");
			return 0;
		}

	}
	
	int calculateWage(int randInt,Company company) {
		int dailyWage = 0;
		switch (randInt) {
		case 1:
			dailyWage = FULL_TIME * company.wagePerHrs;
			return dailyWage;

		case 2:
			dailyWage = PART_TIME * company.wagePerHrs;
			return dailyWage;
		default:
			return dailyWage;
		}
	}
	
	int calculateMonthlyWage(EmployeeWage employee, Company company) {
		Random randomInt = new Random();

		while (days < company.workingDays && hours <= company.workingHoursMonthly) {
			int randInt = randomInt.nextInt(3);
			hours = hours + employee.checkAttendance(randInt);
			if (hours > company.workingHoursMonthly) {
				hours = company.workingHoursMonthly;
				monthlyWage = monthlyWage + employee.calculateWage(randInt,company) - company.wagePerHrs * PART_TIME;
				break;
			} 
			else {
				monthlyWage = monthlyWage + employee.calculateWage(randInt,company);
			}
			days += 1;
			if(employee.checkAttendance(randInt) == 0) {
				days-=1;
			}
		}
		System.out.println("Total days the employee worked is " + days + " days");
		System.out.println("Total hours the employee Worked is " + hours + " hours");
		return monthlyWage;

	}
   
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Employee wage computation");
       
		EmployeeWage employee = new EmployeeWage();
		Company company = new Company();
	    EmpWageBuilder empWageBuilder=new EmpWageBuilder();
		
	    System.out.println("Enter the name of the company :");
		String name = input.nextLine();
		System.out.println("Enter wage per hour :");
		int wagePerHour = input.nextInt();
		System.out.println("Enter the total working days: ");
		int workingDays = input.nextInt();
		System.out.println("Enter total monthly working hours :");
		int workingHoursMonthly = input.nextInt();
		
		company.setInfo(name, wagePerHour, workingDays, workingHoursMonthly);
		int monthlyWage = employee.calculateMonthlyWage(employee,company);
		company.companyMonthlyWage(monthlyWage);
		
		empWageBuilder.showInfo(company);
		empWageBuilder.addCompany(company);
		
		
	}

}
