package Lab1;
import java.util.*;
public class Exercise7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter a number");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		if(checkNumber(num1))
		{
			System.out.println("It is increasing number");
		}
		else
		{
			System.out.println("It is not increasing number");
		}

	}
	//check increasing number
		static boolean checkNumber(int n)
		{
			int temp=n%10;
			n=(int)n/10;
			while(n!=0)
			{
				int r=n%10;
				if(temp>=r)
				{
					temp=r;
				}
				else 
				{
					return false;
				}
				n=(int)n/10;
				
				
			}
			return true;
		}

}
