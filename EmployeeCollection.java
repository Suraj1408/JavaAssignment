package com.brizelab.review4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class EmployeeWagesUseCollection {

     	
	
		 @SuppressWarnings("unused")
		private static double CalculateDilyWages(int fullTime, double perDayAmt) {

	         double calDilyWages=fullTime*perDayAmt;
	 //      System.out.println(calDilyWages);
	         return calDilyWages;
	 }


	 @SuppressWarnings("unused")
	private static double CalculatePartTimeWages(int partTime, double perDayAmt){

	         double calPartTimeWages=partTime*perDayAmt;
	         return calPartTimeWages;

	 }


	 @SuppressWarnings("unused")
	private static double CalculateMonthlyWages(int workingdays, double perDayAmt) {

	         double calMonthlyWages=workingdays*perDayAmt;
	         return calMonthlyWages;
	 }

	 @SuppressWarnings("unused")
	private static int checkEmp(int random) {

	         int emp=random%2+1;
	         return emp;
	 }


			
			 public static void main(String[] args) {

				 List<Employee> list=new ArrayList<Employee>();
				 
				 Employee e1=new Employee();
				 e1.setEmployeeName("suraj");
				 e1.setCompanyName("Brizelab");
				 e1.setFullTimewages(20.00);
				 e1.setHours(8);
				 
				 Employee e2=new Employee();
				 e2.setEmployeeName("Kranti");
				 e2.setCompanyName("Wipro");
				 e2.setFullTimewages(20.00);
				 e2.setHours(8);
				 
				 Employee e3=new Employee();
				 e3.setEmployeeName("Kranti");
				 e3.setCompanyName("Wipro");
				 e3.setFullTimewages(20.00);
				 e3.setHours(100);
				 e3.setWorkingDay(20);
	        
				 list.add(e1);
				 list.add(e2);
				 list.add(e3);
				 
				 Iterator<Employee> itr=list.iterator();
				 while(itr.hasNext())
				 {
					 Employee emp=itr.next();
					 System.out.println(emp.getEmployeeName());
					 System.out.println(emp.getCompanyName());
					 System.out.println(emp.getFullTimewages());
					 System.out.println(emp.getPartTimeWages());
					 System.out.println(emp.getWorkingDay());
				 }
				 
				 Scanner sc=new Scanner(System.in);
	             int num=sc.nextInt();

	             System.out.println("Enter 1 for claculate Total Daily Wages");
	             System.out.println("Enter 2 for claculate Total part time Wages");
	             System.out.println("Enter 3 for claculate Wages For a month");
	             //System.out.println("Enter 4 for ");
	             System.out.println("Enter 5 to Check Emp is Persent Or absent");
	             //EmployeeWages emp=new EmployeeWages();
	             double perDayAmt=20.00;
	             int RANDOM = 0;
	             switch (num)
	             {
	                     case 1:
	                             int fullTime=8;
	                             //double perDayAmt=20.00;
	                       double cal=   EmployeeWages.CalculateDilyWages(fullTime,perDayAmt);
	                         System.out.println("Full Time wages "+cal);
	                     break;

	                     case 2:
	                             int partTime=4;

	                             double calPartTimeWages=EmployeeWages.CalculatePartTimeWages(partTime,perDayAmt);
	                             System.out.println(calPartTimeWages);
	                     break;

	                     case 3:
	                             int workingdays=20;

	                             double calPerMonthWages=EmployeeWages.CalculateMonthlyWages(workingdays,perDayAmt);
	                             System.out.println(calPerMonthWages);
	                     break;

	                     case 4:


	                         int check=EmployeeWages.checkEmp(RANDOM);
	                         if(check==1)
	                         {
	                                 System.out.println("Employee is present");
	                         }
	                         else {
	                                  System.out.println("Employee is Absent");
	                         }

	                 break;

	                 default:
	                         System.out.println("Wrong Input plxzzz no between 1 to 4");
	                 break;
	         }

	 }

}

