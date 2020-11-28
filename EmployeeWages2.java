
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
	
	
	private static double CalculateComputeWages(int workingdays, double perDayAmt, int hours) {
		
		double calComputeWages=workingdays*perDayAmt*hours;
		return calComputeWages;
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Company Name");
		int num=sc.nextInt();
		
		System.out.println("Enter 1 for claculate Total Daily Wages of Brizelab");
		System.out.println("Enter 2 for claculate Total part time Wages of TCS");
		System.out.println("Enter 3 for claculate Wages For a month Wipro");
		System.out.println("Enter 5 for cal Compute wages ");
		System.out.println("Enter 4 to Check Emp is Persent Or absent");
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
		
				int check=EmployeeWages.checkEmp(RANDOM);
				if(check==1)
				{
					System.out.println("Employee is present");
				}
				else {
					 System.out.println("Employee is Absent");
				}
				
			break;
			
			case 5:
				int workingComputeDays=20;
				int hours=100;
				double calComputeWages=EmployeeWages.CalculateComputeWages(workingComputeDays,perDayAmt,hours);
				System.out.println(calComputeWages);	
			break;
			
			default:
				System.out.println("Wrong Input plzzz no between 1 to 5 ");
			break;
		}
		
	}


	

	
	
}

