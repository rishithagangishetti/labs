package lab4;

public class Account {
long accNum;
double balance;
Person accholder;

	public long getAccNum() {
	return accNum;
}

public void setAccNum(long accNum) {
	this.accNum = accNum;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public Person getAccholder() {
	return accholder;
}

public void setAccholder(Person accholder) {
	this.accholder = accholder;
}
 void deposit(double a)
 {
	 balance=balance+a;
 }
 void withdraw(double b)
 {
	 balance=balance-b;
 }
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		Person pr1=new Person();
 		pr1.setName("smith");
 		pr1.setAge(30);
 		Person pr2=new Person();
 		pr2.setName("kathy");
 		pr2.setAge(25);
 		Account acc=new Account();
 		acc.setAccholder(pr1);
 		acc.setBalance(2000);
 		acc.setAccNum(123);
 		Account acc1=new Account();
 		acc1.setAccholder(pr2);
 		acc1.setBalance(3000);
 		acc1.setAccNum(1234);
 		acc.deposit(2000);
 		acc1.withdraw(2000);
 		System.out.println("smiths balance is"+acc.getBalance());
 		System.out.println("kathy's balance is" +acc1.getBalance());
 		
 		
 		
	}

}
