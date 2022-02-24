package Lab1;
import java.util.*;
public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("value is"+new Exercise6().calculateDifference(n));
		

	}
	//difference between sum of squares and squares of sum
		int calculateDifference(int n)
		{
			int sum1=0,sum2=0;
			for(int i=1;i<=n;i++)
			{
				sum1=sum1+i*i;
				sum2=sum2+i;
			}
			return sum1-(sum2*sum2);
		}

}
