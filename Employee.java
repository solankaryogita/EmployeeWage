package com.Bridgelabz;
import java.lang.Math;
import java.util.Random;

public class Employee 
{
	static final int WAGE_PER_HOURS =20;
	static final int EMP_MONTH_DAYS = 20;
	static final int EMP_MONTH_HOUR = 100;
	
	public static void main(String[] args)
	{
	      int workingHours=0;
	      int Employeewag=0;
	      int totalworkingdays=1;
	      int totalEmpWage=0;
	      int totalworkinghour=0;
	      int TotalHour=0;
	      
	      System.out.println("Welcome to Employee Wages");
	      while(totalworkingdays<20 && totalworkinghour<100){
	      
	     int randomVal = (int)Math.floor(Math.random()*10) %4;
	      
	     System.out.println("Random value:"+randomVal);
	   
	     switch(randomVal)
	     {
	         case 0:  System.out.println("Employee is Absent");
	                  workingHours=0;
	                  System.out.println("Working hours :"+workingHours);
	                  break;
	         
	    	 case 1:  System.out.println("Employee is Present");
	                  workingHours=8;
	                  System.out.println("Working hours :"+workingHours);
	                  
	                  break;
	         
	    	 case 2:  System.out.println("Employee Working as Part Time");
	    	          workingHours=4;
	                  System.out.println("Working hours :"+workingHours);
	                  
	                  break;
	        default: System.out.println("End Of The Switch Case");
	     
	     }
	           
	           
	           TotalHour=TotalHour+workingHours;
	           System.out.println("Total Working Hour is :" +TotalHour);
	           Employeewag= workingHours * WAGE_PER_HOURS;
	           System.out.println("Employeewag is :"+Employeewag);
	           totalEmpWage= totalEmpWage+Employeewag;
	           System.out.println("Total Emp Wage :"+totalEmpWage);
	           totalworkingdays++;
	           totalworkinghour++;
	      }
    }
}