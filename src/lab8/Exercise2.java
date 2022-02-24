package lab8;
import java.time.LocalTime;

public class Exercise2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
		while(true) {
		LocalTime t=LocalTime.now();
		System.out.println(t);
		Thread.sleep(10000);	
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args)
	{
		Exercise2 e=new Exercise2();
		Thread t=new Thread(e);
		t.start();
		
	}
	

}
