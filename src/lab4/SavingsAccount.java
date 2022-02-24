package lab4;

public class SavingsAccount extends Account {
	final double minbalance=500;
	void Withdraw(double d)
	{
		if(balance-d>minbalance)
		{
			balance=balance-d;
		}
		else
		{
			System.out.println("withdraw not possible");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount sa=new SavingsAccount();
		sa.balance=100;
		sa.Withdraw(1200);
		System.out.println("balance is  "+sa.getBalance());
	}

}
