package lab5;

import java.util.Scanner;

public class Age {
	public static void main(String[] args) throws InvalidAgeException
	{
		Age a =new Age();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		a.validate(age);
		System.out.print("executed");
		
	}
	//Validate age
	 void validate(int age) 
	{
		 try {
		if(age>=15)
		{
			System.out.println("Valid age");
		}
		//throw Exception if age is less than 15
		else
		{
			throw new InvalidAgeException("Age should not be less than 15");
		}
		 }
		 catch(InvalidAgeException e)
		 {
			 System.out.println(e.getMessage());
		 }
	 }
	 
	}

