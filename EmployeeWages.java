

import java.util.Scanner;

public class EmployeeWages {

	private static double CalculateDilyWages(int fullTime, double perDayAmt) {
	
		double calDilyWages=fullTime*perDayAmt;
	//	System.out.println(calDilyWages);
		return calDilyWages;
	}
	
	
	private static double CalculatePartTimeWages(int partTime, double perDayAmt){
		
		double calPartTimeWages=partTime*perDayAmt;
		return calPartTimeWages;
				
	}
	
	
	private static double CalculateMonthlyWages(int workingdays, double perDayAmt) {
		
		double calMonthlyWages=workingdays*perDayAmt;
		return calMonthlyWages;
	}
	
	private static int checkEmp(int random) {
		
		int emp=random%2+1;
		return emp;
	}
	
	public static void main(String[] args) {
		
		
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
			  double cal=	EmployeeWages.CalculateDilyWages(fullTime,perDayAmt);
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
			
			//int checkEmp=RANDOM*2;
				
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
