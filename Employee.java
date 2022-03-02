package com.Bridgelabz;
import java.lang.Math;
import java.util.Random;

public class Employee 
{
	static final int WAGE_PER_HOURS =20;
	
	public static void main(String[] args)
	{
		int workingHours;
	      int Employeewag;
	      System.out.println("Welcome to Employee Wages");
	        
	     int randomVal = (int)Math.floor(Math.random()*10) %3;
	      
	     System.out.println("Random value:"+randomVal);
	   
	     if(randomVal ==1) 
	     {
	    	 
	           System.out.println("Employee is Present");
	           workingHours=8;
	           System.out.println("Working hours :"+workingHours);
	           Employeewag=workingHours*WAGE_PER_HOURS;
	           System.out.println("Employeewag is :"+Employeewag);
	     }
	     else if(randomVal==2)
	     {
	    	 System.out.println("Employee Working as Part Time");
	    	 workingHours=4;
	         System.out.println("Working hours :"+workingHours);
	         Employeewag=workingHours*WAGE_PER_HOURS;
	         System.out.println("Employeewag is :"+Employeewag);
	     }
	     else {
	           System.out.println("Employee is Absent");
	           workingHours=0;
	           System.out.println("Working hours :"+workingHours);
	          }
    }
}