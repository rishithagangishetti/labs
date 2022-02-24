package lab5;

public class EmployeeException {
	String name;
	int salary;
	//Throw exception if salary is less than 3000
	EmployeeException(String name,int salary) throws InvalidSalaryException
	{
		this.name=name;
		if(salary<3000)
		{
			throw new InvalidSalaryException("Salary is below 3000");
			
		}
		
		this.salary=salary;
		System.out.print("executed");
	}
	public static void main(String[] args) throws InvalidSalaryException
	{
		
		try {
		EmployeeException emp=new EmployeeException("jane",2000);
		System.out.println(emp.name);
		System.out.println(emp.salary);
		}
		catch(InvalidSalaryException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
