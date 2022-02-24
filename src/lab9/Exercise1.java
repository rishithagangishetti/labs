package lab9;
interface Inf1
{
	double power(int x,int y);
}
//calculate power
public class Exercise1 {
public static void main(String[] args)
{
	Inf1 p=(x,y)->Math.pow(x, y);
	System.out.println(p.power(10,2));
}
}
