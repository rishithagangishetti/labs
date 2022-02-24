package lab3;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.print(modifyNumber(num));
	}
	
	private static int modifyNumber(int num) {
		// TODO Auto-generated method stub
		//convert number to string
		String a=String.valueOf(num);
		StringBuilder a1=new StringBuilder();
		for(int i=0;i<a.length()-1;i++)
		{
			//convert each char to number and finding difference
			int temp=Math.abs(Character.getNumericValue(a.charAt(i))-Character.getNumericValue(a.charAt(i+1)));
			//adding difference to new StringBuilder
			a1.append(String.valueOf(temp));
			
		}
		//adding last digit
		a1.append(a.charAt(a.length()-1));
		String b=new String(a1);
		//converting string to int
		return Integer.parseInt(b);
	}

}
