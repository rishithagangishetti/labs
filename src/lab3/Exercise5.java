package lab3;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String sb=new String(sc.next());
		if(positiveString(sb))
		{
			System.out.println("It is positive");
			
		}
		else
		{
			System.out.println("It is not positive");
		}
		
	}
//to check whether string is positive or not
	private static boolean positiveString(String sb) {
		// TODO Auto-generated method stub
		for(int i=0;i<sb.length()-1;i++)
		{
			//compare consecutive characters
			if(sb.charAt(i)>sb.charAt(i+1))
					{
						return false;
					}
		}
		return true;
	}

}
