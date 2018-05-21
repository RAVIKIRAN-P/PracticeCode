
public class SalaryCalculator {

	
	public static void main(String[] args)
	{
	System.out.println("Salary details");
	callSalary();
	int NumA=10;
	int NumB=20;
	addNumbers(NumA,NumB);
	}
	
	
	
	static void callSalary()
	{
		System.out.println("callSalary method");
		
	}
	
	static void addNumbers(int NumA,int NumB)
	{
		int sum = NumA+NumB;
		System.out.println("The sum is " +sum);
	}
	
	
}
