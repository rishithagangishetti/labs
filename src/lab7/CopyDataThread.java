package lab7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread implements Runnable{
	public void run() {
		// TODO Auto-generated method stub	
	FileInputStream fis=null;
	FileOutputStream fos=null;
	try {
		fis = new FileInputStream("C:\\Users\\rishitha\\Downloads\\a.txt");
		fos = new FileOutputStream("C:\\Users\\rishitha\\Downloads\\b.txt");
		int num;
		int c=0;
		while ((num = fis.read()) != -1) {
			System.out.println((char) num);
			c++;
			if(c==10)
			{
				System.out.println("10 Characters copied");
				c=0;
				Thread.sleep(5000);
			}
			fos.write(num);
			
		}
	} 
	catch(InterruptedException e)
	{
		System.out.println(e);
	}
	catch (FileNotFoundException e) {
	
		System.out.println("not found");
	} 

	catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			if(fis!=null) {
				fis.close();
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			if(fos!=null) 
				fos.close();
			} 
		catch (IOException e) {
			e.printStackTrace();
		
			}
	}
	}
public static void main(String[]arg) {

	CopyDataThread t=new CopyDataThread();
	Thread a=new Thread(t);
	a.start();
	}

}
