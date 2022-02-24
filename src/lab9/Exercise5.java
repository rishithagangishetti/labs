package lab9;
interface Inf5
{
	int factorial(int n);
}
public class Exercise5 {
	int factorial(int n)
	{
		int s=1;
		for(int i=1;i<=n;i++)
			s=s*i;
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise5 e=new Exercise5();
		Inf5 f=e::factorial;
		System.out.println("factorial is "+f.factorial(5));
		

	}

}
