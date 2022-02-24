package lab5;

import java.util.Scanner;

public class EmployeeName {

	public static void main(String[] args) throws InvalidNameException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		try
		{
			
			if(!name.contains(" "))
			{
				throw new InvalidNameException("Enter firstname and lastname");
				
			}
			else
			{
				System.out.println("Valid name");
			}
			
		}
		catch(InvalidNameException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("executed");
	}

}
