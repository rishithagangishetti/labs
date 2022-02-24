package lab4;



public class CurrentAccount extends Account{
	int limit=15000;
	void withdraw(double d)
	{
		if(d>limit)
		{
			System.out.print("Not possible to draw money");
		}
		else
		{
			balance=balance-d;
		}
	}
	public static void main(String[] args)
	{
		CurrentAccount ac=new CurrentAccount();
		ac.balance=17000;
		ac.withdraw(12000);
		System.out.print("balance is "+ac.getBalance());
	}
	}

	
