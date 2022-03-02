package com.Bridgelabz;
import java.lang.Math;
import java.util.Random;

public class Employee 
{
   
	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wages");
		
		int randomVal = (int)Math.floor(Math.random()*10) %2;
	      
	    System.out.println("Random value:"+randomVal);
	   
	     if(randomVal ==1) 
	      {
	           System.out.println("Employee is Present");
	      }
	     else
	           System.out.println("Employee is Absent");
		
    }
}