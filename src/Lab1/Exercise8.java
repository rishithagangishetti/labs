package Lab1;

import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter a number");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		if(checkNumber(num1))
		{
			System.out.println("It is power of 2");
		}
		else
		{
			System.out.println("It is not power of 2");
		}

	}
	//check whether number is power of 2 or not
	private static boolean checkNumber(int num1) {
		// TODO Auto-generated method stub
		if(num1==1)
		{
			return false;
		}
		while(num1>1)
		{
			if(num1%2!=0)
			{
				
				return false;
			}
			num1=(int)num1/2;
		}
		return true;
	}
}
