package Lab1;
import java.util.*;
public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("sum is "+calculateSum(n));
		

	}
	//calculate sum of n natural numbers that are divisible by 5 or 3
	static int calculateSum (int n)
	
	{
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			//To check divisible by 5 or 3
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

}
